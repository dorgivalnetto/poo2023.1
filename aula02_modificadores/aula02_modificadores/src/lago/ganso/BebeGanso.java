package lago.ganso;

import lago.margem.Passaro; // in a different package

public class BebeGanso extends Passaro { // extends means create subclass
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }
}
