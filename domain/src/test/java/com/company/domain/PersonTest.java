package com.company.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void testPerson() {
        Person person = new Person("Name");
        assertEquals("Name", person.getName());
    }
}