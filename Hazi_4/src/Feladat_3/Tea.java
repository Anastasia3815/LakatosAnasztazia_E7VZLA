package Feladat_3;

/**
 *
 * @author Anastasia
 */
public class Tea implements Rendezheto {

    public String nev;
    public int ar;

    public Tea(String s, int j) {
        nev = s;
        ar = j;
    }

    @Override
    public boolean egyenlo(Object o) {
        Tea t = (Tea)o;
        return this.ar == t.ar;
    }

    @Override
    public boolean nagyobbMint(Object o) {
        Tea t = (Tea)o;
        return this.ar > t.ar;
    }

    @Override
    public boolean kisebbMint(Object o) {
        Tea t = (Tea)o;
        return this.ar < t.ar;
    }
}