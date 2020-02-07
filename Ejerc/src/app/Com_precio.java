package app;

import java.util.Comparator;
//usando comparator

public class Com_precio implements Comparator<Vehiculo>{
   

    public int compare(Vehiculo o1, Vehiculo o2) {
        
        return o1.getPrecio()-o2.getPrecio();
    }

}