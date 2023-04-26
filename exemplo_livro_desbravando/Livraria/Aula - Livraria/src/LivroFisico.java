public class LivroFisico extends Livro {

    public LivroFisico(Autor autor) {
        //invocando o método construtor da superclasse
        super(autor);   
    }

    public double custoImpressao(){
        return this.getValor() * 0.05;
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
            if(porcentagem > 0.3){
                System.out.println("O desconto não pode ser superior a 30%");    
            } else{
                double desconto = getValor() * porcentagem;
                setValor(getValor() - desconto);
                System.out.println("Valor do Livro Físico com desconto: " + this.getValor());                        
            }  
        }
    }


    
    

