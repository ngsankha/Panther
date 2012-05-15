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

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.VideoAttributes;
import java.io.File;
import java.util.ArrayList;

/**
 * Script engine class for file splitter
 *
 * @author Sankha
 */
public class FileSplitter {

    File inFile, outDir;
    ArrayList timepoints;

    /*
     * constructs the FileSplitter object
     * @param inFile the input file
     * @param outDir the output directory
     */
    public FileSplitter(File inFile, File outDir) {
        this.inFile = inFile;
        this.outDir = outDir;
        timepoints=new ArrayList();
    }

    /*
     * adds a timepoint from where the file will be split
     * @sec the time in seconds
     */
    public void addTimePoint(float sec) {
        timepoints.add(sec);
    }

    /*
     * removes a timepoint if you have previously add one
     * @sec the time in seconds
     */
    public void removeTimePoint(float sec) {
        timepoints.remove(sec);
    }

    /*
     * starts the encoding process
     */
    public void encode() {
        Utilities u = new Utilities();
        Encoder e = new Encoder();
        try {
            MediaFile media = new MediaFile(inFile);
            String format = media.getFormat();
            float sec = media.getDuration();
            timepoints.add(sec);
            float offset = 0;
            for (int i = 0; i < timepoints.size(); i++) {
                StringBuilder sb = new StringBuilder(outDir.getAbsolutePath() + "/" + inFile.getName());
                sb.insert(sb.lastIndexOf("."), "." + (i + 1));
                EncodingAttributes ea = new EncodingAttributes();
                AudioAttributes aa = new AudioAttributes();
                VideoAttributes va = new VideoAttributes();
                va.setCodec(VideoAttributes.DIRECT_STREAM_COPY);
                ea.setAudioAttributes(aa);
                ea.setVideoAttributes(va);
                ea.setFormat(format);
                ea.setOffset(offset);
                ea.setDuration((Float) timepoints.get(i));
                u.println("Creating file: " + sb.toString());
                e.encode(inFile, new File(sb.toString()), ea, new ProgressListener());
                offset += (Float) timepoints.get(i);
            }
        } catch (Exception ex) {
            u.println(ex.toString());
            System.err.println(ex);
        }
    }
}
