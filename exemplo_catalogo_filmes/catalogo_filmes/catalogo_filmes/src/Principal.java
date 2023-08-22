import br.edu.ufca.poo.catalogo.modelo.Filme;
import br.edu.ufca.poo.catalogo.modelo.Serie;

public class Principal {
    public static void main(String[] args) throws Exception {
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
        
    }
}
