package lago.cisne;

import lago.margem.Passaro; // in different package than Bird

public class Cisne extends Passaro { // but subclass of bird

    public void swim() {
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }

    public void helpOtherSwanSwim() {
        Cisne other = new Cisne();
        other.floatInWater(); // package access to superclass
        System.out.println(other.text);// package access to superclass
    }

    public void helpOtherBirdSwim() {
        Passaro other = new Passaro();
        other.floatInWater(); // DOES NOT COMPILE
        System.out.println(other.text); // DOES NOT COMPILE
    }
}
