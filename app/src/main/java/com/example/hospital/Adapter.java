package com.example.hospital;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Drrecyclerviewdata> userList;
    public Adapter(List<Drrecyclerviewdata> userList){
        this.userList = userList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dr_listitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int resource= userList.get(position).getImageView1();
        String name= userList.get(position).getTextView25();
        String details= userList.get(position).getTextView27();
        String line = userList.get(position).getDivider();
        holder.setData(resource,name,details,line);


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public void notifyDataSetChange() {
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView1;
        private TextView textView25;
        private TextView textView27;
        private TextView divider;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1=itemView.findViewById(R.id.imageView1);
            textView25=itemView.findViewById(R.id.textView25);
            textView27=itemView.findViewById(R.id.textView27);
            divider=itemView.findViewById(R.id.textView26);
            
        }

        public void setData(int resource, String name,String details, String line) {
            imageView1.setImageResource(resource);
            textView25.setText(name);
            textView27.setText(details);
            divider.setText(line);
        }
    }
}
