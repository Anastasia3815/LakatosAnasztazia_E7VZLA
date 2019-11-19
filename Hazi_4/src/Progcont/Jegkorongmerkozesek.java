package Progcont;

import java.io.*;
import java.util.*;

/**
 *
 * @author Anastasia
 */
public class Jegkorongmerkozesek {
    static class Csapat implements Comparable<Csapat>{
        public String csapat_nev;
        public int pont;
        public int gol;

        public Csapat(String csapat_nev, int pont, int gol) {
            this.csapat_nev = csapat_nev;
            this.pont = pont;
            this.gol = gol;
        }

        @Override
        public int compareTo(Csapat o) {
            if(this.pont == o.pont){
             if(this.gol == o.gol)
                 return this.csapat_nev.compareTo(o.csapat_nev);
             return o.gol - this.gol;
            }return o.pont - this.pont;
        } 

        @Override
        public boolean equals(Object obj) {
            if(obj == null || !(obj instanceof Csapat))
            return false;
            Csapat p = (Csapat)obj;
            return this.csapat_nev.equals(p.csapat_nev);
        }
        
    }
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Csapat> lista = new ArrayList<>();
       String sor;
       String []t;
       int index = 0;
       
       
       while((sor = br.readLine()) != null){
           if(sor.equals("0")) break;
           int A = 0;
       int B = 0;
       int Apont = 0, Bpont = 0;
           t  = sor.split("[-:,]");
           index = (t.length - 2) / 2;
           for (int i = 2; i < t.length; i++) {
               if(i % 2 == 0)
                   A += Integer.parseInt(t[i]);
               else
                   B += Integer.parseInt(t[i]);
           }
           
           if(index == 3 && A > B){
               Apont = 3;
               Bpont = 0;
           }
           else if (index == 3 && B > A){
               Bpont = 3;
               Apont = 0;
           }
           else if (index > 3 && A > B){
               Apont = 2;
               Bpont = 1;
           }
           else {
               Apont = 1;
               Bpont = 2;
           }
           
           
           Csapat csA = new Csapat(t[0], Apont, A);
           if(!lista.contains(csA))
               lista.add(csA);
           else{
               for (Csapat c : lista) {
                   if(c.equals(csA)){
                       c.gol += A;
                       c.pont += Apont;
                   }                   
               }
           }
           Csapat csB = new Csapat(t[1], Bpont, B);
           if(!lista.contains(csB))          
                lista.add(csB);
            else{
               for (Csapat c : lista) {
                   if(c.equals(csB)){
                       c.gol += B;
                       c.pont += Bpont;
                   }                   
               }
           }
       }
       Collections.sort(lista);
        for (Csapat i : lista) {
            System.out.println(i.csapat_nev+": "+ i.pont +" points ("+i.gol+" scored goals)");
        }       
    }
}
