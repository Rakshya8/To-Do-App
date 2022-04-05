package com.example.todoapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.UUID;
//Plain Old Java CLass
@Entity (tableName = "tasks")
public class Task {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    @ColumnInfo(name="Updated_date")
    private Date updateDate;

    @Ignore
    public Task(int id, String title, String description, Date updateDate){
        this.id=id;
        this.title=title;
        this.description =description;

        this.updateDate=updateDate;


    }

    public Task(String title, String description, Date updateDate) {
        this.title = title;
        this.description = description;
        this.updateDate = updateDate;
    }

//    public Task(){
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
