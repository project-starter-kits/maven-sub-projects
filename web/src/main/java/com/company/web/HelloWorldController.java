package com.company.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.company.domain.Person;
import com.company.services.PersonService;
 
@Controller
public class HelloWorldController {
  
    @Autowired
    private PersonService personService;
    
    String message = "Welcome to Spring MVC!";
 
    @RequestMapping("/hello")
    public ModelAndView showMessage(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        System.out.println("in controller");
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