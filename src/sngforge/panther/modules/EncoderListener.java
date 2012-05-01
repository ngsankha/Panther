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

import it.sauronsoftware.jave.EncoderProgressListener;
import it.sauronsoftware.jave.MultimediaInfo;

/*
 * updates the progress on screen
 */
public class EncoderListener implements EncoderProgressListener{

    WorkingPanel master;

    public void message(String msg){
        System.err.println(msg);
    }

    /*
     * updates the progress bar
     */
    public void progress(int p){
        master.setProgress(p/10);
    }

    public void sourceInfo(MultimediaInfo mi){};

    public void setParent(WorkingPanel rswp){
        master=rswp;
    }
}
