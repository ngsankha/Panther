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

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;
import java.io.File;
import javax.swing.JOptionPane;

/**
 * AudioEncoder class for use with Javascript
 * @author Sankha
 */
public class AudioEncoder {
    
    File in,out;
    AudioAttributes aa;
    EncodingAttributes ea;
    
    /*
     * instantiates the object with the input file and the output file
     * @param in the input file
     * @param out the output file
     */
    public AudioEncoder(File in, File out){
        this.in=in;
        this.out=out;
        aa=new AudioAttributes();
        ea=new EncodingAttributes();
    }
    
    /*
     * begins the encoding process
     */
    public void encode(){
        Encoder e=new Encoder();
        ea.setAudioAttributes(aa);
        try{
            e.encode(in , out, ea, new ProgressListener());
        } catch(Exception ex){
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, ex, "Panther - Error", JOptionPane.ERROR_MESSAGE);
        }
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
    public void setBitrate(int bitrate){
        aa.setBitRate(bitrate);
    }
    
    /*
     * the sampling rate of the output file
     * @param sampling the sampling rate in Hz
     */
    public void setSamplingRate(int sampling){
        aa.setSamplingRate(sampling);
    }
    
    /*
     * the number of channels of the output file
     * @param channels the number of channels (1=mono, 2=stereo)
     */
    public void setChannels(int channels){
        aa.setChannels(channels);
    }
    
    /*
     * the volume of the output file
     * @param volume the volume of the output file
     */
    public void setVolume(int volume){
        aa.setBitRate(volume);
    }
    
    /*
     * sets the format of the output file
     * @param format the format of the output file
     */
    public void setFormat(String format){
        ea.setFormat(format);
    }
}
