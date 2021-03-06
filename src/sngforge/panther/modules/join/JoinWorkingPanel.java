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

package sngforge.panther.modules.join;

import it.sauronsoftware.jave.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingWorker;
import sngforge.panther.Globals;
import sngforge.panther.gui.ReportPanel;
import sngforge.panther.modules.EncoderListener;

public class JoinWorkingPanel extends sngforge.panther.modules.WorkingPanel{

    JoinWorkingPanel aewp=(JoinWorkingPanel)Globals.wp;
    SwingWorker sw;
    /** Creates new form JoinWorkingPanel */
    public JoinWorkingPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        currProgress = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        overallProgress = new javax.swing.JProgressBar();
        cancel = new javax.swing.JButton();
        currFile = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/applications-system.png"))); // NOI18N
        jLabel1.setText("Please wait while Panther splits the files. This may take several minutes.");

        jLabel2.setText("Current Progress");

        jLabel3.setText("Overall Progress");

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/process-stop.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addComponent(overallProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(currFile))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overallProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(cancel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
     * method called when cancel button is clicked
     */
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int choice=JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel?", "Panther", JOptionPane.YES_NO_OPTION);
                if(choice==JOptionPane.YES_OPTION){
                    jLabel2.setText("Cancelling...");
                    currProgress.setIndeterminate(true);
                    cancel.setEnabled(false);
                    sw.cancel(true);
                    Globals.cancelled=true;
                }
    }//GEN-LAST:event_cancelActionPerformed

    /*
     * updates the progress bar on screen
     */
    @Override
    public void setProgress(int val){
        currProgress.setValue(val);
    }

    /*
     * this method is used when the task is started via the simple window
     */
    public void process(){
        aewp=this;
        Globals.cancelled=false;
        Globals.errorList=new java.util.ArrayList();
        Globals.report="The following tasks were completed successfully:\n\n\n";
        Globals.rp=new ReportPanel();
        Globals.tmp=new JScrollPane(Globals.rp);
                sw=new SwingWorker(){
                protected Object doInBackground(){
                    JoinEntry ee=(JoinEntry)Globals.ee;
                    ArrayList list=new ArrayList();
                    Encoder e=new Encoder();
                    for(int i=0;i<ee.files.length;i++){
                        if(!Globals.cancelled){
                        File f=new File((String)ee.files[i]);
                        File fout=new File(System.getProperty("user.home")+"/.panther/"+f.getName()+".mpg");
                        list.add(fout);
                        EncodingAttributes ae=new EncodingAttributes();
                        AudioAttributes aa=new AudioAttributes();
                        VideoAttributes va=new VideoAttributes();
                        ae.setAudioAttributes(aa);
                        ae.setVideoAttributes(va);
                        ae.setFormat("mpeg");
                        ae.setSameQuality(true);
                        EncoderListener rsl=new EncoderListener();
                        rsl.setParent(aewp);
                        try{
                            currFile.setText("Processing File: "+f.getName());
                            e.encode(f, fout, ae, rsl);
                            Globals.report=Globals.report+"Processed File: "+f.getAbsolutePath()+"\n";
                            overallProgress.setValue((i+1)*100/(ee.files.length*2+1));
                        }catch(Exception ex){
                            System.err.println(ex);
                            Globals.errorList.add(ex);
                        }
                        }else
                            break;
                }
                    if(!Globals.cancelled){
                        currFile.setText("Stitching Files ...");
                        currProgress.setIndeterminate(true);
                        File fout=new File(System.getProperty("user.home")+"/.panther/"+".temp.mpg");
                        try{
                            FileOutputStream outStream=new FileOutputStream(fout);
                            for(int i=0;i<list.size();i++){
                                FileInputStream fin=new FileInputStream((File)list.get(i));
                                // 1MB buffer size for very fast file joining
                                byte[] buffer = new byte[1024*1024];
                                int l;
                                while ((l = fin.read(buffer)) != -1)
                                    outStream.write(buffer, 0, l);
                                overallProgress.setValue((ee.files.length+i+1)*100/(ee.files.length*2+1));
                                fin.close();
                            }
                            Globals.report=Globals.report+"\nFiles stitched successfully!\n";
                            outStream.close();
                        }catch(Exception ex){
                            System.err.println(ex);
                            Globals.errorList.add(ex);
                        }}
                    currProgress.setIndeterminate(false);
                    if(!Globals.cancelled){
                        currFile.setText("Creating File: "+ee.outFile.getName());
                        try{
                            MultimediaInfo mi=e.getInfo(new File((String)ee.files[0]));
                            String format=mi.getFormat();
                            EncodingAttributes ae=new EncodingAttributes();
                            AudioAttributes aa=new AudioAttributes();
                            VideoAttributes va=new VideoAttributes();
                            ae.setAudioAttributes(aa);
                            ae.setVideoAttributes(va);
                            ae.setFormat(format);
                            ae.setSameQuality(true);
                            EncoderListener rsl=new EncoderListener();
                            rsl.setParent(aewp);
                            e.encode(new File(System.getProperty("user.home")+"/.panther/"+".temp.mpg"), ee.outFile, ae,rsl);
                            overallProgress.setValue(100);
                            Globals.report=Globals.report+"\nCreated successfully: "+ee.outFile.getAbsolutePath()+"\n";
                        }catch(Exception ex){
                            System.err.println(ex);
                            Globals.errorList.add(ex);
                        }
                    }
                    Globals.report=Globals.report+"\nErrors:\n\n\n";
                    if(!Globals.errorList.isEmpty()){
                        for(int i=0;i<Globals.errorList.size();i++)
                        Globals.report=Globals.report+(Exception)Globals.errorList.get(i);
                    }
                    Globals.mainFrame.setVisible(false);
                    Globals.mainFrame.remove(Globals.scrollPane);
                    Globals.rp.populateReport();
                    Globals.mainFrame.add(Globals.tmp);
                    Globals.mainFrame.setVisible(true);
                    return null;
                }
            };
            sw.execute();
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel currFile;
    private javax.swing.JProgressBar currProgress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JProgressBar overallProgress;
    // End of variables declaration//GEN-END:variables

}
