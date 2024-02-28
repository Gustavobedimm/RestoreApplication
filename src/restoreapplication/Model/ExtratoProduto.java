
package restoreapplication.Model;

public class ExtratoProduto {
    private String EMPRESA;
    private String ALMOX;
    private String PRODUTO;
    private String QTDE;
    private String ENTRADASAIDA;
    private String SALDO;
    private String DATAHORA;
    private String CODIGOID;
    private String MOVIMENTOID;
    private String CUSTOMEDIO;
    private String CUSTOFINAL;
    private String CUSTOMEDIOREPOSICAO;
    private String CUSTOREPOSICAO;
    
    //01 = TVENPedido
    //02 = TEstNfe E e S S=Cancelamento
    //03 = TEstTransfAlmox
    //04 = TEstTransfProduto
    //05 = TEstInventario
    //06 = TVenRetirada
    //07 = devolucao de venda
    //09 = TEstDevolucao

    public String getEMPRESA() {
        return EMPRESA;
    }

    public void setEMPRESA(String EMPRESA) {
        this.EMPRESA = EMPRESA;
    }

    public String getALMOX() {
        return ALMOX;
    }

    public void setALMOX(String ALMOX) {
        this.ALMOX = ALMOX;
    }

    public String getPRODUTO() {
        return PRODUTO;
    }

    public void setPRODUTO(String PRODUTO) {
        this.PRODUTO = PRODUTO;
    }

    public String getQTDE() {
        return QTDE;
    }

    public void setQTDE(String QTDE) {
        this.QTDE = QTDE;
    }

    public String getENTRADASAIDA() {
        return ENTRADASAIDA;
    }

    public void setENTRADASAIDA(String ENTRADASAIDA) {
        this.ENTRADASAIDA = ENTRADASAIDA;
    }

    public String getSALDO() {
        return SALDO;
    }

    public void setSALDO(String SALDO) {
        this.SALDO = SALDO;
    }

    public String getDATAHORA() {
        return DATAHORA;
    }

    public void setDATAHORA(String DATAHORA) {
        this.DATAHORA = DATAHORA;
    }

    public String getCODIGOID() {
        return CODIGOID;
    }

    public void setCODIGOID(String CODIGOID) {
        this.CODIGOID = CODIGOID;
    }

    public String getMOVIMENTOID() {
        return MOVIMENTOID;
    }

    public void setMOVIMENTOID(String MOVIMENTOID) {
        this.MOVIMENTOID = MOVIMENTOID;
    }

    public String getCUSTOMEDIO() {
        return CUSTOMEDIO;
    }

    public void setCUSTOMEDIO(String CUSTOMEDIO) {
        this.CUSTOMEDIO = CUSTOMEDIO;
    }

    public String getCUSTOFINAL() {
        return CUSTOFINAL;
    }

    public void setCUSTOFINAL(String CUSTOFINAL) {
        this.CUSTOFINAL = CUSTOFINAL;
    }

    public String getCUSTOMEDIOREPOSICAO() {
        return CUSTOMEDIOREPOSICAO;
    }

    public void setCUSTOMEDIOREPOSICAO(String CUSTOMEDIOREPOSICAO) {
        this.CUSTOMEDIOREPOSICAO = CUSTOMEDIOREPOSICAO;
    }

    public String getCUSTOREPOSICAO() {
        return CUSTOREPOSICAO;
    }

    public void setCUSTOREPOSICAO(String CUSTOREPOSICAO) {
        this.CUSTOREPOSICAO = CUSTOREPOSICAO;
    }
    
    
     
    
    
}
