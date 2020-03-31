package HITO_2.Examen_Hito_2;

public class persona extends  cuidadano {
    public String etapaCrecimiento;

    public  persona(){ super();};

    cuidadano c = new cuidadano();


    public void leer(){
        c.leer();
        System.out.println("ingresar etapa de crecimiento : ");
        etapaCrecimiento = LEER.next();

    }
    public  void mostrar(){
      c.mostrar();
        System.out.println("la etapa crecimiento  : " + this.etapaCrecimiento);

    }

}
