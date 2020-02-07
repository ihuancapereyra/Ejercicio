package app;
public class Vehiculo extends Concesionaria {
    

    public void datos(String marca, String modelo, String puertas_o_cilindrada, double precio) {   
    Veh_marca=marca;
    Veh_modelo=modelo;
    Veh_puerta_o_cilindrada=puertas_o_cilindrada;
    Veh_precio=precio;
    }


    public int getPrecio(){
        int transformar=(int)Veh_precio;
        return transformar;
    }


    public void consola (){

        Cuentas decimal= new Cuentas();
        if(Veh_puerta_o_cilindrada.indexOf('c')>0){
            System.out.println("Marca: "+Veh_marca+" // Modelo: "+Veh_modelo+" // Cilindrada: "+Veh_puerta_o_cilindrada+" // Precio: $"+decimal.Formatodecimal(Veh_precio));

        }
        else{
            System.out.println("Marca: "+Veh_marca+" // Modelo: "+Veh_modelo+" // Puertas: "+Veh_puerta_o_cilindrada+" // Precio: $"+decimal.Formatodecimal(Veh_precio));

        }
    }
}