package EJERCICIO3_DEFENSA_HITO2;

public class gerente extends  empleado {
    public  int bono;
    public  int sueldo;
    public  int antiguedad;

    empleado e = new empleado();



//
//    public gerente(String primernombre, String apellido, int ciNumero, String ciExtencion) {
//        super(primernombre, apellido, ciNumero, ciExtencion);
//        this.bono = bono;
//        this.sueldo = sueldo;
//        this.antiguedad = antiguedad;
//    }

    public  gerente(){ super();};
    public  void leer(){
        //empleado e = new empleado();
        e.leer();
        System.out.println("ingresar el bono: ");
         bono= LEER.nextInt();
        System.out.println("ingresar sueldo: ");
        sueldo = LEER.nextInt();
        System.out.println("ingresar la antiguedad : ");
        antiguedad = LEER.nextInt();


    }
    public  void mostrar(){

        e.mostrar();

        System.out.println("bono: " + this.bono);
        System.out.println("sueldo: " + this.sueldo);
        System.out.println("antiguedad: " + this.sueldo);


    }



}
