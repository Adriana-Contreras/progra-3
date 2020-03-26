package herenciaVehiculos;

public class trufi extends  vehiculos {
    public trufi(String placa, int numruedas, int numasientos) {
        super(placa, numruedas, numasientos);// hace herencia de atributos de la clase persona

    }
    public  void imprimirtrufi(){ System.out.println(getplaca());
    }
}
