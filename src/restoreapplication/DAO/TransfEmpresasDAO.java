package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.TransfEmpresas;

public class TransfEmpresasDAO {
    Conn conexao = new Conn();
    public TransfEmpresas getTransferencia(String id) throws ClassNotFoundException {
       conexao.Conectar();
        TransfEmpresas transf = new TransfEmpresas();
        try {
            String query = "select * from TESTTRANSFEMPRESA te where te.idesttransfempresa = '"+id+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("entrei no while");
                transf.setId(rs.getString("idesttransfempresa"));
                transf.setData(rs.getString("data"));
                transf.setHora(rs.getString("hora"));
                transf.setUsuario(rs.getString("usuario"));
                transf.setStatus(rs.getString("status"));
                transf.setEmpresaOrigem(rs.getString("empresaorigem"));
                transf.setAlmoxOrigem(rs.getString("almoxorigem"));
                transf.setEmpresaDestino(rs.getString("empresadestino"));
                transf.setAlmoxDestino(rs.getString("almoxdestino"));
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
            transf = null;
        }
        conexao.FecharConexao();
        return transf;
    }
    
}
