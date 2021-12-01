/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.swingdemo;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Fretty
 */
public class SwingAdd extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form SwingAdd
     */
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton b1, b2;
    int x, y, z;

    public SwingAdd() {
        initComponents();
        try {
            t1 = new JTextField(8);
            l1 = new JLabel("Enter 1st number");
            t2 = new JTextField(8);
            l2 = new JLabel("Enter 2nd number");
            t3 = new JTextField(8);
            l3 = new JLabel("Result is ");
            b1 = new JButton("Addition");
            b2 = new JButton("Exit");
            l1.setBounds(10, 20, 100, 30);
            t1.setBounds(200, 20, 100, 30);
            l2.setBounds(10, 50, 100, 30);
            t2.setBounds(200, 50, 100, 30);
            l3.setBounds(10, 80, 100, 30);
            t3.setBounds(200, 80, 100, 30);
            b1.setBounds(150, 120, 100, 30);
            b2.setBounds(250, 120, 100, 30);
            b1.addActionListener(this);
            b2.addActionListener(this);
            add(t1);
            add(l1);
            add(t2);
            add(l2);
            add(t3);
            add(l3);
            add(b1);
            add(b2);
            t1.setText("0");
            t2.setText("0");
            setSize(500, 500);
            setLayout(null);
            setVisible(true);
        } catch (Exception ex) {
            System.err.println(ex);
        }

    }

    public void actionPerformed(ActionEvent ae) {
        //command for exit button
        String choice = ae.getActionCommand();
        if (choice.equalsIgnoreCase("Addition")) //1st choice
        {
            String s1, s2, s;
            s1 = t1.getText();
            x = Integer.parseInt(s1);
            s2 = t2.getText();
            y = Integer.parseInt(s2);
            z = x + y;
            s = String.valueOf(z);
            t3.setText(s);
            //dialog box
            JOptionPane.showMessageDialog(this, "The addition of " + s1 + " and " + s2 + " is = " + s);
        } else {
            System.exit(0); //exit code
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SwingAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
