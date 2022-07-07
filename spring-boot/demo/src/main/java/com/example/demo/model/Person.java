package com.example.demo.model;

import java.util.UUID;

public class person {
    private final UUID id;
    private final String name;

    public person(UUID id, String name){
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
