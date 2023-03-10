package com.example.demo.model;

import com.example.demo.persistence.entity.FirstTable;

import java.time.Instant;
import java.util.List;

public class DemoClass {
    private final long id;
    private final String name;
    private final Instant dob;
    private final List<FirstTable> messages;

    public DemoClass(long id, String name, Instant dob, List<FirstTable> messages) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.messages = messages;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Instant getDob() {
        return dob;
    }

    public List<FirstTable> getMessages() {
        return messages;
    }
}
