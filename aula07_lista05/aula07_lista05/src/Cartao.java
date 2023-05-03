/*
 * A classe Cartao possui os dados básicos do cartão de crédito a ser autorizado/
cobrado.
 */
public class Cartao {
    private String nomeTitular;
    private String numeroCartao;
    
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    
}
