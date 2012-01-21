package sngforge.panther.modules.video;

import java.util.*;
import java.io.*;

public class PresetData {

    public Properties p;

    public PresetData(){
        p=new Properties();
    }

    public void loadPresetData(String desc) {
        File presetDir = new File("./presets/");
        File presets[] = presetDir.listFiles();
        for (int i = 0; i < presets.length; i++) {
            if (presets[i].getAbsolutePath().endsWith(".video.xml")) {
                try {
                    p.loadFromXML(new FileInputStream(presets[i]));
                } catch (Exception e) {
                    System.err.println(e);
                    javax.swing.JOptionPane.showMessageDialog(null, e, "Panther - Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
                if (p.getProperty("desc").equals(desc))
                    break;
            }
        }
    }

    public void loadPresetData(File file){
        try{
            p.loadFromXML(new FileInputStream(file));
        }catch(Exception e){
            System.err.println(e);
                    javax.swing.JOptionPane.showMessageDialog(null, e, "Panther - Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Object[] loadPresetsList() throws Exception{
        ArrayList entries=new ArrayList();
        File presetDir=new File("./presets/");
        File presets[]=presetDir.listFiles();
        for(int i=0;i<presets.length;i++){
            if(presets[i].getAbsolutePath().endsWith(".video.xml")){
                Properties p=new Properties();
                p.loadFromXML(new FileInputStream(presets[i]));
                String entry=p.getProperty("desc");
                entries.add(entry);
            }
        }
        return entries.toArray();
    }
}
