package test.spring.app.model;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public class modelpersona implements interfpersonamodel {
    @Override
    public void Insertar(String nombre) {
        System.out.println("nombre insertado "+ nombre);
    }

}

