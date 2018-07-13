package dialogue;

import controle.etat.JasperMySQL_Parametres;
import controle.modele.ComboBoxRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FenExport extends JDialog {
    private static final long serialVersionUID = 1L;
    private JComboBox<Object> type_export;
    private JPanel jContentPane = null;
    private String modeleJasper = null;
    private JButton export;
    private JLabel jLabel1;

    public FenExport(String modele) {
        super();
        modeleJasper = modele;
        setSize(442, 150);
        setContentPane(getJContentPane());
    }

    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.setBackground(new java.awt.Color(255, 255, 255));
            jContentPane.setPreferredSize(new java.awt.Dimension(373, 112));
            jContentPane.add(getType_export());
            jContentPane.add(getJLabel1());
            jContentPane.add(getExport());
        }
        return jContentPane;
    }
    private JComboBox<Object> getType_export() {
        if (type_export == null) {
            Integer[] intArray = {0, 1, 2, 3, 4};
            ComboBoxRenderer renderer = new ComboBoxRenderer();
            type_export = new JComboBox<Object>(intArray);
            type_export.setBounds(18, 46, 155, 54);
            type_export.setRenderer(renderer);
        }
        return type_export;
    }
    private JLabel getJLabel1() {
        if (jLabel1 == null) {
            jLabel1 = new JLabel();
            jLabel1.setText("Choisissez dans la liste "
                    + "le type de document à exporter.");
            jLabel1.setBounds(18, 19, 387, 16);
        }
        return jLabel1;
    }
    private JButton getExport() {
        if (export == null) {
            export = new JButton();
            export.setText("Exporter");
            export.setBounds(245, 45, 151, 55);
            export.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    switch (type_export.getSelectedIndex()) {
                        case 0:
                            JasperMySQL_Parametres.exporterPDF(modeleJasper);
                            break;
                        case 1:
                            JasperMySQL_Parametres.exportDOCX(modeleJasper);
                            break;
                        case 2:
                            JasperMySQL_Parametres.exportHTML(modeleJasper);
                            break;
                        case 3:
                            JasperMySQL_Parametres.exportODT(modeleJasper);
                            break;
                        case 4:
                            JasperMySQL_Parametres.exportODS(modeleJasper);
                            break;
                        default:
                            break;
                    }
                    FenExport.this.dispose();
                }
            });
        }
        return export;
    }

    public static void main(String[] args) {
        try {
            FenExport dialog = new FenExport("EtatClients.jrxml");
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
