package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Bloqueio;

public class BloqueioDAO {
    Conn conexao = new Conn();
     public ArrayList consultaBloqueio(String doc,String empresa) throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Bloqueio> listaBloqueios = new ArrayList<>();
        try {
            String query = "select * from TGERBLOQUEIOREMOTO B INNER JOIN TGERTIPOBLOQUEIOREMOTO T ON B.TIPO = T.CODIGO WHERE B.DOCUMENTO = '"+doc+"' AND B.EMPRESA = '"+empresa+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Bloqueio bloqueio = new Bloqueio();
                bloqueio.setEmpresa(rs.getString("empresa"));
                bloqueio.setIdentificador(rs.getString("identificador"));
                bloqueio.setTipo(rs.getString("tipo"));
                bloqueio.setData(rs.getString("data"));
                bloqueio.setHora(rs.getString("hora"));
                bloqueio.setStatus(rs.getString("status"));
                bloqueio.setVendedor(rs.getString("vendedor"));
                bloqueio.setUsuario(rs.getString("usuario"));
                bloqueio.setProduto(rs.getString("produto"));
                bloqueio.setCliente(rs.getString("cliente"));
                bloqueio.setDocumento(rs.getString("documento"));
                bloqueio.setUsuarioliberou(rs.getString("usuarioliberou"));
                bloqueio.setDataliberacao(rs.getString("dataliberacao"));
                bloqueio.setHoraliberacao(rs.getString("horaliberacao"));
                bloqueio.setDescricao(rs.getString("descricao"));
                listaBloqueios.add(bloqueio);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaBloqueios;
    } 
    
}
