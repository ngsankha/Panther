package sngforge.panther.modules.video;

import sngforge.panther.modules.*;

public class VideoEntry implements EncoderEntry {

    public String fin, fout, format,aCodec,vCodec;
    public int aBitrate, aChannels, aSamplingRate, aVolume, vBitrate, fps, height, width;
    public float duration, offset;

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
