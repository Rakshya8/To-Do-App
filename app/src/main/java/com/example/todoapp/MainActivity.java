package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG=MainActivity.class.getSimpleName();
    private Repository repository;
    private List<Task> taskList;
    private RecyclerView recyclerView;
    private ToDoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.todoList);
        repository=Repository.getInstance();
        taskList=repository.getALlTask();
        adapter=new ToDoAdapter(taskList);
        recyclerView.setAdapter(adapter);

        //repository.delete(taskList.get(0));

    }
}