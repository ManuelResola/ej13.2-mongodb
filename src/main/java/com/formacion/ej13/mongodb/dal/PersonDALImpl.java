package com.formacion.ej13.mongodb.dal;

import com.formacion.ej13.mongodb.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

public class PersonDALImpl implements PersonDAL{

    private final MongoTemplate mongoTemplate;

    @Autowired
    public PersonDALImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
    @Override
    public Person savePerson(Person person) {
        return null;
    }

    @Override
    public List<Person> getAllPerson() {
        return null;
    }

    @Override
    public List<Person> getAllPersonPaginated(int pageNumber, int pageSize) {
        return null;
    }

    @Override
    public Person findOneByName(String name) {
        return null;
    }

    @Override
    public List<Person> findByName(String name) {
        return null;
    }

    @Override
    public List<Person> findByCity(String city) {
        return null;
    }

    @Override
    public void updatePerson() {

    }

    @Override
    public Person updatePerson(Person person) {
        return null;
    }

    @Override
    public void deletePerson(Person person) {

    }
}
