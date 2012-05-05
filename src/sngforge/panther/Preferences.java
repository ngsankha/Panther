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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * Has common functions related to storing and loading preferences
 * @author Sankha
 */
public class Preferences {
    
    public static void savePreferences(){
        try{
            Globals.prefs.storeToXML(new FileOutputStream(System.getProperty("user.home")+"/.panther/prefs.xml"), "Panther Preferences");
        } catch(Exception e){
            e.printStackTrace(System.err);
            JOptionPane.showMessageDialog(null, e, "Panther - Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void createPreferences(){
        Globals.prefs=new Properties();
        Globals.prefs.put("laf","org.jvnet.substance.skin.SubstanceRavenGraphiteGlassLookAndFeel");
        Globals.prefs.put("lafIndex","0");
        savePreferences();
    }
    
    public static void loadPreferences(){
        Globals.prefs=new Properties();
        try{
            Globals.prefs.loadFromXML(new FileInputStream(System.getProperty("user.home")+"/.panther/prefs.xml"));
        } catch (Exception e){
            e.printStackTrace(System.err);
            JOptionPane.showMessageDialog(null, e, "Panther - Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
