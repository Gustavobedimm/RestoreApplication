package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.InventarioItem;
import restoreapplication.Model.Licenca;

public class LicencaDAO {
    Conn conexao = new Conn();
    public ArrayList getLicenca() throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<Licenca> listaLicencas = new ArrayList<>();
        try {
            String query = "select * from TGERLICENCA";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Licenca licenca = new Licenca();
                licenca.setNumero(rs.getString("numero"));
                licenca.setEmpresa(rs.getString("empresa"));
                licenca.setVersao(rs.getString("versao"));
                listaLicencas.add(licenca);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaLicencas;
    }
}
