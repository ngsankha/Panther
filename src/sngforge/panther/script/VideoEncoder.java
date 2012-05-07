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

import it.sauronsoftware.jave.*;
import java.io.File;

/**
 * VideoEncoder class for use with Javascript
 * @author Sankha
 */
public class VideoEncoder {
    
    File in,out;
    AudioAttributes aa;
    VideoAttributes va;
    EncodingAttributes ea;
    
    /*
     * instantiates the object with the input file and the output file
     * @param in the input file
     * @param out the output file
     */
    public VideoEncoder(File in, File out){
        this.in=in;
        this.out=out;
        va=new VideoAttributes();
        aa=new AudioAttributes();
        ea=new EncodingAttributes();
    }
    
    /*
     * sets the bitrate of the video
     * @param bitrate the bitrate of the video in bps
     */
    public void setVideoBitrate(int bitrate){
        va.setBitRate(bitrate);
    }
    
    /*
     * sets the codec of the video
     * @param codec codec of the video
     */
    public void setVideoCodec(String codec){
        va.setCodec(codec);
    }
    
    /*
     * sets the framerate of the video
     * @param framerate the framerate of the video
     */
    public void setFrameRate(int framerate){
        va.setFrameRate(framerate);
    }
    
    /*
     * sets the dimensions of the video
     * @param width the width of the video
     * @param heigth the height of the video
     */
    public void setSize(int width, int height){
        VideoSize size=new VideoSize(width,height);
        va.setSize(size);
    }
    
    /*
     * sets the duration of the output file
     * @param duration the duration of the output in seconds
     */
    public void setDuration(float duration){
        ea.setDuration(duration);
    }
    
    /*
     * set the offset of the file during the encoding process. The offset number of seconds will be skipped and then the encoding will start
     * @param offset the offset time in seconds
     */
    public void setOffset(float offset){
        ea.setOffset(offset);
    }
    
    /*
     * the bitrate of the output file
     * @param bitrate the bitrate in bps
     */
    public void setAudioBitrate(int bitrate){
        aa.setBitRate(bitrate);
    }
    
    /*
     * the sampling rate of the output file
     * @param sampling the sampling rate in Hz
     */
    public void setAudioSamplingRate(int sampling){
        aa.setSamplingRate(sampling);
    }
    
    /*
     * the number of channels of the output file
     * @param channels the number of channels (1=mono, 2=stereo)
     */
    public void setAudioChannels(int channels){
        aa.setChannels(channels);
    }
    
    /*
     * the volume of the output file
     * @param volume the volume of the output file
     */
    public void setAudioVolume(int volume){
        aa.setBitRate(volume);
    }
    
    /*
     * sets the format of the output file
     * @param format the format of the output file
     */
    public void setFormat(String format){
        ea.setFormat(format);
    }
    
    /*
     * sets the codec of the audio in the video
     * @param codec the codec of the audio
     */
    public void setAudioCodec(String codec){
        aa.setCodec(codec);
    }
    
    /*
     * begins the encoding process
     */
    public void encode(){
        Utilities u=new Utilities();
        u.println("Encoding file: "+in.getAbsolutePath());
        Encoder e=new Encoder();
        ea.setAudioAttributes(aa);
        ea.setVideoAttributes(va);
        try{
            e.encode(in , out, ea, new ProgressListener());
        } catch(Exception ex){
            System.err.println(ex);
            u.println("Error: "+ex);
        }
    }
}