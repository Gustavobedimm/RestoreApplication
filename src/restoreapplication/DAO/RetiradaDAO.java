package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Retirada;
import restoreapplication.Model.RetiradaItem;

public class RetiradaDAO {
    Conn conexao = new Conn();
     public Retirada consultaRetirada(String empresa,String documento) throws ClassNotFoundException {
       conexao.Conectar();
        Retirada retirada = new Retirada();
        try {
            String query = "select * from TVENRETIRADA tvr where tvr.idcodigo = "+documento+" and tvr.empresa = "+empresa ;
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                retirada.setEmpresa(rs.getString("empresa"));
                retirada.setIdcodigo(rs.getString("idcodigo"));
                retirada.setIdcliente(rs.getString("idcliente"));
                retirada.setData(rs.getString("data"));
                retirada.setHora(rs.getString("hora"));
                retirada.setEndereco(rs.getString("endereco"));
                retirada.setStatus(rs.getString("status"));
                retirada.setTipo(rs.getString("tipo"));
                
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return retirada;
    } 
     public ArrayList consultaRetiradaItens(String empresa,String documento) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<RetiradaItem> itens = new ArrayList();
        try {
            String query = "select * from TVENRETIRADAITEM tvri where tvri.idretirada = "+documento+" and tvri.empresa = "+empresa ;
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                RetiradaItem retiradaItem = new RetiradaItem();
                retiradaItem.setEmpresa(rs.getString("empresa"));
                retiradaItem.setIdretirada(rs.getString("idretirada"));
                retiradaItem.setIdentificador(rs.getString("identificador"));
                retiradaItem.setIdproduto(rs.getString("idproduto"));
                retiradaItem.setIdpedido(rs.getString("idpedido"));
                retiradaItem.setQtde(rs.getString("qtde"));
                retiradaItem.setAlmox(rs.getString("almox"));
                itens.add(retiradaItem);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return itens;
    } 
     public ArrayList consultaRetiradasDoPedido(String empresa,String documento) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<RetiradaItem> itens = new ArrayList();
        try {
            String query = "select * from TVENRETIRADAITEM tvri where tvri.idpedido = "+documento+" and tvri.empresa = "+empresa ;
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                RetiradaItem retiradaItem = new RetiradaItem();
                retiradaItem.setEmpresa(rs.getString("empresa"));
                retiradaItem.setIdretirada(rs.getString("idretirada"));
                retiradaItem.setIdentificador(rs.getString("identificador"));
                retiradaItem.setIdproduto(rs.getString("idproduto"));
                retiradaItem.setIdpedido(rs.getString("idpedido"));
                retiradaItem.setQtde(rs.getString("qtde"));
                retiradaItem.setAlmox(rs.getString("almox"));
                itens.add(retiradaItem);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return itens;
    }
     
}
