/*
 *  Panther is a program to encode your media files from one format to the other.
 *  Copyright (C) 2012  Sankha Narayan Guria
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package sngforge.panther.script;

import it.sauronsoftware.jave.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * Script Engine class for joining files
 *
 * @author Sankha
 */
public class FileJoiner {

    ArrayList files;
    File outFile;

    /*
     * creates a new FileJoiner object
     * @param outFile the output file
     */
    public FileJoiner(File outFile) {
        this.outFile = outFile;
        files = new ArrayList();
    }

    /*
     * adds a file to the list of files you want to join
     * @param file the file you want to join
     */
    public void addFile(File file) {
        files.add(file);
    }

    /*
     * removes a file from the list of files you want to join if you previously added it
     * @param file you want to remove from list
     */
    public void removeFile(File file) {
        files.remove(file);
    }

    /*
     * starts the encoding process
     */
    public void encode() {
        Utilities u = new Utilities();
        Encoder e = new Encoder();
        ArrayList list = new ArrayList();
        for (int i = 0; i < files.size(); i++) {
            File f = (File) files.get(i);
            File fout = new File(System.getProperty("user.home") + "/.panther/" + f.getName() + ".mpg");
            list.add(fout);
            EncodingAttributes ae = new EncodingAttributes();
            AudioAttributes aa = new AudioAttributes();
            VideoAttributes va = new VideoAttributes();
            ae.setAudioAttributes(aa);
            ae.setVideoAttributes(va);
            ae.setFormat("mpeg");
            ae.setSameQuality(true);
            try {
                u.println("Processing File: " + f.getAbsolutePath());
                e.encode(f, fout, ae, new ProgressListener());
            } catch (Exception ex) {
                System.err.println(ex);
                u.println(ex.toString());
            }
        }
        u.print("Stitching Files...");
        File fout = new File(System.getProperty("user.home") + "/.panther/" + ".temp.mpg");
        try {
            FileOutputStream outStream = new FileOutputStream(fout);
            for (int i = 0; i < list.size(); i++) {
                FileInputStream fin = new FileInputStream((File) list.get(i));
                // 1MB buffer size for very fast file joining
                byte[] buffer = new byte[1024 * 1024];
                int l;
                while ((l = fin.read(buffer)) != -1) {
                    outStream.write(buffer, 0, l);
                }
                fin.close();
            }
            u.println(" Done!");
            outStream.close();
        } catch (Exception ex) {
            System.err.println(ex);
            u.println(ex.toString());
        }
        u.println("Creating file: " + outFile.getAbsolutePath());
        try {
            MultimediaInfo mi = e.getInfo((File) files.get(0));
            String format = mi.getFormat();
            EncodingAttributes ae = new EncodingAttributes();
            AudioAttributes aa = new AudioAttributes();
            VideoAttributes va = new VideoAttributes();
            ae.setAudioAttributes(aa);
            ae.setVideoAttributes(va);
            ae.setFormat(format);
            ae.setSameQuality(true);
            e.encode(new File(System.getProperty("user.home") + "/.panther/" + ".temp.mpg"), outFile, ae, new ProgressListener());
        } catch (Exception ex) {
            System.err.println(ex);
            u.println(ex.toString());
        }

    }
}
