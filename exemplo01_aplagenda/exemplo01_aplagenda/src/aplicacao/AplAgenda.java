package aplicacao;

import java.util.ArrayList;
import java.util.List;

import dominio.Contato;

public class AplAgenda {
    private List contatos = new ArrayList();

    private void adicionarContato(Contato c){
        contatos.add(c);
    }


}