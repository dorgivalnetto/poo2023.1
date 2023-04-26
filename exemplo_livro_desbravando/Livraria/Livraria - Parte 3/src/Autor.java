public class Autor {
        private String nome;
        private String email;
        private String cpf;
    
    
        public void imprimirInformacoes(){
            String mensagem = "Mostrando detalhes do livro";
            System.out.println(mensagem);
            System.out.println("Nome: " + nome);
            System.out.println("Nome: " + email);
            System.out.println("Nome: " + cpf);
        }


        public String getNome() {
            return nome;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }


        public String getEmail() {
            return email;
        }


        public void setEmail(String email) {
            this.email = email;
        }


        public String getCpf() {
            return cpf;
        }


        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
    
    
}
