package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.Seminar;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    LayoutInflater inflater;
    List<Seminar> seminars;

    public Adapter(Context ctx, List<Seminar> seminars){
        this.inflater = LayoutInflater.from(ctx);
        this.seminars = seminars;
    }


////3 متد oncreateViewHolder , onBindViewHolder , getItemcount در نتیجه impliment کردن کلاس اداپتر

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_list_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // bind the data
        holder.songTitle.setText(seminars.get(position).getTitle());
        holder.type.setText(seminars.get(position).getType());
        Picasso.get().load(seminars.get(position).getCoverImage()).into(holder.songCoverImage);

    }

    @Override
    public int getItemCount() {
        return seminars.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{
        TextView songTitle,type;
        ImageView songCoverImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            songTitle = itemView.findViewById(R.id.seminarTitle);
            type = itemView.findViewById(R.id.type);
            songCoverImage = itemView.findViewById(R.id.coverImage);

            // handle onClick

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Do Something With this Click", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
