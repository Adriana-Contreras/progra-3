package com.example.casos_corona_virus.controller;


import com.example.casos_corona_virus.model.CoronaVirusModel;
import com.example.casos_corona_virus.service.CoronaService;
import com.example.casos_corona_virus.service.UserCoronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
public class userControllerRest {

    @Autowired
    private UserCoronaService usercoronaservice;
    @Autowired
    private CoronaService coronaservice;

    private final String NAME_APP = "Corona Virus Solutions";



    @GetMapping("/nameApp")
    public String nameApp() {
        return NAME_APP;
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam(value = "name", defaultValue = "World") String name) {
        return usercoronaservice.getName(name);
    }
    //crear registros de corona virus
    @PostMapping("/registroCoronaVirus")
    public ResponseEntity save(@RequestBody CoronaVirusModel persona) {
        try {
            return new ResponseEntity<>(coronaservice.save(persona), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    //eliminar registro
    @DeleteMapping("/registroCoronaVirus/deleteCV/{idCorona}")
    public ResponseEntity<String> delete(@PathVariable("idCorona") Integer idPer) {
        try {
            coronaservice.delete(idPer);
            return new ResponseEntity<>("info successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
    //editar registro
    @PutMapping("/registroCoronaVirus/{idCorona}")
    public ResponseEntity<CoronaVirusModel> updateMaterias(@PathVariable("idCorona") Integer idPer, @RequestBody CoronaVirusModel pModel) {
        try {
           CoronaVirusModel pUpdate = coronaservice.update(pModel, idPer);///
            if (pUpdate != null) {
                return new ResponseEntity<>(pUpdate, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
    //leer todoos  los registros o mostrar
    @GetMapping("/registroCoronaVirus")
    public ResponseEntity<List<CoronaVirusModel>> getAllPersons() {
        try {
            List<CoronaVirusModel> registroCoronaVirus =  coronaservice.getAllPersons();

            if (registroCoronaVirus.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(registroCoronaVirus, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    // leer un registro especifico

    @GetMapping("/registroCoronaVirus/getOne/{idCorona}")
    public ResponseEntity<CoronaVirusModel> getPersonByIdPer(@PathVariable("idCorona") Integer idCorona) {
        try {
             CoronaVirusModel pModel = coronaservice.getPersonByIdPer(idCorona);

            if (pModel != null) {
                return new ResponseEntity<>(pModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
