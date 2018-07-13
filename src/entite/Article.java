
package entite;

import controle.connection.ControleConnexion;
import java.sql.*;
import java.util.ArrayList;
//
import java.util.Date;
//
import javax.swing.JOptionPane;

public final class Article {
    private String code;
    private String code_categorie;
    private String designation;
    private int quantite;
    private double prix_unitaire;
    private Date date;
    
    private static Connection laConnexion = ControleConnexion.getLaConnectionStatique();
     private ArrayList<Article> lesEnreg = new ArrayList<>();
     
     //
     //1er constructeur
     //

    public Article(String code, String code_categorie, String designation, int quantite, double prix_unitaire, Date date) {
        this.code = code;
        this.code_categorie = code_categorie;
        this.designation = designation;
        this.quantite = quantite;
        this.prix_unitaire = prix_unitaire;
        this.date = date;
    }
     //
    //2eme constructeur
  

    public Article() {
          lireRecupCRUD();
    }
    //
    //3eme constructeur
    //

    public Article(String code) {
        this.code = code;
    }
    //
    //accesseurs
    //

    public String getCode() {
        return code;
    }

    public String getCode_categorie() {
        return code_categorie;
    }

    public String getDesignation() {
        return designation;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrix_unitaire() {
        return prix_unitaire;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Article> getLesEnreg() {
        return lesEnreg;
    }
    //
    //mutateurs
    //

    public void setCode(String code) {
        this.code = code;
    }

    public void setCode_categorie(String code_categorie) {
        this.code_categorie = code_categorie;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix_unitaire(double prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    //
     public void lireRecupCRUD(){
        try{
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM articles ");
            while(rs.next()){
                String code = rs.getString("code");
                String code_categorie = rs.getString("code_categorie");
                String designation = rs.getString("designation");
                int quantite = rs.getInt("quantite");
                double prix_unitaire = rs.getDouble("prix_unitaire");
                Date date_creation = rs.getDate("date");
                lesEnreg.add(new Article(code,code_categorie,designation,quantite,prix_unitaire, date_creation));
            }
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null,"probleme rencontre : " + e.getMessage(),
                    "Resultat", JOptionPane.ERROR_MESSAGE);
        }
    }
    //
     
      public boolean creerCRUD(String vCode, String vReference,
             String vDesignation, int vQuantite,double vPu, String vDate){
        boolean bCreation = false;
        String requete = null;
        try{
            requete = "INSERT INTO articles VALUES(?,?,?,?,?,NOW())";
            PreparedStatement prepare = laConnexion.prepareStatement(requete);
            prepare.setString(1, vCode);
            prepare.setString(2, vReference);
            prepare.setString(3, vDesignation);
            prepare.setInt(4, vQuantite);
            prepare.setDouble(5,vPu);
            prepare.executeUpdate();
            prepare.close();
            bCreation = true;
            
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null,"Ajout dans le BD non effectue : " + e.getMessage(),
                    "Probleme rencontre", JOptionPane.ERROR_MESSAGE);
        }
        return bCreation;
    }
      //
      
       public boolean modifierCRUD(String vCode, String vReference, 
            String vDesignation, int vQuantite, double vPu) {
        boolean bModification = true;
        String requete = null;
        try {
            requete = "UPDATE articles SET "
                    + "code_categorie = ?, "
                    + "designation = ?, "
                    + "quantite = ?, "
                    + "prix_unitaire = ? "
                    + "WHERE code = ?";
            PreparedStatement prepare = laConnexion.prepareStatement(requete);
            prepare.setString(1, vReference);
            prepare.setString(2, vDesignation);
            prepare.setInt(3, vQuantite);
            prepare.setDouble(4, vPu);
            prepare.setString(5, vCode);
            prepare.executeUpdate();
            bModification = true;
        } catch (SQLException e) {
            bModification = false;
            JOptionPane.showMessageDialog(null, "Modification dans la BD non effectuée : "
                    + e.getMessage(),
                    "Problème rencontré", JOptionPane.ERROR_MESSAGE);
        }
        return bModification;
    }
       
       //
       
       
    public boolean supprimerCRUD(String vCode){
        boolean bSuppression = true;
        String requete = null;
       
        try{
           requete = "DELETE FROM articles WHERE code = ?";        
           PreparedStatement prepare = laConnexion.prepareStatement(requete);
           prepare.setString(1, vCode);
           int nbEnregSup = prepare.executeUpdate();
                if(nbEnregSup == 0){
                    JOptionPane.showMessageDialog(null,
                            "Aucune Suppression."+
                            "Suppression interdite.",
                            "Resultat", JOptionPane.ERROR_MESSAGE); 
                }
        }catch(SQLException e){
            bSuppression = false;
            JOptionPane.showMessageDialog(null,
                            "Aucune suppression effectuee dans la BD."
                    + e.getMessage(),
                            "probleme rencontre", JOptionPane.ERROR_MESSAGE);
        }
        
        return bSuppression;
    }
    
    
    
    //
    
    public ArrayList<Article> chercherCRUD(String recherche) {
        String requete = "";
        requete += "SELECT * ";
        requete += "FROM articles ";
        requete += "WHERE code LIKE '%" + recherche + "%' ";
        requete += "OR code_categorie LIKE '%" + recherche + "%' ";
        requete += "OR designation LIKE '%" + recherche + "%' ";
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery(requete);
            while (rs.next()) {
                String code = rs.getString("code");
                String code_categorie = rs.getString("code_categorie");
                String designation = rs.getString("designation");
                int quantite = rs.getInt("quantite");
                double prix_unitaire = rs.getDouble("prix_unitaire");
                Date date_creation = rs.getDate("date");
                lesEnreg.add(new Article(code, code_categorie, designation, 
                        quantite, prix_unitaire, date_creation));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problème rencontré : "
                    + e.getMessage(),
                    "Résultat", JOptionPane.ERROR_MESSAGE);
        }
        return lesEnreg;
    }
    public ArrayList<Article> chercherRapideCRUD_Articles(String vCode) {
        String requete = "SELECT * FROM articles WHERE code LIKE '" + vCode + "'";
        try {
            Statement state = laConnexion.createStatement();
            ResultSet rs = state.executeQuery(requete);
            while (rs.next()) {
                String code = rs.getString("code");
                String code_categorie = rs.getString("code_categorie");
                String designation = rs.getString("designation");
                int quantite = rs.getInt("quantite");
                double prix_unitaire = rs.getDouble("prix_unitaire");
                Date date_creation = rs.getDate("date");
                lesEnreg.add(new Article(code, code_categorie, designation, 
                        quantite, prix_unitaire, date_creation));
            }
        } catch (SQLException e) {
            System.out.println("problème avec recupEnregBD()");
        }
        return lesEnreg;
    }
     
     
     
     
}
