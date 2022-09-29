package com.formacion.ej13.mongodb.infraestructure.controller;


import com.formacion.ej13.mongodb.aplication.PersonService;
import com.formacion.ej13.mongodb.infraestructure.controller.input.PersonInputDto;
import com.formacion.ej13.mongodb.infraestructure.controller.output.PersonOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonUpdateController {

    @Autowired
    PersonService personServiceImp;

    @PutMapping("/person/{id}")
    public PersonOutputDto updatePerson(@PathVariable String id, @RequestBody PersonInputDto personInputDto) throws Exception {
        return personServiceImp.updatePerson(id);
    }
}
