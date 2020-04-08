package HITO_2.Procesual_Hito_2;

public class policia extends  persona{

    public  String turno;
    public  int nroDestinos;
    public  String[] destinos;

    public  policia(){ super();}


    public void leer(){
        super.leer();
        System.out.println("ingresar el turno: ");
        turno = LEER.next();
        System.out.println("ingresar numero de destinos: ");
        nroDestinos = LEER.nextInt();

        destinos=new String[nroDestinos];
        System.out.println("ingresar solo "+nroDestinos+" destinos");
        for(int i=0;i<nroDestinos;i++)
        {
            destinos[i]=LEER.next();
            System.out.println("ingresar destino: ");
        }

    }

    public  void mostrar(){
        super.mostrar();
        System.out.println("turno: " + this.turno);
        System.out.println("numero de destinos:  " + this.nroDestinos);
        System.out.println("destino: " + this.destinos.length);
        for (int i = 0; i < this.nroDestinos; i++) {
            System.out.println(this.destinos[i]);
        }

    }

}
