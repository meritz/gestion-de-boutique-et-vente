package entite;


public class Parametres {
 private String nomUtilisateur;
 private String motDePasse;
 private String serveurBD;
 private String driverSGBD;

 //constructeur
    public Parametres() {
        nomUtilisateur = "root";
        motDePasse = "";
        driverSGBD ="org.gjt.mm.mysql.Driver";
        serveurBD = "jdbc:mysql://localhost/xelfi";
    }
 
     public String getDriverSGBD() {
        return driverSGBD;
    }
    public void setDriverSGBD(String driverSGBD) {
        this.driverSGBD = driverSGBD;
    }
     public String getMotDePasse() {
        return motDePasse;
    }
     
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
    public String getNomUtilisateur() {
        return nomUtilisateur;
    }
     
    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }
   

    public String getServeurBD() {
        return serveurBD;
    }

   
    public void setServeurBD(String serveurBD) {
        this.serveurBD = serveurBD;
    }
 
}

