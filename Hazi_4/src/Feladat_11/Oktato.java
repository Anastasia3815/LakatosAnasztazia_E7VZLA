package Feladat_11;

/**
 *
 * @author Anastasia
 */
public class Oktato extends Személy{
    String tanszek;

    public Oktato(String név, int életkor, boolean férfi, String tanszek) {
        super(név, életkor, férfi);
        this.tanszek = tanszek;
    }
}
