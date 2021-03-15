package com.example.movies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.movies.R;
import com.example.movies.model.Slide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class SlidePagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<Slide> slideList;

    public SlidePagerAdapter(Context mContext, List<Slide> slideList) {
        this.mContext = mContext;
        this.slideList = slideList;
    }

    @Override
    public int getCount() {
        return slideList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View mView = LayoutInflater.from(mContext).inflate(R.layout.slide_item,null);
        ImageView imgSlide = mView.findViewById(R.id.imgSlide);
        imgSlide.setImageResource(slideList.get(position).getImgSidle());
        FloatingActionButton btnPlay = mView.findViewById(R.id.btnPlay);
        TextView tvFilmName = mView.findViewById(R.id.tvFilmName);
        tvFilmName.setText(slideList.get(position).getTitleFilm());
        container.addView(mView);
        return mView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
