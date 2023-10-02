package br.edu.ufca.poo.catalogo.calculos;

import br.edu.ufca.poo.catalogo.modelo.Filme;
import br.edu.ufca.poo.catalogo.modelo.Serie;
import br.edu.ufca.poo.catalogo.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Filme filme){
        this.tempoTotal += filme.getDuracaoEmMinutos();
    }


    //Sobrecarga de método

    /*
     * A sobrecarga de métodos é uma forma de polimorfismo,
     * que é uma característica da programação orientada a 
     * objetos. Ao sobrecarregar um método, você está criando
     * várias versões desse método que podem ser chamadas com
     * diferentes combinações de argumentos. A linguagem Java 
     * é capaz de distinguir qual versão do método deve ser 
     * chamada com base nos tipos e na quantidade de argumentos
     * passados.
     */
    /*
    public void inclui(Serie serie){
        this.tempoTotal += serie.getDuracaoEmMinutos();
    }
     */

    //Como resolver esse problema?




    //Polimorfismo
    /*
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de: " + titulo.getNome());;
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
     */
}
