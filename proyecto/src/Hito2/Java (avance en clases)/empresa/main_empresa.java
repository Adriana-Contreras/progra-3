package HITO_2.empresa;

import java.util.Scanner;

public class main_empresa {
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero de empleados ");
        int n= leer.nextInt();

        Empleado[] empleadoRRHH = new Empleado[n];

        for(int i=0; i<n ; i++){
            System.out.println("ingrese nombre del empleado ");
             String nombre = leer.next();

            System.out.println("ingrese ci del empleado ");
            String ci = leer.next();

            System.out.println("ingrese la edad del empleado");
            int edad = leer.nextInt();

          Empleado emp1 = new Empleado(nombre, ci, edad);
            empleadoRRHH[i] = emp1;

            // hacer lo mismo con las otras areas

           // System.out.println("ingrese el nombre del area");
             //String s = leer.next();
            // Empleado[] empleadosarea = new Empleado[s]

        }


       // Empleado emp1 = new Empleado("emp1 ", " ci1  ", 20);
        //Empleado emp2 = new Empleado("emp2 ", " ci2  ", 23);
        //emp1.imprimir();


      // Empleado[] empleadoRRHH = new Empleado[2];
      //  empleadoRRHH[0] =emp1;
       // empleadoRRHH[1] = emp2;


        //Area  area1 = new Area("RRHH", empleadoRRHH);
        //------------------------------------
       // Area[] areas = new Area[1];




        //  Area[]  tiposareas = new Area[1];
         //tiposareas[0] = area1;
        // Empresa  HITO_2.empresa = new Empresa("FIRULAIS", tiposareas);
         // HITO_2.empresa.imprimir();


         Scanner leer2 = new Scanner(System.in);
        System.out.println("ingrese el numero  de areas que desea registrar ");
        int  a  = leer2.nextInt();
        Area[] Areas = new Area[a];

        for(int i=0; i<a; i++)
        {
            System.out.println("ingrese el nombre del area");
            String nombreArea = leer2.next();

            System.out.println("Ingrese el nombre del empleado ");
            String nombreEmpleado = leer2.next();





        }





    }
}