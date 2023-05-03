public class Transferencia extends Transacao_Heranca{
    //private String descricao;
    //private double valor;
    //private String data;
    private String contaOrigem;
    private String contaDestino;

    public Transferencia(String descricao, double valor, String data,
    String contaOrigem, String contaDestino){
        super(descricao, valor, data);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void emitirComprovante() {
        //super.emitirComprovante();
        System.out.println("Comprovante da transação");
        System.out.println("========================");
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Data: " + this.getData());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Conta de origem: "
                + this.getContaOrigem());
        System.out.println("Conta de destino: "
                + this.getContaDestino());
        System.out.println();
    }

    /*
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }*/

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    
}
