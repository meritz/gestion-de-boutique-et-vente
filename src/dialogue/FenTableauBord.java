package dialogue;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class FenTableauBord extends javax.swing.JDialog {
    public FenTableauBord(java.awt.Frame parent, boolean modal) {
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

        jLabel2 = new javax.swing.JLabel();
        jLab_Camembert = new javax.swing.JLabel();
        jLab_Nombre = new javax.swing.JLabel();
        jLab_CA = new javax.swing.JLabel();
        jLab_Impayes = new javax.swing.JLabel();
        jLab_Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/retour.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLab_Camembert.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLab_Camembert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/chart.png"))); // NOI18N
        jLab_Camembert.setText(" Factures");
        jLab_Camembert.setToolTipText("");
        getContentPane().add(jLab_Camembert, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLab_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLab_Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/odt.png"))); // NOI18N
        jLab_Nombre.setText("Nombre");
        jLab_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_NombreMouseClicked(evt);
            }
        });
        getContentPane().add(jLab_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLab_CA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLab_CA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/tableauBord.png"))); // NOI18N
        jLab_CA.setText("CA");
        getContentPane().add(jLab_CA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 100, -1));

        jLab_Impayes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLab_Impayes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesgestion/client2.png"))); // NOI18N
        jLab_Impayes.setText("Impayés");
        getContentPane().add(jLab_Impayes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 120, -1));

        jLab_Fond.setBackground(new java.awt.Color(255, 255, 255));
        jLab_Fond.setOpaque(true);
        getContentPane().add(jLab_Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 240));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLab_NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_NombreMouseClicked
        String vAnnee = JOptionPane.showInputDialog(null,
                "Entrez une année : ");
        FenStats stats = new FenStats(vAnnee);
        stats.setModal(true);
        stats.setLocationRelativeTo(stats.getParent());
        stats.setVisible(true);
    }//GEN-LAST:event_jLab_NombreMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         FenMenuPrincipal laFenetre = new FenMenuPrincipal();
        laFenetre.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenTableauBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenTableauBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenTableauBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenTableauBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                FenTableauBord dialog = new FenTableauBord(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLab_CA;
    private javax.swing.JLabel jLab_Camembert;
    private javax.swing.JLabel jLab_Fond;
    private javax.swing.JLabel jLab_Impayes;
    private javax.swing.JLabel jLab_Nombre;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
