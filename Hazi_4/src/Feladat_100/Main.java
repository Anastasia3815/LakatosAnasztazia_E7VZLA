package Feladat_100;

import java.io.*;

import java.util.*;

/**
 *
 * @author Anastasia
 */
public class Main {
     public static List<Teherauto> getTeherauto(Auto[] t){
        ArrayList<Teherauto> li = new ArrayList<>();
        for(Auto a : t){
            if((a instanceof Teherauto) && a.teherbiras > 20){
                li.add(a);
            }
        }
        return a;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Auto a = new Auto(sc.nextLine(), 100, true);
        System.out.println(a);

        Auto [] au = new Auto[4];
        String [] sor = sc.nextLine().split(" ");
        
        au[0] = new Auto(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]));
        sor = sc.nextLine().split(" ");
        au[0] = new Auto(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]));
        
        sor = sc.nextLine().split(" ");
        au[0] = new Teherauto(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]), Integer.parseInt(sor[3]));
        
        sor = sc.nextLine().split(" ");
        au[0] = new Teherauto(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]), Integer.parseInt(sor[3]));
    }


    
}
