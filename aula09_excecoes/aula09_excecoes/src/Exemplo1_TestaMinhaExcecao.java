public class Exemplo1_TestaMinhaExcecao {
    
    public static void main(String[] args) {
        System.out.println("Iniciando o main");
        try {
            metodo1();
            //captura a exceção
        } catch(ArithmeticException |
                NullPointerException | 
                Exemplo1_MinhaException | 
                Exemplo1_MinhaExcecao ex) {
            System.out.println("Exception" + ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1()
            throws Exemplo1_MinhaExcecao {
        System.out.println("Iniciando o metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() 
            throws Exemplo1_MinhaExcecao{
        System.out.println("Iniciando o metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        metodo3();
        //Instanciar a exceção. Lançar a exceção na pilha de execução com throw
        //throw new MinhaException("Exception da minha exceção");
        
       // System.out.println("Fim do metodo2");
    }
    
    /*throws deve vir explicitamente na assinatura do método.
    Precisamos mudar a assinatura do método para explicitar
    que ele pode lançar tal exceção.*/
    private static void metodo3()
            throws Exemplo1_MinhaExcecao
             {
        throw new Exemplo1_MinhaExcecao
        ("Exception é da classe MinhaException");
    }
}
