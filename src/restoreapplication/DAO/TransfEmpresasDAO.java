package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.TransfEmpresaItem;
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
    public ArrayList getTransferenciaItens(String id) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<TransfEmpresaItem> listaItens = new ArrayList();
        try {
            String query = "select * from TESTTRANSFEMPRESAITENS te where te.idtransfempresa = '"+id+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                TransfEmpresaItem item = new TransfEmpresaItem();
                item.setIdtransfempresa(rs.getString("idtransfempresa"));
                item.setIdtransfempresaitens(rs.getString("idtransfempresaitens"));
                item.setQuantidade(rs.getString("quantidade"));
                item.setProduto(rs.getString("produto"));
                listaItens.add(item);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaItens;
    }
    
}
