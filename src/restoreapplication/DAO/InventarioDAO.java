package restoreapplication.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import restoreapplication.Conexao.Conn;
import restoreapplication.Model.Inventario;
import restoreapplication.Model.InventarioItem;

/**
 *
 * @author gustavo.mazutti
 */
public class InventarioDAO {
    Conn conexao = new Conn();
    public Inventario getInventario(String empresa,String lote) throws ClassNotFoundException {
       conexao.Conectar();
        Inventario inventario = new Inventario();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from TESTINVENTARIO tI where ti.lote = '"+lote+"' and ti.empresa = '"+empresa+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                inventario.setEmpresa(rs.getString("Empresa"));
                inventario.setLote(rs.getString("lote"));
                inventario.setAlmox(rs.getString("almox"));
                inventario.setData(rs.getString("data"));
                inventario.setHora(rs.getString("hora"));
                inventario.setEquipe(rs.getString("equipe"));
                inventario.setDataencerramento(rs.getString("dataencerramento"));
                inventario.setUsuarioencerramento(rs.getString("usuarioencerramento"));
                inventario.setUsuario(rs.getString("usuario"));
                inventario.setHoraencerramento(rs.getString("horaencerramento"));
                inventario.setStatus(rs.getString("status"));
                inventario.setDesconsiderareservado(rs.getString("desconsiderareservado"));
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return inventario;
    }
    public ArrayList getInventarioItens(String empresa,String lote) throws ClassNotFoundException {
       conexao.Conectar();
        ArrayList<InventarioItem> listaItens = new ArrayList<>();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from TESTINVENTARIOITENS TI where ti.lote = '"+lote+"' and ti.empresa = '"+empresa+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                InventarioItem item = new InventarioItem();
                item.setEmpresa(rs.getString("empresa"));
                item.setLote(rs.getString("lote"));
                item.setProduto(rs.getString("produto"));
                item.setQtdcontada(rs.getString("qtdcontada"));
                item.setEstoque(rs.getString("estoque"));
                item.setDiferenca(rs.getString("diferenca"));
                item.setIdentificador(rs.getString("identificador"));
                item.setMotivomovimentacao(rs.getString("motivomovimentacao"));
                listaItens.add(item);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaItens;
    }
    
}
