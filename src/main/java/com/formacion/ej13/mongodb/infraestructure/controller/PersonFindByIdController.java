package com.formacion.ej13.mongodb.infraestructure.controller;

import com.formacion.ej13.mongodb.aplication.PersonService;
import com.formacion.ej13.mongodb.infraestructure.controller.output.PersonOutputDtoWithRoleDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonFindByIdController {

    @Autowired
    PersonService personServiceImp;

    @GetMapping("/person/{id}")
    public PersonOutputDtoWithRoleDetails getPersonById(@PathVariable String id) throws Exception {
        return personServiceImp.findPersonById(String.valueOf(id));
    }
}
