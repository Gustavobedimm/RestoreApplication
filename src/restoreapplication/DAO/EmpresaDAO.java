package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Empresa;

public class EmpresaDAO {
    Conn conexao = new Conn();
     public ArrayList consultaEmpresa() throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        try {
            String query = "select * from TGEREMPRESA";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Empresa empresa = new Empresa();
                empresa.setCodigo(rs.getString("codigo"));
                empresa.setNomefantasia(rs.getString("nomefantasia"));
                empresa.setCnpj(rs.getString("cpfcnpj"));
                empresa.setVa(rs.getString("va"));
                listaEmpresas.add(empresa);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaEmpresas;
    } 
    
}
