package Feladat_1;

/**
 *
 * @author Anastasia
 */
public class Aszu extends Bor{
    private int puttonySzam;

    public Aszu(int puttonySzam, String szoloFajta, String TermoTerulet, String iz, double alkoholTartalom) {
        super(szoloFajta, TermoTerulet, iz, alkoholTartalom);
        this.puttonySzam = puttonySzam;
    }
    public int hanyPuttonyos(){
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + puttonySzam + '}';
    }
    
}
