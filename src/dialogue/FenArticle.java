
package dialogue;

import controle.modele.ModeleArticle;
import controle.utilitaires.GestionDates;
import entite.Article;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class FenArticle extends javax.swing.JFrame {


    
    public FenArticle() {
        initComponents();
        bouton_mode_ajout_ou_edition(true);
    }
 private final  ModeleArticle leModeleArticle = new ModeleArticle();
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxt_Code = new javax.swing.JTextField();
        jTxt_Designation = new javax.swing.JTextField();
        jTxt_Quantite = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTxt_CodeCategorie = new javax.swing.JTextField();
        jTxt_PU = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable(leModeleArticle);
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLab_Supprimer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBtn_Ajouter = new javax.swing.JButton();
        jBtn_Effacer = new javax.swing.JButton();
        jBtn_Modifier = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        JTxt_Rechercher = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 482));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Code");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 9, 41, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Designation");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 38, 76, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Quantite");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, 62, -1));
        jPanel2.add(jTxt_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 9, 180, -1));

        jTxt_Designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_DesignationActionPerformed(evt);
            }
        });
        jPanel2.add(jTxt_Designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 35, 440, -1));
        jPanel2.add(jTxt_Quantite, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 61, 80, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Code Categorie");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 100, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Prix Unitair");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 64, 82, -1));
        jPanel2.add(jTxt_CodeCategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 140, -1));
        jPanel2.add(jTxt_PU, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 590, 90));

        JTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(JTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 590, 140));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-download.png"))); // NOI18N
        jLabel1.setText("Ajouter");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-search.png"))); // NOI18N
        jLabel2.setText("Rechercher");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-edit.png"))); // NOI18N
        jLabel3.setText("Modifier");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, -1));

        jLab_Supprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLab_Supprimer.setForeground(java.awt.Color.white);
        jLab_Supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-deny.png"))); // NOI18N
        jLab_Supprimer.setText("Supprimer");
        jLab_Supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_SupprimerMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_Supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-preview.png"))); // NOI18N
        jLabel5.setText("Apercu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-print.png"))); // NOI18N
        jLabel6.setText("Imprimer");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-language.png"))); // NOI18N
        jLabel7.setText("Exporter");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-frontpage.png"))); // NOI18N
        jLabel8.setText("Menu principal");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 480));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-module.png"))); // NOI18N
        jLabel9.setText("Gestion des articles");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 420, -1));

        jBtn_Ajouter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn_Ajouter.setText("Ajouter");
        jBtn_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_AjouterActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_Ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 80, 30));

        jBtn_Effacer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn_Effacer.setText("effacer");
        jBtn_Effacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_EffacerActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_Effacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 80, 30));

        jBtn_Modifier.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtn_Modifier.setText("Modifier");
        jBtn_Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ModifierActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 80, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("annuler");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 80, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-section.png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 50, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Trier la liste par");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Code", "Nom", "Prenom", "Date Creation", "Ville" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 120, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-info.png"))); // NOI18N
        jLabel13.setText("Rechercher");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 120, 50));

        JTxt_Rechercher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTxt_RechercherKeyReleased(evt);
            }
        });
        getContentPane().add(JTxt_Rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 130, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private int num_ligne_modify =0;
    
    private void jTxt_DesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_DesignationActionPerformed
       
    }//GEN-LAST:event_jTxt_DesignationActionPerformed

    private void jBtn_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_AjouterActionPerformed
     String vCode = jTxt_Code.getText();
        if(!vCode.equals("")){
            String vCodeCategorie = jTxt_CodeCategorie.getText();
            String vDesignation = jTxt_Designation.getText();
            int vQuantite = Integer.valueOf(jTxt_Quantite.getText());
            double vPU = Double.valueOf(jTxt_PU.getText());
            //par la date du jour
            Date vDate = GestionDates.dateJavaEnDateSQL(new Date());
            String strDateMySQL = GestionDates.dateEnChaineFR(vDate);
            
            if(vCodeCategorie.equals("")){
                JOptionPane.showMessageDialog(null, "Vous n'avez pas saisi"
                        +"le code de la categorie", 
                        "avertissement",
                        JOptionPane.WARNING_MESSAGE);
            }
          if(vDesignation.equals("")){
                JOptionPane.showMessageDialog(null, "Vous n'avez pas saisi"
                        +"le code de la designation", 
                        "avertissement",
                        JOptionPane.WARNING_MESSAGE);
            }
          if(vQuantite <= 0){
                JOptionPane.showMessageDialog(null, "Vous n'avez pas saisi"
                        +"le code de la quantite", 
                        "avertissement",
                        JOptionPane.WARNING_MESSAGE);
            }
          if(vPU <= 0){
                JOptionPane.showMessageDialog(null, "Vous n'avez pas saisi"
                        +"le code de le prix", 
                        "avertissement",
                        JOptionPane.WARNING_MESSAGE);
            }
          
          if(!vDesignation.equals("")
              && !vCodeCategorie.equals("")
              && vQuantite > 0
              && vPU > 0){
              Article unArticle = new Article(vCode, vCodeCategorie, vDesignation,
                                vQuantite, vPU, vDate);
              boolean bCreation = false;
              bCreation = unArticle.creerCRUD(vCode, vCodeCategorie, vDesignation,
                      vQuantite, vPU,  strDateMySQL);
              if(bCreation){
                  leModeleArticle.CreerMOD(unArticle);
                  jTxt_Code.setText("");
                  jTxt_CodeCategorie.setText("");
                  jTxt_Designation.setText("");
                  jTxt_Quantite.setText("");
                  jTxt_PU.setText("");
                  jTxt_Code.requestFocus();
              } 
          }else{
              JOptionPane.showMessageDialog(null,
                      "le code article est oblogatoir",""
              + "Avertissement",
                      JOptionPane.WARNING_MESSAGE);
          }
          
      }
    }//GEN-LAST:event_jBtn_AjouterActionPerformed

    private void jBtn_EffacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_EffacerActionPerformed
        jTxt_Code.setText("");
        jTxt_CodeCategorie.setText("");
        jTxt_Designation.setText("");
        jTxt_Quantite.setText("");
        jTxt_PU.setText("");
    }//GEN-LAST:event_jBtn_EffacerActionPerformed

    private void JTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMousePressed
        if(evt.getClickCount() == 2){
            num_ligne_modify = JTable.getSelectedRow();
           jTxt_Code.setText(String.valueOf(JTable.getValueAt(num_ligne_modify, 0)));
           jTxt_CodeCategorie.setText(String.valueOf(JTable.getValueAt(num_ligne_modify, 1)));
           jTxt_Designation.setText(String.valueOf(JTable.getValueAt(num_ligne_modify, 2)));
           jTxt_Quantite.setText(String.valueOf(JTable.getValueAt(num_ligne_modify, 3)));
           jTxt_PU.setText(String.valueOf(JTable.getValueAt(num_ligne_modify, 4)));
            bouton_mode_ajout_ou_edition(false);
        }
    }//GEN-LAST:event_JTableMousePressed

    private void jBtn_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ModifierActionPerformed
       String vCode = jTxt_Code.getText();
        if (!vCode.equals("")) {
            String vReference =
                    jTxt_CodeCategorie.getText();
            String vDesignation =
                    jTxt_Designation.getText();
            int vQuantite = Integer.valueOf(jTxt_Quantite.getText());
            double vPrix_unitaire = Double.valueOf(jTxt_PU.getText());
            Date vDate = GestionDates.dateJavaEnDateSQL(new Date());

            Article unArticle = new Article(vCode,
                    vReference, vDesignation, vQuantite,
                    vPrix_unitaire, vDate);
            boolean bCreation = false;
            bCreation = unArticle.modifierCRUD(vCode,
                    vReference, vDesignation,
                    vQuantite, vPrix_unitaire);
            if (bCreation) {
                leModeleArticle.setValueAt(vCode,
                        num_ligne_modify, 0);
                leModeleArticle.setValueAt(vReference,
                        num_ligne_modify, 1);
                leModeleArticle.setValueAt(vDesignation,
                        num_ligne_modify, 2);
                leModeleArticle.setValueAt(vQuantite,
                        num_ligne_modify, 3);
                leModeleArticle.setValueAt(vPrix_unitaire,
                        num_ligne_modify, 4);

                leModeleArticle.modifierMOD(num_ligne_modify,
                        num_ligne_modify, unArticle);
                jTxt_Code.setText("");
                jTxt_CodeCategorie.setText("");
                jTxt_Designation.setText("");
                jTxt_Quantite.setText("");
                jTxt_PU.setText("");
                jTxt_Code.requestFocus();
                bouton_mode_ajout_ou_edition(true);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Le code article est obligatoire.",
                    "Avertissement", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtn_ModifierActionPerformed

    private void jLab_SupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_SupprimerMouseClicked
        int numLigne = JTable.getSelectedRow();
        if (numLigne == -1) {
            JOptionPane.showMessageDialog(null,
                    "Vous devez sélectionner "
                    + "une ligne pour la supprimer",
                    "Avertissement",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            int choix = JOptionPane.showConfirmDialog(null,
                    "Voulez-vous vraiment supprimer"
                    + " l'article sélectionné ?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if (choix == 0) {
                String vCode = JTable.getValueAt(numLigne, 0).toString();
                Article unArticle = new Article(vCode);
                unArticle.supprimerCRUD(vCode);
                leModeleArticle.supprimerMOD(numLigne);
            }
        }
    }//GEN-LAST:event_jLab_SupprimerMouseClicked

    private void JTxt_RechercherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTxt_RechercherKeyReleased
        Article unArticle = new Article("");
        ArrayList<Article> nouvelleListe =
                unArticle.chercherCRUD(JTxt_Rechercher.getText());
        leModeleArticle.lireRecupMode(nouvelleListe);
    }//GEN-LAST:event_JTxt_RechercherKeyReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        FenMenuPrincipal laFenetre = new FenMenuPrincipal();
        laFenetre.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked
    private void bouton_mode_ajout_ou_edition(boolean isAjout){
        if(isAjout){
            jBtn_Ajouter.setEnabled(true);
            jBtn_Effacer.setEnabled(true);
            jBtn_Modifier.setEnabled(false);
            jButton4.setEnabled(false);
        }else{
            jBtn_Ajouter.setEnabled(false);
            jBtn_Effacer.setEnabled(false);
            jBtn_Modifier.setEnabled(true);
            jButton4.setEnabled(true);
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
            java.util.logging.Logger.getLogger(FenArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenArticle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable JTable;
    private javax.swing.JTextField JTxt_Rechercher;
    private javax.swing.JButton jBtn_Ajouter;
    private javax.swing.JButton jBtn_Effacer;
    private javax.swing.JButton jBtn_Modifier;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLab_Supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxt_Code;
    private javax.swing.JTextField jTxt_CodeCategorie;
    private javax.swing.JTextField jTxt_Designation;
    private javax.swing.JTextField jTxt_PU;
    private javax.swing.JTextField jTxt_Quantite;
    // End of variables declaration//GEN-END:variables
}
