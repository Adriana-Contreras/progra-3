package EJERCICIO3_DEFENSA_HITO2;

public class secretaria extends  oficinista{
    public  String nombreArea;


    oficinista o = new oficinista();

    //    public secretaria(String primernombre, String apellido, int ciNumero, String ciExtencion) {
//        super(primernombre, apellido, ciNumero, ciExtencion);
//        this.nombreArea = nombreArea;
//    }

   public  secretaria(){ super();};


    public  void leer(){
        o.leer();
        System.out.println("ingresar el nombre del area : ");
        nombreArea = LEER.next();


    }
    public  void mostrar(){


         o.mostrar();
        System.out.println("nombre area: " + this.nombreArea);

    }
}
