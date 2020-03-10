package manejo_interfaces;

public class circulo implements figura {
    private double diametro;

    public circulo( double diametro) {
        this.diametro = diametro;
    }

    public double area(){

        double resp = PI * ((diametro /2 ) * ( diametro /2 ));
        return  resp;

    }



}
