package com.example.todoapp;

import java.util.Date;
import java.util.UUID;
//Plain Old Java CLass
public class Task {
    private UUID id;
    private String title;
    private String description;
    private Date updateDate;
    public Task(UUID id, String title, String description, Date updateDate){
        this.id=id;
        this.title=title;
        this.description =description;
        this.updateDate=updateDate;


    }
    public Task(){
        id=UUID.randomUUID();
        updateDate=new Date();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}
