package corona.virus.model;

import corona.virus.VirusApplication;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
//actua como base de datos
public class coronaVirusModel implements interfaceCoronaVirusModel {

  public  void insertar(String dept, int cc,  int cs){
      System.out.println("Datos insertados"+ dept + cc + cs);
  }

    @Override
    public void leer() {
    }

    @Override
    public void mostrar() {
        System.out.println("mostrar");

    }

}

