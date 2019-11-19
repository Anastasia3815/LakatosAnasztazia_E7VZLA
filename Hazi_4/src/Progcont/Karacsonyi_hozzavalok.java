package Progcont;

import java.io.*;
import java.util.*;

/**
 *
 * @author Anastasia
 */
class recept implements Comparable<recept> {

    public String nev;
    public int mennyiseg;

    public recept(String nev, int mennyiseg) {
        this.nev = nev;
        this.mennyiseg = mennyiseg;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return nev + ";" + mennyiseg;
    }

    @Override
    public int compareTo(recept o) {
        if (this.mennyiseg == o.mennyiseg) {
            return this.nev.compareTo(o.nev);
        }
        return o.mennyiseg - this.mennyiseg;
    }
}


public class Karacsonyi_hozzavalok {
    public static void main(String[] args) throws IOException {
        List<recept> lista = new ArrayList<recept>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String sor;
        String[] t;
        int db = 0;
        int index;
        int flag;
       
        while ((sor = br.readLine()) != null) {
            t = sor.split(";");
            flag = 0;
            if (db == 0) {
                lista.add(new recept(t[0], Integer.parseInt(t[1])));
                db++;
            } else {
                recept uj = new recept(t[0], Integer.parseInt(t[1]));
                for (int i = 0; i < lista.size(); i++) {
                    if ((lista.get(i).getNev().compareTo(t[0])) == 0) {
                        flag = 1;
                        int seged = lista.get(i).mennyiseg;
                        uj.mennyiseg = uj.mennyiseg + seged;
                        lista.set(i, uj);
                    }
                }
                db++;
                if (flag == 0) {
                    lista.add(uj);
                }
            }           
        }
        Collections.sort(lista);
        for (recept r : lista) {
            System.out.println(r);
        }
    }   
}
