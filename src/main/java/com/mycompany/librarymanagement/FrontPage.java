package com.mycompany.librarymanagement;


import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAYANK MISHRA
 */
public class FrontPage extends javax.swing.JFrame {

    /**
     * Creates new form StartPage
     */
    public FrontPage() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 1600));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 72)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGMENT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 80, 380, 70);

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 72)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LIBRARY ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(65, 10, 270, 70);

        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(135, 270, 140, 70);

        jLabel5.setForeground(new java.awt.Color(5, 5, 40));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\SEM 3 project\\Library\\pexels-ricky-esquivel-1907784.jpg")); // NOI18N
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -150, 400, 610);

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 72)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("PASSWORD ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 40, 350, 70);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(340, 420, 37, 16);

        setSize(new java.awt.Dimension(409, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
LoginPage lf1 = new LoginPage();
        lf1.setVisible(true);
        lf1.pack();
        lf1.setLocationRelativeTo(null);
        lf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
