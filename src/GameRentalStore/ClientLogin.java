/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRentalStore;

import javax.swing.JOptionPane;

/**
 *
 * @author KhaLed
 */
public class ClientLogin extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public ClientLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameBTN = new javax.swing.JTextField();
        PasswordBTN = new javax.swing.JTextField();
        LoginBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RegisterBTN = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1290, 695));
        getContentPane().setLayout(null);

        UsernameBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameBTNActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameBTN);
        UsernameBTN.setBounds(480, 290, 350, 30);

        PasswordBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordBTNActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordBTN);
        PasswordBTN.setBounds(480, 360, 350, 30);

        LoginBTN.setFont(new java.awt.Font("Champagne & Limousines", 1, 36)); // NOI18N
        LoginBTN.setText("Login");
        LoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTNActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBTN);
        LoginBTN.setBounds(580, 490, 150, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameRentalStore/Login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 80, 780, 180);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameRentalStore/Username.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 270, 160, 140);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameRentalStore/Hint.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 400, 540, 50);

        RegisterBTN.setFont(new java.awt.Font("Champagne & Limousines", 3, 13)); // NOI18N
        RegisterBTN.setText("Register");
        RegisterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterBTN);
        RegisterBTN.setBounds(740, 420, 90, 27);

        jButton3.setFont(new java.awt.Font("Champagne & Limousines", 1, 18)); // NOI18N
        jButton3.setText("MainPage");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1150, 10, 120, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameRentalStore/logbackground.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1280, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordBTNActionPerformed

    private void LoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTNActionPerformed
        if (UsernameBTN.getText().equals("") || PasswordBTN.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Error Try Again");
        }
        
        else
        {
        
        JOptionPane.showMessageDialog(null,"Welcome");
        platformchoose s = new platformchoose();
        s.setVisible(true);
        this.setVisible(false);
        String id = UsernameBTN.getText();
        String pass = PasswordBTN.getText();
        //Client cLog = new Client();
        //cLog.Login(id,pass);
        }
        
    }//GEN-LAST:event_LoginBTNActionPerformed

    private void RegisterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBTNActionPerformed
       Register R = new Register();
        R.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegisterBTNActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        WelcomPage s = new WelcomPage();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void UsernameBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBTN;
    private javax.swing.JTextField PasswordBTN;
    private javax.swing.JButton RegisterBTN;
    private javax.swing.JTextField UsernameBTN;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
