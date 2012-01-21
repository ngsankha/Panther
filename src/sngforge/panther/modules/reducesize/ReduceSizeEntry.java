
package sngforge.panther.modules.reducesize;

import sngforge.panther.modules.*;

public class ReduceSizeEntry implements EncoderEntry{

    public Object files[];
    public int bitrate;
    public String outFolder;
    public boolean copyTags;
    public boolean openFolder;

    public void saveSet(Object files[],int bitrate,String outFolder,boolean copyTags,boolean openFolder){
        this.files=files;
        this.bitrate=bitrate;
        this.outFolder=outFolder;
        this.copyTags=copyTags;
        this.openFolder=openFolder;
    }
}
