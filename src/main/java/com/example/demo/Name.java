package com.example.demo;

public class Name {
    private String name;
    private String id;

    public Name(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        if (name != null && !name.isEmpty()) {
            return name;
        } else {
            return "何も入力されていません";
        }
    }

    public String getId() {
        if (id != null && !id.isEmpty()) {
            return id;
        } else {
            return "何も入力されていません";
        }
    }
}