
package sngforge.panther.modules;

import org.farng.mp3.*;
import java.io.*;
import sngforge.panther.*;

public class ID3TagCopier {

    public static void copyTags(String src,String dst){
        try{
            MP3File fsrc=new MP3File(new File(src));
            MP3File fdest=new MP3File(new File(dst));

            fdest.setID3v1Tag(fsrc.getID3v1Tag());
            fdest.setID3v2Tag(fsrc.getID3v2Tag());
            fdest.setFilenameTag(fsrc.getFilenameTag());
            fdest.setLyrics3Tag(fsrc.getLyrics3Tag());
            fdest.save();
            String dfile=dst.substring(0, dst.lastIndexOf(".mp3"))+".original.mp3";
            File sf=new File(dfile);
            sf.delete();
        }catch(Exception e){
            System.err.println(e);
            Globals.errorList.add(e);
        }
    }
}
