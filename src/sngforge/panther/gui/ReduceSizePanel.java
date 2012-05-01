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
package sngforge.panther.gui;

import it.sauronsoftware.jave.AudioInfo;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import sngforge.panther.Globals;
import sngforge.panther.modules.reducesize.ReduceSizeEntry;
import sngforge.panther.modules.reducesize.ReduceSizeWorkingPanel;

/**
 *
 * @author Guria
 */
public class ReduceSizePanel extends javax.swing.JPanel {

    ArrayList files;
    /** Creates new form ReduceSizePanel */
    public ReduceSizePanel() {
        initComponents();
        files=new ArrayList();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filelist = new javax.swing.JList();
        bitrateInfo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        folderPath = new javax.swing.JTextField();
        findBitrate = new javax.swing.JButton();
        browse = new javax.swing.JButton();
        preserveTags = new javax.swing.JCheckBox();
        openFolder = new javax.swing.JCheckBox();
        cancel = new javax.swing.JButton();
        encode = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bitrate = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/dialog-information.png"))); // NOI18N
        jLabel2.setText("Panther allows you to reduce the size of your music files by reducing their bitrate with very negligible change in quality.");

        jLabel1.setText("Please select the input source files and then the output folder and the bitrate and then click encode to continue.");

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/list-add.png"))); // NOI18N
        add.setText("Add ...");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/list-remove.png"))); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(filelist);

        jLabel4.setText("Output Folder");

        findBitrate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/dialog-information.png"))); // NOI18N
        findBitrate.setText("Find bitrate");
        findBitrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBitrateActionPerformed(evt);
            }
        });

        browse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/document-open.png"))); // NOI18N
        browse.setText("Browse ...");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        preserveTags.setText("Copy audio tags");

        openFolder.setText("Open folder after encoding is complete");

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/process-stop.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        encode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/go-jump.png"))); // NOI18N
        encode.setText("Encode");
        encode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeActionPerformed(evt);
            }
        });

        jLabel5.setText("Bitrate");

        bitrate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "64", "128", "256" }));

        jLabel6.setText("kbps");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(bitrateInfo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(folderPath, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(findBitrate, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(browse, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(openFolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                        .addComponent(encode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel))
                    .addComponent(preserveTags)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(bitrate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bitrateInfo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(folderPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findBitrate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browse)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(bitrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(preserveTags)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(openFolder)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel)
                            .addComponent(encode))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
     * adds files to the list
     */
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        JFileChooser jfc=new JFileChooser();
        jfc.setMultiSelectionEnabled(true);
        FileFilter filter;
        filter = createFileFilter("MP3 Music Files",true, "mp3");
        jfc.setFileFilter(filter);
        jfc.showOpenDialog(this);
        File f[]=jfc.getSelectedFiles();
        for(int i=0;i<f.length;i++)
            files.add(f[i].getAbsolutePath());
        filelist.setListData(files.toArray());
    }//GEN-LAST:event_addActionPerformed

    /*
     * removes files from the list
     */
    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        files.remove(filelist.getSelectedIndex());
        filelist.setListData(files.toArray());
    }//GEN-LAST:event_removeActionPerformed

    /*
     * selects the output folder
     */
    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        JFileChooser jfc=new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jfc.showOpenDialog(this);
        folderPath.setText(jfc.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_browseActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new MainPanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    /*
     * gets the bitrate of the selected file
     */
    private void findBitrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBitrateActionPerformed
        try{
            Encoder e=new Encoder();
            MultimediaInfo mi=e.getInfo(new File((String)filelist.getSelectedValue()));
            AudioInfo ai=mi.getAudio();
            bitrateInfo.setText("The bitrate is "+ai.getBitRate()+" kbps");
            bitrateInfo.setIcon(new ImageIcon(getClass().getResource("/sngforge/panther/resources/emblem-important.png")));
        }catch(Exception e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e, "Panther - Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_findBitrateActionPerformed

    /*
     * starts the encoding operation
     */
    private void encodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeActionPerformed
        ReduceSizeEntry rse=new ReduceSizeEntry();
        rse.saveSet(files.toArray(),Integer.parseInt((String)bitrate.getSelectedItem()),folderPath.getText(),preserveTags.isSelected(),openFolder.isSelected());
        ReduceSizeWorkingPanel rswp=new ReduceSizeWorkingPanel();
        Globals.ee=rse;
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(rswp);
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
        rswp.process();
    }//GEN-LAST:event_encodeActionPerformed

    private FileFilter createFileFilter(String description,boolean showExtensionInDescription, String...extensions)
    {
        if (showExtensionInDescription)
        description = createFileNameFilterDescriptionFromExtensions(description, extensions);
        return new FileNameExtensionFilter(description, extensions);
    }
    private String createFileNameFilterDescriptionFromExtensions(String description, String[] extensions)
    {
        String fullDescription = (description == null) ? "(" : description + " (";
        fullDescription += "." + extensions[0];
        for (int i = 1; i < extensions.length; i++) {
            fullDescription += ", .";
            fullDescription += extensions[i];
        }
        fullDescription += ")";
        return fullDescription;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JComboBox bitrate;
    private javax.swing.JLabel bitrateInfo;
    private javax.swing.JButton browse;
    private javax.swing.JButton cancel;
    private javax.swing.JButton encode;
    private javax.swing.JList filelist;
    private javax.swing.JButton findBitrate;
    private javax.swing.JTextField folderPath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox openFolder;
    private javax.swing.JCheckBox preserveTags;
    private javax.swing.JButton remove;
    // End of variables declaration//GEN-END:variables

}
