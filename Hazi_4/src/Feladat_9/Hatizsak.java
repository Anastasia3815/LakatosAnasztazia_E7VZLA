package Feladat_9;

/**
 *
 * @author Anastasia
 */
public class Hatizsak implements Comparable<Hatizsak>{
    private String marka;
   private double urtartalom;
   private int zsebekSzama;
   private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekSzama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekSzama = zsebekSzama;
        this.vizhatlan = vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekSzama() {
        return zsebekSzama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    @Override
    public String toString() {
        return "Hatizsak{" + "marka=" + marka + ", urtartalom=" + urtartalom + ", zsebekSzama=" + zsebekSzama + ", vizhatlan=" + vizhatlan + '}';
    }

    @Override
    public int compareTo(Hatizsak o) {
        if(this.marka == o.marka){
            return o.zsebekSzama - this.zsebekSzama;
        }return this.marka.compareTo(o.marka);
    }   
}
