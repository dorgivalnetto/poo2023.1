public class Condicional {
    
    public static void main(String[] args) {
        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = false;
        String tipoDoPlano = "Plus";

        if(anoDeLancamento >= 2023){
            System.out.println("Filme lançamento");
        } else{
            System.out.println("Filme antigo");
        }

        if(incluidoNoPlano || tipoDoPlano.equals("Plus"){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Necessário alugar!");
        }


    }
}
