package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Formulacao;
import restoreapplication.Model.FormulacaoItem;

public class FormulacaoDAO {
    Conn conexao = new Conn();
    public Formulacao getFormulacao(String empresa,String idformulacao) throws ClassNotFoundException {
       conexao.Conectar();
        Formulacao formulcao = new Formulacao();
        try {
            //and te.datahora like '%2023-05%'
            String query = "SELECT * from TPCPFORMULACAO tpf where tpf.IDFORMULACAO = '"+idformulacao+"' and tpf.empresa = '"+empresa+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                formulcao.setEmpresa(rs.getString("empresa"));
                formulcao.setIdformulacao(rs.getString("idformulacao"));
                formulcao.setFormula(rs.getString("formula"));
                formulcao.setQtde(rs.getString("qtde"));
                formulcao.setData(rs.getString("data"));
                formulcao.setUsuario(rs.getString("usuario"));
                formulcao.setDatafechamento(rs.getString("datafechamento"));
                formulcao.setFormulado(rs.getString("formulado"));
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return formulcao;
    }
    public ArrayList getFormulacaoItens(String empresa,String idformulacao) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<FormulacaoItem> lista = new ArrayList<>();
        try {
            //and te.datahora like '%2023-05%'
            String query = "SELECT * from TPCPFORMULACAOITENS tpfi where tpfi.IDFORMULACAO = '"+idformulacao+"' and tpfi.empresa = '"+empresa+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                FormulacaoItem item = new FormulacaoItem();
                item.setEmpresa(rs.getString("empresa"));
                item.setIdformulacao(rs.getString("idformulacao"));
                item.setAlmox(rs.getString("almox"));
                item.setItem_principal(rs.getString("item_principal"));
                item.setItem(rs.getString("item"));
                item.setQtdeunit(rs.getString("qtdeunit"));
                item.setQtde(rs.getString("qtde"));
                item.setGanho(rs.getString("ganho"));
                item.setPerganho(rs.getString("perganho"));
                item.setPercconcentracao(rs.getString("percconcentracao"));
                item.setDiferencaqtde(rs.getString("diferencaqtde"));
                item.setIdlote(rs.getString("idlote"));
                item.setRecebediferencaqtde(rs.getString("recebediferencaqtde"));
                lista.add(item);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return lista;
    }
    
}
