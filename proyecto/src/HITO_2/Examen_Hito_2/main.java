package HITO_2.Examen_Hito_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        persona per = new persona();

        policia p = new policia();
//        p.turno = "";
//        p.apellido = "";
        p.leer();
        p.mostrar();

        profesor pro = new profesor();
//      pro.cargaH= 4;
//      pro.ciudad= "";
        pro.leer();
        pro.mostrar();

        policia poli = new policia();
        poli.leer();
        poli.mostrar();
         comprobar(pro.ciudad,poli.destinos);


    }
//    Scanner leer2 = new Scanner(System.in);
//    public void iguales() {
//            String [] materias= new String [5];
//            String palabra;
//            int conta = 0;
//            System.out.println("ingrese una palabra: ");
//
//            while (materias.hasNext())    //  while (conta <5)
//            {
//                palabra = leer2.nextLine();
//
//                if (palabra.length() >= 10) {
//                    conta++;
//                    System.out.println("cadena encontrada");
//                    break;
//
//                }
//
//
//
//            }
//
//
//
//        }
       public static  void comprobar (String ciudad, String [] destino){
        for(int i=0;i<destino.length;i++){
            if(ciudad==destino[i]){
                System.out.println("¨Coinciden");
             }
           }
            }


    }

