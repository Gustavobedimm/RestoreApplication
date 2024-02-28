package restoreapplication.Model;

public class InventarioItem {
    private String empresa;
    private String lote;
    private String produto;
    private String qtdcontada;
    private String estoque;
    private String diferenca;
    private String identificador;
    private String motivomovimentacao;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQtdcontada() {
        return qtdcontada;
    }

    public void setQtdcontada(String qtdcontada) {
        this.qtdcontada = qtdcontada;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public String getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(String diferenca) {
        this.diferenca = diferenca;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getMotivomovimentacao() {
        return motivomovimentacao;
    }

    public void setMotivomovimentacao(String motivomovimentacao) {
        this.motivomovimentacao = motivomovimentacao;
    }
    
}
