package EJERCICIO3_DEFENSA_HITO2;

public class supervisor extends  empleado{
    public  int sueldo;
    public  int antiguedad;
    empleado e = new empleado();


    //    public supervisor(String primernombre, String apellido, int ciNumero, String ciExtencion) {
//        super(primernombre, apellido, ciNumero, ciExtencion);
//        this.sueldo = sueldo;
//        this.antiguedad = antiguedad;
//    }
   public  supervisor(){ super();};


    public  void leer(){
        e.leer();
        System.out.println("ingresar el sueldo : ");
        sueldo= LEER.nextInt();
        System.out.println("ingresar la antiguedad: ");
        antiguedad = LEER.nextInt();


    }
    public void mostrar(){
        e.mostrar();
        System.out.println("sueldo: " + this.sueldo);
        System.out.println("antiguedad: " + this.sueldo);


    }

}
