package br.edu.ufca.poo.livraria.produtos;
public interface Promocional {
    
    void aplicarDesconto(double porcentagem);

    /*
     * Desde o Java 8, uma interface pode ter métodos concretos.
     * Com isso, suas implementações não são obrigadas a reescrevê-los.
     * Esse recurso é conhecido como default methods.
     */
     default void aplicarDesconto10porcento(){
        aplicarDesconto(0.1);
     }

     /*
      * Interface que tem um único método abstrato é chamada de funcional.
      Para fazer isso, utilizamos a anotação @FunctionalInterface
      */
}
