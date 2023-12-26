package com.example.demo23;

public class TaskType {
    private int id;
    private String typeName;

    // Constructors

    public TaskType() {
    }

    public TaskType(int id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
