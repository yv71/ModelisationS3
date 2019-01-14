/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographie.DiffieHellman;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author yv066840
 */
public class Fenetre extends javax.swing.JFrame {

    /**
     * Creates new form Fenetre
     */
    public Fenetre() {
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

        lNbCommun = new javax.swing.JLabel();
        jNbCommun = new javax.swing.JTextField();
        lNbPerso = new javax.swing.JLabel();
        jNbSecretAlice = new javax.swing.JTextField();
        lCleInter = new javax.swing.JLabel();
        rCleInterAlice = new javax.swing.JLabel();
        lNbAmi = new javax.swing.JLabel();
        lCle = new javax.swing.JLabel();
        jCleAlice = new javax.swing.JLabel();
        jButtonCleInter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNbSecretBob = new javax.swing.JTextField();
        jCleInterBob = new javax.swing.JLabel();
        jNbAmiAlice = new javax.swing.JLabel();
        jNbAmiBob = new javax.swing.JLabel();
        jCleBob = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lNbCommun.setText("Entrer votre nombre commun");

        lNbPerso.setText("Entrer votre nombre secret");

        lCleInter.setText("Donner cette valeur à votre ami");

        lNbAmi.setText("Entrer le nombre de votre ami");

        lCle.setText("Votre cle commune");

        jButtonCleInter.setText("Valider");
        jButtonCleInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleInterActionPerformed(evt);
            }
        });

        jLabel1.setText("Alice");

        jLabel2.setText("Bob");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNbCommun)
                    .addComponent(lNbPerso)
                    .addComponent(lCleInter)
                    .addComponent(lNbAmi)
                    .addComponent(lCle))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jNbAmiAlice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jNbSecretAlice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rCleInterAlice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCleAlice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jNbSecretBob, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(jCleInterBob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jNbAmiBob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCleBob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jButtonCleInter)
                                .addContainerGap(230, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jNbCommun, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNbCommun)
                    .addComponent(jNbCommun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNbPerso)
                    .addComponent(jNbSecretAlice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNbSecretBob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCleInter)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lCleInter)
                    .addComponent(rCleInterAlice, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jCleInterBob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lNbAmi)
                    .addComponent(jNbAmiAlice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNbAmiBob, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCleBob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lCle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCleAlice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCleInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleInterActionPerformed
        if(!this.jNbCommun.getText().isEmpty() && !this.jNbSecretAlice.getText().isEmpty() && !this.jNbSecretBob.getText().isEmpty()){
            double cleInterAlice = DiffieHellman.calculCle(Double.valueOf(this.jNbCommun.getText()), Double.valueOf(this.jNbSecretAlice.getText()));
            double cleInterBob = DiffieHellman.calculCle(Double.valueOf(this.jNbCommun.getText()), Double.valueOf(this.jNbSecretBob.getText()));
            NumberFormat formatter = new DecimalFormat("#0");
            this.rCleInterAlice.setText(formatter.format(cleInterAlice));
            this.jCleInterBob.setText(formatter.format(cleInterBob));
            this.jNbAmiAlice.setText(this.jCleInterBob.getText());
            this.jNbAmiBob.setText(this.rCleInterAlice.getText());
            double cleAlice = DiffieHellman.calculCle(Double.valueOf(this.jNbAmiAlice.getText()), Double.valueOf(this.jNbSecretAlice.getText()));
            double cleBob = DiffieHellman.calculCle(Double.valueOf(this.jNbAmiBob.getText()), Double.valueOf(this.jNbSecretBob.getText()));
            this.jCleAlice.setText(formatter.format(cleAlice));
            this.jCleBob.setText(formatter.format(cleBob));
        }
    }//GEN-LAST:event_jButtonCleInterActionPerformed

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
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCleInter;
    private javax.swing.JLabel jCleAlice;
    private javax.swing.JLabel jCleBob;
    private javax.swing.JLabel jCleInterBob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jNbAmiAlice;
    private javax.swing.JLabel jNbAmiBob;
    private javax.swing.JTextField jNbCommun;
    private javax.swing.JTextField jNbSecretAlice;
    private javax.swing.JTextField jNbSecretBob;
    private javax.swing.JLabel lCle;
    private javax.swing.JLabel lCleInter;
    private javax.swing.JLabel lNbAmi;
    private javax.swing.JLabel lNbCommun;
    private javax.swing.JLabel lNbPerso;
    private javax.swing.JLabel rCleInterAlice;
    // End of variables declaration//GEN-END:variables
}
