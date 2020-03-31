package HITO_2.introduccion;
 import java.util.Scanner;

public class persona {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        //leer cadenas
//        System.out.println("ingrese su nombre");
//        String n1nombre = leer.nextLine();
//        System.out.println("ingrese su apellido ");
//        String n1apellido = leer.nextLine();
//        System.out.printf("su nombre completo es: %s %s ", n1nombre, n1apellido);
//        System.out.println();


//        System.out.println("ingrese su edad: ");
//        int miedad = leer.nextInt();
//        System.out.printf("su edada es: %d", miedad);


//        System.out.println("ingrese su edad");
//        while (leer.hasNextInt()) {
//            int edad2 = leer.nextInt();
//            System.out.println("su edad es: " + edad2);
//            System.out.println("ingreses su edad");
//        }
        // -----sumar las primeras 5 edades----

//------------------------------------------------------------------------
//        int total = 0;
//        int prom = 0;
//        int conta = 0;
//        System.out.println("ingrese su edad");
//        while (leer.hasNextInt())   //  while (conta <5)
//        {
//            int edad = leer.nextInt();
//            total = edad + total;
//
//            System.out.println("ingrese su edad");
//            conta++;
//        }
//        prom = total / conta;
//        System.out.printf("el total de edades  es: %d", total);
//        System.out.printf("el promedio de edades  es: %d", prom);
//

      //----------------------------------------

//        int num1 = 21;
//        if (num1 % 2 == 0) {
//            System.out.printf(" el numero %d es igual ", num1);
//
//        } else {
//            System.out.printf("el numero  %d es impar ", num1);
//        }
//
//
//        String name = "progra3";
//        if (name.equals("progra3")) {
//            System.out.printf("las cadenas  %s son iguales", name);
//
//       }else {
//            System.out.printf("las cadenas  %s son distintas", name );
//        }
//
//          for(int i=0; i<= 10; i++){
//          System.out.println(i);
//           }
//--------------------------------------
// manejo de if
// llamar al scanner en este caso es "leer"

        System.out.println("ingrese su numero: ");

        while (leer.hasNextInt()) {
      int credit_number = leer.nextInt();
      if (credit_number > 50000) {
          System.out.printf(" el numero %d es platinium \n ", credit_number);

      } else if (credit_number >= 10000 && credit_number <= 50000) {
          System.out.printf("el numero  %d es gold \n  ", credit_number);
      } else if (credit_number < 10000) {
          System.out.printf("el numero  %d es  silver \n  ", credit_number);
      }


  }
}
    }

//-------------------------------------------------------------



