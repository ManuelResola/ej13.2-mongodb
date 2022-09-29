package com.formacion.ej13.mongodb.infraestructure.controller;


import com.formacion.ej13.mongodb.aplication.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonDeleteController {

    @Autowired
    PersonService personServiceImp;

    @DeleteMapping("person/{id}")
    public String deletePerson(@PathVariable String id) throws Exception {
        return personServiceImp.deletePerson(id);
    }
}
