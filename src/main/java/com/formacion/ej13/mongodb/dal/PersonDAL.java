package com.formacion.ej13.mongodb.dal;

import com.formacion.ej13.mongodb.Model.Person;

import java.util.List;

public interface PersonDAL {
    Person savePerson(Person person);
    List<Person> getAllPerson();
    List<Person> getAllPersonPaginated(
            int pageNumber, int pageSize);
    Person findOneByName(String name);
    List<Person> findByName(String name);
    List<Person> findByCity(String city);
    void updatePerson();
    Person updatePerson(Person person);
    void deletePerson(Person person);
}
