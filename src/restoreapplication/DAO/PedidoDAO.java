package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Pedido;

public class PedidoDAO {
     Conn conexao = new Conn();
     public Pedido consultaPedido(String numeroPed,String empresa) throws ClassNotFoundException {
       conexao.Conectar();
        Pedido pedido = new Pedido();
        try {
            String query = "select * from tvenpedido ped inner join testnatureza nat on nat.codigo = ped.tipooperacao where ped.codigo = '"+numeroPed+"' and ped.empresa = '"+empresa+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {

                pedido.setEMPRESA(rs.getString("EMPRESA"));
                pedido.setCODIGO(rs.getString("CODIGO"));
                pedido.setDATA(rs.getString("DATA"));
                pedido.setHORA(rs.getString("HORA"));
                pedido.setCLIENTENOME(rs.getString("CLIENTENOME"));
                pedido.setVALORBRUTO(rs.getString("VALORBRUTO"));
                pedido.setALMOX(rs.getString("ALMOX"));
                pedido.setSTATUS(rs.getString("STATUS"));
                pedido.setNOTAFISCAL(rs.getString("NOTAFISCAL"));
                pedido.setVERSAO(rs.getString("VERSAO"));
                pedido.setDESCRICAO(rs.getString("DESCRICAO"));
                pedido.setCODIGOFISCAL(rs.getString("CODIGOFISCAL"));
                pedido.setMOVIMENTAESTOQUE(rs.getString("MOVIMENTAESTOQUE"));
                pedido.setDATAEFE(rs.getString("DATAEFE"));
                pedido.setHORAEFE(rs.getString("HORAEFE"));
                pedido.setDATASAIDA(rs.getString("DATASAIDA"));
                pedido.setHORASAIDA(rs.getString("HORASAIDA"));
                pedido.setSEQUENCIALPAF(rs.getString("SEQUENCIALPAF"));
                String agrupamento = rs.getString("PEDIDOAGRUPAMENTO");
                if(agrupamento == null || agrupamento == ""){
                    pedido.setPEDIDOAGRUPAMENTO("0");
                }else{
                    pedido.setPEDIDOAGRUPAMENTO(rs.getString("PEDIDOAGRUPAMENTO"));
                }
                
                
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return pedido;
    } 
}
