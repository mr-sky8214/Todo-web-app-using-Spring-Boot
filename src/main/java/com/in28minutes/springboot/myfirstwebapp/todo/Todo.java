package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String usrename;
    @Size(min = 10, message = "Please enter atleast 10 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public Todo(int id, String usrename, String description, LocalDate targetdate, boolean done) {
        this.id = id;
        this.usrename = usrename;
        this.description = description;
        this.targetDate = targetdate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsrename() {
        return usrename;
    }

    public void setUsrename(String usrename) {
        this.usrename = usrename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", usrename='" + usrename + '\'' +
                ", description='" + description + '\'' +
                ", targetdate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
