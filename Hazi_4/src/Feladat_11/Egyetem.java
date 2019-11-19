/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_11;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Anastasia
 */
public class Egyetem {
     private ArrayList<Személy> li;

    public Egyetem() {
        this.li = new ArrayList<>();
    }
    
    public void felvesz(Személy sz){
        li.add(sz);
    }
    
    public boolean torol(Személy sz){
        return li.remove(sz);
    }
    
    public void print3Legfiatalabb(){
        Collections.sort(li);
        for(int i = 0; i < 3 && i < li.size(); i++){
            System.out.println(li.get(i));
        }
    }
    
    public void addFelkialtojel(){
        for(Személy sz : li){
            if(sz instanceof Oktato){
                if(((Oktato) sz).tanszek.equals("IT") && !sz.isFérfi()){
                    sz.setNév(sz.getNév() + "!");
                }
            }
        }
    }
}
