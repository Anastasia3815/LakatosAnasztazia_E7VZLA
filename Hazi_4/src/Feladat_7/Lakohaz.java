package Feladat_7;

/**
 *
 * @author Anastasia
 */
public class Lakohaz implements Comparable<Lakohaz>{
    public double emeletMagassag = 3.2;
    private String cim;
    private int emeletekSzama;
    private double alapterulet;

    public Lakohaz(String cim, int emeletekSzama, double alapterulet) {
        this.cim = cim;
        this.emeletekSzama = emeletekSzama;
        this.alapterulet = alapterulet;
    }

    public String getCim() {
        return cim;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public double getAlapterulet() {
        return alapterulet;
    }
    
    public double legkobmeter(){
        return alapterulet * emeletMagassag * emeletekSzama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(cim).append(", ");
        sb.append(emeletekSzama).append(", ");
        sb.append(alapterulet);       
        return sb.toString();
    }

    @Override
    public int compareTo(Lakohaz o) {  
        double legkobmeter = alapterulet * emeletMagassag* emeletekSzama;

     return Double.compare(legkobmeter, o.legkobmeter());
    }   
}
