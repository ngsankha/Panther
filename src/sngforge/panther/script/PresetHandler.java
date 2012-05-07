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

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * Class to handle video presets from Javascript
 * @author Sankha
 */
public class PresetHandler {
    
    Properties p;
    
    public PresetHandler(File f){
        try{
            p.loadFromXML(new FileInputStream(f));
        }catch(Exception e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e, "Panther - Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String getDescription(){
        return p.getProperty("desc");
    }
    
    public String getFormat(){
        return p.getProperty("format");
    }
    
    public String getVideoCodec(){
        return p.getProperty("videoCodec");
    }
    
    public String getAudioCodec(){
        return p.getProperty("audioCodec");
    }
    
    public int getAudioBitrate(){
        return Integer.parseInt(p.getProperty("audioBitrate"));
    }
    
    public int getAudioChannels(){
        return Integer.parseInt(p.getProperty("audioChannels"));
    }
    
    public int getAudioSamplimgRate(){
        return Integer.parseInt(p.getProperty("audioSampling"));
    }
    
    public int getAudioVolume(){
        return Integer.parseInt(p.getProperty("audioVolume"));
    }
    
    public int getVideoBitrate(){
        return Integer.parseInt(p.getProperty("videoBitrate"));
    }
    
    public int getVideoFramerate(){
        return Integer.parseInt(p.getProperty("videoFps"));
    }
    
    public int getVideoHeight(){
        return Integer.parseInt(p.getProperty("videoHeight"));
    }
    
    public int getVideoWidth(){
        return Integer.parseInt(p.getProperty("videoWidth"));
    }
    
    public int getVideoDuration(){
        return Integer.parseInt(p.getProperty("videoDuration","0"));
    }
    
    public int getVideoOffset(){
        return Integer.parseInt(p.getProperty("videoOffset","0"));
    }
}
