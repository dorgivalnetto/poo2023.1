package br.edu.ufca.poo.lista2.questao9.principal;

import br.edu.ufca.poo.lista2.questao9.modelo.MinhasPreferidas;
import br.edu.ufca.poo.lista2.questao9.modelo.Musica;
import br.edu.ufca.poo.lista2.questao9.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Hino do Botafogo");
        minhaMusica.setCantor("Lamartine Babo");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Fronteiras da Engenharia de Software");
        meuPodcast.setApresentador("Professor Adolfo Neto");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
