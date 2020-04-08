package HITO_2.Examen_Hito_2;

public class profesor extends  persona {
    public int cargaH;
    public String ciudad;
    public int nroMaterias;
    public String[] Materias;

    public profesor() { super(); }


    public void leer() {
        super.leer();
        System.out.println("ingresar carga horaria: ");
        cargaH = LEER.nextInt();
        System.out.println("ingresar ciudad: ");
        ciudad = LEER.next();
        System.out.println("ingresar numero de materias: ");
        nroMaterias = LEER.nextInt();
        Materias = new String[nroMaterias];
        System.out.println("ingresar solo "+nroMaterias+" materias");
        System.out.println("ingresa la materia: ");
        for (int i= 0; i < nroMaterias; i++) {
            Materias[i] = LEER.next();
            System.out.println("ingresa la siguiente materia:  ");
        }
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("carga horaria: " + this.cargaH);
        System.out.println("cuidad: " + this.ciudad);
        System.out.println("num materias: " + this.nroMaterias);
        System.out.println("materias asignadas:  "+ this.Materias.length);

        for (int i = 0; i < this.nroMaterias; i++) {
            System.out.println("la materia: ");
            System.out.println(this.Materias[i]);
        }


    }
}
