package com.kausa.rodrick.tryoutspring.api;

import com.kausa.rodrick.tryoutspring.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }
}
