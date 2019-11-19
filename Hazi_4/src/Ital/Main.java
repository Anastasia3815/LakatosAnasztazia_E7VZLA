package Ital;

/**
 *
 * @author Anastasia
 */
public class Main{

    public static void main(String[] args) {
        
        Ital szorp = new Ital("Obolony", "1 L", 500);
        Ital viz = new Ital("Mizse", "0,5 L", 200);
        Ital sor = new SzeszesItal(4, "Tuborg", "0,5 L", 200);
        Ital danko = new SzeszesItal(13, "Danko", "0,75 L", 400);
        Ital tokai = new SzeszesItal(12, "Tokai", "0,75 L", 1200);
        Ital soproni = new SzeszesItal(5, "Soproni", "0,5 L", 250);
        
        Ital[] i = new Ital[]{szorp, viz, sor, danko,tokai, soproni};
    }

}
