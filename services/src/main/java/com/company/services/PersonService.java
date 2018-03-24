package com.company.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dataaccess.PersonRepository;
import com.company.domain.Person;

@Service ("personService")
public class PersonService {
  @Autowired
  PersonRepository personRepository;
  
  public Person createPerson(String name) {
    return personRepository.createPerson(name);
  }
}