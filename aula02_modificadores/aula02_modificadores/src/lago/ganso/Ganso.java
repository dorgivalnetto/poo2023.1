package lago.ganso;

import lago.margem.Passaro;

public class Ganso extends Passaro { // extends means create subclass
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }

    public void helpGooseSwim() {
        Ganso other = new Ganso();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
        Passaro other = new Ganso();
        other.floatInWater(); // DOES NOT COMPILE
        System.out.println(other.text); // DOES NOT COMPILE
    }
}
