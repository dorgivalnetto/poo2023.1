public class TestaLaco {
    public static void main(String[] args) {
        int contador = 0;

        while(contador <= 10){
            System.out.println(contador+=1);
            System.out.println(contador++);
        }

        System.out.println("Aqui "+contador);
 
        for (int cont = 0; cont <=10; cont++){
            System.out.println("Novo " + cont);
        }




        for(int multiplicador = 1; multiplicador <=10; multiplicador++){
            for (int conta = 1; conta <=10; conta++){
                System.out.print(multiplicador * conta + " ");
            }
            System.out.println("\n");
        }



        
        for(int linha = 0; linha<5; linha++){
            for(int coluna = 0; coluna<=linha; coluna++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Calcule o fatorial de 1 a 10
        //4! = 1*2*3*4 = 24
        int fatorial = 1;
        for(int i = 1; i<11; i++){
              fatorial *= i;
            System.out.println("Fatorial de: " + i + " = " + fatorial);
        }

        /*
         * Fatorial de: 1 = 1
Fatorial de: 2 = 2
Fatorial de: 3 = 6
Fatorial de: 4 = 24
Fatorial de: 5 = 120
Fatorial de: 6 = 720
Fatorial de: 7 = 5040
Fatorial de: 8 = 40320
Fatorial de: 9 = 362880
Fatorial de: 10 = 3628800
         */
    }

    


}
