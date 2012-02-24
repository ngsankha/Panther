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

import sngforge.panther.modules.EncoderEntry;

public class VideoEntry implements EncoderEntry {

    public String fin, fout, format,aCodec,vCodec;
    public int aBitrate, aChannels, aSamplingRate, aVolume, vBitrate, fps, height, width;
    public float duration, offset;

    /*
     * saves the setting for the current video encoding process
     * these may come from the presets and/or the settings user specifies in the options window of the conversion task
     */
    public void saveSet(String aCodec, String vCodec, String fin, String fout, String format, int aBitrate, int aChannels, int aSamplingRate, int aVolume, int vBitrate, int fps, int height, int width, float duration, float offset){
        this.aCodec=aCodec;
        this.vCodec=vCodec;
        this.fin=fin;
        this.fout=fout;
        this.format=format;
        this.aBitrate=aBitrate;
        this.aChannels=aChannels;
        this.aSamplingRate=aSamplingRate;
        this.aVolume=aVolume;
        this.vBitrate=vBitrate;
        this.fps=fps;
        this.height=height;
        this.width=width;
        this.duration=duration;
        this.offset=offset;
    }
}
