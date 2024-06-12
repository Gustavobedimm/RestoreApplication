package restoreapplication;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.UIDefaults;
import restoreapplication.Telas.Principal;
import javax.swing.UIManager;

public class RestoreApplication {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatMacLightLaf() );
            //UIManager.setLookAndFeel( new FlatLightLaf() );
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        UIDefaults defaults = UIManager.getLookAndFeelDefaults();
        if (defaults.get("Table.alternateRowColor") == null) {
            defaults.put("Table.alternateRowColor", new Color(240, 240, 240));
        }
        

        Principal principal = new Principal();
        principal.setVisible(true);
    }

}
