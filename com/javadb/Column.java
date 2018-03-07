package com.javadb;

/**
 * A column in a table.
 * Currently holds only it's name but later can be used to add PK, Constraints, Data Types.
 * TODO: Add primary key functionality
 */
public class Column {
    private String name;


    Column(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}