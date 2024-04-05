package restoreapplication.Conexao;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restoreapplication.Model.Config;

public class Conn {
    public static String status = "Não conectou...";
    public Connection con;
    
    public void Conectar() {
        String json = "";
        json = pegaCaminho();
        //-------------------
        Config config = new Gson().fromJson(json, Config.class);
        String databaseURL = "jdbc:firebirdsql:127.0.0.1:"+config.getPath();
        String user = "sysdba";
        String password = "masterkey";
        String driverName = "org.firebirdsql.jdbc.FBDriver";
        try {
            Class.forName(driverName).newInstance();
            con = DriverManager.getConnection(databaseURL, user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getMessage());
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getSQLState());
            JOptionPane.showMessageDialog(null,"SQLException: " + ex.getErrorCode());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar a base " + databaseURL + "ERRO : " + e);
        }
    }
    public boolean FecharConexao() {
        try {
            con.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    public String pegaCaminho(){
        String json = "";
        try {
            json = String.join(" ",
                    Files.readAllLines(
                            Paths.get("./config.json"),
                            StandardCharsets.UTF_8)
            );
        } catch (IOException ex) {
            Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }
     
}
