import br.edu.ufca.poo.catalogo.modelo.Filme;

public class App {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme();
        filme1.setAnoDeLancamento(2023);
        filme1.setNome("Super Mario");
        filme1.setDuracaoEmMinutos(90);
        
        Filme filme2 = new Filme("Filme2", 2022, 120, true);
        System.out.println(filme2.getNome());
        
        filme2.setNome("O Auto da Compadecida 2");
        System.out.println(filme2.getNome());
        filme2.exibeFichaTecnica();
    }
}
