
package controle.modele;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Font;


public class RendererGras extends DefaultTableCellRenderer{
    
    private static final long serialVersionUID = 1L;
    public JTable table ;
        
    public Component getTableCellRendereComponent(JTable table,
            Object value, boolean isSeleted, boolean hasFocus,
            int row, int column){
        super.getTableCellRendererComponent(table, value, isSeleted, hasFocus, row, column);
        setFont(getFont().deriveFont(Font.BOLD));
        return this;
    }
}
