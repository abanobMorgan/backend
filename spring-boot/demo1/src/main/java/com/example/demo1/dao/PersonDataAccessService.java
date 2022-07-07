package com.example.demo1.dao;

import com.example.demo1.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("MYSQL")
public class PersonDataAccessService implements PersonDao{

    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> sellectAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "From MYSQL DB"));
    }

    @Override
    public Optional<Person> selectPersoneById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePerosnById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
