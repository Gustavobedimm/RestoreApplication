package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.TestNfe;

public class TestNfeDAO {
    Conn conexao = new Conn();
    
    public ArrayList todasNotasCanceladas() throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<TestNfe> listaNotas = new ArrayList();
        try {
            String query = "SELECT * FROM TESTNFE TF WHERE TF.STATUS = 'CA'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                TestNfe nota = new TestNfe();

                nota.setEMPRESA(rs.getString("EMPRESA"));
                nota.setCODIGOID(rs.getString("CODIGOID"));
                nota.setNUMERONFE(rs.getString("NUMERONFE"));
                nota.setFORNECEDOR(rs.getString("FORNECEDOR"));
                nota.setNATUREZA(rs.getString("NATUREZA"));

                listaNotas.add(nota);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaNotas;
    }
    public TestNfe buscaNota(String empresa,String numeroDOC) throws ClassNotFoundException {
       conexao.Conectar();
       TestNfe nota = new TestNfe();
        try {
            String query = "SELECT * FROM TESTNFE TF inner join testnatureza nat on nat.codigo = TF.NATUREZA WHERE TF.EMPRESA = '"+empresa+"' AND TF.CODIGOID = '"+numeroDOC+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                nota.setEMPRESA(rs.getString("EMPRESA"));
                nota.setCODIGOID(rs.getString("CODIGOID"));
                nota.setNUMERONFE(rs.getString("NUMERONFE"));
                nota.setFORNECEDOR(rs.getString("FORNECEDOR"));
                nota.setNATUREZA(rs.getString("NATUREZA"));
                nota.setVERSAO(rs.getString("VERSAO"));
                nota.setSTATUS(rs.getString("STATUS"));
                nota.setOBS(rs.getString("OBS"));
                nota.setDATAPEDIDO(rs.getString("DATAPEDIDO"));
                nota.setDATAEMISSAO(rs.getString("DATAEMISSAO"));
                nota.setDATACHEGADA(rs.getString("DATACHEGADA"));
                nota.setDATAENTRADA(rs.getString("DATAENTRADA"));
                nota.setDATAFATURA(rs.getString("DATAFATURA"));
                nota.setDATACANCEL(rs.getString("DATACANCEL"));
                nota.setDATAVALIDACAO(rs.getString("DATAVALIDACAO"));
                nota.setTIPO(rs.getString("TIPO"));
                nota.setCHAVENFE(rs.getString("CHAVENFE"));
                //inner join TESTNATUREZA
                nota.setDESCRICAO(rs.getString("DESCRICAO"));
                nota.setCODIGOFISCAL(rs.getString("CODIGOFISCAL"));
                nota.setMOVIMENTAESTOQUE(rs.getString("MOVIMENTAESTOQUE"));
                nota.setATIVA(rs.getString("ATIVA"));
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return nota;
    }
    
    
}
