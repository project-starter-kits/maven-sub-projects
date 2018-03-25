package com.company.dataaccess;

import com.company.domain.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonRepositoryTest {

  @Test
  public void testCreatePerson() {
    PersonRepository personRepository = new PersonRepository();
    Person person = personRepository.createPerson("Name");

    assertNotNull(person);
    assertEquals("Name", person.getName());
  }
}
