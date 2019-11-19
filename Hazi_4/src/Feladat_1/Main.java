package Feladat_1;

/**
 *
 * @author Anastasia
 */
public class Main {

    private static Aszu[] otpu (Bor[] b) {
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu a = (Aszu) b[i];
                if (a.hanyPuttonyos() == 5) {
                    index++;
                }
            }
        }
        Aszu[] aszutomb = new Aszu[index];
        index = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Aszu) {
                Aszu a = (Aszu) b[i];
                if (a.hanyPuttonyos() == 5) {
                    aszutomb[index++] = a;
                }
            }
        }
        return aszutomb;
    }
    
    public static void main(String[] args) {
        Bor[] b1 = new Bor[5];
        b1[0] = new Bor("Ezerfurt", "Tokaj", "Finom", 13.5);
        b1[1] = new Bor("Feher goher", "Tarcal", "Edes", 8);
        b1[2] = new Aszu(5, "Pozsonyi feher", "Tokaj", "Szaraz", 15);
        b1[3] = new Aszu(4, "Viktoria gyongye", "Villany", "Feledes", 22);
        b1[4] = new Bor("Feher goher", "Eger", "Edes", 8);

        Aszu[]a = otpu(b1);
        for (Aszu i : a) {
            System.out.println(i);
        }
        
    }
}
