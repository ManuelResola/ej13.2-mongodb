package com.formacion.ej13.mongodb.infraestructure.controller.input;

import com.formacion.ej13.mongodb.Model.Person;
import lombok.Data;

@Data
public class PersonInputDto {

    private String name;
    private String city;


    public Person transformIntoPerson(){
        Person person = new Person();
        person.setName(this.name);
        person.setCity(this.city);

        return person;
    }

}
