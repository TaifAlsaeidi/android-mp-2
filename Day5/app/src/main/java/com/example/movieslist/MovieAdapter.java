package com.example.movieslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day5.Movie;
import com.example.day5.R;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter {

    ArrayList<Movie> mArray;
    Context context;

    public MovieAdapter(ArrayList<Movie> mArray, Context context) {
        this.mArray = mArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //connecting to movie_list_item xml
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movielise,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).rating.setText(mArray.get(position).getRating()+"");
        ((ViewHolder) holder).duration.setText(mArray.get(position).getDuration()+"");
        ((ViewHolder) holder).name.setText(mArray.get(position).getName());
        ((ViewHolder) holder).img.setImageResource(mArray.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return mArray.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public TextView name;
        public TextView duration;
        public TextView rating ;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView; //مهم جدا
            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
            duration = itemView.findViewById(R.id.textView5);
            rating = itemView.findViewById(R.id.textView3);
        }
    }
}
