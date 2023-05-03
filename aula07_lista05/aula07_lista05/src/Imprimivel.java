/*
 * Um imprimível é algo capaz de ser impresso, e para isso, definimos como
requisitos mínimos que ele deve ter os dois métodos declarados, um que retorna
o cabeçalho da página e outro que retorna o corpo da página.
 */
public interface Imprimivel {
    String getCabecalhoPagina();
    String getCorpoPagina();
}
