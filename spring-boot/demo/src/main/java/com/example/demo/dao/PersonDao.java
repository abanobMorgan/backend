package com.example.demo.deo;
import  com.example.demo.model.person;

import java.util.UUID;

public interface personDao {
    int insertPerson(UUID id, person person);

    default int addPerson(person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);

    }
}
