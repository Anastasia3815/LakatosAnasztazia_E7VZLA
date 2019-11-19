
import java.util.Scanner;




class Luhn{
    String kartyaSzam;

    public Luhn(String kartyaSzam) {
        this.kartyaSzam = kartyaSzam;
    }
    
    public boolean valid(){
        if(kartyaSzam.length() != 16) return false;
        
        int[] szamok = new int[16];
        int osszeg = 0;
        
        for(int i = 15; i >= 0; i--){
            szamok[i] = Integer.parseInt(kartyaSzam.charAt(i) + "");
            if(i % 2 == 0){
                szamok[i] *= 2;
                if(szamok[i] > 9){
                   szamok[i] -= 9;
                }
            }
            osszeg += szamok[i];
        }
        
        return ((osszeg % 10) == 0);
    }
    
}


public class Bankkartyaszam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            Luhn h = new Luhn(sc.nextLine());
            System.out.println(h.valid() ? "YES" : "NO");
        }
    }
    
}
