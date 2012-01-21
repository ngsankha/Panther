
package sngforge.panther.modules.audio;

import sngforge.panther.modules.*;

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
