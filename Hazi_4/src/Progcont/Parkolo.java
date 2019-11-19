package Progcont;

import java.io.*;
import java.util.*;

/**
 *
 * @author Anastasia
 */
public class Parkolo {   
   static class Szabad implements Comparable<Szabad>{
        public String varos;
        public int hely;

        public Szabad(String varos, int hely) {
            this.varos = varos;
            this.hely = hely;
        }

        @Override
        public int compareTo(Szabad o) {
            if(this.hely == o.hely)
                return this.varos.compareTo(o.varos);
            return o.hely - this.hely;
        }        
    }
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Szabad> lista = new ArrayList<>();
       String sor;
       String []t;
       int index = 0;
       while((sor = br.readLine())!= null){
           if(sor.equals("0")) break;
           t = sor.split(";");
           
           lista.add(new Szabad(t[0], Integer.parseInt(t[2]) - (t.length-3)));
       }
       Collections.sort(lista);
        for (Szabad s : lista) {
            if(s.hely >= 3)
            System.out.println(s.varos+": "+s.hely+" szabad hely");
        }
    }
}
