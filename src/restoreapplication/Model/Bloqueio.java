package restoreapplication.Model;

public class Bloqueio {
    private String empresa;
    private String identificador;
    private String tipo;
    private String data;
    private String hora;
    private String status;
    private String vendedor;
    private String usuario;
    private String produto;
    private String cliente;
    private String documento;
    private String usuarioliberou;
    private String dataliberacao;
    private String horaliberacao;
    //tipo bloqueio inner join
    private String descricao;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getUsuarioliberou() {
        return usuarioliberou;
    }

    public void setUsuarioliberou(String usuarioliberou) {
        this.usuarioliberou = usuarioliberou;
    }

    public String getDataliberacao() {
        return dataliberacao;
    }

    public void setDataliberacao(String dataliberacao) {
        this.dataliberacao = dataliberacao;
    }

    public String getHoraliberacao() {
        return horaliberacao;
    }

    public void setHoraliberacao(String horaliberacao) {
        this.horaliberacao = horaliberacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
