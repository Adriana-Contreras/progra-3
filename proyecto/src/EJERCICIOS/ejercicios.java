package EJERCICIOS;

import java.util.Scanner;

public class ejercicios {
    Scanner leer = new Scanner(System.in);

    public void Fibonacci() {

        int numero, fi1, fi2, i;
        do {
            System.out.print("Introduce numero mayor que 1: ");
            numero = leer.nextInt();
        } while (numero <= 1);
        System.out.println("Los " + numero + " primeros nmeros de la serie son: ");

        fi1 = 0;
        fi2 = 1;


        for (i = 1; i <= numero; i++) {
            System.out.print(fi1);
            fi2 = fi1 + fi2;
            fi1 = fi2 - fi1;


            System.out.println();
        }
    }

    //-----------------------------------------------
    Scanner leer2 = new Scanner(System.in);

    public void cadenas() {


        String palabra;
        int conta = 0;
        System.out.println("ingrese una palabra: ");
        while (leer2.hasNext())    //  while (conta <5)
        {
            palabra = leer2.nextLine();

            if (palabra.length() >= 10) {
                conta++;
                System.out.println("cadena encontrada");
                break;

            }


        }
    }

    //--------------------------
    Scanner leer3 = new Scanner(System.in);

    public void array() {
        int pares = 0;
        int[] num = new int[10];

        System.out.println("Los elementos del array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            num[i] = leer3.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (   num[i] %2 == 0) {
                int contarpares =+ num[i];
                pares++;
                if (pares != 0) {
                    System.out.println(" los valores  pares  son : " + contarpares );
                } else {
                    System.out.println("No ha introducido numeros positivos");
                }
            }


        }
    }
}