package lago.pato;

public class PatoPai {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise); // private access is ok
    }

    private void makeNoise() {
        quack(); // private access is ok
    }
}
