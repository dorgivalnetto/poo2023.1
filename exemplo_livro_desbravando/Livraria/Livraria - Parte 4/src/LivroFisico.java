public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(Autor autor) {
        super(autor);
        
    }

    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }

    @Override
    public void aplicarDesconto(double porcentagem){
        if (porcentagem > 0.3){
            System.out.println("O desconto não pode ser maior do que 30%");
        } else{
            double desconto = getValor() * porcentagem;
            setValor(getValor() - desconto);
            System.out.println("Valor do Livro Físico com desconto: " + this.getValor());                        
        }
    }
    
}
