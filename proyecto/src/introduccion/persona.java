package introduccion;
 import java.util.Scanner;

public class persona {
    public static void main(String[] args)   {

        Scanner leer =new Scanner(System.in);
  //leer cadenas
  //      System.out.println("ingrese su nombre");
//        String n1nombre = leer.nextLine();
//        System.out.println("ingrese su apellido ");
//        String n1apellido = leer.nextLine();
//
//        System.out.printf("su nombre completo es: %s %s ", n1nombre, n1apellido);System.out.println();
//

//        System.out.println("ingrese su edad: ");
//        int  miedad =  leer.nextInt();
//        System.out.printf("su edada es: %d", miedad);

//
//        System.out.println("ingrese su edad");
//        while (leer.hasNextInt())
//        {
//            int edad2 = leer.nextInt();
//            System.out.println("su edad es: "+ edad2);
//            System.out.println("ingreses su edad");
//        }
//       // -----sumar las primeras 5 edades----

//        System.out.println("ingrese la primera edad: ");
//        int  edad1 =  leer.nextInt();
//        System.out.println("ingrese la segunda edad: ");
//        int  edad2 =  leer.nextInt();
//        System.out.println("ingrese la tercera edad: ");
//        int  edad3 =  leer.nextInt();
//        System.out.println("ingrese la cuarta  edad: ");
//        int  edad4 =  leer.nextInt();
//        System.out.println("ingrese  la quinta  edad: ");
//        int  edad5 =  leer.nextInt();
//        int total = edad1 +  edad2 + edad3 + edad4 + edad5;
//        System.out.printf("el total de edades  es: %d", total);

//------------------------------------------------------------------------
        int total =0;
        int prom =0;
        int conta =0;
        System.out.println("ingrese su edad");
      while (leer.hasNextInt())   //  while (conta <5)
        {
            int edad = leer.nextInt();
            total = edad + total;

            System.out.println("ingrese su edad");
            conta++;
      }
        prom = total / conta ;
        System.out.printf("el total de edades  es: %d", total);
        System.out.printf("el promedio de edades  es: %d", prom);



    }
}
