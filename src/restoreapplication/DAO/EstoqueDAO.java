package restoreapplication.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Estoque;

public class EstoqueDAO {
    Conn conexao = new Conn();
    
    public ArrayList estoqueProduto(String produtoP,String empresa) throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Estoque> listaEstoque = new ArrayList();
        try {
            String query = "select * from testestoque te where te.produto = '"+produtoP+"' and te.empresa = '"+empresa+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Estoque estoque = new Estoque();

                estoque.setEMPRESA(rs.getString("EMPRESA"));
                estoque.setALMOX(rs.getString("ALMOX"));
                estoque.setESTDISPONIVEL(rs.getString("ESTDISPONIVEL"));
                estoque.setESTARETIRAR(rs.getString("ESTARETIRAR"));
                estoque.setESTCONDICIONAL(rs.getString("ESTCONDICIONAL"));
                estoque.setESTRESERVADO(rs.getString("ESTRESERVADO"));
                estoque.setESTVENDAEXTERNA(rs.getString("ESTVENDAEXTERNA"));
                estoque.setENDERECO(rs.getString("ENDERECO"));
                estoque.setESTTRANSITO(rs.getString("ESTTRANSITO"));
                estoque.setDATAHORAALTERACAO(rs.getString("DATAHORAALTERACAO"));
                

                listaEstoque.add(estoque);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaEstoque;
    }
    public ArrayList estoqueProdutoReservadoNegativo() throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Estoque> listaEstoque = new ArrayList();
        try {
            String query = "select * from testestoque te where te.estreservado < 0";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Estoque estoque = new Estoque();

                estoque.setEMPRESA(rs.getString("EMPRESA"));
                estoque.setALMOX(rs.getString("ALMOX"));
                estoque.setESTDISPONIVEL(rs.getString("ESTDISPONIVEL"));
                estoque.setESTARETIRAR(rs.getString("ESTARETIRAR"));
                estoque.setESTCONDICIONAL(rs.getString("ESTCONDICIONAL"));
                estoque.setESTRESERVADO(rs.getString("ESTRESERVADO"));
                estoque.setESTVENDAEXTERNA(rs.getString("ESTVENDAEXTERNA"));
                estoque.setENDERECO(rs.getString("ENDERECO"));
                estoque.setESTTRANSITO(rs.getString("ESTTRANSITO"));
                estoque.setDATAHORAALTERACAO(rs.getString("DATAHORAALTERACAO"));
                estoque.setPRODUTO(rs.getString("PRODUTO"));

                listaEstoque.add(estoque);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaEstoque;
    }
    public ArrayList estoqueProdutoReservadoPositivo() throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Estoque> listaEstoque = new ArrayList();
        try {
            String query = "select * from testestoque te where te.estreservado > 0";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Estoque estoque = new Estoque();

                estoque.setEMPRESA(rs.getString("EMPRESA"));
                estoque.setALMOX(rs.getString("ALMOX"));
                estoque.setESTDISPONIVEL(rs.getString("ESTDISPONIVEL"));
                estoque.setESTARETIRAR(rs.getString("ESTARETIRAR"));
                estoque.setESTCONDICIONAL(rs.getString("ESTCONDICIONAL"));
                estoque.setESTRESERVADO(rs.getString("ESTRESERVADO"));
                estoque.setESTVENDAEXTERNA(rs.getString("ESTVENDAEXTERNA"));
                estoque.setENDERECO(rs.getString("ENDERECO"));
                estoque.setESTTRANSITO(rs.getString("ESTTRANSITO"));
                estoque.setDATAHORAALTERACAO(rs.getString("DATAHORAALTERACAO"));
                estoque.setPRODUTO(rs.getString("PRODUTO"));

                listaEstoque.add(estoque);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaEstoque;
    }
    
}
