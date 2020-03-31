package HITO_2.calculadora;

public class main {
    public  static  void main(String []args){

   calculadora calc = new calculadora();
     calc.imprimir("la suma es: ", calc.suma(5 ,5 ));
     calc.imprimir("la resta es: ", calc.resta(15, 5));
     calc.imprimir("la multiplicacion es: ", calc.multiplicacion(2, 5 ));
     calc.imprimir("la division es: ", calc.division(21, 2 ));
    }
}
