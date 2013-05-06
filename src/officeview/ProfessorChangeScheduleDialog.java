/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import java.awt.Component;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

/**
 *
 * @author Mike
 */
public class ProfessorChangeScheduleDialog extends javax.swing.JDialog {

    ArrayList display = new ArrayList();

    /**
     * Creates new form ProfessorChangeScheduleDialog
     */
    public ProfessorChangeScheduleDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocation((OfficeView.screensize.width / 2 - (this.getWidth() / 2)), (OfficeView.screensize.height / 2 - (this.getHeight() / 2)));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(OfficeView.image)));
        Professor prof = ProfessorDashboard.getProfessor();
        Schedule profSched = prof.getSchedule();
        /*for (int i=0;i<5;i++){
         TimeRange temp = new TimeRange();
         JPanel tab = (JPanel)ProfessorChangeScheduleTabList.getComponent(i);
         JScrollPane scrollPane = (JScrollPane) tab.getComponent(2); 
         JViewport scrollView = (JViewport) scrollPane.getComponent(0);
         JPanel innerPanel = (JPanel) scrollView.getComponent(0);
         for(Day day : profSched){
            
         } 
         }*/


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProfessorChangeScheduleTabList = new javax.swing.JTabbedPane();
        Monday = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MondayScrollPane = new javax.swing.JScrollPane();
        MondayInnerPanel = new javax.swing.JPanel();
        Tuesday = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MondayScrollPane1 = new javax.swing.JScrollPane();
        MondayInnerPanel1 = new javax.swing.JPanel();
        Wednesday = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MondayScrollPane2 = new javax.swing.JScrollPane();
        MondayInnerPanel2 = new javax.swing.JPanel();
        Thursday = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        MondayScrollPane3 = new javax.swing.JScrollPane();
        MondayInnerPanel3 = new javax.swing.JPanel();
        Friday = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        MondayScrollPane4 = new javax.swing.JScrollPane();
        MondayInnerPanel4 = new javax.swing.JPanel();
        UpdateButton = new javax.swing.JButton();
        AddTime = new javax.swing.JButton();
        LocationLabel = new javax.swing.JLabel();
        LocationBar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(536, 305));
        setModal(true);
        setResizable(false);

        jLabel2.setText("Time In");

        jLabel3.setText("Time Out");

        MondayScrollPane.setMaximumSize(new java.awt.Dimension(492, 32767));
        MondayScrollPane.setMinimumSize(new java.awt.Dimension(492, 22));
        MondayScrollPane.setPreferredSize(new java.awt.Dimension(492, 19));

        MondayInnerPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout MondayInnerPanelLayout = new javax.swing.GroupLayout(MondayInnerPanel);
        MondayInnerPanel.setLayout(MondayInnerPanelLayout);
        MondayInnerPanelLayout.setHorizontalGroup(
            MondayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        MondayInnerPanelLayout.setVerticalGroup(
            MondayInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        MondayScrollPane.setViewportView(MondayInnerPanel);

        javax.swing.GroupLayout MondayLayout = new javax.swing.GroupLayout(Monday);
        Monday.setLayout(MondayLayout);
        MondayLayout.setHorizontalGroup(
            MondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MondayLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(121, 121, 121))
            .addComponent(MondayScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        MondayLayout.setVerticalGroup(
            MondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MondayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addComponent(MondayScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        );

        ProfessorChangeScheduleTabList.addTab("Monday", Monday);

        jLabel6.setText("Time In");

        jLabel7.setText("Time Out");

        MondayScrollPane1.setMaximumSize(new java.awt.Dimension(492, 32767));
        MondayScrollPane1.setMinimumSize(new java.awt.Dimension(492, 22));
        MondayScrollPane1.setPreferredSize(new java.awt.Dimension(492, 19));

        MondayInnerPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout MondayInnerPanel1Layout = new javax.swing.GroupLayout(MondayInnerPanel1);
        MondayInnerPanel1.setLayout(MondayInnerPanel1Layout);
        MondayInnerPanel1Layout.setHorizontalGroup(
            MondayInnerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        MondayInnerPanel1Layout.setVerticalGroup(
            MondayInnerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        MondayScrollPane1.setViewportView(MondayInnerPanel1);

        javax.swing.GroupLayout TuesdayLayout = new javax.swing.GroupLayout(Tuesday);
        Tuesday.setLayout(TuesdayLayout);
        TuesdayLayout.setHorizontalGroup(
            TuesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TuesdayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(116, 116, 116))
            .addComponent(MondayScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        TuesdayLayout.setVerticalGroup(
            TuesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TuesdayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TuesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addComponent(MondayScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        );

        ProfessorChangeScheduleTabList.addTab("Tuesday", Tuesday);

        jLabel10.setText("Time In");

        jLabel11.setText("Time Out");

        MondayScrollPane2.setMaximumSize(new java.awt.Dimension(492, 32767));
        MondayScrollPane2.setMinimumSize(new java.awt.Dimension(492, 22));
        MondayScrollPane2.setPreferredSize(new java.awt.Dimension(492, 19));

        MondayInnerPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout MondayInnerPanel2Layout = new javax.swing.GroupLayout(MondayInnerPanel2);
        MondayInnerPanel2.setLayout(MondayInnerPanel2Layout);
        MondayInnerPanel2Layout.setHorizontalGroup(
            MondayInnerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        MondayInnerPanel2Layout.setVerticalGroup(
            MondayInnerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        MondayScrollPane2.setViewportView(MondayInnerPanel2);

        javax.swing.GroupLayout WednesdayLayout = new javax.swing.GroupLayout(Wednesday);
        Wednesday.setLayout(WednesdayLayout);
        WednesdayLayout.setHorizontalGroup(
            WednesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WednesdayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(116, 116, 116))
            .addComponent(MondayScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        WednesdayLayout.setVerticalGroup(
            WednesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WednesdayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WednesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(9, 9, 9)
                .addComponent(MondayScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        );

        ProfessorChangeScheduleTabList.addTab("Wednesday", Wednesday);

        jLabel14.setText("Time In");

        jLabel15.setText("Time Out");

        MondayScrollPane3.setMaximumSize(new java.awt.Dimension(492, 32767));
        MondayScrollPane3.setMinimumSize(new java.awt.Dimension(492, 22));
        MondayScrollPane3.setPreferredSize(new java.awt.Dimension(492, 19));

        MondayInnerPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout MondayInnerPanel3Layout = new javax.swing.GroupLayout(MondayInnerPanel3);
        MondayInnerPanel3.setLayout(MondayInnerPanel3Layout);
        MondayInnerPanel3Layout.setHorizontalGroup(
            MondayInnerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        MondayInnerPanel3Layout.setVerticalGroup(
            MondayInnerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        MondayScrollPane3.setViewportView(MondayInnerPanel3);

        javax.swing.GroupLayout ThursdayLayout = new javax.swing.GroupLayout(Thursday);
        Thursday.setLayout(ThursdayLayout);
        ThursdayLayout.setHorizontalGroup(
            ThursdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThursdayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(116, 116, 116))
            .addComponent(MondayScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        ThursdayLayout.setVerticalGroup(
            ThursdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThursdayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThursdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(9, 9, 9)
                .addComponent(MondayScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        );

        ProfessorChangeScheduleTabList.addTab("Thursday", Thursday);

        jLabel26.setText("Time In");

        jLabel27.setText("Time Out");

        MondayScrollPane4.setMaximumSize(new java.awt.Dimension(492, 32767));
        MondayScrollPane4.setMinimumSize(new java.awt.Dimension(492, 22));
        MondayScrollPane4.setPreferredSize(new java.awt.Dimension(492, 19));

        MondayInnerPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout MondayInnerPanel4Layout = new javax.swing.GroupLayout(MondayInnerPanel4);
        MondayInnerPanel4.setLayout(MondayInnerPanel4Layout);
        MondayInnerPanel4Layout.setHorizontalGroup(
            MondayInnerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        MondayInnerPanel4Layout.setVerticalGroup(
            MondayInnerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        MondayScrollPane4.setViewportView(MondayInnerPanel4);

        javax.swing.GroupLayout FridayLayout = new javax.swing.GroupLayout(Friday);
        Friday.setLayout(FridayLayout);
        FridayLayout.setHorizontalGroup(
            FridayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FridayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(116, 116, 116))
            .addComponent(MondayScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        FridayLayout.setVerticalGroup(
            FridayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FridayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FridayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addGap(9, 9, 9)
                .addComponent(MondayScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        );

        ProfessorChangeScheduleTabList.addTab("Friday", Friday);

        UpdateButton.setText("Update");

        AddTime.setText("+");
        AddTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTimeActionPerformed(evt);
            }
        });

        LocationLabel.setText("Location:");

        LocationBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationBarActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LocationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LocationBar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AddTime)
                        .addGap(200, 200, 200)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateButton))
                    .addComponent(ProfessorChangeScheduleTabList))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProfessorChangeScheduleTabList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddTime)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(UpdateButton)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTimeActionPerformed
        TimeRange temp = new TimeRange();
        JPanel tab = (JPanel) ProfessorChangeScheduleTabList.getSelectedComponent();
        JScrollPane scrollPane = (JScrollPane) tab.getComponent(2);
        JViewport scrollView = (JViewport) scrollPane.getComponent(0);
        JPanel innerPanel = (JPanel) scrollView.getComponent(0);



        //int componentCount = innerPanel.getComponentCount();
        //innerPanel.removeAll();
        //for(int i=0;i<4;i++){
        //    innerPanel.add(temp).setLocation(0, 30 * i+1);
        //    innerPanel.validate();
        //}
        int count = innerPanel.getComponentCount();
        innerPanel.add(temp).setLocation(0, 30 * count + 1);
        innerPanel.validate();
    }//GEN-LAST:event_AddTimeActionPerformed

    private void LocationBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationBarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JPanel tab = (JPanel) ProfessorChangeScheduleTabList.getSelectedComponent();
        JScrollPane scrollPane = (JScrollPane) tab.getComponent(2);
        JViewport scrollView = (JViewport) scrollPane.getComponent(0);
        JPanel innerPanel = (JPanel) scrollView.getComponent(0);
        Component list[] = innerPanel.getComponents();
        for (int i = 0; i < innerPanel.getComponents().length - 1; i++) {
            TimeRange temp = (TimeRange) list[i];
            System.out.println(temp.getComponents());

        }
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfessorChangeScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorChangeScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorChangeScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorChangeScheduleDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProfessorChangeScheduleDialog dialog = new ProfessorChangeScheduleDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTime;
    private javax.swing.JPanel Friday;
    private javax.swing.JTextField LocationBar;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JPanel Monday;
    private javax.swing.JPanel MondayInnerPanel;
    private javax.swing.JPanel MondayInnerPanel1;
    private javax.swing.JPanel MondayInnerPanel2;
    private javax.swing.JPanel MondayInnerPanel3;
    private javax.swing.JPanel MondayInnerPanel4;
    private javax.swing.JScrollPane MondayScrollPane;
    private javax.swing.JScrollPane MondayScrollPane1;
    private javax.swing.JScrollPane MondayScrollPane2;
    private javax.swing.JScrollPane MondayScrollPane3;
    private javax.swing.JScrollPane MondayScrollPane4;
    private javax.swing.JTabbedPane ProfessorChangeScheduleTabList;
    private javax.swing.JPanel Thursday;
    private javax.swing.JPanel Tuesday;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JPanel Wednesday;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
