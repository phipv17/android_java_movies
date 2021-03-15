package com.example.movies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movies.R;
import com.example.movies.model.Upcoming;

import java.util.List;

public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.MyViewHolder> {
    private Context mContext;
    private List<Upcoming> upcomingList;

    public UpcomingAdapter(Context mContext, List<Upcoming> upcomingList) {
        this.mContext = mContext;
        this.upcomingList = upcomingList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.upcoming_item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imgUpcoming.setImageResource(upcomingList.get(position).getImgUpComing());
    }

    @Override
    public int getItemCount() {
        if(upcomingList != null){
            return upcomingList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgUpcoming;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgUpcoming = itemView.findViewById(R.id.imgUpcoming);
        }
    }
}
