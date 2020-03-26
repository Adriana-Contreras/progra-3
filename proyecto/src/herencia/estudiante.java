package herencia;

public class estudiante extends persona {
    private String carrera;

    public estudiante(String carrera, String nombres , String apellidos, int edad, String CI) {
        super(nombres, apellidos, edad, CI);// hace herencia de atributos de la clase persona

    }
    public  void imprimirEstudiante(){
        System.out.println(getCI());
    }
}
