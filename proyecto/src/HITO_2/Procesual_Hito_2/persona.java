package HITO_2.Procesual_Hito_2;

public class persona extends  cuidadano {
    public String etapaCrecimiento;

    public  persona(){super(); }

    public void leer(){
        super.leer();
        System.out.println("ingresar etapa de crecimiento : ");
        etapaCrecimiento = LEER.next();
    }
    public  void mostrar(){
      super.mostrar();
        System.out.println("la etapa crecimiento:  " + this.etapaCrecimiento);

    }

}
