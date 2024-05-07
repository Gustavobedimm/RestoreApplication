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
                pedido.setGerafinanceiro(rs.getString("gerafinanceiro"));
                pedido.setTipovenda(rs.getString("tipovenda"));
                pedido.setQtdevolumes(rs.getString("qtdevolumes"));
                pedido.setNfeletronica(rs.getString("nfeletronica"));
                pedido.setIdtabelapreco(rs.getString("Idtabelapreco"));
                pedido.setRenegociacaoagrupamento(rs.getString("renegociadoagrupamento"));
                pedido.setInutilizada(rs.getString("inutilizada"));
                pedido.setDenegada(rs.getString("denegada"));
                pedido.setNfcancelada(rs.getString("nfcancelada"));
                pedido.setTipooperacao(rs.getString("tipooperacao"));
                pedido.setClienteendereco(rs.getString("clienteendereco"));
                
                
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
      public ArrayList consultaPedidosPendentes(String empresa) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        
        try {
            String query = "Select * From TVENPRODUTO PRD\n" +
"Inner Join TVENPEDIDO PED On (PED.EMPRESA = PRD.EMPRESA And PED.CODIGO = PRD.PEDIDO) \n" +
"Where ((PED.STATUS In ('CXA') And\n" +
"      PRD.TIPOVENDA In ('N', 'T', 'P', 'M')) Or (PED.STATUS = 'PEN' And \n" +
"      PRD.TIPOVENDA In ('M', 'N'))) And \n" +
"      PRD.TIPOGRUPO = 'R' And \n" +
"      PRD.MOVIMENTAESTOQUE = 'S' And \n" +
"      PRD.EMPRESA = '"+empresa+"' And\n" +
"      ((PED.PEDIDOAGRUPAMENTO Is Null) Or (PED.PEDIDOAGRUPAMENTO = PED.CODIGO))";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
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
                //pedido.setDESCRICAO(rs.getString("DESCRICAO"));
                //pedido.setCODIGOFISCAL(rs.getString("CODIGOFISCAL"));
                //pedido.setMOVIMENTAESTOQUE(rs.getString("MOVIMENTAESTOQUE"));
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
                listaPedidos.add(pedido);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaPedidos;
    } 
}
