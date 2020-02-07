package app;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


public class Cuentas {

    //formato decimal para el precio

    public String Formatodecimal(double valor){

        DecimalFormatSymbols simb = new DecimalFormatSymbols(new Locale("paraTP"));
        simb.setDecimalSeparator(',');
        simb.setGroupingSeparator('.');
        DecimalFormat asd= new DecimalFormat("###,###.00",simb);

        return asd.format(valor);
    }

    //----------------------------------------------------------------------------------
    String cadena;
//Obtiene mas caro y mas barato tambien obtiene letra Y
    
    public void Mascaro_masbarato(Vehiculo[] vehiculos ){
        
        for(int x=vehiculos.length-1;x>=0;x--){
            char letra='Y';
            
            if(x==vehiculos.length-1)
            {
              System.out.println("Vehículo más caro: "+vehiculos[x].Veh_marca+" "+vehiculos[x].Veh_modelo);
            }
            else if(x==0){
            System.out.println("Vehículo más barato: "+vehiculos[x].Veh_marca+" "+vehiculos[x].Veh_modelo);
  
            }
            if(vehiculos[x].Veh_modelo.indexOf(letra)>=0){
            cadena="Vehículo que contiene en el modelo la letra ‘Y’: "+vehiculos[x].Veh_marca+" "+vehiculos[x].Veh_modelo+" $"+Formatodecimal(vehiculos[x].Veh_precio);
            }
            
          }
          System.out.println(cadena);  
    }
    //----------------------------------------------------------------------------------
    //Imprime de mayor a menor 

    public void Ordenar(Vehiculo[] vehiculos){
        for(int i=vehiculos.length-1;i>=0;i--){
          
            System.out.println(vehiculos[i].Veh_marca+" "+vehiculos[i].Veh_modelo);
          }
    }
    //----------------------------------------------------------------------------------
  
}