package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Licenca;
import restoreapplication.Model.Reservado;

public class ReservadoDAO {
    Conn conexao = new Conn();
    public ArrayList getReservadoPCP(String empresa,String almox,String produto) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<Reservado> lista = new ArrayList<>();
        try {
            String query = "Select I.EMPRESA,I.ALMOX,I.IDFORMULACAO,F.FORMULA,I.ITEM_PRINCIPAL, G.PRODUTOPRINCIPAL, G.QTDEEMBALAGEM, Cast((I.QTDE) - Coalesce((Select Sum(T.QTDE)\n" +
"                                                                                        From TPCPPRODUCAOITENS T\n" +
"                                                                                        Where T.EMPRESA = I.EMPRESA And\n" +
"                                                                                              T.ITEM_PRINCIPAL = I.ITEM_PRINCIPAL And\n" +
"                                                                                              T.IDFORMULACAO = I.IDFORMULACAO), 0) As Numeric(18,8)) As QTDE\n" +
"From TPCPFORMULACAOITENS I\n" +
"Inner Join TPCPFORMULACAO F On (F.EMPRESA = I.EMPRESA And F.IDFORMULACAO = I.IDFORMULACAO)\n" +
"Inner Join TESTPRODUTOGERAL G On (G.CODIGO = I.ITEM_PRINCIPAL)\n" +
"Where I.EMPRESA = "+empresa+" And\n" +
"      I.ALMOX = "+almox+" And\n" +
"      F.DATAFECHAMENTO Is Null And\n" +
"      G.PRODUTOPRINCIPAL = "+produto+"  ";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Reservado reservado = new Reservado();
                reservado.setIdformulacao(rs.getString("idformulacao"));
                reservado.setFormula(rs.getString("formula"));
                reservado.setItem_pricipal(rs.getString("item_principal"));
                reservado.setProduto_principal(rs.getString("produtoprincipal"));
                reservado.setQtdeembalagem(rs.getString("qtdeembalagem"));
                reservado.setQtde(rs.getString("qtde"));
                reservado.setAlmox(rs.getString("almox"));
                reservado.setEmpresa(rs.getString("empresa"));
                
                lista.add(reservado);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return lista;
    }
     public ArrayList getReservadoPEDIDO(String empresa,String almox,String produto) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<Reservado> lista = new ArrayList<>();
        try {
            String query = "Select PED.STATUS,PRD.EMPRESA,prd.ALMOX,pdg.PRODUTOPRINCIPAL,PRD.PEDIDO,\n" +
"       (PRD.QTDE * PDG.QTDEEMBALAGEM) - Coalesce((Select Coalesce(T.QTDE * PDG.QTDEEMBALAGEM, 0)\n" +
"                                                  From TVENPEDIDO P\n" +
"                                                  Inner Join TVENPRODUTO T On (T.EMPRESA = P.EMPRESA And T.PEDIDO = P.CODIGO)\n" +
"                                                  Where T.EMPRESA = PRD.EMPRESA And\n" +
"                                                        T.PRODUTO = PRD.PRODUTO And\n" +
"                                                        P.CODIGO = PED.CODIGO And\n" +
"                                                        T.ALMOX = PRD.ALMOX And\n" +
"                                                        P.IDMOBSERVER > 0 And\n" +
"                                                        P.IDMOBDEVICE > 0 And\n" +
"                                                        P.PEDIDOVENDAEXTERNA <> 'S' And\n" +
"                                                        P.STATUS = 'PEN'), 0) As QTDE\n" +
"From TVENPRODUTO PRD\n" +
"Inner Join TVENPEDIDO PED On (PED.EMPRESA = PRD.EMPRESA And PED.CODIGO = PRD.PEDIDO)\n" +
"Inner Join TESTPRODUTOGERAL PDG On (PDG.CODIGO = PRD.PRODUTO)\n" +
"Where ((PED.STATUS In ('CXA') And\n" +
"      PRD.TIPOVENDA In ('N', 'T', 'P', 'M')) Or (PED.STATUS = 'PEN' And\n" +
"      PRD.TIPOVENDA In ('M', 'N'))) And\n" +
"      PRD.TIPOGRUPO = 'R' And\n" +
"      PRD.MOVIMENTAESTOQUE = 'S' And\n" +
"      PRD.EMPRESA = "+empresa+" And\n" +
"      PDG.PRODUTOPRINCIPAL = "+produto+" And\n" +
"      PRD.ALMOX = "+almox+" And\n" +
"      ((PED.PEDIDOAGRUPAMENTO Is Null) Or (PED.PEDIDOAGRUPAMENTO = PED.CODIGO)) ";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Reservado reservado = new Reservado();
                reservado.setProduto_principal(rs.getString("produtoprincipal"));
                reservado.setAlmox(rs.getString("almox"));
                reservado.setEmpresa(rs.getString("empresa"));
                reservado.setQtde(rs.getString("qtde"));
                reservado.setPedido(rs.getString("pedido"));
                reservado.setStatus(rs.getString("status"));
                
                lista.add(reservado);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return lista;
    }
      public ArrayList getReservadoDEVOLUCAO(String empresa,String almox,String produto) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<Reservado> lista = new ArrayList<>();
        try {
            String query = "Select DEV.STATUS,DEP.EMPRESA, DEP.PRODUTO, DEP.QTDE,DEV.ALMOX,DEV.CODIGO\n" +
"From TESTDEVOLUCAO DEV\n" +
"Inner Join TESTDEVOLUCAOPRODUTO DEP On DEV.EMPRESA = DEP.EMPRESA And DEP.IDDEVOLUCAO = DEV.CODIGO\n" +
"Where DEV.STATUS = 'PEN' And\n" +
"      DEP.EMPRESA = "+empresa+" And\n" +
"      DEP.PRODUTO = "+produto+" And\n" +
"      DEV.ALMOX = "+almox+"   ";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Reservado reservado = new Reservado();
                reservado.setProduto_principal(rs.getString("produto"));
                reservado.setAlmox(rs.getString("almox"));
                reservado.setEmpresa(rs.getString("empresa"));
                reservado.setQtde(rs.getString("qtde"));
                reservado.setPedido(rs.getString("codigo"));
                reservado.setStatus(rs.getString("status"));
                
                lista.add(reservado);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return lista;
    }
      public ArrayList getReservadoORDEMSERVICO(String empresa,String almox,String produto) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<Reservado> lista = new ArrayList<>();
        try {
            String query = "Select PED.CODIGO AS PEDIDO,(PRO.QTDE * PDG.QTDEEMBALAGEM) As QTDE,PED.ALMOX,PED.EMPRESA\n" +
"From TVENPRODUTO PRO\n" +
"Inner Join TVENPEDIDO PED On (PED.EMPRESA = PRO.EMPRESA And PED.CODIGO = PRO.PEDIDO)\n" +
"Inner Join TESTPRODUTOGERAL PDG On (PDG.CODIGO = PRO.PRODUTO)\n" +
"Where PED.STATUS = 'PEN' And\n" +
"      PRO.TIPOVENDA = 'C' And\n" +
"      PRO.TIPOGRUPO = 'R' And\n" +
"      PRO.MOVIMENTAESTOQUE = 'S' And\n" +
"      PRO.EMPRESA = "+empresa+" And\n" +
"      PDG.PRODUTOPRINCIPAL = "+produto+" And\n" +
"      PRO.ALMOX = "+almox+" And\n" +
"      ((PED.PEDIDOAGRUPAMENTO Is Null) Or (PED.PEDIDOAGRUPAMENTO = PED.CODIGO)) ";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Reservado reservado = new Reservado();
                reservado.setAlmox(rs.getString("almox"));
                reservado.setEmpresa(rs.getString("empresa"));
                reservado.setQtde(rs.getString("qtde"));
                reservado.setPedido(rs.getString("pedido"));
                
                lista.add(reservado);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return lista;
    }
}
