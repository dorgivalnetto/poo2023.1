package lago.pato;

public class PatinhoMau {
    public void makeNoise() {
        PatoPai duck = new PatoPai();
        duck.quack(); // DOES NOT COMPILE
        System.out.println(duck.noise); // DOES NOT COMPILE

        /*
         * Ele tenta para acessar um método privado em outra classe. 
         * Na linha 7, ele tenta acessar uma instância privada de uma variável
         * em outra classe. Ambos geram erros de compilador.
         */
    }
}
