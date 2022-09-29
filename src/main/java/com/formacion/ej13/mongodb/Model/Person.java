package com.formacion.ej13.mongodb.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document (collection = "persons")
public class Person {
    @Id
    private String id;
    private String name;
    private String city;


    public Person() {

    }

    public Person(String name, String city) {
        this.name = name;
        this.city = city;

    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
    }



}