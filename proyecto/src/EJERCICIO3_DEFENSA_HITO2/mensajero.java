package EJERCICIO3_DEFENSA_HITO2;

public class mensajero extends  oficinista {
    public String turno;

    oficinista o = new oficinista();


    public  mensajero(){ super();};


    public  void leer(){
        o.leer();

        System.out.println("ingresar el turno: ");
        turno = LEER.next();


    }
    public  void mostrar(){
        o.mostrar();
        System.out.println("turno" + this.turno);


    }
}
