
package sngforge.panther.modules;

import sngforge.panther.modules.audio.*;
import it.sauronsoftware.jave.*;

public class EncoderListener implements EncoderProgressListener{

    WorkingPanel master;

    public void message(String msg){
        System.err.println(msg);
    }

    public void progress(int p){
        master.setProgress(p/10);
    }

    public void sourceInfo(MultimediaInfo mi){};

    public void setParent(WorkingPanel rswp){
        master=rswp;
    }
}
