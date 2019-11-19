package Progcont;

import java.io.*;
import java.util.*;

/**
 *
 * @author Anastasia
 */
class osztaly implements Comparable<osztaly> {

    public String nev;
    public int pontszam;

    public osztaly(String nev, int pontszam) {
        this.nev = nev;
        this.pontszam = pontszam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return nev + ";" + pontszam;
    }

    @Override
    public int compareTo(osztaly o) {
        if (this.pontszam == o.pontszam) {
            return this.nev.compareTo(o.nev);
        }
        return o.pontszam - this.pontszam;
    }
}

public class Zarthelyi_eredmenyek {

    public static void main(String[] args) throws IOException {
        List<osztaly> lista = new ArrayList<osztaly>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String sor;
        String[] t;
        int db = 0;
        int index;
        int flag;
       
        while ((sor = br.readLine()) != null) {
            //if(sor.equals("1")) break;
            t = sor.split(";");
            flag = 0;
            if (db == 0) {
                lista.add(new osztaly(t[0], Integer.parseInt(t[1])));
            } else {
                for (int i = 0; i < lista.size(); i++) {
                    if ((lista.get(i).getNev().compareTo(t[0])) == 0) {
                        flag = 1;
                        int seged = lista.get(i).getPontszam();
                        osztaly uj = new osztaly(t[0], seged + Integer.parseInt(t[1]));
                        lista.set(i, uj);
                    }
                }
                if (flag == 0) {
                    lista.add(new osztaly(t[0], Integer.parseInt(t[1])));
                }
            }
            db++;
        }
        Collections.sort(lista);
        for (osztaly o : lista) {
            System.out.println(o);
        }
    }
}

