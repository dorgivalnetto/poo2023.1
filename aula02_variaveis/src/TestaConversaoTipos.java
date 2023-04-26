public class TestaConversaoTipos {
    public static void main(String[] args) {
        double salario = 1365.87;
        /*
         * CASTING conversão de tipos. Solicitamos ao Java que ache uma forma de transformar
         * o valor do lado direito do (int), no nosso caso, a variável salário, em inteiro.
         * Dessa foram o Java transformará double para int.
         */
        int valor = (int) salario;
        System.out.println(valor);
        //1365


    }
}
