package HITO_2.Tarea_final_hito2.EJERCICIO3_DEFENSA_HITO2;

public class oficinista extends  empleado{
    public  String codArea;
    public  int sueldoBasico;
    empleado e = new empleado();


//    public oficinista(String primernombre, String apellido, int ciNumero, String ciExtencion) {
//        super(primernombre, apellido, ciNumero, ciExtencion);// hace HITO_2.herencia de atributos de la clase persona
//        this.codArea = codArea;
//        this.sueldoBasico = sueldoBasico;
//
//    }

    public  oficinista(){ super();};


    public  void leer(){
        e.leer();
        System.out.println("ingresar el codigo de area: ");
        codArea = LEER.next();
        System.out.println("ingresar el sueldo basico: ");
        sueldoBasico = LEER.nextInt();

    }
    public  void mostrar(){
        e.mostrar();
        System.out.println("codigo de area: " + this.codArea);
        System.out.println("sueldo basico : " + this.sueldoBasico);
    }
}
