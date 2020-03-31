package HITO_2.Examen_Hito_2;

import empresa.Empleado;

public class policia extends  persona{

    public  String turno;
    public  int nroDestinos;
    public  String destinos[];

    persona p = new persona();

    public  policia(){ super();};





    public void leer(){
        p.leer();
        System.out.println("ingresar el turno : ");
        turno = LEER.next();
        System.out.println("ingresar numero de destinos: ");
        nroDestinos = LEER.nextInt();
        destinos=new String[nroDestinos];
        System.out.println("ingresar el destino : ");
        for(int i=0;i<nroDestinos;i++)
        {

            destinos[i]=LEER.next();
        }

    }
//    public destinos [] getdestinos(){
//        return  this.destinos;
//}
    public  void mostrar(){
          p.mostrar();
        System.out.println("turno : " + this.turno);
        System.out.println("numero de destinos  : " + this.nroDestinos);
        System.out.println("destino: " + this.destinos);
        for (int i = 0; i < this.destinos.length; i++) {
            System.out.println(this.destinos[1]);
        }

    }

}
