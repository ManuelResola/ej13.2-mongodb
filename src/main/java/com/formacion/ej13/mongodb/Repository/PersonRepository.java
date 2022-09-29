package com.formacion.ej13.mongodb.Repository;

import java.util.List;

import com.formacion.ej13.mongodb.Model.Person;
import com.formacion.ej13.mongodb.infraestructure.controller.input.PersonInputDto;
import com.formacion.ej13.mongodb.infraestructure.controller.output.PersonOutputDto;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface PersonRepository extends MongoRepository<Person, String>{
    List<Person> findByName(String name);
    List<Person> findByCity(String city);

    PersonOutputDto insert(PersonInputDto personInputDto);
}
