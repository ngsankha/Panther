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
package sngforge.panther;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import javax.swing.*;
import sngforge.panther.gui.MainPanel;

public class Main {

    /*
     * The main method.
     * Execution begins here
     */
    public static void main(String[] args) throws Exception{
        setLogger();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try{
            //setting up the look and feel
            UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceRavenGraphiteGlassLookAndFeel");
            SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                //creating the main parent window
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
    
    /*
     * Sets up the Logger
     * Stores all output and error messages in files for error tracking
     */
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
