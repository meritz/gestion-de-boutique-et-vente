package entite;


public abstract class Personne {
    String code;
    String nom;
    String prenom;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    //1er constructeur

    public Personne(String vCode, String vNom, String vPrenom) {
        this.code = vCode;
        this.nom = vNom;
        this.prenom = vPrenom;
    }
    
    //2eme constructeur

    public Personne(String vCode) {
        this.code = vCode;
    }
    
    //3eme constructeur

    public Personne() {
    }
    
    
    
}

