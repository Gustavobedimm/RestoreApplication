package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.ProdutoEmTransito;

public class ProdutoEmTransitoDAO {
    
    Conn conexao = new Conn();

    public ArrayList getProdutosEmTransito(String empresa,String almox) throws ClassNotFoundException {
        conexao.Conectar();

        ArrayList<ProdutoEmTransito> listaProdutos = new ArrayList();
        try {
            String query = "SELECT TNP.EMPRESA,TNP.ALMOX,TNP.PRODUTO,SUM(TNP.QTDE) as QUANTIDADE\n" +
"FROM TESTNFEPROD TNP\n" +
"JOIN TESTNFE TN ON TN.EMPRESA = TNP.EMPRESA AND TN.CODIGOID = TNP.CODIGOID\n" +
"WHERE TN.ESTTRANSITO = 'S' and tn.EMPRESA = '"+empresa+"' and tnp.ALMOX = '"+almox+"'\n" +
"GROUP by  TNP.EMPRESA,TNP.ALMOX,TNP.PRODUTO";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                ProdutoEmTransito produtoEmTransito = new ProdutoEmTransito();

                produtoEmTransito.setEmpresa(rs.getString("EMPRESA"));
                produtoEmTransito.setAlmox(rs.getString("ALMOX"));
                produtoEmTransito.setProduto(rs.getString("PRODUTO"));
                produtoEmTransito.setQuantidade(rs.getString("QUANTIDADE"));
                //produtoEmTransito.setNumeronfe(rs.getString("NUMERONFE"));
                //produtoEmTransito.setFornecedor(rs.getString("FORNECEDOR"));

                listaProdutos.add(produtoEmTransito);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaProdutos;
    }
}
