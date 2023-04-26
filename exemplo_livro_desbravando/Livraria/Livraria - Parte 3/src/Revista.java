public class Revista implements Produto{

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public void aplicaDesconto(double porcentagem){
        if(porcentagem > 0.1){
            System.out.println("O desconto não pode ser superior a 10%");
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Valor da revista com desconto" + this.getValor());
    }

    @Override
    public double getValor() {
        return this.valor;
    }
}