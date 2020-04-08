package HITO_2.empresa;

public class Empleado {
    private String nombre;
    private String ci;
    private int edad;

    public Empleado( String nombre1, String ci1, int edad1 ){
        this.nombre = nombre1;
        this.ci = ci1;
        this.edad = edad1;


    }
    public void setNombre(String newname ){
        this.nombre= newname;

    }
    public String getNombre(){
        return this.nombre;
    }

    public  void imprimir()
    {
        System.out.println("nombre empleado: "+this.nombre);
        System.out.println("ci empleado" + this.ci);
        System.out.println("edad empleado" + this.edad);

    }
}
