package transporte;



public class bicicleta implements vehiculo {

    private int numeroderuedaas;
    private String color;

    public  void color(){
        System.out.printf("el color de la bicicleta es: %s", this.getColor());
    }
    public  void numeroderuedas(){
        System.out.printf("La bicicleta  tiene : %d", this.getNumeroderuedaas());
    }


    public int getNumeroderuedaas() {
        return numeroderuedaas;
    }

    public String getColor() {
        return color;
    }

    public void setNumeroderuedaas(int numeroderuedaas) {
        this.numeroderuedaas = numeroderuedaas;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
