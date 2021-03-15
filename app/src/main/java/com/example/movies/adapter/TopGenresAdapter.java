package com.example.movies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.R;
import com.example.movies.model.TopByGenres;

import java.util.List;

public class TopGenresAdapter extends RecyclerView.Adapter<TopGenresAdapter.MyViewHolder> {
        private Context mContext;
        private List<TopByGenres> byGenresList;

    public TopGenresAdapter(Context mContext, List<TopByGenres> byGenresList) {
        this.mContext = mContext;
        this.byGenresList = byGenresList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(mContext).inflate(R.layout.topgenres_item_layout,parent,false);
        return new MyViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvGenres.setText(byGenresList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        if(byGenresList != null){
            return byGenresList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvGenres;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvGenres = itemView.findViewById(R.id.tvGenres);
        }
    }
}
