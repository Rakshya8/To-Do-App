package com.example.todoapp;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface TaskDao {
    @Query("select * from tasks order by updated_date")
    public List<Task> getAllTasks();
    //In case duplicate primary key
    @Insert(onConflict= OnConflictStrategy.REPLACE)
    void insert(Task task);
    @Query("delete from tasks")
    void deleteAll();
    @Delete
    void delete(Task task);

    @Update
    void update(Task task);

    @Query("select * from tasks where id=:id")
    Task getTaskById(int id);

}
