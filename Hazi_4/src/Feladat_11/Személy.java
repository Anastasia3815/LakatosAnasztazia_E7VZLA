package Feladat_11;

/**
 *
 * @author Anastasia
 */
public class Személy implements Comparable<Személy>
{
    protected String név;
    protected int életkor;
    private boolean férfi;

    public Személy(String név, int életkor, boolean férfi) {
        this.név = név;
        this.életkor = életkor;
        this.férfi = férfi;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getÉletkor() {
        return életkor;
    }

    public void setÉletkor(int életkor) {
        this.életkor = életkor;
    }

    public boolean isFérfi() {
        return férfi;
    }

    public void setFérfi(boolean férfi) {
        this.férfi = férfi;
    }

    @Override
    public String toString() {
        return név + " " + életkor + " " + férfi;
    }

    @Override
    public int compareTo(Személy t) {
        return Integer.compare(this.életkor, t.életkor);
    }
}

