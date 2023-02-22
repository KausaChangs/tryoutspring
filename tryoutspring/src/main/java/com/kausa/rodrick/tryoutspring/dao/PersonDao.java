package com.kausa.rodrick.tryoutspring.dao;

import java.util.UUID;

public interface PersonDao {

    insertPerson(UUID id, Person person);

    default int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
