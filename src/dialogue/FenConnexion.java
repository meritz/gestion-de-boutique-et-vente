
package dialogue;

import java.awt.Cursor;
import controle.connection.ControleConnexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

/**
 *
 * @author MODESTE
 */
public class FenConnexion extends javax.swing.JFrame {
    

    
    public FenConnexion() {
        initComponents();
        complementGUI();
    }
    private void complementGUI(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass()
        .getResource("/images/logoNetBeans.png")));
        setTitle("mon programme");
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxT_Nom = new javax.swing.JTextField();
        jPassword_MDP = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("mon programme");
        setPreferredSize(new java.awt.Dimension(405, 300));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("modeste"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Projet Xelfi/connection/ecran.png"))); // NOI18N
        jLabel3.setText("Connexion au Programme");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 390, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Projet Xelfi/connection/utilisateur.png"))); // NOI18N
        jLabel4.setText("Nom");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Projet Xelfi/connection/key.png"))); // NOI18N
        jLabel5.setText("Mot de passe");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, -1));
        getContentPane().add(jTxT_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 180, 30));
        getContentPane().add(jPassword_MDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Projet Xelfi/connection/ban.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 400, 160));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Projet Xelfi/connection/switch-on.png"))); // NOI18N
        jLabel6.setText("parametre de connexion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-16-checkin.png"))); // NOI18N
        jButton1.setText("Valider");
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-16-delete.png"))); // NOI18N
        jButton2.setText("Quiter");
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 90, 30));

        bindingGroup.bind();

        setSize(new java.awt.Dimension(440, 301));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
       if(evt.getKeyCode()== 10){
           System.exit(0);
       }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(controleConnexion_Appel()){
            try{
                ControleConnexion.transferDonnees();
            }catch(SQLException ex){
                Logger.getLogger(FenConnexion.class.getName())
                        .log(Level.SEVERE, null , ex);
            }
            FenMenuPrincipal laFenetre = new FenMenuPrincipal();
        
        laFenetre.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode()== 10){
          if(controleConnexion_Appel()){
              try{
                ControleConnexion.transferDonnees();
            }catch(SQLException ex){
                Logger.getLogger(FenConnexion.class.getName())
                        .log(Level.SEVERE, null , ex);
            }
              FenMenuPrincipal laFenetre = new FenMenuPrincipal();
          
        laFenetre.setVisible(true);
        dispose(); 
        }
      }
    }//GEN-LAST:event_jButton1KeyPressed

    
    private boolean controleConnexion_Appel(){
        //
        String leNom = jTxT_Nom.getText();
        boolean bControle = false;
        String leMotDePasse = String.valueOf(jPassword_MDP.getPassword());
        if(ControleConnexion.controle(leNom,leMotDePasse)){
            if(ControleConnexion.isEtatConnexion()){
                bControle = true;
            }else{
                JOptionPane.showMessageDialog(null,"Impossible de se connecter." 
                    +"a la basse de donnees ' \n\n'"
                         +"Vos nom et mot de passe sont corrects ' \n\n'"
                         +"Mais les parametres pour le pilote' \n\n'" 
                        +"et la basse de donnees ' \n\n'"
                         +"doivent etre verifiers ' \n\n'"
                         +"Cantactez le responsable informatique",
                        "ALERTE", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        return bControle;
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
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenConnexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPassword_MDP;
    public static transient javax.swing.JTextField jTxT_Nom;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
