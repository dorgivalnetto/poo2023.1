public class Ebook extends Livro implements Promocional{
    private String marcaDagua;

    public Ebook(Autor autor){
        /*
         * utilizamos a palavra
         * super para delegar a
         * responsabilidade para 
         * a superclasse que já 
         * tem esse comportamento
         * bem definido.
         */
        super(autor);

    }

    public String getMarcaDagua() {
        return marcaDagua;
    }

    public void setMarcaDagua(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }
    
    @Override
    public void aplicarDesconto(double porcentagem){
        if (porcentagem > 0.15){
            System.out.println("O desconto não pode ser maior do que 15%");
        } else{
            double desconto = this.getValor() * porcentagem;
            this.setValor(this.getValor()-desconto);
            System.out.println("Valor do Ebook com desconto: " + this.getValor());
        }
    }
    
}
