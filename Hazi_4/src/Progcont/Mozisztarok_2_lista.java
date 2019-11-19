package Progcont;

import java.io.*;
import java.util.*;

/**
 *
 * @author Anastasia
 */

class datum_sztar implements Comparable<datum_sztar>{
    public String nev;
    public int datum;

    public datum_sztar(String nev, int datum) {
        this.nev = nev;
        this.datum = datum;
    }

    @Override
    public int compareTo(datum_sztar o) {
        if(this.datum == o.datum)
            return this.nev.compareTo(o.nev);
        return this.datum - o.datum;
    }
}

class mozi implements Comparable<mozi>{
    public String cim;
    public int db;
    ArrayList<datum_sztar>lista2 = new ArrayList<>();

    public mozi(String cim, int db) {
        this.cim = cim;
        this.db = db;
    }

    @Override
    public int compareTo(mozi o) {
        if(this.db == o.db)
            return this.cim.compareTo(o.cim);
        return o.db - this.db;
    }
}

public class Mozisztarok_2_lista {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         ArrayList<mozi> lista = new ArrayList<>();
         String sor;
         String []t;
         String []token;
         int index = 0;
         String szinesz;
         
         while((sor = br.readLine()) != null){
            // if(sor.equals("0")) break;
             t = sor.split("[:;]");
             token = t[0].split("[()]");

             
             for (int i = 1; i < t.length; i++) {
                 index = 0;
                 for (int j = 0; j < lista.size(); j++) {
                     if(t[i].equals(lista.get(j).cim)){
                         lista.get(j).db +=1;
                             lista.get(j).lista2.add(new datum_sztar(token[0].trim(), Integer.parseInt(token[1])));
                             index = 1;                         
                     }
                 }
                 if(index == 0){
                     lista.add(new mozi(t[i], 1));
                     lista.get(lista.size()-1).lista2.add(new datum_sztar(token[0].trim(), Integer.parseInt(token[1])));
                 }                     
             }         
         }
         Collections.sort(lista);
         for (int i = 0; i < lista.size(); i++) {
            Collections.sort(lista.get(i).lista2);
        }
         for (int i = 0; i < lista.size(); i++) {
             System.out.println(lista.get(i).cim);
             for (int j = 0; j < lista.get(i).lista2.size(); j++) {
                 System.out.println(lista.get(i).lista2.get(j).datum +": "+ lista.get(i).lista2.get(j).nev);
             }
        }
    }   
}

