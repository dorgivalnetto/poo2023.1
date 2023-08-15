package lago.pato;

public class PatinhoBom {

    public void makeNoise() {
        PatoMae duck = new PatoMae();
        duck.quack(); // default access
        System.out.println(duck.noise); // default access
    }
}
