package br.edu.ufca.poo.livraria.produtos;
import br.edu.ufca.poo.livraria.Editora;

public class Revista implements Produto, Promocional{

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        if(porcentagem > 0.1){
            System.out.println("O desconto não pode ser superior a 10%");
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Valor da revista com desconto" + this.getValor());
    }
}