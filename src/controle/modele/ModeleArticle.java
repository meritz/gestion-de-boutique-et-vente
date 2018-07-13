
package controle.modele;
import java.util.ArrayList;
import entite.Article;
import javax.swing.table.AbstractTableModel;

public class ModeleArticle extends AbstractTableModel{


   
    //proprie
    //---------------------
    Article instanceArticle = new Article();
    private ArrayList<Article> lesDonnees = instanceArticle.getLesEnreg();
    private final String[] lesTitre = {"Code", "Code Catégorie", "Désignation", "Quantié", "prix unitaire", "date creation"};
    
    //
     @Override
    public int getRowCount() {
        return lesDonnees.size();
    }
    
     @Override
    public int getColumnCount() {
        return lesTitre.length; 
    }
    @Override
      public String getColumnName(int columnIndex) {
        return lesTitre[columnIndex];
    }
    
   
    //retourne l'objet associe a une cellule dela table
    @Override
    public Object getValueAt(int rowIndex,int columnIndex){
        switch(columnIndex){
            case 0:
                return lesDonnees.get(rowIndex).getCode();
            case 1: 
                return lesDonnees.get(rowIndex).getCode_categorie();
            case 2:
                return lesDonnees.get(rowIndex).getDesignation();
            case 3:
                return lesDonnees.get(rowIndex).getQuantite();
            case 4:
                return lesDonnees.get(rowIndex).getPrix_unitaire();
            case 5:
                return lesDonnees.get(rowIndex).getDate();
            default:
                return null;
        }
    }
    // methodes FireXXX
    public void CreerMOD(Article unArticle){
        lesDonnees.add(unArticle);
        fireTableRowsInserted(lesDonnees.size() -1, lesDonnees.size() -1);
    }
    
    public void supprimerMOD(int rowIndex){
        lesDonnees.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    public void modifierMOD(int firstRow, int lastRow, Article unArticle){
        lesDonnees.set(firstRow, unArticle);
        fireTableCellUpdated(firstRow, lastRow);
    }
    
    public void lireRecupMode(ArrayList<Article> nouvellesDonnees){
        lesDonnees = nouvellesDonnees;
        fireTableDataChanged();
    }
}