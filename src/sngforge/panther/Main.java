
package sngforge.panther;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import javax.swing.*;
import sngforge.panther.gui.MainPanel;

public class Main {

    public static void main(String[] args) throws Exception{
        setLogger();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try{
            UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceRavenGraphiteGlassLookAndFeel");
            SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Globals.mainFrame=new JFrame("Panther");
                Globals.mainFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/sngforge/panther/resources/panther-logo.png")));
                Globals.scrollPane=new JScrollPane(new MainPanel());
                Globals.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Globals.mainFrame.add(Globals.scrollPane);
                Globals.mainFrame.setSize(750,500);
                Globals.mainFrame.setVisible(true);
            }});
        }catch(Exception e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e, "Panther - Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void setLogger(){
        File f=new File(System.getProperty("user.home")+"/.panther");
        if(!f.exists())
            f.mkdirs();
        PrintStream out=null,err=null;
        try{
            out=new PrintStream(new FileOutputStream(System.getProperty("user.home")+"/.panther/out.log"));
            err=new PrintStream(new FileOutputStream(System.getProperty("user.home")+"/.panther/err.log"));
        }catch(Exception e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e, "Panther - Error", JOptionPane.ERROR_MESSAGE);
        }
        System.setOut(out);
        System.setErr(err);
    }
}
