package controle.etat;

import controle.connection.ControleConnexion;
import controle.utilitaires.Systeme;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.oasis.JROdsExporter;
import net.sf.jasperreports.engine.export.oasis.JROdtExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class JasperMySQL_Parametres {

    private static Connection laConnexion =
            ControleConnexion.getLaConnectionStatique();
    private static JasperDesign design = null;
    private static JasperReport report = null;
    private static JasperPrint print = null;
    private static String code_facture = "";
    private static String code_client = "";
    private static String recherche_article = "";

    public static String getcode_facture() {
        return code_facture;
    }
    public static String getCode_Client() {
        return code_client;
    }
    public static String getRecherche_article() {
        return recherche_article;
    }
    public static void setCode_facture
            (String code_facture) {
        JasperMySQL_Parametres
                .code_facture = code_facture;
    }
    public static void setCode_client
            (String code_client) {
        JasperMySQL_Parametres
                .code_client = code_client;
    }
    public static void setRecherche_article
            (String recherche_article) {
        JasperMySQL_Parametres
                .recherche_article = recherche_article;
    }

    public static void chargeEtcompile(String rapport) {
        try {
            design = JRXmlLoader.load(Systeme.getRepertoireCourant()
                    + Systeme.getSeparateur() + "jasper"
                    + Systeme.getSeparateur() + rapport);
            report = JasperCompileManager.compileReport(design);
            HashMap<String, Object> mesParametres 
                    = new HashMap<>();
            mesParametres.put("code", new String("%"));
            mesParametres.put("recherche_article",
                    new String('%' + getRecherche_article()
                    + '%'));
            mesParametres.put("code_facture",
                    new String(getcode_facture()));
            print = JasperFillManager.fillReport
                    (report, mesParametres, laConnexion);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null,
                    "La compilation du rapport a échoué : \n"
                    + e.getMessage()
                    + "\nVeuillez contacter "
                    + "votre administrateur", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void apercu(String rapport) {
        chargeEtcompile(rapport);
        try {
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erreur lors de l'aperçu : \n" 
                    + e.getMessage()
                    + "\nVeuillez contacter "
                    + "votre administrateur", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void imprimer(String rapport) {
        chargeEtcompile(rapport);
        try {
            JasperPrintManager.printReport(print, true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "L'impression a échoué : \n" 
                    + e.getMessage()
                    + "\nVeuillez contacter "
                    + "votre administrateur", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void exporterPDF(String rapport) {
        JFileChooser save = new JFileChooser();
        save.setSelectedFile(new File("Fichier.pdf"));
        int retour = save.showSaveDialog(save);
        if (retour == JFileChooser.APPROVE_OPTION) {
            try {
                chargeEtcompile(rapport);
                JasperExportManager
                        .exportReportToPdfFile(print, 
                           save.getSelectedFile()
                           .getAbsolutePath());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, 
                        "L'export au format PDF a échoué :"
                        + " \n" + e.getMessage()
                        + "\nVeuillez contacter "
                        + "votre administrateur", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void exportHTML(String rapport) {
        chargeEtcompile(rapport);
        JFileChooser save = new JFileChooser();
        save.setSelectedFile(new File("Fichier.html"));
        int retour = save.showSaveDialog(save);
        if (retour == JFileChooser.APPROVE_OPTION) {
            try {
                JasperExportManager
                        .exportReportToHtmlFile
                           (print, save.getSelectedFile()
                           .getAbsolutePath());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "L'export au format HTML a échoué :"
                        + " \n" + e.getMessage()
                        + "\nVeuillez contacter "
                        + "votre administrateur", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void exportDOCX(String rapport) {
        chargeEtcompile(rapport);
        JFileChooser save = new JFileChooser();
        save.setSelectedFile(new File("Fichier.docx"));
        int retour = save.showSaveDialog(save);
        if (retour == JFileChooser.APPROVE_OPTION) {
            try {
                JRDocxExporter exporter = 
                        new JRDocxExporter();
                exporter.setParameter(JRExporterParameter
                        .JASPER_PRINT, print);
                exporter.setParameter(JRExporterParameter
                        .OUTPUT_FILE_NAME, save
                        .getSelectedFile().getAbsolutePath());
                exporter.exportReport();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "L'export a rencontré une erreur : "
                        + "\n" + e.getMessage()
                        + "\nVeuillez contacter "
                        + "votre administrateur", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void exportODS(String rapport) {
        chargeEtcompile(rapport);
        JFileChooser save = new JFileChooser();
        save.setSelectedFile(new File("Fichier.ods"));
        int retour = save.showSaveDialog(save);
        if (retour == JFileChooser.APPROVE_OPTION) {
            try {
                JROdsExporter exporter = new JROdsExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, save.getSelectedFile().getAbsolutePath());
                exporter.exportReport();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "L'export a rencontré une erreur : \n" + e.getMessage()
                        + "\nVeuillez contacter votre administrateur", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void exportODT(String rapport) {
        chargeEtcompile(rapport);
        JFileChooser save = new JFileChooser();
        save.setSelectedFile(new File("Fichier.odt"));
        int retour = save.showSaveDialog(save);
        if (retour == JFileChooser.APPROVE_OPTION) {
            try {
                JROdtExporter exporter = new JROdtExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, save.getSelectedFile().getAbsolutePath());
                exporter.exportReport();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "L'export a rencontré une erreur : \n" + e.getMessage()
                        + "\nVeuillez contacter votre administrateur", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
