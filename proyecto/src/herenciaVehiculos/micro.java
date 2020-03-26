package herenciaVehiculos;

public class micro extends  vehiculos {
    public micro(String placa, int numruedas, int numasientos) {
        super(placa, numruedas, numasientos);// hace herencia de atributos de la clase persona

    }
    public  void imprimirmicro(){ System.out.println(getplaca());
    }
}
