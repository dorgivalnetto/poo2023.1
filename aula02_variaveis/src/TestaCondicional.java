public class TestaCondicional {
    public static void main(String[] args) {
        double salario = 3300.0;

        if (salario < 2600.0){
            System.out.println("A sua alíquota é 15%");
            System.out.println("Você pode deduzir até R$350,00");
        }

        else if (salario < 3750.0){
            System.out.println("A sua alíquota é 22,5%");
            System.out.println("Você pode deduzir até R$636,00");
        }

        int idade = 68;
        boolean ehIdoso = idade >= 65;
        System.out.println(ehIdoso); // Saída: true

        int mesAtual = 0;

        switch(mesAtual){
            case 1:
                System.out.println("O mês atual é Janeiro");
                break;
            case 2:
                System.out.println("O mês atual é Fevereiro");
                break;
            default:
                System.out.println("O mês informado é inválido");
            
        }
    }
    
}
