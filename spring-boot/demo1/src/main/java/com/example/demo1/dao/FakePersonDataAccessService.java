package com.example.demo1.dao;

import com.example.demo1.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Repository("fackDao")
public class FakePersonDataAccessService implements PersonDao{
    private static List<Person> DB = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> sellectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersoneById(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deletePerosnById(UUID id) {
        Optional<Person>  personMaybe= selectPersoneById(id);
        if (personMaybe.isEmpty()){
            return 0;
        }
        DB.remove(personMaybe.get());
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person update) {
        return selectPersoneById(id)
                .map(person  ->{
                    int indexOfPresonToDelete = DB.indexOf(person);
                    if(indexOfPresonToDelete >= 0){
                        DB.set(indexOfPresonToDelete, new Person(id, update.getName()));
                        return 1;
                    }
                    return 0;
                }).orElse(0);


    }


}
