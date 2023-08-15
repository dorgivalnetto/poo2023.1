import javax.sql.rowset.serial.SerialArray;

public class TestaEscopoVariavel{
    public static void main(String[] args) {
        boolean fuiPromovido = true;

        if(fuiPromovido){
            /*
             * Variáveis locais são declaradas dentro de um método
             */
            double salario = 5000;
        } else{
            double salario = 3000;
        }

        System.out.println(salario); // Fora do escopo
        System.out.println(fuiPromovido); // Dentro do escopo

        /*
         * Variáveis locais - no escopo da declaração ao final do bloco
         * Variáveis de instância - no escopo da declaração até que o lixo do objeto seja coletado
         * Variáveis de classe - no escopo da declaração até o final do programa
         */
    }
}