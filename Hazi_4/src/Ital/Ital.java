package Ital;

import java.util.Objects;

/**
 *
 * @author Anastasia
 */
public class Ital implements Comparable<Ital>{

    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + ", " + ár + "Ft";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Ital))
            return false;
        Ital i = (Ital)obj;
        return this.név.equals(i.getNév()) && this.kiszerelés.equals(i.getKiszerelés());
    }

    @Override
    public int compareTo(Ital o) {       
        return Integer.compare(ár, o.getÁr());
    }
    
    


    
}
