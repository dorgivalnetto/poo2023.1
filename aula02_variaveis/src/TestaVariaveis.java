public class TestaVariaveis {
    
    public static void main(String[] args) {
        //TestaVariaveis.java:4: error: incompatible types: possible lossy conversion from double to int
        //int livroJava8 = 59.9;
        //double livroJava8_novo = 60;
        //int numero_inteiro = livroJava8_novo;
        
        int idade = 34;
    
        System.out.println(idade);

        idade = 2 * idade;

        System.out.println(idade);

        System.out.println("A idade é: " + idade);

        /*
         * + soma
         * - subtração
         * * multiplicação
         * / divisão
         */
        
         double altura = 1.70;
         System.out.println("A altura é: " + altura); //

         int divisao = 5/2;
         System.out.println(divisao); // Saída: 2

         double novaTentativa = 5/2;
         System.out.println(novaTentativa); // Saída: 2

         double outraTentativa = 5.0/2;
         System.out.println(outraTentativa); // Saída: 2.50000
    }
}