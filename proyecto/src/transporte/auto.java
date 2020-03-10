package transporte;
import empresa.Area;

public class auto implements vehiculo {

    private int numeroderuedas;
    private String  color;



   public  void numeroderuedas(){
       System.out.printf("el auto tiene : %d", this.getNumeroderuedas() );
   }
   public  void color(){
       System.out.printf("el color del auto es: %s", this.getColor());
   }

    public void setNumeroderuedas(int numeroderuedas) {

       this.numeroderuedas = numeroderuedas;
    }



    public int getNumeroderuedas() {
        return this.numeroderuedas;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }
}
