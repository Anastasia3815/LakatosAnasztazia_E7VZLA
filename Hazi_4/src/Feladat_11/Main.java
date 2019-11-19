package Feladat_11;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Anastasia
 */
public class Main {
    public static double getAtlag(Set<Hallgato> s){
        double osszeg = 0;
        int jok = 0;
        for(Hallgato d : s){
            if(d.joAtlagu()){
                osszeg += d.életkor;
                jok++;
            }
        }
        return osszeg / jok;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Személy mona = new Személy("Mona Liza", 20, false);
        System.out.println(mona);
        
        Személy[] szemelyek = new Személy[4];
        
        String[] sor = sc.nextLine().split(" ");
        szemelyek[0] = new Hallgato(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]), Double.parseDouble(sor[3]));
        sor = sc.nextLine().split(" ");
        szemelyek[0] = new Hallgato(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]), Double.parseDouble(sor[3]));
        
        sor = sc.nextLine().split(" ");
        szemelyek[0] = new Oktato(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]), sor[3]);
        
        sor = sc.nextLine().split(" ");
        szemelyek[0] = new Oktato(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]), sor[3]);
        
    }
}
