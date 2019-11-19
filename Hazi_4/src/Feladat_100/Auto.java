package Feladat_100;

import java.util.Objects;

/**
 *
 * @author Anastasia
 */
public class Auto implements Comparable<Auto>{
    private String rendszám;
    private int teljesítmény;
    private boolean automata;

    public Auto(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendsz=" + rendszám + ", teljes" + teljesítmény + ", automata=" + automata + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Auto))
            return false;
        Auto a =  (Auto)obj;
        return this.rendszám.equals(a.rendszám);
    }

    @Override
    public int compareTo(Auto o) {
        return o.teljesítmény - this.teljesítmény;
    }
   
        public static boolean isValidRendszam(String s){
        if(s.length() != 6) 
            return false;
        int i;
        for(i = 0; i < 3; i++){
            if(!Character.isAlphabetic(s.charAt(i))) 
                return false;
        }       
        for(; i < 6; i++){
            if(!Character.isDigit(s.charAt(i))) 
                return false;
        }
        return true;
    }
    
}
