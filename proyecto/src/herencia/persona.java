package herencia;

public class persona {
    public String nombres;
    public String apellidos;
    public int edad;
    public String CI;

    public persona(String nombres, String apellidos, int edad, String CI ){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.CI = CI;

    }
    public void setCI(String ci){
        this.CI = ci;
    }

   // public void ci(){
    //    System.out.printf("el ci es: %s", this.getCI());
    //}

    public  String getCI(){
        return  this.CI;
    }
}
