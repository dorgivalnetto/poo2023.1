package lago.interior;

import lago.margem.Passaro;

/*
 * Subclasses e classes no mesmo pacote são as únicas permissõe
 * para acessar membros protegidos 
 */

public class ObservadorPassarosDeLonge {
    public void watchBird() {
        Passaro bird = new Passaro();
        bird.floatInWater(); // DOES NOT COMPILE
        System.out.println(bird.text); // DOES NOT COMPILE
    }
}
