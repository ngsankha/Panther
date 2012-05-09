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
package sngforge.panther.modules;

import java.io.File;
import org.blinkenlights.jid3.MP3File;
import sngforge.panther.Globals;

public class ID3TagCopier {

    /*
     * copies the ID3 tags of an MP3 file to another after the encoding process
     */
    public static void copyTags(File src,File dst){
        try{
            MP3File fsrc=new MP3File(src);
            MP3File fdest=new MP3File(dst);
            
            fdest.setID3Tag(fsrc.getID3V1Tag());
            fdest.setID3Tag(fsrc.getID3V2Tag());
            fdest.sync();
        }catch(Exception e){
            System.err.println(e);
            Globals.errorList.add(e);
        }
    }
}
