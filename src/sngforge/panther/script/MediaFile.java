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

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;
import java.io.File;

/**
 * Script engine class for getting different properties from a media file
 * @author Sankha
 */
public class MediaFile {
    
    MultimediaInfo mi;
    Utilities u;
    
    /*
     * constructs the MediaFile object
     * @param file the file whose properties is required
     */
    public MediaFile (File file){
        Encoder e=new Encoder();
        u=new Utilities();
        try {
            mi=e.getInfo(file);
        } catch (Exception ex) {
            System.err.println(ex);
            u.println("Error: "+ex);
        }
    }
    
    /*
     * gets the format of the media file
     * @param the format of the file
     */
    public String getFormat(){
        return mi.getFormat();
    }
    
    /*
     * gets the duration of the media file
     * @param the duartion of the audio or video
     */
    public float getDuration(){
        return mi.getDuration()/1000;
    }
}
