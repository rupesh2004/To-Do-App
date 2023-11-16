package com.example.todoapp.Model;

public class ToDoModel extends  TaskId{
    String task,due;
    int status;

    public String getTask() {
        return task;
    }

    public String getDue() {
        return due;
    }

    public int getStatus() {
        return status;
    }
}
