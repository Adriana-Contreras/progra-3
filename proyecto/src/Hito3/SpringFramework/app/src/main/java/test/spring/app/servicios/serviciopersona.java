package test.spring.app.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.spring.app.model.modelpersona;
@Service


public class serviciopersona implements interserpersona {
    @Autowired
    private modelpersona mpersona;

    public void Insertar(String nombre) {
       // mpersona = new modelpersona();
       mpersona.Insertar(nombre);
    }
}
