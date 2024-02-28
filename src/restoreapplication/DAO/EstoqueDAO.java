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

                listaEstoque.add(estoque);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaEstoque;
    }
    
}
