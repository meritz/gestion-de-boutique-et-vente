package dialogue;

import controle.modele.ModeleClient;
import entite.Client;
import java.awt.Toolkit;
import java.util.ArrayList;

public class FenChoixClient extends javax.swing.JDialog {
    private ModeleClient leModeleClient = new ModeleClient();
    public FenChoixClient(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        complementGUI();
    }

    private void complementGUI() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass()
                .getResource("/images/logoNetBeans.png")));
        setTitle("SARL XELFI");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Titre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable(leModeleClient);
        jLab_recherche = new javax.swing.JLabel();
        jTxT_Rechercher = new javax.swing.JTextField();
        jLabel_Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titre.setText("Double-cliquez sur la ligne du client.");
        jLabel_Titre.setToolTipText("");
        getContentPane().add(jLabel_Titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, -1, -1));

        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 46, 656, 269));

        jLab_recherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/chercheAssiste.png"))); // NOI18N
        jLab_recherche.setText("Rechercher");
        jLab_recherche.setToolTipText("");
        getContentPane().add(jLab_recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 322, 100, 30));

        jTxT_Rechercher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxT_RechercherKeyReleased(evt);
            }
        });
        getContentPane().add(jTxT_Rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 327, 125, -1));

        jLabel_Fond.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Fond.setOpaque(true);
        getContentPane().add(jLabel_Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 360));

        setSize(new java.awt.Dimension(698, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
if (evt.getClickCount() == 2) {
            int ligne = jTable.getSelectedRow();
            FenFacture.setjTxT_NomClient(jTable.getValueAt(ligne, 1).toString()
                    + " " + jTable.getValueAt(ligne, 2).toString());
            FenFacture.setCode_client(jTable.getValueAt(ligne, 0).toString());
            FenChoixClient.this.dispose();  
}
    }//GEN-LAST:event_jTableMouseClicked

    private void jTxT_RechercherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxT_RechercherKeyReleased
        Client unClient = new Client("");
        ArrayList<Client> nouvelleListe = unClient
                .chercherCRUD(jTxT_Rechercher.getText());
        leModeleClient.lireRecupMOD(nouvelleListe);
    }//GEN-LAST:event_jTxT_RechercherKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Minus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenChoixClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenChoixClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenChoixClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenChoixClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FenChoixClient dialog = new FenChoixClient(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLab_recherche;
    private javax.swing.JLabel jLabel_Fond;
    private javax.swing.JLabel jLabel_Titre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTxT_Rechercher;
    // End of variables declaration//GEN-END:variables
}
