package com.company.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dataaccess.PersonRepository;
import com.company.domain.Person;

@Service ("personService")
public class PersonService {
  private static final Logger LOGGER = LogManager.getLogger(PersonService.class);

  @Autowired
  PersonRepository personRepository;
  
  public Person createPerson(String name) {
    LOGGER.info("createPerson Service returning person " + name);
    return personRepository.createPerson(name);
  }
}