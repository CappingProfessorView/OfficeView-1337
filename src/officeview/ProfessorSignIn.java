/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */
public class ProfessorSignIn extends javax.swing.JFrame {

    /**
     * Creates new form ProfessorSignIn
     */
    public ProfessorSignIn() {
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

        ProfessorSignInFrame = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        ProfessorLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Office View");
        setMinimumSize(new java.awt.Dimension(140, 210));
        setResizable(false);

        ProfessorSignInFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ProfessorSignInFrame.setOpaque(false);

        UsernameLabel.setText("Username:");
        UsernameLabel.setName("Username Label"); // NOI18N

        UsernameField.setName("Username box"); // NOI18N
        UsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernameFieldKeyPressed(evt);
            }
        });

        PasswordLabel.setText("Password:");
        PasswordLabel.setName("Password Label"); // NOI18N

        PasswordField.setName("Password box"); // NOI18N
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ProfessorSignInFrameLayout = new javax.swing.GroupLayout(ProfessorSignInFrame);
        ProfessorSignInFrame.setLayout(ProfessorSignInFrameLayout);
        ProfessorSignInFrameLayout.setHorizontalGroup(
            ProfessorSignInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessorSignInFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProfessorSignInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameField)
                    .addGroup(ProfessorSignInFrameLayout.createSequentialGroup()
                        .addGroup(ProfessorSignInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordLabel)
                            .addComponent(UsernameLabel))
                        .addGap(0, 190, Short.MAX_VALUE))
                    .addComponent(PasswordField))
                .addContainerGap())
        );
        ProfessorSignInFrameLayout.setVerticalGroup(
            ProfessorSignInFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessorSignInFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        UsernameField.getAccessibleContext().setAccessibleName("Username box");
        PasswordField.getAccessibleContext().setAccessibleName("Password box");

        ProfessorLogin.setText("Login");
        ProfessorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfessorLoginActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ProfessorLogin))
                    .addComponent(ProfessorSignInFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProfessorSignInFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProfessorLogin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfessorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfessorLoginActionPerformed
        login();
    }//GEN-LAST:event_ProfessorLoginActionPerformed

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
        UsernameFieldKeyPressed(evt);
    }//GEN-LAST:event_PasswordFieldKeyPressed

    private void UsernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_UsernameFieldKeyPressed

    private void login(){
        String un = UsernameField.getText().toLowerCase();
        int pwh = new String(PasswordField.getPassword()).hashCode();
        //if(un.equals("") || pwh == 0){
        if(un.equals("admin") && pwh == 70759573){
            System.out.println("YOU ARE THE ADMIN");
        }
        Professor prof = OfficeView.professors.findOne("{userName: '" + un
                + "', passwordHash: "+ pwh +"}").as(Professor.class);
        if(prof == null) {
            JOptionPane.showMessageDialog(this,"The username or password you entered is incorrect");
        }
        else{
            //OfficeView.currentUserID = prof.getId();
            ProfessorDashboard dash = new ProfessorDashboard(prof);
            dash.setVisible(true);
            this.dispose();
        }
        //}
        //else{
            //System.out.println("Enter Correct Credentials");
        //}
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
            java.util.logging.Logger.getLogger(ProfessorSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessorSignIn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton ProfessorLogin;
    private javax.swing.JPanel ProfessorSignInFrame;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    // End of variables declaration//GEN-END:variables
}
