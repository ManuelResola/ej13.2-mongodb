package com.formacion.ej13.mongodb.infraestructure.controller.output;

import com.formacion.ej13.mongodb.Model.Person;
import lombok.Data;


@Data
public class PersonOutputDtoWithRoleDetails {
    private String id;

    private String name;

    private String city;


    public PersonOutputDtoWithRoleDetails(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.city = person.getCity();

        }
    }



