package Feladat_1;

/**
 *
 * @author Anastasia
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos{
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String iz, double alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }
    public String milyenizu(){
        return iz;
    }

    @Override
    public String toString() {
        return "AlkoholosItal{" + "iz=" + iz + ", alkoholTartalom=" + alkoholTartalom + '}';
    }
    
    
    
}
