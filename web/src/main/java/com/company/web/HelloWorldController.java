package com.company.web;

import com.company.domain.Person;
import com.company.services.PersonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

  private static final Logger LOGGER = LogManager.getLogger(HelloWorldController.class);
  String message = "Welcome to Spring MVC!";
  @Autowired
  private PersonService personService;

  @RequestMapping("/hello")
  public ModelAndView showMessage(
    @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
    LOGGER.info("showMessage called in HelloWorldController");
    Person person = getPerson(name);

    ModelAndView mv = new ModelAndView("helloworld");
    mv.addObject("message", message);
    mv.addObject("name", person.getName());
    return mv;
  }

  private Person getPerson(String name) {
    return personService.createPerson(name);
  }
}
