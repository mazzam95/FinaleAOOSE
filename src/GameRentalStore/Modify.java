/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRentalStore;

import javax.swing.JOptionPane;

/**
 *
 * @author Mohammed Azzam
 */
public class Modify extends javax.swing.JFrame {

    /**
     * Creates new form Modify
     */
    public Modify() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1290, 695));
        getContentPane().setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grand Theft Auto (PS4)", "Grand Theft Auto (XB1)", "FIFA18 (PS4)", "FIFA18 (XB1)" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(40, 140, 430, 30);

        jButton1.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        jButton1.setText("Modify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 590, 140, 40);

        jButton2.setFont(new java.awt.Font("Champagne & Limousines", 1, 18)); // NOI18N
        jButton2.setText("Goback");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1170, 10, 100, 30);

        jButton14.setFont(new java.awt.Font("Champagne & Limousines", 1, 18)); // NOI18N
        jButton14.setText("Log Out");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(1060, 10, 100, 30);

        jLabel5.setFont(new java.awt.Font("Champagne & Limousines", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Modification Center");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 10, 500, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Please make sure to input the right updates and information modifications");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 80, 660, 40);

        jLabel3.setFont(new java.awt.Font("Orator Std", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Description");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 410, 270, 40);

        jLabel2.setFont(new java.awt.Font("Orator Std", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Year");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 310, 70, 40);

        jLabel6.setFont(new java.awt.Font("Orator Std", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 200, 130, 40);

        jLabel7.setFont(new java.awt.Font("Orator Std", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Company");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 260, 120, 40);

        jLabel8.setFont(new java.awt.Font("Orator Std", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("availability");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 360, 180, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 450, 330, 110);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", " " }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(150, 310, 130, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 210, 230, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(150, 260, 270, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available yet" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(220, 370, 150, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameRentalStore/adminbackground.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1280, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StaffMenu s = new StaffMenu();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Stafflogin s = new Stafflogin();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextArea1.getText().equals("")|| jTextField3.getText().equals("")|| jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Error Try Again");
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"Game Modified");
        
        
        String company=jTextField3.getText();
        String name=jTextField1.getText();
        String year=jComboBox5.getActionCommand();
        float r=Float.parseFloat(year);
        String disc=jTextArea1.getText();
        String ava=jComboBox3.getActionCommand();
        
        Admin s=new Admin();
        if (s.GameStore(name,company,r,disc,ava)){
            JOptionPane.showMessageDialog(null,"Game Modified");
        }
        else{
          JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);

        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
