package com.in28minutes.springboot.todoapp.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String username;
    private String descriotion;
    private LocalDate targetDate;
    private boolean isCompleted;

    public Todo(int id, String username, String descriotion, LocalDate targetDate, boolean isCompleted) {
        this.id = id;
        this.username = username;
        this.descriotion = descriotion;
        this.targetDate = targetDate;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescriotion() {
        return descriotion;
    }

    public void setDescriotion(String descriotion) {
        this.descriotion = descriotion;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", descriotion='" + descriotion + '\'' +
                ", targetDate=" + targetDate +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
