import javax.swing.JOptionPane;

public class Repeticao {
   public static void main(String[] args) {
        float mediaAvaliacao = 0;

    for(int i = 0; i<3; i++){
        float leitura = Float.parseFloat(
            JOptionPane.showInputDialog("Digite a nota do filme"));
        mediaAvaliacao += leitura;
    }

    System.out.println(mediaAvaliacao / 3);
   }
}
