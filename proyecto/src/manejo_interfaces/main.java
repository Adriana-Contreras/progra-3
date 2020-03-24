package manejo_interfaces;

import transporte.auto;

public class main {
    public static void main(String[] args) {

        cuadrado cu = new cuadrado(5);
        System.out.println("el area del cuadrado es: "+ cu.area());

        circulo  c = new circulo(5);
        System.out.println("el diametro es: "+ c.area());


        rectangulo  r = new rectangulo(5,10);
        System.out.println("el area del rectangulo es: "+ r.area());


    }
}
