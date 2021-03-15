package com.example.movies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.R;
import com.example.movies.model.Recomend;

import java.util.List;

public class RecomendAdapter extends RecyclerView.Adapter<RecomendAdapter.MyViewHolder> {
    private Context mContext;
    private List<Recomend> recomendList;

    public RecomendAdapter(Context mContext, List<Recomend> recomendList) {
        this.mContext = mContext;
        this.recomendList = recomendList;
    }

    @NonNull
    @Override
    public RecomendAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recomend_item_layout,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecomendAdapter.MyViewHolder holder, int position) {
        holder.imgRecomend.setImageResource(recomendList.get(position).getImgRecomend());
    }

    @Override
    public int getItemCount() {
        if(recomendList != null){
            return recomendList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgRecomend;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgRecomend = itemView.findViewById(R.id.imgImgRecomend);
        }
    }
}
