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

import javax.swing.JScrollPane;
import sngforge.panther.Globals;

/**
 *
 * @author Guria
 */
public class MainPanel extends javax.swing.JPanel {

    /** Creates new form MainPanel */
    public MainPanel() {
        initComponents();
        hideBatchButton();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoLabel = new javax.swing.JLabel();
        convertAudio = new javax.swing.JButton();
        convertVideo = new javax.swing.JButton();
        batchConversion = new javax.swing.JButton();
        help = new javax.swing.JButton();
        close = new javax.swing.JButton();
        about = new javax.swing.JButton();
        reduceSize = new javax.swing.JButton();

        infoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/go-jump.png"))); // NOI18N
        infoLabel.setText("<html>Panther is a media encoder that you can use to encode media files from one format to the other and reduce the size of music files.<br> It is fast simple and easy to use.<br><br> Please select the task that you want to perform from the following.");

        convertAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/audio-x-generic.png"))); // NOI18N
        convertAudio.setText("<html><b>Audio Files</b><br><br>Click here to convert an audio file to another format.");
        convertAudio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        convertAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertAudioActionPerformed(evt);
            }
        });

        convertVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/video-x-generic.png"))); // NOI18N
        convertVideo.setText("<html><b>Video Files</b><br><br>Click here to convert a video file to another format.");
        convertVideo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        convertVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertVideoActionPerformed(evt);
            }
        });

        batchConversion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/utilities-terminal.png"))); // NOI18N
        batchConversion.setText("<html><b>Batch Conversion</b><br><br>Click here to write scripts to encode multiple files at once.");
        batchConversion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/help-browser.png"))); // NOI18N
        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/process-stop.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/dialog-information.png"))); // NOI18N
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        reduceSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/system-file-manager.png"))); // NOI18N
        reduceSize.setText("<html><b>Reduce the size of Music Files</b><br><br>Click here to reduce the file size of music files without affecting its quality.");
        reduceSize.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reduceSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceSizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convertVideo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addComponent(reduceSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addComponent(convertAudio, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(help)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(about)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                        .addComponent(close))
                    .addComponent(batchConversion, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLabel)
                .addGap(13, 13, 13)
                .addComponent(convertAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reduceSize, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(batchConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(help)
                        .addComponent(about))
                    .addComponent(close))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
     * launches the help
     */
    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        //sngforge.jelp.Main.launch();
    }//GEN-LAST:event_helpActionPerformed

    /*
     * starts the about dialog
     */
    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        new AboutDialog(Globals.mainFrame,true).setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void reduceSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceSizeActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new ReduceSizePanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_reduceSizeActionPerformed

    private void convertAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertAudioActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new SimpleAudioPanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_convertAudioActionPerformed

    private void convertVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertVideoActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new VideoPanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_convertVideoActionPerformed

    /*
     * batch processing feature
     * under development
     */
    public void hideBatchButton(){
        batchConversion.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton batchConversion;
    private javax.swing.JButton close;
    private javax.swing.JButton convertAudio;
    private javax.swing.JButton convertVideo;
    private javax.swing.JButton help;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton reduceSize;
    // End of variables declaration//GEN-END:variables

}
