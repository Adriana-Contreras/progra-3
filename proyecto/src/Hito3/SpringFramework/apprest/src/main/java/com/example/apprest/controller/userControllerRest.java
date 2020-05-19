package com.example.apprest.controller;


import com.example.apprest.model.personaModel;
import com.example.apprest.service.PersonaService;
import com.example.apprest.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")

public class userControllerRest {
    @Autowired
    private userService userservice;


    @Autowired
    private PersonaService personaService;////

    private final String NAME_APP = "adrii solutions";


    @GetMapping("/nameapp")
    public  String nameapp(){
        return NAME_APP;
    }

    @GetMapping("/saludo")
    public  String saludo(@RequestParam(value = "name", defaultValue = "world")String name){
        return userservice.getName(name);
    }
    //crear personas
    @PostMapping("/persons")
    public ResponseEntity save(@RequestBody personaModel persona){

        try {
            return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }

    }
    //eliminar persona
    @DeleteMapping("/persons/{idPer}")
    public ResponseEntity<String> delete(@PathVariable("idPer") Integer idPer) {
        try {
            personaService.delete(idPer);
            return new ResponseEntity<>("person successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }
    //editar persona
    //completar



    //leer datos de persona, consultar datos, todos los datos
    @GetMapping("/persons")
    public ResponseEntity<List<personaModel>> getAllPersons() {
        try {
            List<personaModel> persons = personaService.getAllPersons();

            if (persons.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(persons, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //leer datos de persona especifica
    @GetMapping("/persons/{idPer}")
    public ResponseEntity<personaModel> getPersonByIdPer(@PathVariable("idPer") Integer idPer) {
        try {
            personaModel pModel = personaService.getPersonByIdPer(idPer);

            if (pModel != null) {
                return new ResponseEntity<>(pModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //editar materias
    @PutMapping("/materias/{idmat}")
    public ResponseEntity<personaModel> updateMaterias(@PathVariable("idPer") Integer idPer, @RequestBody personaModel pModel) {
        try {
            personaModel pUpdate = personaService.update(pModel, idPer);
            if (pUpdate != null) {
                return new ResponseEntity<>(pUpdate, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}









