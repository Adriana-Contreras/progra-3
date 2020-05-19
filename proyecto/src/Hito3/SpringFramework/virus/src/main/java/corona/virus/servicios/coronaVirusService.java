package corona.virus.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import corona.virus.model.coronaVirusModel;

import java.util.Scanner;

@Service
public class coronaVirusService implements interfaceCoronaVirusService{

    public String nombreDepartamento;
    public int casosConfirmados;
    public int casosSospechosos;
   @Autowired
   private coronaVirusModel coronaVirusModel;


    @Override
    public void leer() {


            System.out.println("ingresar nombre departamento: ");
            this.nombreDepartamento =LEER.next();

            System.out.println("ingresar casos confirmados: ");
            this.casosConfirmados =LEER.nextInt();
            System.out.println("ingrese casos sospechosos: ");
            this.casosSospechosos = LEER.nextInt();

//            coronaVirusModel.LEER(
//                    this.nombreDepartamento,
//                    this.casosConfirmados,
//                    this.casosSospechosos);



    }

            @Override
            public void mostrar() {
                System.out.println("nombre departamentos: " + this.nombreDepartamento +
                        "CConfirmados"+ this.casosConfirmados + "CSoospechosos"+ this.casosSospechosos);


            }
//            public calcularMayor(coronaVirusService coronaService){
//
//            }





}
