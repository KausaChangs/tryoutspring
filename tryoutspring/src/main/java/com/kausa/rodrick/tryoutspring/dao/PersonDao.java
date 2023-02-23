package com.kausa.rodrick.tryoutspring.dao;


import java.util.UUID;



import com.kausa.rodrick.tryoutspring.model.Person;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
