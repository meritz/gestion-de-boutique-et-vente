
package dialogue;
import controle.modele.ModeleLigneFacture;
import entite.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

public class FenFacture extends javax.swing.JFrame {
private static String code_article = "";
    private static String code_client = "";
    private static String code_facture = randomfactureNumber();
    private static final long serialVersionUID = 1L;
    private final ModeleLigneFacture leModelLigneFacture =
            new ModeleLigneFacture(code_facture);
    private final ModeReglement mode = new ModeReglement();
    private double total_ttc;
    
    public FenFacture() {
        initComponents();
         remplirCmBModeReglement();
         bouton_mode_ajout_ou_edition(true);
    }

    
   private static String randomfactureNumber() {
        String num = "";
        Random rand = new Random();
        num += "FAC" + rand.nextInt(999999);
        return num;
    }
    private void remplirCmBModeReglement() {
        for (ModeReglement unMode :
                mode.getLesEnreg()) {
            jCmB_ModeReglement.addItem(unMode.getType());
        }
    }
    
    private void bouton_mode_ajout_ou_edition(boolean isAjout){
        if(isAjout){
            jBTN_Ajouter.setEnabled(true);
            jBTN_Modifier.setEnabled(false);
           
        }else{
            jBTN_Ajouter.setEnabled(false);
            jBTN_Modifier.setEnabled(true);
            
        }
    }
    
    
    
    public static void setCode_article(String code_article) {
        FenFacture.code_article = code_article;
    }
    public static void setCode_client(String code_client) {
        FenFacture.code_client = code_client;
    }

   public static void setjTxT_NomClient(String nom) {
        FenFacture.jTxT_NomClient.setText(nom);
   }
    public static void setjTxT_CodeArticle(String code) {
        FenFacture.jTxT_CodeArticle.setText(code);
    }
    public static void setjTxT_CodeCategorie(String categorie) {
        FenFacture.jTxT_CodeCategorie.setText(categorie);
    }
    public static void setjTxT_Designation(String designation) {
        FenFacture.jTxT_Designation.setText(designation);
    }
    public static void setjCmB_Quantite(int max) {
        JCmB_Quantite.removeAllItems();
        for (int i = 1; i <= max; i++) {
            JCmB_Quantite.addItem(i);
        }
    }
    public static void setjTxT_Montant(String montant) {
        FenFacture.jTxT_Montant.setText(montant);
    }
    private String afficheDateJour() {
        Date date = new Date();
        SimpleDateFormat today = new SimpleDateFormat("dd/MM/yyyy");
        String dateJour = today.format(date);
        return dateJour;
    }
    
    private String calculeTotal() {
        String total = "";
        try {
            DecimalFormat format = new DecimalFormat("#,##0.00");
            total_ttc = 0.0;
            for (int i = 0; i < jTable.getRowCount(); i++) {
                total_ttc += Double.valueOf(jTable.getValueAt(i, 5).toString());
            }
            total = "Total : " + format.format(total_ttc) + "  cfa";
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Erreur de format de nombre");
        }
        return total;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLab_Fichier = new javax.swing.JLabel();
        jLab_SupprimerLigne = new javax.swing.JLabel();
        jLab_SupprimerTout = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel(randomfactureNumber());
        jTxT_NomClient = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLab_NumDocument = new javax.swing.JLabel();
        jCB_NumDocument = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTxT_DateJour = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jBTN_Articles = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTxT_CodeArticle = new javax.swing.JTextField();
        JCmB_Quantite = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jTxT_Designation = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTxT_Montant = new javax.swing.JTextField();
        jBTN_Ajouter = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jBTN_Modifier = new javax.swing.JButton();
        jTxT_CodeCategorie = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable(leModelLigneFacture);
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLab_ModeReglement = new javax.swing.JLabel();
        jCmB_ModeReglement = new javax.swing.JComboBox();
        jBTN_Valider = new javax.swing.JButton();
        jLab_TotalTTC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(831, 514));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLab_Fichier.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLab_Fichier.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Fichier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/commande2.png"))); // NOI18N
        jLab_Fichier.setText("ficher des facture");
        jLab_Fichier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_FichierMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_Fichier, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 50));

        jLab_SupprimerLigne.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLab_SupprimerLigne.setForeground(java.awt.Color.white);
        jLab_SupprimerLigne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/supprimer2.png"))); // NOI18N
        jLab_SupprimerLigne.setText("Supprimer une ligne");
        jLab_SupprimerLigne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_SupprimerLigneMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_SupprimerLigne, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, -1));

        jLab_SupprimerTout.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLab_SupprimerTout.setForeground(java.awt.Color.white);
        jLab_SupprimerTout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/supprimer.png"))); // NOI18N
        jLab_SupprimerTout.setText("Supprimer toute les ligne");
        jLab_SupprimerTout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_SupprimerToutMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_SupprimerTout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 190, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/retour.png"))); // NOI18N
        jLabel8.setText("Menu principal");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 510));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 110, 20));

        jTxT_NomClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxT_NomClientMouseClicked(evt);
            }
        });
        jPanel2.add(jTxT_NomClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 20));

        jLabel3.setText("Nom du client");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, -1));

        jLab_NumDocument.setText("Numero du document");
        jPanel2.add(jLab_NumDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 130, -1));
        jPanel2.add(jCB_NumDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 90, -1));

        jLabel9.setText("Date du jour");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 90, 10));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-writemess.png"))); // NOI18N
        jLabel2.setText("Information generales sur la facture en cours");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        jTxT_DateJour.setText(afficheDateJour());
        jPanel2.add(jTxT_DateJour, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 600, 100));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBTN_Articles.setText("Parcourir les articles");
        jBTN_Articles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTN_ArticlesActionPerformed(evt);
            }
        });
        jPanel3.add(jBTN_Articles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        jLabel12.setText("Code");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, 20));

        jLabel14.setText("Quantite");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel3.add(jTxT_CodeArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 80, -1));

        jPanel3.add(JCmB_Quantite, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, -1));

        jLabel15.setText("Designation");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 70, 20));
        jPanel3.add(jTxT_Designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 170, -1));

        jLabel16.setText("Montant");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 70, 20));
        jPanel3.add(jTxT_Montant, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 80, -1));

        jBTN_Ajouter.setText("Ajouter");
        jBTN_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTN_AjouterActionPerformed(evt);
            }
        });
        jPanel3.add(jBTN_Ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 100, -1));

        jLabel17.setText("Code categorie");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 90, 20));

        jBTN_Modifier.setText("Modifier");
        jPanel3.add(jBTN_Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 110, -1));

        jTxT_CodeCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxT_CodeCategorieActionPerformed(evt);
            }
        });
        jPanel3.add(jTxT_CodeCategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 60, -1));

        jScrollPane1.setViewportView(jTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 580, 140));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filesave.png"))); // NOI18N
        jLabel13.setText("Valeurs/Champs a ajouter a la facture");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 600, 290));

        jLab_ModeReglement.setText("Mode de règlement");
        getContentPane().add(jLab_ModeReglement, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 470, 110, 20));

        jCmB_ModeReglement.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cheque", "Carte", "Cash" }));
        getContentPane().add(jCmB_ModeReglement, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 120, -1));

        jBTN_Valider.setText("Valider la facture");
        jBTN_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTN_ValiderActionPerformed(evt);
            }
        });
        getContentPane().add(jBTN_Valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 470, 160, -1));
        getContentPane().add(jLab_TotalTTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 140, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/etiquette.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 170, 20));

        setSize(new java.awt.Dimension(845, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxT_CodeCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxT_CodeCategorieActionPerformed
       
    }//GEN-LAST:event_jTxT_CodeCategorieActionPerformed

    private void jBTN_ArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTN_ArticlesActionPerformed
        FenChoixArticle choix =
                new FenChoixArticle(this, rootPaneCheckingEnabled);
        choix.setModal(true);
        choix.setLocationRelativeTo(choix.getParent());
        choix.setVisible(true);
    }//GEN-LAST:event_jBTN_ArticlesActionPerformed

    private void jBTN_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTN_AjouterActionPerformed
        if (jTxT_CodeArticle.getText().isEmpty()
                || (code_client.equals(""))) {
            JOptionPane.showMessageDialog(null,
                    "Vérifiez vos choix !");
        } else {
            int quantite = Integer.parseInt(JCmB_Quantite.getSelectedItem().toString());
            if (quantite > 0) {
                double pu = Double.valueOf(jTxT_Montant.getText());
                LignesFacture uneLigne = new LignesFacture(
                        code_facture,
                        new Article(jTxT_CodeArticle.getText(),
                        jTxT_CodeCategorie.getText(),
                        jTxT_Designation.getText(),
                        quantite,
                        pu,
                        new Date()),
                        quantite,
                        pu,
                        quantite * pu);
                boolean is_created = uneLigne.creerCRUD(code_facture,
                        jTxT_CodeArticle.getText(),
                        quantite, pu, quantite * pu);
                if (is_created) {
                    leModelLigneFacture.creerMOD(uneLigne);
                }
                
                jLab_TotalTTC.setText(calculeTotal());
                jTxT_CodeArticle.setText("");
                jTxT_Designation.setText("");
                jTxT_Montant.setText("");
                jTxT_CodeCategorie.setText("");
                JCmB_Quantite.removeAllItems();
            }
        }
    }//GEN-LAST:event_jBTN_AjouterActionPerformed

    private void jBTN_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTN_ValiderActionPerformed
        if (jTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Une facture doit avoir au moins "
                    + "un article pour être validée.",
                    "Information",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (code_client.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Vous devez sélectionner"
                        + " un client pour continuer.",
                        "Erreur", JOptionPane.WARNING_MESSAGE);
            } else {
                int code_mode_reglement = mode.getLesEnreg().get(jCmB_ModeReglement.getSelectedIndex()).getCode();
                String nom_reglement = mode.getLesEnreg().get(jCmB_ModeReglement.getSelectedIndex()).getType();
                Facture facture = new Facture(code_facture,
                        new Client(code_client), total_ttc,
                        new ModeReglement(code_mode_reglement,
                        nom_reglement), new Date());
                facture.creerCRUD(code_facture, code_client,
                        total_ttc, code_mode_reglement);
                jTxT_NomClient.setText("[ Cliquez ici pour sélectionner un client ]");
                leModelLigneFacture.supprimerTous();
                code_facture = randomfactureNumber();
                jLab_TotalTTC.setText("");
            }
        }
    }//GEN-LAST:event_jBTN_ValiderActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (JOptionPane.showConfirmDialog(null,
                "Abandon de la saisie ? ",
                "Confirmation", 
                           JOptionPane.YES_NO_OPTION) == 0) {
            LignesFacture lesLignes = 
                    new LignesFacture();
            lesLignes.supprimerToutCRUD(code_facture,
                    "code_facture");
            leModelLigneFacture.supprimerTous();
            jTxT_NomClient.setText
               ("[ Cliquez ici pour sélectionner un client ]");
            jLab_TotalTTC.setText("");
            code_facture = randomfactureNumber();
             FenMenuPrincipal laFenetre = new FenMenuPrincipal();
        laFenetre.setVisible(true);
        dispose();
           
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLab_SupprimerLigneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_SupprimerLigneMouseClicked
        if (jTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null,
                    "Vous devez sélectionner "
                    + "une ligne pour la supprimer.",
                    "Suppression",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(null,
                    "Souhaitez-vous vraiment supprimer"
                    + " cette ligne de la facture ?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION) == 0) {
                int numLigne = jTable.getSelectedRow();
                String codeArticle = jTable.getValueAt(numLigne, 0).toString();
                LignesFacture uneLigne =
                        new LignesFacture();
                uneLigne.supprimerLigneCRUD(code_facture, codeArticle);
                leModelLigneFacture.supprimerMOD(numLigne);
            }
        }
    }//GEN-LAST:event_jLab_SupprimerLigneMouseClicked

    private void jLab_SupprimerToutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_SupprimerToutMouseClicked
        if (JOptionPane.showConfirmDialog(null,
                "Souhaitez-vous "
                + "vraiment supprimer "
                + "tous les articles présents"
                + " dans cette facture ?",
                "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
            LignesFacture lesLignes = new LignesFacture();
            lesLignes.supprimerToutCRUD(code_facture,
                    "code_facture");
            leModelLigneFacture.supprimerTous();
            code_facture = randomfactureNumber();
        }
    }//GEN-LAST:event_jLab_SupprimerToutMouseClicked

    private void jLab_FichierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_FichierMouseClicked
       FenTableFacture laFenetre = new FenTableFacture();
        laFenetre.setVisible(true);
        
    }//GEN-LAST:event_jLab_FichierMouseClicked

    private void jTxT_NomClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxT_NomClientMouseClicked
      FenChoixClient choix =
                new FenChoixClient(this, rootPaneCheckingEnabled);
        choix.setModal(true);
        choix.setLocationRelativeTo(choix.getParent());
        choix.setVisible(true);
    }//GEN-LAST:event_jTxT_NomClientMouseClicked

    
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
            java.util.logging.Logger.getLogger(FenFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenFacture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox JCmB_Quantite;
    private javax.swing.JButton jBTN_Ajouter;
    private javax.swing.JButton jBTN_Articles;
    private javax.swing.JButton jBTN_Modifier;
    private javax.swing.JButton jBTN_Valider;
    private javax.swing.JComboBox jCB_NumDocument;
    private javax.swing.JComboBox jCmB_ModeReglement;
    private javax.swing.JLabel jLab_Fichier;
    private javax.swing.JLabel jLab_ModeReglement;
    private javax.swing.JLabel jLab_NumDocument;
    private javax.swing.JLabel jLab_SupprimerLigne;
    private javax.swing.JLabel jLab_SupprimerTout;
    private javax.swing.JLabel jLab_TotalTTC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private static javax.swing.JTextField jTxT_CodeArticle;
    private static javax.swing.JTextField jTxT_CodeCategorie;
    private javax.swing.JTextField jTxT_DateJour;
    private static javax.swing.JTextField jTxT_Designation;
    private static javax.swing.JTextField jTxT_Montant;
    private static javax.swing.JLabel jTxT_NomClient;
    // End of variables declaration//GEN-END:variables
}
