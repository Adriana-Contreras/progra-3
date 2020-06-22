package HITO_2.Tarea_final_hito2.EJERCICIO3_DEFENSA_HITO2;

public class empleado implements LeerInterfaz {
   public String primernombre;
   public String apellido;
   public int ciNumero;
   public String ciExtencion;


  public  empleado(){ super();};

    public void leer(){
        System.out.println("ingresar primer nombre: ");
        primernombre = LEER.next();
        System.out.println("ingresar apellido: ");
        apellido = LEER.next();
        System.out.println("ingresar el ci : ");
        ciNumero = LEER.nextInt();
        System.out.println("ingresar la extension del ci: ");
        ciExtencion = LEER.next();
    }
    public  void mostrar(){

        System.out.println("primer nombre : " + this.primernombre);
        System.out.println("apellido : " + this.apellido);
        System.out.println("numero de ci: " + this.ciNumero);
        System.out.println("extension de ci: " + this.ciExtencion);

    }
}
