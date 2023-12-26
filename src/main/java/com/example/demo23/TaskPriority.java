package com.example.demo23;

public class TaskPriority {
    private int id;
    private String priorityName;

    // Constructors

    public TaskPriority() {
    }

    public TaskPriority(int id, String priorityName) {
        this.id = id;
        this.priorityName = priorityName;
    }

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(String priorityName) {
        this.priorityName = priorityName;
    }
}
