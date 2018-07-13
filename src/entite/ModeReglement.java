
package entite;

import controle.connection.ControleConnexion;
import java.sql.Connection;
import java.util.ArrayList;

public class ModeReglement {
     private int code;
     private String type;
     private static Connection laConnexion = ControleConnexion.getLaConnectionStatique();
     private final ArrayList<ModeReglement> lesEnreg = new ArrayList<>();
    
     //
     //1er constructeur
     //

    public ModeReglement() {
         // lireRecupCRUD();
    }
     
    //
    //2eme
    //

    public ModeReglement(int code, String type) {
        this.code = code;
        this.type = type;
    }
    
    //
    //3eme
    //

    public ModeReglement(String vType) {
        type = vType;
    }
    //
    //accesseurs
    //

    public int getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public ArrayList<ModeReglement> getLesEnreg() {
        return lesEnreg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
