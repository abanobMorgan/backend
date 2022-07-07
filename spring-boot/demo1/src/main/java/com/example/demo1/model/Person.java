package com.example.demo1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class Person {
    private final UUID id;
    @NonNull   /*@NotBlank not available in my java version */
    private final String name;

    public Person(@JsonProperty UUID id, @JsonProperty String name){
        this.id = id;
        this.name = name;

    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
