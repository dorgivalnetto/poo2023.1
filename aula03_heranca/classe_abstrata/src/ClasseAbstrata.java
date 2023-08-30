public abstract class ClasseAbstrata {
        private String titulo;
      
        public void setTitulo(String titulo) {
          this.titulo = titulo;
        }
      
        public abstract String obterInformacao();
      
        public void imprimir() {
          System.out.println(this.titulo);
          System.out.println("\t" +
           obterInformacao());
        }
      
}
