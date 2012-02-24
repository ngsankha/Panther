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
package sngforge.panther.modules.reducesize;

import sngforge.panther.modules.EncoderEntry;

public class ReduceSizeEntry implements EncoderEntry{

    public Object files[];
    public int bitrate;
    public String outFolder;
    public boolean copyTags;
    public boolean openFolder;

    /*
     * saves the details for the reduuction of files in the current encoding task
     */
    public void saveSet(Object files[],int bitrate,String outFolder,boolean copyTags,boolean openFolder){
        this.files=files;
        this.bitrate=bitrate;
        this.outFolder=outFolder;
        this.copyTags=copyTags;
        this.openFolder=openFolder;
    }
}
