package zh;

import java.util.Random;
import zh.Dolgozat;

/**
 *
 * @author Anastasia
 */
public class Hallgato {
    int mennyitKeszult;
    boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }
    
    public Dolgozat dolgozatotIr(){
        Dolgozat d;
        if(sokatTanul){
            d = new Dolgozat(((new Random()).nextInt(3) + 4) * mennyitKeszult);
        }else{
            d = new Dolgozat(((new Random()).nextInt(5) + 0) * mennyitKeszult);
        }
        
        System.out.println(d);
        if( (Math.abs((new Random()).nextInt()) / (double)Integer.MAX_VALUE) <= 0.02){
            d = new Dolgozat(-1);
        }
        
        return d;
    }
}
