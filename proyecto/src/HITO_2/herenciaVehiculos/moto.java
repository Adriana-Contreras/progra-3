package HITO_2.herenciaVehiculos;

public class moto extends vehiculos {
    public moto(String placa, int numruedas, int numasientos) {
        super(placa, numruedas, numasientos);// hace herencia de atributos de la clase persona

    }
    public  void imprimirmoto(){ System.out.println(getplaca());
    }
}
