
package dialogue;

import controle.etat.JasperMySQL_Parametres;
import controle.modele.ModeleClient;
import controle.modele.RendererBooleen;
import controle.modele.RendererDate;
import controle.modele.RendererGras;
import controle.utilitaires.GestionDates;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class FenTableClient extends javax.swing.JFrame implements TableModelListener {
  private ModeleClient leModeleClients = new ModeleClient();
    private String code_client;
    @SuppressWarnings("LeakingThisInConstructor")
    public FenTableClient() {
        initComponents(); 
        table.getColumnModel().getColumn(1)
                .setCellRenderer(new RendererGras());
        table.getColumnModel().getColumn(3)
                .setCellRenderer(new RendererBooleen());
        table.getColumnModel().getColumn(4)
                .setCellRenderer(new RendererDate());
        leModeleClients.addTableModelListener(this);
        
    }
  

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLab_Ajouter = new javax.swing.JLabel();
        Recherche = new javax.swing.JLabel();
        jLab_Modifier = new javax.swing.JLabel();
        Supprimer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTXTCode = new javax.swing.JTextField();
        jTXTNom = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTXT_DateCreation = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTXT_Prenom = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        checkBox_carte = new java.awt.Checkbox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable(leModeleClients);
        jComboBox1 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLab_Ajouter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLab_Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-download.png"))); // NOI18N
        jLab_Ajouter.setText("Ajouter");
        jLab_Ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_AjouterMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_Ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 50));

        Recherche.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Recherche.setForeground(java.awt.Color.white);
        Recherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-search.png"))); // NOI18N
        Recherche.setText("Rechercher");
        Recherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RechercheMouseClicked(evt);
            }
        });
        jPanel1.add(Recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 40));

        jLab_Modifier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLab_Modifier.setForeground(java.awt.Color.white);
        jLab_Modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-edit.png"))); // NOI18N
        jLab_Modifier.setText("Modifier");
        jLab_Modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_ModifierMouseClicked(evt);
            }
        });
        jPanel1.add(jLab_Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, -1));

        Supprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Supprimer.setForeground(java.awt.Color.white);
        Supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-deny.png"))); // NOI18N
        Supprimer.setText("Supprimer");
        Supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupprimerMouseClicked(evt);
            }
        });
        jPanel1.add(Supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-preview.png"))); // NOI18N
        jLabel5.setText("Apercu");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-print.png"))); // NOI18N
        jLabel6.setText("Imprimer");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-language.png"))); // NOI18N
        jLabel7.setText("Exporter");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
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
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-user-add.png"))); // NOI18N
        jLabel9.setText("Gestion des clients");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 420, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Code");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Nom");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Adesse");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Code postal");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Tel.fix");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Email");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Remarques");

        jTXTNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTXTNomActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Date creation");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Prenom");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("ville");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("mobillis");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Carte fidelite");

        checkBox_carte.setLabel("checkbox1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField7)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jTXTNom, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jTXTCode)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTXT_Prenom)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTXT_DateCreation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addGap(7, 7, 7)
                                .addComponent(checkBox_carte, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTXTCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jTXT_DateCreation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addComponent(checkBox_carte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTXTNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(jTXT_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 590, 240));

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 590, 110));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Code", "Nom", "Prenom", "Date Creation", "Ville" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 120, -1));

        jLabel22.setText("Trier la liste par");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, 20));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-48-section.png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 40, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTXTNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTXTNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTXTNomActionPerformed

    private void jLab_AjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_AjouterMouseClicked
        //---Ajouter en Mode fiche--------
        //creation de la fenetre
        FenFicheClient laFenetre = new FenFicheClient(leModeleClients, "Ajouter");
        //on change le titre et son icone
        //
        laFenetre.getjLabTitreClient().setText("Ajout d'un client");
        laFenetre.getjLab_Action().setIcon(new ImageIcon
                                    (FenFicheClient.class
                                    .getResource("/imagesgestion/ajouter.png")));
        laFenetre.getjLab_Action().setText("Sauvegarder");
        //focus sur le code
        laFenetre.getjTxTCode().requestFocus(true);
        //on met par defaut la date du jour
        Date dtDate = new Date();
        /**gestion du format de la date **/
        String strDate = GestionDates.dateEnChaineFR(dtDate);
        laFenetre.getJTxT_DateCreation().setText(strDate);
        laFenetre.getJTxT_DateCreation().setEnabled(false);
        //
        laFenetre.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jLab_AjouterMouseClicked

    private void jLab_ModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ModifierMouseClicked
        // appel par la suite de la methode prepaModification()
        prepaModification();
    }//GEN-LAST:event_jLab_ModifierMouseClicked

    private void SupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupprimerMouseClicked
       int NumLigne = -1;
       NumLigne = table.getSelectedRow();
       if(NumLigne != -1){
           int choix = JOptionPane.showConfirmDialog(null, 
           "Voulez-vous supprimer"
           + "la fiche du client?"
           + "\ncode :" + table.getValueAt(NumLigne, 0)
           + "\nnom : " + table.getValueAt(NumLigne,1 ), 
           "SUPPRESSION", JOptionPane.YES_NO_OPTION);
           // 0: oui 1: nom
           if(choix == 0){
               String vCode;
               vCode = String.valueOf(table.getValueAt(NumLigne,0));
          //pour recuperer la methode CRUD
          entite.Client leClient = new entite.Client(vCode);
          //Suppression de l'enregistrement dans la BD
          boolean bSuppression = leClient.supprimerCRUD(vCode);
            if(bSuppression){
                // suppression de la ligne dans le modele
                leModeleClients.supprimerMOD(NumLigne);
            }    
           } 
       }
       //si aucune ligne selectionnee
       if(NumLigne == -1){
           JOptionPane.showMessageDialog(null, 
                   "Sélectionnez une ligne avant.",
                   "Suppression" , JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_SupprimerMouseClicked

    private void RechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechercheMouseClicked
        //--------- recherche en mode fiche----
        // creation de l fenetre
        FenFicheClient laFenetre = new FenFicheClient(leModeleClients, "Rechercher");
        // on changr la libelle, l'icone et le titre
        laFenetre.getjLab_Action().setText("Rechercher");
        laFenetre.getjLab_Action().setIcon(new ImageIcon(FenFicheClient.class
                                    .getResource("/imagesgestion/chercher2.png")));
        laFenetre.getjLabTitreClient().setText("Recherche de client(s)");
        laFenetre.setVisible(true);
    }//GEN-LAST:event_RechercheMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        //
        int Numligne;
        Numligne = table.getSelectedRow();
        jTXTCode.setText(String.valueOf(table.getValueAt(Numligne,0)));
        jTXTNom.setText(String.valueOf(table.getValueAt(Numligne,1)));
        jTXT_Prenom.setText(String.valueOf(table.getValueAt(Numligne,2)));
        String stateCarte = String.valueOf(table.getValueAt(Numligne,3));

        if(stateCarte.equals("true")){
            checkBox_carte.setState(true);
        }else{
            checkBox_carte.setState(false);
        }
        String strDate = String.valueOf(table.getValueAt(Numligne,4));
        jTXT_DateCreation.setText(strDate);
        //
        if(evt.getClickCount()== 2){
            prepaModification();
        }
    }//GEN-LAST:event_tableMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       if (table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, 
                    "Vous devez sélectionner"
                    + " un Client pour afficher l'aperçu.");
        } else {
            JasperMySQL_Parametres.setCode_client(code_client);
           JasperMySQL_Parametres.apercu("EtatClients.jrxml");
        }
        
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       if (table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, 
                    "Vous devez sélectionner "
                    + "un clien pour l'imprimer");
        } else {
            JasperMySQL_Parametres.setCode_client(code_client);
            JasperMySQL_Parametres.imprimer("EtatClients.jrxml");
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, 
                    "Vous devez sélectionner "
                    + "un client pour l'exporter.");
        } else {
            JasperMySQL_Parametres.setCode_client(code_client);
            FenExport export = new FenExport("EtatClients.jrxml");
            export.setLocationRelativeTo(export.getParent());
            export.setModal(true);
            export.setVisible(true);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         FenMenuPrincipal laFenetre = new FenMenuPrincipal();
        laFenetre.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

     private void prepaModification(){
            //
            int NumLigne = -1;
            NumLigne = table.getSelectedRow();
            //
            if(NumLigne == -1){
                JOptionPane.showMessageDialog(null,
                        "Selectionnez auparavant"
                        + " la ligne a modifier"
                        +'\n'
                        +"ou effectuez un double clic sur la  ligne",
                        "MODIFICATION", JOptionPane.INFORMATION_MESSAGE);
            }if(NumLigne != -1){
                // on recupere avant les donnees
                // a partir d'une ligne selectionnee
                String vCode = String.valueOf(table.getValueAt(NumLigne,0));
                String vNom = String.valueOf(table.getValueAt(NumLigne,1));
                String vPrenom = String.valueOf(table.getValueAt(NumLigne,2));
                String vCarte = String.valueOf(table.getValueAt(NumLigne,3));
                String vDate = String.valueOf(table.getValueAt(NumLigne,4));
                // preparation du booleen pour le champ Carte
                boolean bCarte = false;
                if(vCarte.equals("true")){
                    bCarte = true;
                }else{
                    bCarte = false;
                }
                // traitement des date a faire
                vDate = GestionDates.chaineDateENversFR(vDate);
                
                FenFicheClient laFenetre = new FenFicheClient(leModeleClients, "Modifier");
                // on affecte les valeurs aux champs correspondant 
                // de la fenetre fenficheclient
                laFenetre.setjTxTCode(vCode);
                laFenetre.setJTxTNom(vNom);
                laFenetre.setJTxT_Prenom(vPrenom);
                laFenetre.setCheckBox_Carte(bCarte);
                laFenetre.setJTXT_DateCreation(vDate);
                laFenetre.getjTxTCode().setEditable(false);
                laFenetre.getjLabTitreClient().setText("Modification d'un client");
                laFenetre.getjLab_Action().setText("Sauvegarder");
                laFenetre.getjLab_Action().setIcon(new ImageIcon(FenFicheClient.class.getResource("/imagesgestion/modifier2.png")));
                laFenetre.setVisible(true);
            }
        }
     
@Override
    public void tableChanged(TableModelEvent e) {
         String suiteMessage = "\nFaisons d'autres actions"
                + " suite à cet événement.";
        switch (unEvenement.getType()) {
            case TableModelEvent.INSERT:
                System.out.println("La table a été mise à jour, "
                        + "il y a eu une insertion !!!"
                        + suiteMessage);
                break;
            case TableModelEvent.DELETE:
                System.out.println("La table a été mise à jour, "
                        + " il y a eu une suppression !!!"
                        + suiteMessage);
                break;
            case TableModelEvent.UPDATE:
                System.out.println("La table a été mise à jour, "
                        + "il y a eu une modification !!!"
                        + suiteMessage);
                break;
            default:
                break;
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
            java.util.logging.Logger.getLogger(FenTableClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenTableClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenTableClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenTableClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenTableClient().setVisible(true);
            }
        });
    }
    
    
    
     
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Recherche;
    private javax.swing.JLabel Supprimer;
    private java.awt.Checkbox checkBox_carte;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLab_Ajouter;
    private javax.swing.JLabel jLab_Modifier;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTXTCode;
    private javax.swing.JTextField jTXTNom;
    private javax.swing.JTextField jTXT_DateCreation;
    private javax.swing.JTextField jTXT_Prenom;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    public static javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    

    



   
}
