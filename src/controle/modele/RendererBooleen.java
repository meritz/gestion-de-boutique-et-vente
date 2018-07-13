
package controle.modele;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RendererBooleen extends DefaultTableCellRenderer{
    private static final long serialVersionUID = 1L;
    
    private Icon carteOui;
    private Icon carteNon;
   
    public RendererBooleen(){
        super();
        carteOui = new ImageIcon(getClass()
                .getResource("/images/icon-16-default.png"));
        carteNon = new ImageIcon(getClass()
                .getResource("/images/icon-16-help-docs.png"));
    }
    
    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSeleted, boolean hasFocus,
            int row, int column){
        super.getTableCellRendererComponent(table, value, isSeleted, hasFocus, row, column);
       Boolean carte_fidele = (boolean)value;
       setText("");
       if(carte_fidele){
           setIcon(carteOui);
       }else{
           setIcon(carteNon);
       }
       //pour centre les donnee de la colonne
       setHorizontalAlignment(CENTER);
        return this;
    }
}
