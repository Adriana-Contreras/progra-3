package HITO_2.herenciaVehiculos;

public class vehiculos {
    public String placa;
    public int numruedas;
    public int numasientos;

    public vehiculos(String placa, int numruedas, int numasientos) {
        this.placa = placa;
        this.numruedas = numruedas;
        this.numasientos = numasientos;

    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public String getplaca(){
        return this.placa;
    }

}

