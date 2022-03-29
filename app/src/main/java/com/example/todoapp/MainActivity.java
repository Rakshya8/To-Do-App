package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG=MainActivity.class.getSimpleName();
    private Repository repository;
    private List<Task> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repository=Repository.getInstance();
        taskList=repository.getALlTask();
        Log.d(TAG,"task list size: "+taskList.size());
        for(Task task: taskList){
            Log.d(TAG," task: "+task);
        }

        //repository.delete(taskList.get(0));

    }
}