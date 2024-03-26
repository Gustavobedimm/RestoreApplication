package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Almox;
import restoreapplication.Model.NfePedidos;
import restoreapplication.Model.PedCompraProd;

public class PedidoCompraDAO {
Conn conexao = new Conn();
     public ArrayList consultaRegistrosTESTPEDCOMPRAPROD() throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<PedCompraProd> listaPedCompraProd = new ArrayList<>();
        try {
            String query = "select TPCP.EMPRESA,TPCP.PEDIDO,TPCP.PRODUTO,TPCP.QTDEPEDIDA,TPCP.QTDERECEBIDA,TPCP.QTDERESTANTE,TPCP.QTDECANCELADA from TESTPEDCOMPRAPROD TPCP order by TPCP.EMPRESA,TPCP.PEDIDO,TPCP.PRODUTO";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                PedCompraProd pedCompraProd = new PedCompraProd();
                pedCompraProd.setEmpresa(rs.getString("empresa"));
                pedCompraProd.setPedido(rs.getString("pedido"));
                pedCompraProd.setProduto(rs.getString("produto"));
                pedCompraProd.setQtdepedida(rs.getString("qtdepedida"));
                pedCompraProd.setQtderecebida(rs.getString("qtderecebida"));
                pedCompraProd.setQtderestante(rs.getString("qtderestante"));
                pedCompraProd.setQtdecancelada(rs.getString("qtdecancelada"));
                listaPedCompraProd.add(pedCompraProd);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaPedCompraProd;
    }
     public ArrayList consultaRegistroNF(String empresa,String pedido,String produto) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<NfePedidos> listaNF = new ArrayList<>();
        try {
            String query = "select t.empresa,t.pedidocompraid,t.produto,t.qtderecebida from TESTNFEPEDIDOS T where t.empresa = "+empresa+" and t.pedidocompraid = "+pedido+" and t.produto = "+produto+"";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                NfePedidos nfePedidos = new NfePedidos();
                nfePedidos.setEmpresa(rs.getString("empresa"));
                nfePedidos.setPedidocompraid(rs.getString("pedidocompraid"));
                nfePedidos.setProduto(rs.getString("produto"));
                nfePedidos.setQtderecebida(rs.getString("qtderecebida"));
                listaNF.add(nfePedidos);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaNF;
    }
      public void updatePedido(String empresa,String pedido,String produto,Double recebida,Double restante,Double cancelada) throws ClassNotFoundException {
       conexao.Conectar();
        try {
            String query = "update TESTPEDCOMPRAPROD TPCP set TPCP.QTDERECEBIDA =?,TPCP.QTDERESTANTE =?,TPCP.QTDECANCELADA =?  where TPCP.empresa =? and TPCP.pedido =? and TPCP.produto = ?";
            PreparedStatement pst;
            pst = conexao.con.prepareStatement(query);
            pst.setDouble(1, recebida);
            pst.setDouble(2, restante);
            pst.setDouble(3, cancelada);
            pst.setString(4, empresa);
            pst.setString(5, pedido);
            pst.setString(6, produto);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
    }
      public void updateProduto(String empresa,String produto,Double estoque) throws ClassNotFoundException {
       conexao.Conectar();
        try {
            String query = "update TESTPRODUTO TP set TP.ESTPEDIDO =? where TP.empresa =? and Tp.produto =?";
            PreparedStatement pst;
            pst = conexao.con.prepareStatement(query);
            pst.setDouble(1, estoque);
            pst.setString(2, empresa);
            pst.setString(3, produto);
            
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
    }
       public ArrayList selecionaProdutos() throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<PedCompraProd> listaPedCompraProd = new ArrayList<>();
        try {
            String query = "with auxilia as(select p.EMPRESA,p.PRODUTO,tp.ESTPEDIDO,sum(p.QTDERESTANTE) as restante from TESTPEDCOMPRAPROD p\n" +
                           "inner join testproduto tp on tp.PRODUTO = p.PRODUTO and tp.EMPRESA = p.EMPRESA\n" +
                           "group by 1,2,3)\n" +
                           "select * from auxilia aux where aux.estpedido <> aux.restante";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                PedCompraProd pedCompraProd = new PedCompraProd();
                pedCompraProd.setEmpresa(rs.getString("empresa"));
                pedCompraProd.setProduto(rs.getString("produto"));
                pedCompraProd.setAux(rs.getString("estpedido"));
                pedCompraProd.setQtderestante(rs.getString("restante"));
                listaPedCompraProd.add(pedCompraProd);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaPedCompraProd;
    }
}
