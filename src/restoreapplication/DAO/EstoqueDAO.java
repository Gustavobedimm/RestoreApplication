package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Estoque;

public class EstoqueDAO {

    Conn conexao = new Conn();

    public ArrayList estoqueProduto(String produtoP, String empresa) throws ClassNotFoundException {
        conexao.Conectar();

        ArrayList<Estoque> listaEstoque = new ArrayList();
        try {
            String query = "select * from testestoque te where te.produto = '" + produtoP + "' and te.empresa = '" + empresa + "'";
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
    public Estoque estoqueProdutoAlmox(String produtoP, String empresa,String almox) throws ClassNotFoundException {
        conexao.Conectar();
        Estoque estoque = new Estoque();
        try {
            String query = "select * from testestoque te where te.produto = '" + produtoP + "' and te.empresa = '" + empresa + "' and te.almox = '"+almox+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                estoque.setEMPRESA(rs.getString("EMPRESA"));
                estoque.setPRODUTO(rs.getString("PRODUTO"));
                estoque.setALMOX(rs.getString("ALMOX"));
                estoque.setESTDISPONIVEL(rs.getString("ESTDISPONIVEL"));
                estoque.setESTARETIRAR(rs.getString("ESTARETIRAR"));
                estoque.setESTCONDICIONAL(rs.getString("ESTCONDICIONAL"));
                estoque.setESTRESERVADO(rs.getString("ESTRESERVADO"));
                estoque.setESTVENDAEXTERNA(rs.getString("ESTVENDAEXTERNA"));
                estoque.setENDERECO(rs.getString("ENDERECO"));
                estoque.setESTTRANSITO(rs.getString("ESTTRANSITO"));
                estoque.setDATAHORAALTERACAO(rs.getString("DATAHORAALTERACAO"));
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return estoque;
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

    public String getSaldo(String empresa, String produto, String almox) throws ClassNotFoundException {
        conexao.Conectar();
        String saldo = null;
        try {
            String query = "SELECT    CAST((Pdt2.EstDisponivel + Pdt2.EstReservado + Pdt2.EstCondicional + Pdt2.EstTransito) AS NUMERIC(18,8)) AS SaldoTotal\n"
                    + "          FROM TEstEstoque Pdt2\n"
                    + "    WHERE Pdt2.Empresa = " + empresa + "\n"
                    + "      AND Pdt2.Produto = " + produto + "\n"
                    + "      AND Pdt2.ALMOX = " + almox + "";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                saldo = rs.getString("SaldoTotal");
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return saldo;
    }

}
