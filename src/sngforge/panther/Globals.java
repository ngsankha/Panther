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

import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import sngforge.panther.gui.ReportPanel;
import sngforge.panther.modules.EncoderEntry;
import sngforge.panther.modules.WorkingPanel;
import sngforge.panther.modules.video.PresetData;

/*
 * Stores all the global (static) variables used universally in the application
 */
public class Globals {
    public static Properties prefs;
    public static JFrame mainFrame;
    public static JScrollPane scrollPane;
    public static EncoderEntry ee;
    public static WorkingPanel wp;
    public static ArrayList errorList;
    public static String report;
    public static boolean cancelled;
    public static ReportPanel rp;
    public static JScrollPane tmp;
    public static PresetData pd;
    public static JEditorPane output;
}
