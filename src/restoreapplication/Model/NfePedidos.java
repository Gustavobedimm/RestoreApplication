package restoreapplication.Model;
public class NfePedidos {
   private String empresa;
   private String codigoid;
   private String pedidocompraid;
   private String produto;
   private String qtderecebida;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCodigoid() {
        return codigoid;
    }   

    public void setCodigoid(String codigoid) {
        this.codigoid = codigoid;
    }

    public String getPedidocompraid() {
        return pedidocompraid;
    }

    public void setPedidocompraid(String pedidocompraid) {
        this.pedidocompraid = pedidocompraid;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQtderecebida() {
        return qtderecebida;
    }

    public void setQtderecebida(String qtderecebida) {
        this.qtderecebida = qtderecebida;
    }
   
}
