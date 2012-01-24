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
package sngforge.panther.modules.audio;

import sngforge.panther.modules.EncoderEntry;

public class AudioEntry implements EncoderEntry{

    public String fin,fout,format;
    public int bitrate,channels,samplingRate,volume;
    public float duration,offset;

    public void saveSet(String fin,String fout,String selectedFormat){
        this.fin=fin;
        if(selectedFormat.equals("MP3 File (.mp3)")){
            format="mp3";
            this.fout=fout+".mp3";
        }
        else if(selectedFormat.equals("Wave Audio File (.wav)")){
            format="wav";
            this.fout=fout+".wav";
        }
        else if(selectedFormat.equals("MP4 Audio File (.mp4)")){
            format="mp4";
            this.fout=fout+".mp4";
        }
        else if(selectedFormat.equals("AU File (.au)")){
            format="au";
            this.fout=fout+".au";
        }
        else if(selectedFormat.equals("AIFF File (.aif, .aifc, .aiff)")){
            format="aiff";
            this.fout=fout+".aiff";
        }
        else if(selectedFormat.equals("MP2 File (.mp2)")){
            format="mp2";
            this.fout=fout+".mp2";
        }
        else if(selectedFormat.equals("ADTS File (.adt, .adts)")){
            format="adts";
            this.fout=fout+".adts";
        }
        else if(selectedFormat.equals("Creative Voice file format (.voc)")){
            format="voc";
            this.fout=fout+".voc";
        }
        else if(selectedFormat.equals("RealMedia format (.rm)")){
            format="rm";
            this.fout=fout+".rm";
        }
        else if(selectedFormat.equals("OGG file format (.ogg)")){
            format="ogg";
            this.fout=fout+".ogg";
        }
        else if(selectedFormat.equals("3GPP AMR file format (.amr)")){
            format="amr";
            this.fout=fout+".amr";
        }
    }

    public void saveSetAdvanced(String fin,String fout,String selectedFormat,int bitrate,int channels,int samplingRate,int volume,float offset,float duration){
        saveSet(fin,fout,selectedFormat);
        this.fout=fout;
        this.bitrate=bitrate;
        this.channels=channels;
        this.samplingRate=samplingRate;
        this.volume=volume;
        this.duration=duration;
        this.offset=offset;
    }
}
