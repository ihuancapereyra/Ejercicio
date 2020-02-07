package app;
import java.util.Arrays;


public class Main {


    public static void main(String[] args){


        
        Vehiculo vehiculo1=new Vehiculo();
        Vehiculo vehiculo2= new Vehiculo();
        Vehiculo vehiculo3=new Vehiculo();
        Vehiculo vehiculo4= new Vehiculo();
        vehiculo1.datos("Peugeot","206","4",200000.00);
        vehiculo2.datos("Honda", "Titan", "125c",60000.00);
        vehiculo3.datos("Peugeot", "208", "5", 250000.00);
        vehiculo4.datos("Yamaha", "YBR", "160c", 80500.50);

        Vehiculo[] vehiculos={vehiculo1,vehiculo2,vehiculo3,vehiculo4};
        //CArga DAtos a imprimir
        for(int z=0;z<vehiculos.length;z++){
          vehiculos[z].consola();
        }

        // Ordena de menor a mayor el Array
        Arrays.sort(vehiculos,new Com_precio());


        Cuentas micuenta= new Cuentas();
        
        System.out.println("==============================================================");
        micuenta.Mascaro_masbarato(vehiculos);
        System.out.println("==============================================================");



        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        micuenta.Ordenar(vehiculos);
        
      }
        
    }

