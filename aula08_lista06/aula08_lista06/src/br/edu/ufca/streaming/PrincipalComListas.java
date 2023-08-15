package br.edu.ufca.streaming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.edu.ufca.streaming.modelos.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        
        listaAssistidos.add(meuFilme);
        listaAssistidos.add(outroFilme);
        listaAssistidos.add(lost);

        //Para cada item da minha listaAssistidos
        for(Titulo item: listaAssistidos){
            System.out.println(item.getNome());
            
            if(item instanceof Filme){
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Dorgival");
        buscaPorArtista.add("Maria");
        buscaPorArtista.add("Ana");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(listaAssistidos);
        System.out.println(listaAssistidos);

        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordendando pelo ano de lançamento");
        System.out.println(listaAssistidos);
    }
}
