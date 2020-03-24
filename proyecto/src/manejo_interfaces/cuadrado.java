package manejo_interfaces;

    public class cuadrado implements figura {
    private float lado;



    public cuadrado( float lado) {  //constructor
        this.lado = lado;
    }

    public double area(){

         double respuesta = lado * lado;
         return respuesta;

    }





}
