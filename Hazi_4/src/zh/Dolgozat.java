package zh;

import egyetem.Pontozhato;

/**
 *
 * @author Anastasia
 */
public class Dolgozat implements Pontozhato {

    public int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt() {
        if (pontszam != -1) {
            System.out.println("Nem írt");
        }
        return pontszam > 35;
    }

    @Override
    public String toString() {
        return "pontszám: " + (pontszam == -1 ? "nem írt" : pontszam);
    }

}
