package restoreapplication.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.LoteValidadeMov;
public class LoteValidadeMovDAO {
    Conn conexao = new Conn();
    public ArrayList getMovimentacaoLote(String empresa,String idLote)  {
       conexao.Conectar();
        ArrayList<LoteValidadeMov> movimentacaoLote = new ArrayList();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from testlotevalidademovimento te where te.idlote = "+idLote+" and te.empresa = "+empresa+" order by te.identificador";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                LoteValidadeMov movimentacao = new LoteValidadeMov();
                movimentacao.setEMPRESA(rs.getString("EMPRESA"));
                movimentacao.setIDENTIFICADOR(rs.getInt("IDENTIFICADOR"));
                movimentacao.setIDLOTE(rs.getInt("IDLOTE"));
                movimentacao.setDATAHORA(rs.getString("DATAHORA"));
                movimentacao.setQTDE(rs.getString("QTDE"));
                movimentacao.setORIGEM(rs.getString("ORIGEM"));
                movimentacao.setPRODUTO(rs.getString("PRODUTO"));
                movimentacao.setIDNFE(rs.getString("IDNFE"));
                movimentacao.setIDVENDA(rs.getString("IDVENDA"));
                movimentacao.setIDINVENTARIO(rs.getInt("IDINVENTARIO"));
                movimentacao.setIDDEVOLUCAOCOMPRA(rs.getInt("IDDEVOLUCAOCOMPRA"));
                movimentacao.setSTATUS(rs.getString("STATUS"));
                movimentacao.setUSUARIO(rs.getString("USUARIO"));
                movimentacao.setIDRETIRADA(rs.getString("IDRETIRADA"));
                movimentacao.setIDFORMULACAO(rs.getInt("IDFORMULACAO"));
                movimentacao.setIDPRODUCAO(rs.getInt("IDPRODUCAO"));
                movimentacao.setIDTRANSFEMPRESA(rs.getInt("IDTRANSFEMPRESA"));
                movimentacao.setIDSEQUENCIARETIRADA(rs.getInt("IDSEQUENCIARETIRADA"));
                movimentacao.setCONFERIDO(rs.getString("CONFERIDO"));
                movimentacao.setREGLOTE(rs.getInt("REGLOTE"));
                movimentacao.setIDAMBIENTE(rs.getLong("IDAMBIENTE"));
                movimentacao.setIDENTIFICADORPRODUTO(rs.getLong("IDENTIFICADORPRODUTO"));
                movimentacaoLote.add(movimentacao);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return movimentacaoLote;
    }
    public ArrayList getMovimentacaoLotePedido(String pedidoP) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<LoteValidadeMov> movimentacaoLote = new ArrayList();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from testlotevalidademovimento te where te.idvenda = "+pedidoP+"  order by te.identificador";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                LoteValidadeMov movimentacao = new LoteValidadeMov();

                movimentacao.setEMPRESA(rs.getString("EMPRESA"));
                movimentacao.setIDENTIFICADOR(rs.getInt("IDENTIFICADOR"));
                movimentacao.setIDLOTE(rs.getInt("IDLOTE"));
                movimentacao.setDATAHORA(rs.getString("DATAHORA"));
                movimentacao.setQTDE(rs.getString("QTDE"));
                movimentacao.setORIGEM(rs.getString("ORIGEM"));
                movimentacao.setPRODUTO(rs.getString("PRODUTO"));
                movimentacao.setIDNFE(rs.getString("IDNFE"));
                movimentacao.setIDVENDA(rs.getString("IDVENDA"));
                movimentacao.setIDINVENTARIO(rs.getInt("IDINVENTARIO"));
                movimentacao.setIDDEVOLUCAOCOMPRA(rs.getInt("IDDEVOLUCAOCOMPRA"));
                movimentacao.setSTATUS(rs.getString("STATUS"));
                movimentacao.setUSUARIO(rs.getString("USUARIO"));
                movimentacao.setIDRETIRADA(rs.getString("IDRETIRADA"));
                movimentacao.setIDFORMULACAO(rs.getInt("IDFORMULACAO"));
                movimentacao.setIDPRODUCAO(rs.getInt("IDPRODUCAO"));
                movimentacao.setIDTRANSFEMPRESA(rs.getInt("IDTRANSFEMPRESA"));
                movimentacao.setIDSEQUENCIARETIRADA(rs.getInt("IDSEQUENCIARETIRADA"));
                movimentacao.setCONFERIDO(rs.getString("CONFERIDO"));
                movimentacao.setREGLOTE(rs.getInt("REGLOTE"));
                movimentacao.setIDAMBIENTE(rs.getLong("IDAMBIENTE"));
                movimentacao.setIDENTIFICADORPRODUTO(rs.getLong("IDENTIFICADORPRODUTO"));

                movimentacaoLote.add(movimentacao);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return movimentacaoLote;
    }
    public ArrayList getMovimentacaoLoteNfe(String pedidoP) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<LoteValidadeMov> movimentacaoLote = new ArrayList();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from testlotevalidademovimento te where te.idnfe = "+pedidoP+"  order by te.identificador";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                LoteValidadeMov movimentacao = new LoteValidadeMov();

                movimentacao.setEMPRESA(rs.getString("EMPRESA"));
                movimentacao.setIDENTIFICADOR(rs.getInt("IDENTIFICADOR"));
                movimentacao.setIDLOTE(rs.getInt("IDLOTE"));
                movimentacao.setDATAHORA(rs.getString("DATAHORA"));
                movimentacao.setQTDE(rs.getString("QTDE"));
                movimentacao.setORIGEM(rs.getString("ORIGEM"));
                movimentacao.setPRODUTO(rs.getString("PRODUTO"));
                movimentacao.setIDNFE(rs.getString("IDNFE"));
                movimentacao.setIDVENDA(rs.getString("IDVENDA"));
                movimentacao.setIDINVENTARIO(rs.getInt("IDINVENTARIO"));
                movimentacao.setIDDEVOLUCAOCOMPRA(rs.getInt("IDDEVOLUCAOCOMPRA"));
                movimentacao.setSTATUS(rs.getString("STATUS"));
                movimentacao.setUSUARIO(rs.getString("USUARIO"));
                movimentacao.setIDRETIRADA(rs.getString("IDRETIRADA"));
                movimentacao.setIDFORMULACAO(rs.getInt("IDFORMULACAO"));
                movimentacao.setIDPRODUCAO(rs.getInt("IDPRODUCAO"));
                movimentacao.setIDTRANSFEMPRESA(rs.getInt("IDTRANSFEMPRESA"));
                movimentacao.setIDSEQUENCIARETIRADA(rs.getInt("IDSEQUENCIARETIRADA"));
                movimentacao.setCONFERIDO(rs.getString("CONFERIDO"));
                movimentacao.setREGLOTE(rs.getInt("REGLOTE"));
                movimentacao.setIDAMBIENTE(rs.getLong("IDAMBIENTE"));
                movimentacao.setIDENTIFICADORPRODUTO(rs.getLong("IDENTIFICADORPRODUTO"));

                movimentacaoLote.add(movimentacao);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return movimentacaoLote;
    }
    public ArrayList getMovimentacaoLoteRetirada(String retiradaP) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<LoteValidadeMov> movimentacaoLote = new ArrayList();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from testlotevalidademovimento te where te.idretirada = "+retiradaP+"  order by te.identificador";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                LoteValidadeMov movimentacao = new LoteValidadeMov();

                movimentacao.setEMPRESA(rs.getString("EMPRESA"));
                movimentacao.setIDENTIFICADOR(rs.getInt("IDENTIFICADOR"));
                movimentacao.setIDLOTE(rs.getInt("IDLOTE"));
                movimentacao.setDATAHORA(rs.getString("DATAHORA"));
                movimentacao.setQTDE(rs.getString("QTDE"));
                movimentacao.setORIGEM(rs.getString("ORIGEM"));
                movimentacao.setPRODUTO(rs.getString("PRODUTO"));
                movimentacao.setIDNFE(rs.getString("IDNFE"));
                movimentacao.setIDVENDA(rs.getString("IDVENDA"));
                movimentacao.setIDINVENTARIO(rs.getInt("IDINVENTARIO"));
                movimentacao.setIDDEVOLUCAOCOMPRA(rs.getInt("IDDEVOLUCAOCOMPRA"));
                movimentacao.setSTATUS(rs.getString("STATUS"));
                movimentacao.setUSUARIO(rs.getString("USUARIO"));
                movimentacao.setIDRETIRADA(rs.getString("IDRETIRADA"));
                movimentacao.setIDFORMULACAO(rs.getInt("IDFORMULACAO"));
                movimentacao.setIDPRODUCAO(rs.getInt("IDPRODUCAO"));
                movimentacao.setIDTRANSFEMPRESA(rs.getInt("IDTRANSFEMPRESA"));
                movimentacao.setIDSEQUENCIARETIRADA(rs.getInt("IDSEQUENCIARETIRADA"));
                movimentacao.setCONFERIDO(rs.getString("CONFERIDO"));
                movimentacao.setREGLOTE(rs.getInt("REGLOTE"));
                movimentacao.setIDAMBIENTE(rs.getLong("IDAMBIENTE"));
                movimentacao.setIDENTIFICADORPRODUTO(rs.getLong("IDENTIFICADORPRODUTO"));

                movimentacaoLote.add(movimentacao);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return movimentacaoLote;
    }
     public ArrayList getMovimentacaoLoteInventario(String lote) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<LoteValidadeMov> movimentacaoLote = new ArrayList();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from testlotevalidademovimento te where te.idinventario = "+lote+" order by te.identificador";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                LoteValidadeMov movimentacao = new LoteValidadeMov();

                movimentacao.setEMPRESA(rs.getString("EMPRESA"));
                movimentacao.setIDENTIFICADOR(rs.getInt("IDENTIFICADOR"));
                movimentacao.setIDLOTE(rs.getInt("IDLOTE"));
                movimentacao.setDATAHORA(rs.getString("DATAHORA"));
                movimentacao.setQTDE(rs.getString("QTDE"));
                movimentacao.setORIGEM(rs.getString("ORIGEM"));
                movimentacao.setPRODUTO(rs.getString("PRODUTO"));
                movimentacao.setIDNFE(rs.getString("IDNFE"));
                movimentacao.setIDVENDA(rs.getString("IDVENDA"));
                movimentacao.setIDINVENTARIO(rs.getInt("IDINVENTARIO"));
                movimentacao.setIDDEVOLUCAOCOMPRA(rs.getInt("IDDEVOLUCAOCOMPRA"));
                movimentacao.setSTATUS(rs.getString("STATUS"));
                movimentacao.setUSUARIO(rs.getString("USUARIO"));
                movimentacao.setIDRETIRADA(rs.getString("IDRETIRADA"));
                movimentacao.setIDFORMULACAO(rs.getInt("IDFORMULACAO"));
                movimentacao.setIDPRODUCAO(rs.getInt("IDPRODUCAO"));
                movimentacao.setIDTRANSFEMPRESA(rs.getInt("IDTRANSFEMPRESA"));
                movimentacao.setIDSEQUENCIARETIRADA(rs.getInt("IDSEQUENCIARETIRADA"));
                movimentacao.setCONFERIDO(rs.getString("CONFERIDO"));
                movimentacao.setREGLOTE(rs.getInt("REGLOTE"));
                movimentacao.setIDAMBIENTE(rs.getLong("IDAMBIENTE"));
                movimentacao.setIDENTIFICADORPRODUTO(rs.getLong("IDENTIFICADORPRODUTO"));

                movimentacaoLote.add(movimentacao);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return movimentacaoLote;
    }
     public ArrayList getMovimentacaoLoteFormulacao(String lote) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<LoteValidadeMov> movimentacaoLote = new ArrayList();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from testlotevalidademovimento te where te.idformulacao = "+lote+" order by te.identificador";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                LoteValidadeMov movimentacao = new LoteValidadeMov();

                movimentacao.setEMPRESA(rs.getString("EMPRESA"));
                movimentacao.setIDENTIFICADOR(rs.getInt("IDENTIFICADOR"));
                movimentacao.setIDLOTE(rs.getInt("IDLOTE"));
                movimentacao.setDATAHORA(rs.getString("DATAHORA"));
                movimentacao.setQTDE(rs.getString("QTDE"));
                movimentacao.setORIGEM(rs.getString("ORIGEM"));
                movimentacao.setPRODUTO(rs.getString("PRODUTO"));
                movimentacao.setIDNFE(rs.getString("IDNFE"));
                movimentacao.setIDVENDA(rs.getString("IDVENDA"));
                movimentacao.setIDINVENTARIO(rs.getInt("IDINVENTARIO"));
                movimentacao.setIDDEVOLUCAOCOMPRA(rs.getInt("IDDEVOLUCAOCOMPRA"));
                movimentacao.setSTATUS(rs.getString("STATUS"));
                movimentacao.setUSUARIO(rs.getString("USUARIO"));
                movimentacao.setIDRETIRADA(rs.getString("IDRETIRADA"));
                movimentacao.setIDFORMULACAO(rs.getInt("IDFORMULACAO"));
                movimentacao.setIDPRODUCAO(rs.getInt("IDPRODUCAO"));
                movimentacao.setIDTRANSFEMPRESA(rs.getInt("IDTRANSFEMPRESA"));
                movimentacao.setIDSEQUENCIARETIRADA(rs.getInt("IDSEQUENCIARETIRADA"));
                movimentacao.setCONFERIDO(rs.getString("CONFERIDO"));
                movimentacao.setREGLOTE(rs.getInt("REGLOTE"));
                movimentacao.setIDAMBIENTE(rs.getLong("IDAMBIENTE"));
                movimentacao.setIDENTIFICADORPRODUTO(rs.getLong("IDENTIFICADORPRODUTO"));

                movimentacaoLote.add(movimentacao);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return movimentacaoLote;
    }
    
}
