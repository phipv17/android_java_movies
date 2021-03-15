package com.example.movies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.ICLickPopularItem;
import com.example.movies.R;
import com.example.movies.model.Popular;

import java.util.List;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.MyViewHolder> {
        private Context mContext;
        private List<Popular> mListPopulars;


    public PopularAdapter(Context mContext, List<Popular> mListPopulars) {
        this.mContext = mContext;
        this.mListPopulars = mListPopulars;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.popular_item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       holder.imgPopular.setImageResource(mListPopulars.get(position).getImgBg());

    }

    @Override
    public int getItemCount() {
        if(mListPopulars != null)
        return mListPopulars.size();
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPopular;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPopular = itemView.findViewById(R.id.imgImgPopular);
        }
    }
}
