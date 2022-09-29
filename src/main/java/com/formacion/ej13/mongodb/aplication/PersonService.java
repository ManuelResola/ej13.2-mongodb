package com.formacion.ej13.mongodb.aplication;

import com.formacion.ej13.mongodb.infraestructure.controller.input.PersonInputDto;
import com.formacion.ej13.mongodb.infraestructure.controller.output.PersonOutputDto;
import com.formacion.ej13.mongodb.infraestructure.controller.output.PersonOutputDtoWithRoleDetails;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PersonService {
    PersonOutputDto addPerson(PersonInputDto personInputDto);

    PersonOutputDto updatePerson(String id, PersonInputDto personInputDto);

    PersonOutputDto findPerson(String id);

    String deletePerson(String id);

    PersonOutputDtoWithRoleDetails findPersonById(String id);


    List<PersonOutputDto> findPersonByName(String name);

    PersonOutputDto updatePerson(String id);
}
