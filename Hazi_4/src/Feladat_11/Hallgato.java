package Feladat_11;

/**
 *
 * @author Anastasia
 */
public class Hallgato extends Személy{
    private static double atlagfeletti = 4.0;
    double átlag;

    public Hallgato(String név, int életkor, boolean férfi, double átlag) {
        super(név, életkor, férfi);
        this.átlag = átlag;
    }

    @Override
    public String toString() {
        
        return this.getNév() + "\n" + this.getÉletkor()+ "\n" +this.isFérfi()+ "\n" +this.átlag;
    }
    
    
    public boolean joAtlagu(){
        return this.átlag >= atlagfeletti;
    }
    
    public static void setAtlagSzint(double d){
        atlagfeletti = d;
    }
    
}