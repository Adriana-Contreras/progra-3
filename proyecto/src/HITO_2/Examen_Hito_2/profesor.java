package HITO_2.Examen_Hito_2;

public class profesor extends  persona{
    public int cargaH;
    public String ciudad;
    public int nroMaterias;
    public String  Materias[];

    persona p = new persona();


    public  profesor(){ super();};


    public void leer(){
        System.out.println("ingresar carga horaria : ");
        cargaH= LEER.nextInt();
        System.out.println("ingresar ciudad: ");
        ciudad = LEER.next();
        System.out.println("ingresar numero de materias  : ");
        nroMaterias = LEER.nextInt();
        System.out.println("ingresar el destino : ");
        for(int i=0;i<nroMaterias;i++)
        {

            Materias[i]=LEER.next();
        }
    }
    public  void mostrar(){
        p.mostrar();
        System.out.println("turno : " + this.cargaH);
        System.out.println("cuidada : " + this.ciudad);
        System.out.println("num materias : " + this.nroMaterias);
//        for (int i = 0; i < this.nroMaterias.length; i++) {
//            System.out.println(this.Materias[1]);

    }


}
