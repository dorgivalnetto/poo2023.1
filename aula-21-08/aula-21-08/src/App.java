public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Catálago de Filmes");

        System.out.println("Filme: Super Mario Bros.");
        Filme f1 = new Filme();
        //f1.setAnoDeLancamento(2023);

        int anoDeLancamento = 2023;
        System.out.println("Ano de Lançamento " + anoDeLancamento);

        int notaDoFilme = (int)9.5;
        double media = (notaDoFilme + 6.0 + 8.5)/3;
        System.out.println(media);

        String sinopse;
        //Text block
        sinopse = """ Mario e Luigi são encanadores em Nova York. 
        Os dois acabam viajando por labirinto subterrâneo
        e vão parar em um universo paralelo. 
        Enquanto Luigi se vê preso pelo violento Bowser,
        Mario terá que ajudar uma princesa a salvar seu 
        reino e libertar seu irmão!
                
                """;
    }

}
