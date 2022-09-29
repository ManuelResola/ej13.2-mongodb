package com.formacion.ej13.mongodb.aplication;

import com.formacion.ej13.mongodb.Model.Person;
import com.formacion.ej13.mongodb.Repository.PersonRepository;
import com.formacion.ej13.mongodb.exceptions.EntityNotFoundException;
import com.formacion.ej13.mongodb.infraestructure.controller.input.PersonInputDto;
import com.formacion.ej13.mongodb.infraestructure.controller.output.PersonOutputDto;
import com.formacion.ej13.mongodb.infraestructure.controller.output.PersonOutputDtoWithRoleDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;
    @Override
    public PersonOutputDto addPerson(PersonInputDto personInputDto) {

        Person newPerson = personInputDto.transformIntoPerson();

        personRepository.save(newPerson);

        return new PersonOutputDto(newPerson);
    }

    @Override
    public PersonOutputDto updatePerson(String id, PersonInputDto personInputDto) {
        Optional<Person> personOpt = personRepository.findById(id);
        Person person = personOpt.get();
        person.setName(personInputDto.getName());
        person.setCity(personInputDto.getCity());

        personRepository.save(person);

        return new PersonOutputDto(person);
    }

    @Override
    public PersonOutputDto findPerson(String id) {
        Optional<Person> personOptional = personRepository.findById(id);

        return new PersonOutputDto(personOptional.orElseThrow(() -> new EntityNotFoundException("Person does not exist")));

    }

    @Override
    public String deletePerson(String id) {
        Optional<Person> personOptional = personRepository.findById(id);

        Person person = personOptional.orElseThrow(() -> new EntityNotFoundException("Person does not exist"));

        personRepository.delete(person);

        return "The person has been deleted";

    }

    @Override
    public PersonOutputDtoWithRoleDetails findPersonById(String id) {
        return null;
    }

    @Override
    public List<PersonOutputDto> findPersonByName(String name) {
        return null;
    }

    @Override
    public PersonOutputDto updatePerson(String id) {
        return null;
    }
}
