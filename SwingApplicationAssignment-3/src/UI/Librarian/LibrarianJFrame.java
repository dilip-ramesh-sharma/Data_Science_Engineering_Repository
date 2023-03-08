/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Librarian;

import Employee.Employee;
import System.ApplicationSystem;
import System.Branch;
import System.UserAccount;
import UI.MainJFrame;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 91730
 */
public class LibrarianJFrame extends javax.swing.JFrame {
    
    DefaultTableModel viewTableModel;
    private ApplicationSystem applicationsystem;
    private Branch branch;
    private UserAccount useraccount;
    public LibrarianJFrame() {
        initComponents();
    }

    public LibrarianJFrame(ApplicationSystem applicationsystem, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.applicationsystem = applicationsystem;
        this.branch = branch;
        this.useraccount = useraccount;
        displayLocation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        bookButton = new javax.swing.JButton();
        rentalRequestButton = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        locationTextField = new javax.swing.JTextField();
        magazineButton = new javax.swing.JButton();
        jLabelWelcome = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        displayJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlJPanel.setBackground(new java.awt.Color(153, 153, 153));
        controlJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookButton.setText("Add Book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 140, 20));

        rentalRequestButton.setText("Rental Request");
        rentalRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentalRequestButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(rentalRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, -1));

        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        controlJPanel.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 89, -1));

        jLabel1.setText("Location");
        controlJPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 63, 79, -1));

        locationTextField.setEnabled(false);
        locationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTextFieldActionPerformed(evt);
            }
        });
        controlJPanel.add(locationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 60, 95, -1));

        magazineButton.setText("Add Magazine");
        magazineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magazineButtonActionPerformed(evt);
            }
        });
        controlJPanel.add(magazineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 140, 20));

        jLabelWelcome.setText("Username");
        controlJPanel.add(jLabelWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 26, -1, -1));

        jLabelUser.setText("name");
        controlJPanel.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 26, 42, -1));

        jSplitPane1.setLeftComponent(controlJPanel);

        displayJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(displayJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new AddBookJPanel(this.applicationsystem,this.branch, this.useraccount));
    }//GEN-LAST:event_bookButtonActionPerformed

    private void rentalRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentalRequestButtonActionPerformed
       
 jSplitPane1.setRightComponent(new RentReqJPanel(this.applicationsystem,this.branch, this.useraccount)); // TODO add your handling code here:
    }//GEN-LAST:event_rentalRequestButtonActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(this.applicationsystem,this.branch, this.useraccount);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void locationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTextFieldActionPerformed

    private void magazineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magazineButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new AddMagazineJPanel(this.applicationsystem,this.branch, this.useraccount));
    }//GEN-LAST:event_magazineButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianJFrame().setVisible(true);
            }
        });
    }
    
    public void displayLocation()
    {
        jLabelUser.setText(useraccount.getUsername());
        
        locationTextField.setText(useraccount.getAccessTo());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookButton;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JButton magazineButton;
    private javax.swing.JButton rentalRequestButton;
    // End of variables declaration//GEN-END:variables
}
