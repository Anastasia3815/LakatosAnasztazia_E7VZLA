package Feladat_1;

/**
 *
 * @author Anastasia
 */
public class Bor extends AlkoholosItal{
    private String szoloFajta;
    private String TermoTerulet;

    public Bor(String szoloFajta, String TermoTerulet, String iz, double alkoholTartalom) {
        super(iz, alkoholTartalom);
        this.szoloFajta = szoloFajta;
        this.TermoTerulet = TermoTerulet;
    }
    
    public String milyenSzolobolKeszult(){
        return szoloFajta;
    }
    
    public String mibolKeszult(){
        return null;
    }
    public String holTermett(){
        return TermoTerulet;
    }

    @Override
    public String toString() {
        return "Bor{" + "szoloFajta=" + szoloFajta + ", TermoTerulet=" + TermoTerulet + '}';
    }   
}
