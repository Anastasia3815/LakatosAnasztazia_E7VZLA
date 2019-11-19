package Ital;

/**
 *
 * @author Anastasia
 */
public class Dolgozat {

    public static Ital legmagasabbAlkoholTartalom(SzeszesItal[] t) {
        if (t.length >= 3) {
            for (int i = 0; i < t.length - 1; i++) {
                for (int j = i + 1; j < t.length; j++) {
                    if (t[i].getAlkoholTartalom() < t[j].getAlkoholTartalom()) {
                        SzeszesItal tmp = t[i];
                        t[i] = t[j];
                        t[j] = tmp;
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                return t[i];
            }
        }

        return null;
    }
}
