package lago.pato;

/*
 * Ela permite classes no mesmo pacote para acessar seus membros.
 */
public class PatoMae {
    String noise = "quack";

    void quack() {
        System.out.println(noise); // default access is ok
    }

    private void makeNoise() {
        quack(); // default access is ok
    }
}
