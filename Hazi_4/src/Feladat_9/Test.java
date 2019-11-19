package Feladat_9;

import java.util.*;

/**
 *
 * @author Anastasia
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Hatizsak> hazak = new ArrayList<>();
        hazak.add(new Hatizsak("Adidas",110.0, 3, false));
        hazak.add(new Hatizsak("Benzi",62.0, 2, true));
        hazak.add(new Hatizsak("Matties Bags",135.5, 3, false));
        hazak.add(new Hatizsak("Heavy Tools",57.0, 56, false));
        hazak.add(new Hatizsak("Nike",90.7,3, true));
        hazak.add(new Hatizsak("Samsonite",59.3, 5, true));
        hazak.add(new Hatizsak("Rialto",70.5, 9, true));
        hazak.add(new Hatizsak("Swisswin", 64.7, 0 ,false));
        hazak.add(new Hatizsak("Yearz",119.8,23,true));
        hazak.add(new Hatizsak("Touareg",105.4,21,true));
        hazak.add(new Hatizsak("Justin & Kelvin",70.3,1,false));
        hazak.add(new Hatizsak("Leonardo Da Vinci", 64.0,5,true));
        hazak.add(new Hatizsak("Dielle", 61.4,7,false));
        hazak.add(new Hatizsak("Giulio", 110.7,32,true));

        Collections.sort(hazak);

        for (Hatizsak i : hazak ) {
            System.out.println(i);
        }
    }
}
