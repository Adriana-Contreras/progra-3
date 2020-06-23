package HITO_2.empresa;

public class Empresa {

    private String nombre;
    Area[] areas;

    public Empresa(String nombre1, Area[] areas1) {
        this.nombre = nombre1;
        this.areas = areas1;

    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
    }

    public Area[] getAreas() {
        return areas;
    }

    public void imprimir() {
        System.out.println("nombre del area" + this.nombre);
        for (int i = 0; i < this.areas.length; i++) { //memorizar estte array para imprimir
            this.areas[1].imprimir();
        }
    }
}