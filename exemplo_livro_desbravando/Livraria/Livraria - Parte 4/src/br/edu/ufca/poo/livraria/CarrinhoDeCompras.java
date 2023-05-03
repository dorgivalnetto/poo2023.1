package br.edu.ufca.poo.livraria;
import java.util.ArrayList;
import java.util.List;

import br.edu.ufca.poo.livraria.produtos.Produto;


public class CarrinhoDeCompras {
    
    private double total;
    /*
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
     */
    private List<Produto> produtos;

    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<>();
    }

    public void adiciona(Produto produto){
        this.produtos.add(produto);
    }

    public void remove(Produto produto){
        this.produtos.remove(produto);
    }


    /*
        O código funcionará como esperado,
        pois podemos nos referenciar a esses
        objetos de uma forma mais genérica, 
        pela sua classe pai. Chamamos de
        polimorfismo.
      
    public void adiciona(Livro livro){
        /*
         * Isso quer dizer que eu posso adicionar
         * um Ebook aqui?
         * 
         * Como estamos referenciando o parâmetro 
         * passado para o método adiciona, da classe
         * CarrinhoDeCompras como um Livro, apenas os
         * métodos presentes na classe Livro poderão ser
         * invocados sem que um erro de compilação ocorra.
         */
        //Ebook ebook  = (Ebook)livro;
        //ebook.getMarcaDagua();
        //System.out.println("Adicionando: " + livro);
        //livro.aplicarDesconto(0.05);
        //total += livro.getValor();

    //}

    /*
    public void adiciona(Revista revista){
        System.out.println("Adicionando: " + revista);
        revista.aplicaDesconto(0.05);
        total += revista.getValor();
    } */

    //public void adiciona(Produto produto){
        //Essa implementação fica inviável, pois teríamos diversos produtos em um carrinho de compras
        /*System.out.println("Adicionando: " + produto);
        if(this.produto1 != null){
            this.produto1 = produto;
        } else if(this.produto2 != null){
            this.produto2 = produto;
        } total += produto.getValor();
        */
    //}

    public double getTotal(){
        return total;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

}
