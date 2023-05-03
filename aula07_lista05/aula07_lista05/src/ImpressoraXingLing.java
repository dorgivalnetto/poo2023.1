/*
 * ImpressoraXingling exibe na saída os mesmos dados do cabeçalho e
corpo da página, mas em um formato diferente.
 */
public class ImpressoraXingLing implements Impressora {

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println("===================");
        System.out.println("**Xingling Printer**");
    }
}
