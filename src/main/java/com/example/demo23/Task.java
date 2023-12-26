package com.example.demo23;

import java.sql.Date;

public class Task {
    private int id;
    private String taskName;
    private String taskDescription;
    private int taskTypeId;
    private int taskPriorityId;
    private Date deadline;
    private boolean taskCompleted;

    // Constructors

    public Task() {
    }

    public Task(int id, String taskName, String taskDescription, int taskTypeId, int taskPriorityId, Date deadline, boolean taskCompleted) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskTypeId = taskTypeId;
        this.taskPriorityId = taskPriorityId;
        this.deadline = deadline;
        this.taskCompleted = taskCompleted;
    }

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(int taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public int getTaskPriorityId() {
        return taskPriorityId;
    }

    public void setTaskPriorityId(int taskPriorityId) {
        this.taskPriorityId = taskPriorityId;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isTaskCompleted() {
        return taskCompleted;
    }

    public void setTaskCompleted(boolean taskCompleted) {
        this.taskCompleted = taskCompleted;
    }
}
