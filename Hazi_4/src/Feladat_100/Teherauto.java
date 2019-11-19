package Feladat_100;

/**
 *
 * @author Anastasia
 */
public class Teherauto extends Auto{
    public int teherbiras;

    public Teherauto(int teherbiras, String rendszám, int teljesítmény, boolean automata) {
        super(rendszám, teljesítmény, automata);
        this.teherbiras = teherbiras;
    }

    @Override
    public String toString() {
        return "Teherauto{" + "teherbiras=" + teherbiras + '}';
    }
    
}
