package com.kausa.rodrick.tryoutspring.model;

public class Person {

    private final UUID id;
    private final String name;

    public Person(UUID id, String name) {
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
