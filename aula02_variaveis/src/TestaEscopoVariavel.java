import javax.sql.rowset.serial.SerialArray;

public class TestaEscopoVariavel{
    public static void main(String[] args) {
        boolean fuiPromovido = true;

        if(fuiPromovido){
            double salario = 5000;
        } else{
            double salario = 3000;
        }

        //System.out.println(salario); // Fora do escopo
        System.out.println(fuiPromovido); // Dentro do escopo
    }
}