package introduccion;
 import java.util.Scanner;

public class persona {
    public static void main(String[] args)   {

        Scanner leer =new Scanner(System.in);
  //leer cadenas
     System.out.println("ingrese su nombre");
        String n1nombre = leer.nextLine();
       System.out.println("ingrese su apellido ");
        String n1apellido = leer.nextLine();
        System.out.printf("su nombre completo es: %s %s ", n1nombre, n1apellido);System.out.println();


        System.out.println("ingrese su edad: ");
        int  miedad =  leer.nextInt();
       System.out.printf("su edada es: %d", miedad);


        System.out.println("ingrese su edad");
        while (leer.hasNextInt())
      {
          int edad2 = leer.nextInt();
           System.out.println("su edad es: "+ edad2);
            System.out.println("ingreses su edad");
      }
      // -----sumar las primeras 5 edades----

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
