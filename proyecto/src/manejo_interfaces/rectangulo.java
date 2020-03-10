package manejo_interfaces;

public class rectangulo {
     private float lado;
     private float altura;

      public  double area(){

          double resp1;
          resp1 =  lado * altura;
          return resp1;
      }

    public rectangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }
}
