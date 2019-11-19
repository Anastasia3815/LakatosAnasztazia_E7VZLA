package zh;

import java.util.Scanner;

/**
 *
 * @author Anastasia
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hallgatokSzama = Integer.parseInt(sc.nextLine());
        Hallgato[] hallgatok = new Hallgato[hallgatokSzama];
        
        for(int i = 0; i < hallgatokSzama; i++){
            String[] sor = sc.nextLine().split(" ");
            hallgatok[i] = new Hallgato(Integer.parseInt(sor[0]), sor[1].equals("igaz"));
        }
        
        for(int i = 0; i < hallgatokSzama; i++){
            if(hallgatok[i].dolgozatotIr().megfelelt() &&hallgatok[i].dolgozatotIr().megfelelt()){
                System.out.println("megfelelt");
            } else System.out.println("nem felelt meg");
        }
    }
}
