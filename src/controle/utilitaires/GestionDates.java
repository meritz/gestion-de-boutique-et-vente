/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.utilitaires;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;

/**
 *
 * @author MODESTE
 */
public class GestionDates {
    public static String dateEnChaineFR(Date laDate){
        //
        Locale locale = Locale.FRANCE;
        //
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", locale);
        String date = dateFormat.format(laDate);
        return date;
    }
    
    public static String chaineDateFRversEN(String dateFR){
        String dateEN = "";
        String vAnneeEN = dateFR.substring(6, 10);
        String vMoisEN = dateFR.substring(3, 5);
        String vJourEN = dateFR.substring(0, 2);
        dateEN = vAnneeEN + "-" + vMoisEN + "-" + vJourEN;
        return dateEN;
    }
    public static Date dateJavaEnDateSQL(Date laDate){
        Date dateSQL = new java.sql.Date(laDate.getTime());
        return dateSQL;
    }
    
    public static String chaineDateENversFR(String dateEN){
        String dateFR="";
        String vJourFR = dateEN.substring(8, 10);
        String vMoisFR = dateEN.substring(5, 7);
        String vAnneeFR = dateEN.substring(0, 4);
        dateFR = vJourFR + "/" + vMoisFR + "/" + vAnneeFR;
        return dateFR;
    }
    
    public static Date chaineENversDateJava(String laDtaeChaineEN)throws ParseException {
        SimpleDateFormat dateStandard = new SimpleDateFormat("yyyy-MM-dd");
        Date laDateDate = dateStandard.parse(laDtaeChaineEN);
        return laDateDate;
    }
}
