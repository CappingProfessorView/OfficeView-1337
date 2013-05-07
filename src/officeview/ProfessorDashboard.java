/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import java.awt.PopupMenu;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JWindow;

/**
 *
 * @author Mike
 */
public class ProfessorDashboard extends javax.swing.JFrame{

    //private static Professor prof = OfficeView.professors.findOne("{id: #}",OfficeView.currentUserID).as(Professor.class);
    private Professor prof;
    /**
     * Creates new form ProfessorMainWindow
     */
    public ProfessorDashboard(){}
    public ProfessorDashboard(Professor prof) {
        this.prof = prof;
        initComponents();
        setLocation((OfficeView.screensize.width/2 - (this.getWidth()/2)), (OfficeView.screensize.height/2 - (this.getHeight()/2)));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(OfficeView.image)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProfessorDashboardSatusFrame = new javax.swing.JPanel();
        CurrentStatusLabel = new javax.swing.JLabel();
        CurrentActiveStatus = new javax.swing.JLabel();
        ProfessorDashboardNameLabel = new javax.swing.JLabel();
        ProfessorDashboardMenu = new javax.swing.JMenuBar();
        ProfessorDashboardMenu_File = new javax.swing.JMenu();
        Schedule = new javax.swing.JMenuItem();
        Separator = new javax.swing.JPopupMenu.Separator();
        Logout = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Available = new javax.swing.JRadioButtonMenuItem();
        Busy = new javax.swing.JRadioButtonMenuItem();
        BeBackSoon = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Office View - Dashboard");
        setName("Professor Dashboard Main Frame"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        ProfessorDashboardSatusFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CurrentStatusLabel.setText("Current Status:");
        CurrentStatusLabel.setName("Status Label"); // NOI18N

        CurrentActiveStatus.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        CurrentActiveStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentActiveStatus.setText("Available");

        javax.swing.GroupLayout ProfessorDashboardSatusFrameLayout = new javax.swing.GroupLayout(ProfessorDashboardSatusFrame);
        ProfessorDashboardSatusFrame.setLayout(ProfessorDashboardSatusFrameLayout);
        ProfessorDashboardSatusFrameLayout.setHorizontalGroup(
            ProfessorDashboardSatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfessorDashboardSatusFrameLayout.createSequentialGroup()
                .addGroup(ProfessorDashboardSatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfessorDashboardSatusFrameLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(CurrentStatusLabel))
                    .addGroup(ProfessorDashboardSatusFrameLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(CurrentActiveStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
        );
        ProfessorDashboardSatusFrameLayout.setVerticalGroup(
            ProfessorDashboardSatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessorDashboardSatusFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CurrentStatusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CurrentActiveStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        ProfessorDashboardNameLabel.setText("Professor Name");

        ProfessorDashboardMenu_File.setText("File");

        Schedule.setText("Schedule");
        Schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleActionPerformed(evt);
            }
        });
        ProfessorDashboardMenu_File.add(Schedule);
        ProfessorDashboardMenu_File.add(Separator);

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        ProfessorDashboardMenu_File.add(Logout);

        ProfessorDashboardMenu.add(ProfessorDashboardMenu_File);

        jMenu3.setText("Status");

        Available.setText("Available");
        Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailableActionPerformed(evt);
            }
        });
        jMenu3.add(Available);

        Busy.setText("Busy");
        Busy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusyActionPerformed(evt);
            }
        });
        jMenu3.add(Busy);

        BeBackSoon.setText("Be Back Soon");
        BeBackSoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeBackSoonActionPerformed(evt);
            }
        });
        jMenu3.add(BeBackSoon);
        BeBackSoon.getAccessibleContext().setAccessibleName("Soon");

        ProfessorDashboardMenu.add(jMenu3);

        setJMenuBar(ProfessorDashboardMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProfessorDashboardSatusFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProfessorDashboardNameLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(ProfessorDashboardNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProfessorDashboardSatusFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableActionPerformed
        this.Available.setSelected(true);
        this.Busy.setSelected(false);
        this.BeBackSoon.setSelected(false);
        this.CurrentActiveStatus.setText("Available");
    }//GEN-LAST:event_AvailableActionPerformed

    private void BusyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusyActionPerformed
        this.Available.setSelected(false);
        this.Busy.setSelected(true);
        this.BeBackSoon.setSelected(false);
        this.CurrentActiveStatus.setText("Busy");
    }//GEN-LAST:event_BusyActionPerformed

    private void BeBackSoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeBackSoonActionPerformed
        this.Available.setSelected(false);
        this.Busy.setSelected(false);
        this.BeBackSoon.setSelected(true);
        this.CurrentActiveStatus.setText("Be Back Soon");
    }//GEN-LAST:event_BeBackSoonActionPerformed

    private void ScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleActionPerformed
       ProfessorChangeScheduleDialog popup = new ProfessorChangeScheduleDialog(prof);
       popup.setVisible(true);
    }//GEN-LAST:event_ScheduleActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        //***TODO:Set professor status and other things***
        int choice = JOptionPane.showConfirmDialog(this, "Do you wish to sign out?");
        if (choice == JOptionPane.YES_OPTION){
            
            this.dispose();
        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.CurrentActiveStatus.setText("Available");
        this.Available.setSelected(true);
        String profName = prof.getFirstName() + " " + prof.getLastName();
        this.ProfessorDashboardNameLabel.setText(profName);
    }//GEN-LAST:event_formWindowActivated

    public Professor getProfessor(){
        return prof;
    }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfessorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessorDashboard().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem Available;
    private javax.swing.JRadioButtonMenuItem BeBackSoon;
    private javax.swing.JRadioButtonMenuItem Busy;
    private javax.swing.JLabel CurrentActiveStatus;
    private javax.swing.JLabel CurrentStatusLabel;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenuBar ProfessorDashboardMenu;
    private javax.swing.JMenu ProfessorDashboardMenu_File;
    private javax.swing.JLabel ProfessorDashboardNameLabel;
    private javax.swing.JPanel ProfessorDashboardSatusFrame;
    private javax.swing.JMenuItem Schedule;
    private javax.swing.JPopupMenu.Separator Separator;
    private javax.swing.JMenu jMenu3;
    // End of variables declaration//GEN-END:variables
}
