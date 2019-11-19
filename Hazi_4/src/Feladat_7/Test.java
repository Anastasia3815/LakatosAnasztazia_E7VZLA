package Feladat_7;

import java.util.*;

/**
 *
 * @author Anastasia
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Lakohaz> hazak = new ArrayList<>();
        hazak.add(new Lakohaz("Debrecen, Kossuth u. 8.", 3, 110.0));
        hazak.add(new Lakohaz("Debrecen, Csapo u. 94.", 3, 62.0));
        hazak.add(new Lakohaz("Zahony, Arany Janos u. 3.", 1, 135.5));
        hazak.add(new Lakohaz("Tuzser, Dozsa Gyorgy u. 76.", 2, 57.0));
        hazak.add(new Lakohaz("Budapest, Andrássy út 40.", 4, 90.7));
        hazak.add(new Lakohaz("Debrecen, Bocskai u. 9.", 2, 59.3));
        hazak.add(new Lakohaz("Budapest, Alkotmány u. 10.", 2, 70.5));
        hazak.add(new Lakohaz("Túrkeve, Arany János u. 44.", 2, 64.7));
        hazak.add(new Lakohaz("Mátészalka, Bartók u. 1.", 1, 119.8));
        hazak.add(new Lakohaz("Teglas, Mosolygó u. 14.", 1, 105.4));
        hazak.add(new Lakohaz("Debrecen, Jokai u. 56.", 3, 70.3));
        hazak.add(new Lakohaz("Debrecen, Kassai u. 26.", 2, 64.0));
        hazak.add(new Lakohaz("Debrecen, Kút u. 16.", 2, 61.4));
        hazak.add(new Lakohaz("Hajdúszoboszló, Ady Endre u. 45.", 1, 110.7));

        Collections.sort(hazak);

        for (Lakohaz i : hazak) {
            System.out.println(i);
        }
    }
}
