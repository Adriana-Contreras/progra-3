package HITO_2.Examen_Hito_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        profesor pro = new profesor();
        pro.leer();
        pro.mostrar();
        profesor pro1 = new profesor();
        pro1.leer();
        pro1.mostrar();

       verificar(pro.Materias,pro1.Materias);


        policia poli = new policia();
        policia poli2 = new policia();
        poli.leer();
        poli.mostrar();
        poli2.leer();
        poli2.mostrar();

       comprobar(pro.ciudad,poli2.destinos);


    }

       public static  void comprobar (String ciudad, String[] destino){
        for(int i=0;i<destino.length;i++){
            if(ciudad==destino[i]){   //ciudad.equals compara si dos cadenas son iguales
                System.out.println("Coinciden");
             }else{
                System.out.println("no coinciden");
            }
           }
            }

            public  static  void verificar (String[] Materias1, String[] Materias2) {
                    for (int i = 0; i <Materias1.length; i++) {
                        if (Materias1.equals(Materias2)) {
                            System.out.println("tienen la misma materia");
                        } else {
                            System.out.println("no tienen la misma materia ");
                        }
                    }
            }
    }

