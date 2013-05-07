/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Mike
 */
public class TimeRange extends javax.swing.JPanel {

    /**
     * Creates new form TimeRange
     */
    public TimeRange() {
        initComponents();
        setVisible(true);
        setSize(getPreferredSize());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HrInBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        MinInBox = new javax.swing.JComboBox();
        PeriodInBox = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        HrOutBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        MinOutBox = new javax.swing.JComboBox();
        PeriodOutBox = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(564, 28));
        setPreferredSize(new java.awt.Dimension(564, 28));

        HrInBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "--" }));
        HrInBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HrInBoxActionPerformed(evt);
            }
        });

        jLabel1.setText(":");

        MinInBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "00", "15", "30", "45", "--" }));

        PeriodInBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "AM", "PM", "--" }));

        jLabel21.setText("to");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        HrOutBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "--" }));
        HrOutBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HrOutBoxActionPerformed(evt);
            }
        });

        jLabel4.setText(":");

        MinOutBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "00", "15", "30", "45", "--" }));

        PeriodOutBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "AM", "PM", "--" }));

        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrInBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MinInBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PeriodInBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HrOutBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MinOutBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PeriodOutBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MinInBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PeriodInBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HrOutBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(MinOutBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PeriodOutBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(HrInBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HrInBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HrInBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HrInBoxActionPerformed

    private void HrOutBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HrOutBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HrOutBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //ProfessorChangeScheduleDialog.delete();
            
            this.HrInBox.setSelectedItem("--");
            this.MinInBox.setSelectedItem("--");
            this.PeriodInBox.setSelectedItem("--");
            this.HrOutBox.setSelectedItem("--");
            this.MinOutBox.setSelectedItem("--");
            this.PeriodOutBox.setSelectedItem("--");
        //this.getParent().revalidate();
        //repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     *
     */
    public ArrayList<JComboBox> getComboValues(){
        ArrayList<JComboBox> arr = new ArrayList<JComboBox>();
        arr.add(this.HrInBox);arr.add(this.MinInBox);arr.add(this.PeriodInBox);
        arr.add(this.HrOutBox);arr.add(this.MinOutBox);arr.add(this.PeriodOutBox);
        return arr;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox HrInBox;
    private javax.swing.JComboBox HrOutBox;
    private javax.swing.JComboBox MinInBox;
    private javax.swing.JComboBox MinOutBox;
    private javax.swing.JComboBox PeriodInBox;
    private javax.swing.JComboBox PeriodOutBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
