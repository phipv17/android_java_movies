package com.example.movies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.R;
import com.example.movies.model.Movies;

import java.util.List;

public class MoviesApdapter extends RecyclerView.Adapter<MoviesApdapter.MyViewHoder> {
    private Context mContext;
    private List<Movies> movies;

    public MoviesApdapter(Context mContext, List<Movies> movies) {
        this.mContext = mContext;
        this.movies = movies;
    }

    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.movies_item_layout,parent,false);
        return new MyViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoder holder, int position) {
        holder.imgMovies.setImageResource(movies.get(position).getImgMovies());
    }

    @Override
    public int getItemCount() {
        if(movies != null){
            return movies.size();
        }
        return 0;
    }

    public class MyViewHoder extends RecyclerView.ViewHolder {

        private ImageView imgMovies;
        public MyViewHoder(@NonNull View itemView) {
            super(itemView);

            imgMovies = itemView.findViewById(R.id.imgSlide);
        }
    }
}
