public class Arrays1 {
    
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 17;
        idades[1] = 34;
        idades[2] = 54;

        System.out.println(idades[0]);
        
        for (int i=0; i< idades.length; i++){
            System.out.println(idades[i]);
        }

        //variavel aux do tipo do array representa cada uma das posições
        for(int aux: idades){
            System.out.println(aux);
        }
    }
}
