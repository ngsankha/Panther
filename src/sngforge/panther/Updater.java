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

import java.awt.Desktop;
import javax.swing.JOptionPane;
import sngforge.jupdater.JUpdater;

/**
 * This class checks for updates to the newer version of Panther
 * @author Sankha
 */
public class Updater {
    
    /*
     * call this method to check for new updates
     */
    public static void update(){
        JUpdater updater;
        try{
            updater=new JUpdater("version.xml","http://sankha93.github.com/Panther/update.xml");
            if(updater.isUpdateRequired()){
                System.out.println("Update for Panther "+updater.getServerVersion()+" is available.");
                String text="<html>A new update is available. Would you like to update?<br/>"+updater.getUpdateDetails()+"</html>";
                int selected=JOptionPane.showConfirmDialog(null, text, "Panther - Update", JOptionPane.YES_NO_OPTION);
                if(selected==JOptionPane.YES_OPTION){
                    Desktop d=Desktop.getDesktop();
                    d.browse(updater.getUpdateURL().toURI());
                    System.out.println("Update for Panther "+updater.getServerVersion()+" was selected.");
                }
            } else
                System.out.println("No updates to Panther was found.");
        } catch (Exception e){
            System.err.println(e);
        }
    }
}
