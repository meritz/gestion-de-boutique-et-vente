
package dialogue;

import controle.etat.JasperMySQL_Parametres;
import controle.modele.ModeleFacture;
import entite.Facture;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MODESTE
 */
public class FenTableFacture extends javax.swing.JFrame {
private ModeleFacture leModeleFacture = new ModeleFacture();
    private String code_facture;

    /**
     * Creates new form FenTableFacture
     */
    public FenTableFacture() {
        initComponents();
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLab_Imprimer = new javax.swing.JLabel();
        jLab_Aperçu = new javax.swing.JLabel();
        jLab_Exporter = new javax.swing.JLabel();
        jLab_Supprimer = new javax.swing.JLabel();
        jLab_Retour = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable(leModeleFacture);
        jTxT_Total = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxT_Recherche = new javax.swing.JTextField();
        jBTN_CalculeTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLab_Imprimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLab_Imprimer.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Imprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-print.png"))); // NOI18N
        jLab_Imprimer.setText("Imprimer la facture");
        jLab_Imprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_ImprimerMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_Imprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, -1));

        jLab_Aperçu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLab_Aperçu.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Aperçu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-upload.png"))); // NOI18N
        jLab_Aperçu.setText("Apercu de la facture");
        jLab_Aperçu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_AperçuMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_Aperçu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLab_Exporter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLab_Exporter.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Exporter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-inbox.png"))); // NOI18N
        jLab_Exporter.setText("Exporter la facture");
        jLab_Exporter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_ExporterMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_Exporter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLab_Supprimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLab_Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-trash.png"))); // NOI18N
        jLab_Supprimer.setText("Supprimer une facture");
        jLab_Supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_SupprimerMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_Supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLab_Retour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLab_Retour.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-frontpage.png"))); // NOI18N
        jLab_Retour.setText("Retour");
        jLab_Retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_RetourMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_Retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 430));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("GESTION DU FICHIER DES FACTURES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 620, 280));

        jTxT_Total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTxT_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 130, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-checkin.png"))); // NOI18N
        jLabel9.setText("Rechercher une facture");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, 40));

        jTxT_Recherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxT_RechercheKeyReleased(evt);
            }
        });
        getContentPane().add(jTxT_Recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 110, 20));

        jBTN_CalculeTotal.setText("Total des factures:");
        jBTN_CalculeTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTN_CalculeTotalActionPerformed(evt);
            }
        });
        getContentPane().add(jBTN_CalculeTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLab_SupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_SupprimerMouseClicked
        if (jTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null,
                    "Vous devez sélectionner "
                    + "une facture pour la supprimer.");
        } else {
            if (JOptionPane.showConfirmDialog(null,
                    "Souhaitez-vous vraiment "
                    + "supprimer cette facture ?",
                    "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
                int ligne_a_supprimer = jTable.getSelectedRow();
                Facture uneFacture = new Facture("");
                uneFacture.supprimerCRUD(code_facture);
                leModeleFacture.supprimerMOD(ligne_a_supprimer);
            }
        }
    }//GEN-LAST:event_jLab_SupprimerMouseClicked

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int line = jTable.getSelectedRow();
        code_facture = jTable.getValueAt(line, 0).toString();
    }//GEN-LAST:event_jTableMouseClicked

    private void jTxT_RechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxT_RechercheKeyReleased
       Facture facture = new Facture("");
        ArrayList<Facture> lesFactures =
                facture.chercherCRUD(jTxT_Recherche.getText());
        leModeleFacture.lireRecupMOD(lesFactures);
    }//GEN-LAST:event_jTxT_RechercheKeyReleased

    private void jBTN_CalculeTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTN_CalculeTotalActionPerformed
        double total = 0;
        DecimalFormat leFormat = new DecimalFormat("#,##0.00");
        for (int i = 0; i < jTable.getRowCount(); i++) {
            total += Double.parseDouble(jTable.getValueAt(i, 3).toString());
        }
        jTxT_Total.setText(leFormat.format(total) + " cfa");
    }//GEN-LAST:event_jBTN_CalculeTotalActionPerformed

    private void jLab_AperçuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_AperçuMouseClicked
        if (jTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, 
                    "Vous devez sélectionner"
                    + " une facture pour afficher l'aperçu.");
        } else {
            JasperMySQL_Parametres.setCode_facture(code_facture);
            JasperMySQL_Parametres.apercu("Facture.jrxml");
        }
    }//GEN-LAST:event_jLab_AperçuMouseClicked

    private void jLab_ImprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ImprimerMouseClicked
        if (jTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, 
                    "Vous devez sélectionner "
                    + "une facture pour l'imprimer");
        } else {
            JasperMySQL_Parametres.setCode_facture(code_facture);
            JasperMySQL_Parametres.imprimer("Facture.jrxml");
        }
    }//GEN-LAST:event_jLab_ImprimerMouseClicked

    private void jLab_ExporterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ExporterMouseClicked
        if (jTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, 
                    "Vous devez sélectionner "
                    + "une facture pour l'exporter.");
        } else {
            JasperMySQL_Parametres.setCode_facture(code_facture);
            FenExport export = new FenExport("Facture.jrxml");
            export.setLocationRelativeTo(export.getParent());
            export.setModal(true);
            export.setVisible(true);
        }
    }//GEN-LAST:event_jLab_ExporterMouseClicked

    private void jLab_RetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_RetourMouseClicked
         FenFacture laFenetre = new FenFacture();
        laFenetre.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLab_RetourMouseClicked

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
            java.util.logging.Logger.getLogger(FenTableFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenTableFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenTableFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenTableFacture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenTableFacture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTN_CalculeTotal;
    private javax.swing.JLabel jLab_Aperçu;
    private javax.swing.JLabel jLab_Exporter;
    private javax.swing.JLabel jLab_Imprimer;
    private javax.swing.JLabel jLab_Retour;
    private javax.swing.JLabel jLab_Supprimer;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTxT_Recherche;
    private javax.swing.JLabel jTxT_Total;
    // End of variables declaration//GEN-END:variables
}
