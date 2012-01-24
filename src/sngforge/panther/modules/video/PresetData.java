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
package sngforge.panther.modules.video;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

public class PresetData {

    public Properties p;

    public PresetData(){
        p=new Properties();
    }

    public void loadPresetData(String desc) {
        File presetDir = new File("./presets/");
        File presets[] = presetDir.listFiles();
        for (int i = 0; i < presets.length; i++) {
            if (presets[i].getAbsolutePath().endsWith(".video.xml")) {
                try {
                    p.loadFromXML(new FileInputStream(presets[i]));
                } catch (Exception e) {
                    System.err.println(e);
                    javax.swing.JOptionPane.showMessageDialog(null, e, "Panther - Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
                if (p.getProperty("desc").equals(desc))
                    break;
            }
        }
    }

    public void loadPresetData(File file){
        try{
            p.loadFromXML(new FileInputStream(file));
        }catch(Exception e){
            System.err.println(e);
                    javax.swing.JOptionPane.showMessageDialog(null, e, "Panther - Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Object[] loadPresetsList() throws Exception{
        ArrayList entries=new ArrayList();
        File presetDir=new File("./presets/");
        File presets[]=presetDir.listFiles();
        for(int i=0;i<presets.length;i++){
            if(presets[i].getAbsolutePath().endsWith(".video.xml")){
                Properties p=new Properties();
                p.loadFromXML(new FileInputStream(presets[i]));
                String entry=p.getProperty("desc");
                entries.add(entry);
            }
        }
        return entries.toArray();
    }
}
