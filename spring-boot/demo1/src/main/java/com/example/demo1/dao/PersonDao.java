package com.example.demo1.dao;
import com.example.demo1.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);

    }
    List<Person> sellectAllPeople();

    Optional<Person> selectPersoneById(UUID id);

    int deletePerosnById(UUID id);

    int updatePersonById(UUID id, Person person);

}
