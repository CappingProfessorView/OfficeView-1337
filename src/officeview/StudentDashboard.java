/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Iterator;
//import officeview.OfficeView.School;
import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */
public class StudentDashboard extends javax.swing.JFrame {

    /**
     * Creates new form StudentView
     */
    public StudentDashboard() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        SearchByNameTab = new javax.swing.JPanel();
        LastNameBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        FirstNameBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SearchByNameButton = new javax.swing.JButton();
        SearchBySchoolTab = new javax.swing.JPanel();
        SchoolComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        SearchBySchoolButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Office View - Dashboard");

        LastNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameBoxActionPerformed(evt);
            }
        });
        LastNameBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LastNameBoxKeyPressed(evt);
            }
        });

        jLabel1.setText("Last:");

        FirstNameBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FirstNameBoxKeyPressed(evt);
            }
        });

        jLabel2.setText("First:");

        SearchByNameButton.setText("Search");
        SearchByNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByNameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchByNameTabLayout = new javax.swing.GroupLayout(SearchByNameTab);
        SearchByNameTab.setLayout(SearchByNameTabLayout);
        SearchByNameTabLayout.setHorizontalGroup(
            SearchByNameTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchByNameTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchByNameTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(SearchByNameTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstNameBox, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(LastNameBox))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchByNameTabLayout.createSequentialGroup()
                .addGap(0, 279, Short.MAX_VALUE)
                .addComponent(SearchByNameButton))
        );
        SearchByNameTabLayout.setVerticalGroup(
            SearchByNameTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchByNameTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchByNameTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SearchByNameTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(SearchByNameButton))
        );

        jTabbedPane1.addTab("Search by Name", SearchByNameTab);

        SchoolComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Communication & the Arts", "Computer Science & Mathematics", "Global and Professional Programs", "Liberal Arts", "Management", "Science", "Social & Behavioral Sciences" }));
        SchoolComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchoolComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("School of:");

        SearchBySchoolButton.setText("Search");
        SearchBySchoolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBySchoolButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchBySchoolTabLayout = new javax.swing.GroupLayout(SearchBySchoolTab);
        SearchBySchoolTab.setLayout(SearchBySchoolTabLayout);
        SearchBySchoolTabLayout.setHorizontalGroup(
            SearchBySchoolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchBySchoolTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SchoolComboBox, 0, 277, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchBySchoolTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SearchBySchoolButton))
        );
        SearchBySchoolTabLayout.setVerticalGroup(
            SearchBySchoolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchBySchoolTabLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(SearchBySchoolTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SchoolComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(SearchBySchoolButton))
        );

        jTabbedPane1.addTab("Search by School", SearchBySchoolTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab1\ntab2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LastNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameBoxActionPerformed

    private void SchoolComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchoolComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SchoolComboBoxActionPerformed

    private void SearchByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByNameButtonActionPerformed
        search();
    }//GEN-LAST:event_SearchByNameButtonActionPerformed

    private void SearchBySchoolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBySchoolButtonActionPerformed
        //searchEnum(this.SchoolComboBox.getSelectedItem().toString());
        //System.out.println(School.);
        //Iterable<Professor> temp = OfficeView.professors.find("{school: #}",school).as(Professor.class);
        
        //returnResults(temp.iterator());
        String school = SchoolComboBox.getSelectedItem().toString();
        Iterable<Professor> temp = OfficeView.professors.find(
                "{\"school\": #}",school).as(Professor.class);
        returnResults(temp.iterator());
    }//GEN-LAST:event_SearchBySchoolButtonActionPerformed

    private void LastNameBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNameBoxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            search();
        }
    }//GEN-LAST:event_LastNameBoxKeyPressed

    private void FirstNameBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNameBoxKeyPressed
        LastNameBoxKeyPressed(evt);
    }//GEN-LAST:event_FirstNameBoxKeyPressed

    private void search(){
        String firstName = this.FirstNameBox.getText().toLowerCase();
        String lastName = this.LastNameBox.getText().toLowerCase();
        Iterator<Professor> results = null;
        
        if (firstName.equals("") && !lastName.equals("")){
            Iterable<Professor> temp = OfficeView.professors.find(
                "{\"lastName\": #}",lastName).as(Professor.class);
            results = temp.iterator();
        }
        else if(lastName.equals("") && !firstName.equals("")){
            Iterable<Professor> temp = OfficeView.professors.find(
                "{\"firstName\": #}",firstName).as(Professor.class);
            results = temp.iterator();
        }
        else if(!firstName.equals("") && !lastName.equals("")){
            Iterable<Professor> temp = OfficeView.professors.find(
                "{\"firstName\": #, \"lastName\": #}",firstName,lastName).as(Professor.class);
            results = temp.iterator();
        }
        
        returnResults(results);
    } 
    
    
    /*private static School searchEnum(String text) {
        if (text != null) {
          for (School s : School.values()) {
              //if (text.equalsIgnoreCase(s.name().toString())) {
             // return s;
            //}
          }
        }
        return null;
    }*/
    
    private void returnResults(Iterator results){
        if (!results.hasNext()){
            JOptionPane.showMessageDialog(this,"No professors found");
        }
        else{
            ProfessorResultsWindow2 resultsWindow = new ProfessorResultsWindow2(results);
            resultsWindow.setVisible(true);
            //while (results.hasNext()){
                //System.out.println(results.next());
                //System.out.println();
            //}
            
        }
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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDashboard().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstNameBox;
    private javax.swing.JTextField LastNameBox;
    private javax.swing.JComboBox SchoolComboBox;
    private javax.swing.JButton SearchByNameButton;
    private javax.swing.JPanel SearchByNameTab;
    private javax.swing.JButton SearchBySchoolButton;
    private javax.swing.JPanel SearchBySchoolTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
