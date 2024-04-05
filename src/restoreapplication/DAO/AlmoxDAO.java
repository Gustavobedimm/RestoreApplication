package restoreapplication.DAO;

import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Almox;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import restoreapplication.Model.TransfAlmox;

public class AlmoxDAO {
    Conn conexao = new Conn();
     public ArrayList consultaAlmox(String empresa) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<Almox> listaAlmox = new ArrayList<>();
        try {
            String query = "select * from TESTALMOX ta where ta.empresa = "+empresa+" order by ta.empresa";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Almox almox = new Almox();
                almox.setEmpresa(rs.getString("empresa"));
                almox.setCodigo(rs.getString("codigo"));
                almox.setDescricao(rs.getString("descricao"));
                listaAlmox.add(almox);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaAlmox;
    } 
     public ArrayList consultaTransfAlmox(String EMPRESA,String CODIGO) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<TransfAlmox> transferencias = new ArrayList<>();
        try {
            String query = "select * from TESTTRANSFALMOX ta WHERE TA.CODIGO = '"+CODIGO+"' and ta.empresa = '"+EMPRESA+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                TransfAlmox transf = new TransfAlmox();
                transf.setEmpresa(rs.getString("empresa"));
                transf.setCodigo(rs.getString("codigo"));
                transf.setProduto(rs.getString("produto"));
                transf.setAlmoxentrada(rs.getString("almoxentrada"));
                transf.setAlmoxsaida(rs.getString("almoxsaida"));
                transf.setQtde(rs.getString("qtde"));
                transf.setQtdeembalagem(rs.getString("qtdeembalagem"));
                transf.setData(rs.getString("data"));
                transferencias.add(transf);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return transferencias;
    }
    
    
    
}
