package HITO_2.introduccion;


import java.util.Scanner;

public class Ejercicios {
    public Scanner leer;

    public Ejercicios() {
        leer = new Scanner(System.in);

    }


    public void seriesaturales(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public void compara2cadenas(String cad1, String cad2) {
        if (cad1.equals(cad2)) {
            System.out.println("cadenas iguales");
        } else {
            System.out.println("no son cadenas iguales");
        }
    }


    public void generarserie1(int limite) {

            for (int i = 0; i < limite; i++) {
              if(1%2== 0){
                  System.out.printf("%d ", i+2);

            }else {
                  System.out.printf(" %d",i);
              }

        }

        }

    }