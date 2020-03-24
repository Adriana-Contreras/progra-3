package calculadora;

public class calculadora implements  suma, resta, multiplicacion, division {

    public  int suma (int a, int b ){
        return  a + b;
    }
    public  int resta (int a, int b ){
        return  a - b;
    }
    public  int multiplicacion (int a, int b ){
        return  a * b ;
    }
    public  int division(int a, int b){
        return  (a/b) ;
    }
    public void imprimir(String msg, int valor  ){
        System.out.printf("%s %d %s",msg, valor,"\n");

    }
}
