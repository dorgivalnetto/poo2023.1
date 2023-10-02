import br.edu.ufca.poo.catalogo.calculos.CalculadoraDeTempo;
import br.edu.ufca.poo.catalogo.calculos.FiltroRecomendacao;
import br.edu.ufca.poo.catalogo.modelo.Filme;
import br.edu.ufca.poo.catalogo.modelo.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        Titulo t1 = new Serie();
        System.out.println("Abstração Serie"
         + t1.getDuracaoEmMinutos());
        Titulo t2 = new Filme();
        System.out.println("Abstração filme: " 
        + t2.getDuracaoEmMinutos());

        //Serie t3 = new Titulo();
        
        Filme filme1 = new Filme();
        filme1.exibeFichaTecnica();

        Filme filme2 = new Filme("Super Mario Bros.", true, 2023, 92, "Aaron Horvath");
        System.out.println(filme2);
        filme2.exibeFichaTecnica();

        filme2.avalia(8);
        filme2.avalia(6);
        filme2.avalia(10);
        System.out.println(filme2.getSomaDasAvaliacoes());
        System.out.println(filme2.getTotalDeAvalicoes());

        System.out.println(filme2.mediaDasAvaliacoes()); 


        Filme filme3 = new Filme();
        filme3.setNome("Gran Turismo - De Jogador a Corredor");
        filme3.setAnoDeLancamento(2023);
        filme3.setDuracaoEmMinutos(135);

        filme3.avalia(8);
        filme3.avalia(6);
        filme3.avalia(10);


        Serie serie1 = new Serie();
        serie1.setNome("The House of the Dragon");
        serie1.setAnoDeLancamento(2022);
        serie1.exibeFichaTecnica();
        serie1.setTemporada(1);
        serie1.setEpisodioPorTemporada(10);
        serie1.setMinutosPorEpisodio(45);
        //O que acontece nessa impressão?
        System.out.println("Duração da série para maratonar: " + serie1.getDuracaoEmMinutos());

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(filme3);
        System.out.println(calc.getTempoTotal());

        //calc.inclui(serie1);
        //System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme3);

        Episodio episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setSerie(serie1);
        episodio1.setTotalDeAvalicoes(1);

        filtro.filtra(episodio1);
    }
}
