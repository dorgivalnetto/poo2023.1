public class TestaConversaoTipos {
    public static void main(String[] args) {
        double salario = 1365.87;
        /*
         * CASTING conversão de tipos. Solicitamos ao Java que ache uma forma de
         * transformar o valor do lado direito do (int), no nosso caso, a variável salário, em
         * inteiro. Dessa foram o Java transformará double para int.
         */
        int valor = (int) salario;
        System.out.println(valor);
        // Saída:

        /*
         * Casting feito implicitamente, pois o valor possui um
         * tamanho menor que o tipo da variavel que irá recebe-lo.
         */
        char a = 'a';
        int b = 'b';
        char b1 = 98;
        float c = 100;

        System.out.println(a); // Imprime: 
        System.out.println(b); // Imprime: 
        System.out.println(b1); // Imprime: 
        System.out.println(c); // Imprime: 

        /*
         * Casting feito explicitamente, pois o valor possui um tamanho
         * maior que o tipo da variavel que irá recebe-lo.
         */
        int d = (int) 5.1987;
        float e = (float) 5.0;
        int f = (char) (a + 5);
        char g = (char) 110.5;

        System.out.println(d); // Imprime: 
        System.out.println(e); // Imprime: 
        System.out.println(f); // Imprime: 
        System.out.println(g); // Imprime: 
    }
}
