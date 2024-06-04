package restoreapplication.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Produto;
public class ProdutoDAO {
Conn conexao = new Conn();
    
    public Produto consultaProduto(String empresa,String produtoP) throws ClassNotFoundException {
       conexao.Conectar();
        Produto produto = new Produto();
        ArrayList<Produto> listaProdutos = new ArrayList();
        try {
            String query = "select * from testprodutogeral tpg inner join testproduto tp on tp.produto = tpg.codigo where tpg.codigo = '"+produtoP+"' and tp.empresa = '"+empresa+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {

                produto.setCODIGO(rs.getString("CODIGO"));
                produto.setDESCRICAO(rs.getString("DESCRICAO"));
                produto.setCODIGOBARRA(rs.getString("CODIGOBARRA"));
                produto.setESTARETIRAR(rs.getString("ESTARETIRAR"));
                produto.setESTCONDICIONAL(rs.getString("ESTCONDICIONAL"));
                produto.setESTDISPONIVEL(rs.getString("ESTDISPONIVEL"));
                produto.setESTRESERVADO(rs.getString("ESTRESERVADO"));
                produto.setPRODUTOPRINCIPAL(rs.getString("PRODUTOPRINCIPAL"));
                produto.setCONTROLALOTE(rs.getString("CONTROLALOTE"));
                produto.setATIVO(rs.getString("ATIVO"));
                produto.setESTFRACIONADO(rs.getString("ESTFRACIONADO"));
                produto.setPRODUTOGENERICO(rs.getString("PRODUTOGENERICO"));
                produto.setDISPONIVELVENDA(rs.getString("DISPONIVELVENDA"));
                produto.setCONTROLANUMEROSERIE(rs.getString("CONTROLANUMEROSERIE"));
                produto.setQTDE(rs.getString("QTDEEMBALAGEM"));
                produto.setEMBALEGEM(rs.getString("EMBALAGEM"));
                produto.setESTTRANSITO(rs.getString("ESTTRANSITO"));
                produto.setESTVENDAEXTERNA(rs.getString("ESTVENDAEXTERNA"));
                produto.setESTOQUEMINIMO(rs.getString("ESTOQUEMINIMO"));
                produto.setESTOQUEMAXIMO(rs.getString("ESTOQUEMAXIMO"));
                produto.setULTENTRADAQTDE(rs.getString("ULTENTRADAQTDE"));
                produto.setULTENTRADADATA(rs.getString("ULTENTRADADATA"));
                produto.setULTENTRADASAIDA(rs.getString("ULTSAIDADATA"));
                
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return produto;
    }
public ArrayList produtosDoPedido(String pedido,String empresa) throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Produto> listaProdutos = new ArrayList();
        try {
            String query = "select * from tvenproduto tvp where tvp.pedido = '"+pedido+"' and tvp.empresa = '"+empresa+"' order by tvp.identificador";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCODIGO(rs.getString("PRODUTO"));
                produto.setDESCRICAO(rs.getString("DESCRICAOEDITADA"));
                produto.setALMOX(rs.getString("ALMOX"));
                produto.setQTDE(rs.getString("QTDE"));
                listaProdutos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaProdutos;
    }
public ArrayList produtosDaNota(String nota,String empresa) throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Produto> listaProdutos = new ArrayList();
        try {
            String query = "select * from testnfeprod tprod inner join testprodutogeral tpg on tpg.codigo = tprod.produto where tprod.codigoid = '"+nota+"' and tprod.empresa = '"+empresa+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCODIGO(rs.getString("PRODUTO"));
                produto.setALMOX(rs.getString("ALMOX"));
                produto.setQTDE(rs.getString("QTDE"));
                produto.setDESCRICAO(rs.getString("DESCRICAO"));
                listaProdutos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaProdutos;
    }
public ArrayList buscaSaldo(String empresa,String almox,String produtoP) throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Produto> listaProdutos = new ArrayList();
        try {
            String query = "select * from TESTEXTSALDOPRODUTO tsp where tsp.produto = '"+produtoP+"' and tsp.almox = '"+almox+"' and tsp.empresa = '"+empresa+"' order by tsp.anomes";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCODIGO(rs.getString("PRODUTO"));
                produto.setALMOX(rs.getString("ALMOX"));
                produto.setANOSMES(rs.getString("ANOMES"));
                produto.setANTERIOR(rs.getString("ANTERIOR"));
                produto.setENTRADA(rs.getString("ENTRADA"));
                produto.setSAIDA(rs.getString("SAIDA"));
                produto.setATUAL(rs.getString("ATUAL"));
                produto.setEMPRESA(rs.getString("EMPRESA"));
                listaProdutos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaProdutos;
    }
public ArrayList buscaCodigos(String empresa ) throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Produto> listaCodigos = new ArrayList();
        try {
            String query = "select tp.produto,tp.empresa from testproduto tp\n" +
"inner join TESTPRODUTOGERAL tpg on tpg.CODIGO = tp.PRODUTO\n" +
"where tp.empresa = '"+empresa+"' and tp.ATIVO = 'S' and tp.PRODUTO = tpg.PRODUTOPRINCIPAL order by tp.PRODUTO" ;
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCODIGO(rs.getString("PRODUTO"));
                produto.setEMPRESA(rs.getString("EMPRESA"));
                listaCodigos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaCodigos;
    }
public boolean consultaTestEstoque(String empresa,String almox,String produtoP) throws ClassNotFoundException {
       conexao.Conectar();
       boolean existe = false;
        try {
            String query = "select * from testestoque te where te.produto = '"+produtoP+"' and te.empresa = '"+empresa+"' and te.almox = '"+almox+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                existe = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return existe;
    }

}
