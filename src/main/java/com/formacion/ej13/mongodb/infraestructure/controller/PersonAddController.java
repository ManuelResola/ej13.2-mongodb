package com.formacion.ej13.mongodb.infraestructure.controller;


import com.formacion.ej13.mongodb.aplication.PersonService;
import com.formacion.ej13.mongodb.infraestructure.controller.input.PersonInputDto;
import com.formacion.ej13.mongodb.infraestructure.controller.output.PersonOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonAddController {

    @Autowired
    PersonService personServiceImp;

    @PostMapping("/person")
    public PersonOutputDto addPerson(@RequestBody PersonInputDto personInputDto) throws Exception {
            return personServiceImp.addPerson(personInputDto);
    }
}
