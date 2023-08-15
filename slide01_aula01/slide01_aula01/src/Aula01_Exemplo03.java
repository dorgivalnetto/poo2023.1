import javax.swing.JOptionPane;

public class Aula01_Exemplo03 {
    public static void main(String[] args) {
        
        //variaveis
        int idade;

        Pessoa dorgival  = new Pessoa();
        //dorgival.idade = 34;
        dorgival.setIdade(idade);
    
        //entrada de dados
        idade = Integer.parseInt(JOptionPane.showInputDialog(
            "Informe a idade do eleitor"));
    
        //processamento
        if (idade < 16) {
            JOptionPane.showMessageDialog(null, 
            "O eleitor tem " + idade + " anos e ainda não pode votar!");
        }
    
        if (idade >= 16 && idade < 18) {
            JOptionPane.showMessageDialog(null, 
            "O eleitor tem " + idade + " anos e o voto é facultativo!");
        }
    
        if (idade >= 18 && idade < 70) {
            JOptionPane.showMessageDialog(null, 
            "O eleitor tem " + idade + " anos e o voto é obrigatório!");
        }
    
        if (idade >= 70) {
            JOptionPane.showMessageDialog(null, 
            "O eleitor tem " + idade + " anos e o voto é facultativo!");
        }

        //Qual a diferença entre JOptionPane.showMessageDialog
        // e System.out.println()?

    } //fim do main    
}
