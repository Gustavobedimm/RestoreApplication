package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.LoteValidade;

public class LoteValidadeDAO {
    Conn conexao = new Conn();
    public ArrayList getMovimentacaoLote(String produtoP) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<LoteValidade> listaLotes = new ArrayList();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from TESTLOTEVALIDADEESTOQUE tq where tq.produtoprincipal = " +produtoP;
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                LoteValidade loteValidade = new LoteValidade();
                loteValidade.setEmpresa(rs.getString("Empresa"));
                loteValidade.setIdentificador(rs.getString("Identificador"));
                loteValidade.setProdutoprincipal(rs.getString("Produtoprincipal"));
                loteValidade.setLote(rs.getString("Lote"));
                loteValidade.setFabricacao(rs.getString("Fabricacao"));
                loteValidade.setVencimento(rs.getString("Vencimento"));
                loteValidade.setEstoqueatual(rs.getString("Estoqueatual"));
                
                listaLotes.add(loteValidade);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaLotes;
    }
    public LoteValidade getMovimentacaoLoteID(String idLote)  {
       conexao.Conectar();
       LoteValidade loteValidade = new LoteValidade();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from TESTLOTEVALIDADEESTOQUE tq where tq.identificador = " +idLote;
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                loteValidade.setEmpresa(rs.getString("Empresa"));
                loteValidade.setIdentificador(rs.getString("Identificador"));
                loteValidade.setProdutoprincipal(rs.getString("Produtoprincipal"));
                loteValidade.setLote(rs.getString("Lote"));
                loteValidade.setFabricacao(rs.getString("Fabricacao"));
                loteValidade.setVencimento(rs.getString("Vencimento"));
                loteValidade.setEstoqueatual(rs.getString("Estoqueatual"));
                loteValidade.setAlteracao(rs.getString("datahoraalteracao"));
                }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return loteValidade;
    }
}
