package lago.margem;

public class ObservadorPassaros {
    public void watchBird() {
        Passaro bird = new Passaro();
        bird.floatInWater(); // calling protected member
        System.out.println(bird.text); // calling protected member
    }
}
    