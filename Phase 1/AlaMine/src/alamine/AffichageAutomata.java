/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamine;

import alamine.Automate2Etats.Nain2Etats;
import alamine.State.State;
import alamine.State.State_Travail;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Beelzed
 */
public class AffichageAutomata extends javax.swing.JFrame {

    private ArrayList<String> listMusic;
    /**
     * Creates new form Affichage
     */
    public AffichageAutomata() throws InterruptedException {
        initComponents();
        listMusic = new ArrayList<>();
        File directory = new File("C:\\Users\\yv066840\\Desktop\\ModelisationS3\\Phase 1\\AlaMine\\src\\alamine\\Ressources");
        String[] list = directory.list();
        for (String s : list){
            if (s.endsWith(".mp3")){
                jComboBox1.addItem(s.substring(0, s.length()-4));
            }
        }
        jLabel5.setIcon(new ImageIcon("C:\\Users\\yv066840\\Desktop\\ModelisationS3\\Phase 1\\AlaMine\\src\\alamine\\Ressources\\Gandalf.png"));
        jPanel2.setVisible(false);
        jLabel5.setVisible(false);
        jLabel7.setVisible(false);
    }

    public void runNain() throws InterruptedException{
        Nain n = new Nain();
        Temps t = new Temps();
        t.resetHorloge();
        if(jLabel5.isVisible()){
            jLabel5.setVisible(false);
            jLabel7.setVisible(false);
        }
        Lecteur.play("Ressources/"+ jComboBox1.getSelectedItem() + ".mp3", 20); 
        int it = (int)jSpinner1.getValue();
        for(int i=0;i<(24*it*3);i++){
            n.getEtat().agir();
            /*System.out.println(t.toString());
            System.out.println(n.toString());
            if(i%(24*3)==0){
                System.out.println(n.getCptTaverne().toString("Taverne"));
                System.out.println(n.getCptMine().toString("Mine"));
            }*/
            Random r = new Random();
            double d = r.nextDouble();
            if (d<0.000001 && !jLabel5.isVisible()){
                   jLabel5.setVisible(true); 
                   jLabel7.setVisible(true);
            }
           
            n.setEtat(n.getEtat().transition());
            t.passeTranche();  
        }
        this.jPanel2.setVisible(true);
        this.jLabel4.setText(n.getCptTaverne().toString("Taverne"));
        this.jLabel3.setText(n.getCptMine().toString("Mine"));
        this.jLabel6.setText(n.getCptForge().toString("Forge"));
        this.jLabel8.setText("Proba de rester dans la taverne : " + (double) n.getCptResteTaverne().getNbIteration()/n.getCptTaverne().getNbIteration());
        this.jLabel9.setText("Proba de sortir de la taverne : "+(double) n.getCptTaverneToMine().getNbIteration()/n.getCptTaverne().getNbIteration());
        double res = (double) n.getCptMineToForge().getNbIteration()/ (double) n.getCptMine().getNbIteration();
        res *= ((double) n.getCptForgeToTaverne().getNbIteration()/ (double) n.getCptForge().getNbIteration());
        this.jLabel10.setText("Proba de passer de la mine a la taverne : " + res);
        Lecteur.stopAllAudio();
    }
    
        public void runNain2Etats() throws InterruptedException{
        Nain2Etats n = new Nain2Etats();
        Temps t = new Temps();
        t.resetHorloge();
        if(jLabel5.isVisible()){
            jLabel5.setVisible(false);
            jLabel7.setVisible(false);
        }
        Lecteur.play("Ressources/"+ jComboBox1.getSelectedItem() + ".mp3", 20); 
        int it = (int)jSpinner1.getValue();
        for(int i=0;i<(24*it*3);i++){
            n.getEtat().agir();
            /*System.out.println(t.toString());
            System.out.println(n.toString());
            if(i%(24*3)==0){
                System.out.println(n.getCptTaverne().toString("Taverne"));
                System.out.println(n.getCptMine().toString("Mine"));
            }*/
            Random r = new Random();
            double d = r.nextDouble();
            if (d<0.000001 && !jLabel5.isVisible()){
                   jLabel5.setVisible(true); 
                   jLabel7.setVisible(true);
            }
           
            n.setEtat(n.getEtat().transition());
            t.passeTranche();  
        }
        this.jPanel2.setVisible(true);
        this.jLabel4.setText(n.getCptTaverne().toString("Taverne"));
        this.jLabel3.setText(n.getCptMine().toString("Mine"));
        this.jLabel6.setText(n.getCptForge().toString("Forge"));
        this.jLabel8.setText("Proba de rester dans la taverne : " + (double) n.getCptResteTaverne().getNbIteration()/n.getCptTaverne().getNbIteration());
        this.jLabel9.setText("Proba de sortir de la taverne : "+(double) n.getCptTaverneToMine().getNbIteration()/n.getCptTaverne().getNbIteration());
        double res = (double) n.getCptMineToForge().getNbIteration()/ (double) n.getCptMine().getNbIteration();
        res *= ((double) n.getCptForgeToTaverne().getNbIteration()/ (double) n.getCptForge().getNbIteration());
        this.jLabel10.setText("Proba de passer de la mine a la taverne : " + res);
        Lecteur.stopAllAudio();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        automatePleinDEtats = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        automate2Etats = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 190, -1));

        jLabel1.setText("Music : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 80, -1));

        automatePleinDEtats.setText("Lancez le nain !");
        automatePleinDEtats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automatePleinDEtatsActionPerformed(evt);
            }
        });
        jPanel1.add(automatePleinDEtats, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 10, 120, -1));

        jLabel2.setText("Nombre de jours :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel4.setText("jLabel4");

        jLabel3.setText("jLabel3");

        jLabel6.setText("jLabel6");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(416, 416, 416))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 860, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jButton1.setText("Gandalf");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel7.setText("You shall not pass");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        automate2Etats.setText("Automate 2 etats");
        automate2Etats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automate2EtatsActionPerformed(evt);
            }
        });
        jPanel1.add(automate2Etats, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(jLabel5.isVisible()){
        jLabel5.setVisible(false);
        jLabel7.setVisible(false);
    }
    else {
        jLabel5.setVisible(true);
        jLabel7.setVisible(true);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void automatePleinDEtatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automatePleinDEtatsActionPerformed
        try {
            if(this.jPanel2.isVisible()){
                this.jPanel2.setVisible((false));
            }
            this.automatePleinDEtats.setVisible(false);
            this.runNain();
            this.automatePleinDEtats.setVisible(true);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(AffichageAutomata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_automatePleinDEtatsActionPerformed

    private void automate2EtatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automate2EtatsActionPerformed
        try {
            if(this.jPanel2.isVisible()){
                this.jPanel2.setVisible((false));
            }
            this.automatePleinDEtats.setVisible(false);
            this.runNain2Etats();
            this.automatePleinDEtats.setVisible(true);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(AffichageAutomata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_automate2EtatsActionPerformed

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
            java.util.logging.Logger.getLogger(AffichageAutomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AffichageAutomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AffichageAutomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AffichageAutomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AffichageAutomata().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AffichageAutomata.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton automate2Etats;
    private javax.swing.JButton automatePleinDEtats;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
