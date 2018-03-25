package com.company.dataaccess;

import com.company.domain.Person;
import com.company.util.StringUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository("personRepository")
public class PersonRepository {
  private static final Logger LOGGER = LogManager.getLogger(PersonRepository.class);

  public Person createPerson(String name) {
    LOGGER.info("PersonRepository createPerson called with " + name);
    return new Person(StringUtil.withoutTrainingSlash(name));
  }

}
