import java.util.ArrayList;

import br.edu.ufca.poo.catalogo.calculos.CalculadoraDeTempo;
import br.edu.ufca.poo.catalogo.modelo.Filme;
import br.edu.ufca.poo.catalogo.modelo.Serie;


public class App {
    public static void main(String[] args) throws Exception {
        Filme f1 = new Filme("Gran Turismo - De Jogador a Corredor", 2023, 135, true,"Fulano de tal");
        Serie s1 = new Serie("The House of the Dragon", 2022, 45, true, 1, true, 10, 45);

        Filme f2 = new Filme("Super Mario", 2023, 90, true,"Fulano de tal");

        f1.avalia(9);
        f1.avalia(7);
        f1.avalia(8);
        System.out.println(f1.mediaDasAvaliacoes());
        f1.exibeFichaTecnica();

        s1.exibeFichaTecnica();

        System.out.println("Filme" + f1.getDuracaoEmMinutos());

        System.out.println("Série" + s1.getDuracaoEmMinutos());

        //Cannot instantiate the type Titulo
        //Titulo t1 = new Titulo("Nome do titulo", 2023, 120, false);
        //System.out.println(t1.toString());

        System.out.println(f1.toString());
        
        CalculadoraDeTempo calc1 = new CalculadoraDeTempo();
        calc1.inclui(f1);
        System.out.println(calc1.getTempoTotal()); //135

        calc1.inclui(s1);
        System.out.println(calc1.getTempoTotal()); //450 + 135 = 585

        CalculadoraDeTempo calc2 = new CalculadoraDeTempo();
        System.out.println(calc2.getTempoTotal()); //0

        /*
        
        
        
        Filme filme2 = new Filme("Filme2", 2022, 120, true);
        System.out.println(filme1.getNome());
        System.out.println(filme2.getNome());
        
        filme2.setNome("O Auto da Compadecida 2");
        System.out.println(filme2.getNome());
        filme2.exibeFichaTecnica();

        filme2.avalia(10);
        filme2.avalia(5);
        filme2.avalia(3);
        filme2.mediaDasAvaliacoes();
         */

         ArrayList<Filme> listaDeFilmes = new ArrayList<>();
         listaDeFilmes.add(f1);
         listaDeFilmes.add(f2);
         System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
         System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
         System.out.println(listaDeFilmes);
    }
}
