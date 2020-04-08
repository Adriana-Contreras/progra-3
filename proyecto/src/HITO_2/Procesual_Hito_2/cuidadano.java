package HITO_2.Procesual_Hito_2;

public class cuidadano implements leerInterfaz{
    public String primerNombre;
    public String apellido;
    public int ciNumero;
    public String ciExtencion;
    public  int edad;


    public  cuidadano(){ super();}

    public void leer(){
        System.out.println("ingresar primer nombre: ");
        primerNombre = LEER.next();
        System.out.println("ingresar apellido: ");
        apellido = LEER.next();
        System.out.println("ingresar el ci : ");
        ciNumero = LEER.nextInt();
        System.out.println("ingresar la extension del ci: ");
        ciExtencion = LEER.next();
        System.out.println("ingresar la edad:  ");
        edad = LEER.nextInt();

    }
    public  void mostrar(){
        System.out.println("primer nombre : " + this.primerNombre);
        System.out.println("apellido : " + this.apellido);
        System.out.println("numero de ci: " + this.ciNumero);
        System.out.println("extension de ci: " + this.ciExtencion);
        System.out.println("la edad: " + this.edad);
    }
}
