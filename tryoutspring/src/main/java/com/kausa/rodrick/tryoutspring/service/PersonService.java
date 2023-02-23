package com.kausa.rodrick.tryoutspring.service;

import com.kausa.rodrick.tryoutspring.dao.PersonDao;
import com.kausa.rodrick.tryoutspring.model.Person;

public class PersonService {

    private final PersonDao personDao;


    public PersonService(PersonDao personDao){
        this.personDao = personDao;
    }
    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
