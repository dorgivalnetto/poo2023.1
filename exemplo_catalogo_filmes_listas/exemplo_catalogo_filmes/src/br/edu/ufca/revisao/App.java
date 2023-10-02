package br.edu.ufca.revisao;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Catálogo de Filmes");
        System.out.println("Filme: Super Mario Bros. O Filme");

        int anoDeLancamento = 2023;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        double notaDoFilme = 9.5;
        double media = (notaDoFilme + 6.3 + 7.5)/3;
        System.out.println("Média das avaliações " + media);

        String sinopse;
        //Text Block
        sinopse = """
                Mario e Luigi são encanadores em Nova York. 
                Os dois acabam viajando por labirinto subterrâneo
                e vão parar em um universo paralelo. 
                Enquanto Luigi se vê preso pelo violento Bowser,
                Mario terá que ajudar uma princesa a salvar seu 
                reino e libertar seu irmão!
                """; 
        System.out.println(sinopse);

        int classificacao;
        //classificacao = media/2; 
        classificacao = (int)(media/2);
        System.out.println("Classificação do filme: " + classificacao);
    }
}
