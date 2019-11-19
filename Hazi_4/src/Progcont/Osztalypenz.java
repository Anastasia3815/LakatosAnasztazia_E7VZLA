package Progcont;

import java.io.*;
import java.util.*;

/**
 *
 * @author Anastasia
 */
public  class Osztalypenz {   
   static class penz implements Comparable<penz>{
        public String nev;
        public int osszeg;

        public penz(String nev, int osszeg) {
            this.nev = nev;
            this.osszeg = osszeg;
        }

        @Override
        public int compareTo(penz o) {
            if(this.osszeg == o.osszeg)
                return this.nev.compareTo(o.nev);
            return o.osszeg  -this.osszeg;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null || !(obj instanceof penz))
            return false;
            penz p = (penz)obj;
            return this.nev.equals(p.nev);
        }       
    }
    
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<penz> lista = new ArrayList<>();
       String sor;
       String []t;
      
       while((sor = br.readLine()) != null){
           if(sor.equals("0")) break;
           t = sor.split(";");
           
           penz p = new penz(t[0], Integer.parseInt(t[1]));
           if(lista.contains(p)){
               
               for (int i = 0; i < lista.size(); i++) {
                   if(lista.get(i).equals(p))
                       lista.get(i).osszeg += Integer.parseInt(t[1]);
               }
           }
               else
               lista.add(p);
       }
       Collections.sort(lista);
        for (penz s : lista) {
            System.out.println(s.nev +";"+s.osszeg);
        }       
    }
}
