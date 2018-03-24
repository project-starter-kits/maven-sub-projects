package com.company.dataaccess;

import org.springframework.stereotype.Repository;

import com.company.domain.Person;

@Repository ("personRepository")
public class PersonRepository {

    public Person createPerson(String name) {
        return new Person(name);
    }

}