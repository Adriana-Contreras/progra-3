package empresa;



public class Area {
    private String nombre;
    private  Empleado[] empleados; //para tener muchis empleados

     public  Area(String nombre1, Empleado[] empleados1){
         this.nombre = nombre1;
         this.empleados = empleados1;

     }

    public void setEmpleados(Empleado[] empleados) {

         this.empleados = empleados;
    }
    public Empleado[] getEmpleados(){
         return  this.empleados;
    }
     public  void  imprimir(){
         System.out.println("nombre de empleado" + this.nombre);
         for(int i=0; i < this.empleados.length; i++){ //memorizar estte array para imprimir
             this.empleados[1].imprimir();
         }
     }
}
