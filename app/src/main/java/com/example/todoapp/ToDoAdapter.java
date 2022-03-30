package com.example.todoapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.awt.font.TextAttribute;
import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {
    private List<Task> data;

    public ToDoAdapter(List<Task> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ToDoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Take inflater from context (environment)
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        //turn xml to java (list item--> to java)
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }
    //Give position to data in view according to our list
    @Override
    public void onBindViewHolder(@NonNull ToDoAdapter.ViewHolder holder, int position) {
        Task item=data.get(position);
        holder.title.setText(item.getTitle());
    }
    //View holder--> each class and Recycler View is container
    class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView title;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            //Setting data in empty view sequentially
            title=itemView.findViewById(R.id.textView);
        }
    }

    @Override
    public int getItemCount() {
        if(data==null)
            return 0;
        return data.size();
    }
}
