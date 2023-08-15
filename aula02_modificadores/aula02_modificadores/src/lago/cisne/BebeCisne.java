package lago.cisne;

import lago.pato.PatoMae; // import another package

public class BebeCisne {
    public void makeNoise() {
        PatoMae duck = new PatoMae();
        duck.quack(); // DOES NOT COMPILE
        System.out.println(duck.noise); // DOES NOT COMPILE
}
