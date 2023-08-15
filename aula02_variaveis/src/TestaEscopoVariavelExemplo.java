public class TestaEscopoVariavelExemplo {

    // Quantas variáveis locais você vê neste exemplo?
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }


    /*
     * Variáveis locais nunca podem ter um escopo maior do que o
     * método em que são definidas. No entanto, eles podem ter um
     * escopo menor. Considere este exemplo:
     */

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } 
        // bitesOfCheese goes out of scope here
        //System.out.println(bitesOfCheese);// DOES NOT COMPILE
    }




    /*
     * tente imaginar o tipo das quatro variáveis ​​e quando elas
     * entram e saem do escopo.
     */
    public class Mouse {
        static int MAX_LENGTH = 5;
        int length;

        public void grow(int inches) {
            if (length < MAX_LENGTH) {
                int newSize = length + inches;
                length = newSize;
            }

        }
    }

    /*
     * Variáveis ​​de instância: elas estarão disponíveis assim que forem
     * definidas e duram toda a vida útil do próprio objeto. 
     * 
     * Variáveis ​​de classe (static): elas entram em escopo quando declaradas como
     * os outros tipos de variáveis. No entanto, eles permanecem no escopo
     *  por toda a vida do programa.
     */
}
