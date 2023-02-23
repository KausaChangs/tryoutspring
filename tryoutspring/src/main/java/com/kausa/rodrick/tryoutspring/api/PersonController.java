package com.kausa.rodrick.tryoutspring.api;

import com.kausa.rodrick.tryoutspring.service.PersonService;
import com.kausa.rodrick.tryoutspring.model.Person;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    public void addPerson(Person person){
         personService.addPerson(person);
    }
}
