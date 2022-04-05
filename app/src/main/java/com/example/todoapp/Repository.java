package com.example.todoapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
//Singleton class: A class with only one possible instance
public class Repository
{
    private List<Task> taskList;
    private static Repository sInstance;
    private Repository(){
        taskList=new ArrayList<>();
        for (int i=0;i<10;i++){
            Task task =new Task();
            task.setTitle("Task: "+i);
            taskList.add(task);
        }
    }
    public Task getTaskId(UUID id){
//        for (Task item:taskList){
//            if(item.getId()==id){
//                return item;
//            }
//        }
        return null;

    }
    public static Repository getInstance(){
        if (sInstance==null){
            sInstance=new Repository();
        }
        return sInstance;
    }
    public List<Task> getALlTask(){
        return taskList;
    }
    private  void insert(Task task){
        taskList.add(task);
    }
    public void Update(Task task){
//        Task oldTask=getTaskId(task.getId());
//        oldTask.setTitle(task.getTitle());
//        oldTask.setDescription(task.getDescription());
//        oldTask.setUpdateDate(new Date());

    }
    public void delete(Task task){
//        Task taskDelete= getTaskId(task.getId());
//        taskList.remove(taskDelete);
    }
}
