package Ital;

/**
 *
 * @author Anastasia
 */
public class SzeszesItal extends Ital{
    private double alkoholTartalom;

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }
    
    

    public SzeszesItal(double alkoholTartalom, String név, String kiszerelés, int ár) {
        super(név, kiszerelés, ár);
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String toString() {
        return alkoholTartalom + "% alkoholtartalmú " + név + ", " + kiszerelés + ", " + ár + " Ft";
    }
    
}
