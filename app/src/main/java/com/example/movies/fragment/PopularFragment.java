package com.example.movies.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.movies.ICLickPopularItem;
import com.example.movies.R;
import com.example.movies.adapter.MoviesApdapter;
import com.example.movies.adapter.PopularAdapter;
import com.example.movies.adapter.RecomendAdapter;
import com.example.movies.adapter.SlidePagerAdapter;
import com.example.movies.model.Movies;
import com.example.movies.model.Popular;
import com.example.movies.model.Recomend;
import com.example.movies.model.Slide;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class PopularFragment extends Fragment {
    private ViewPager viewPagerSlide;
    private TabLayout indicator;
    private List<Slide> slideList;
    private PopularAdapter popularApdapter;
    private List<Popular> popularList;
    private RecomendAdapter recomendApdapter;
    private List<Recomend> recomendList;
    private SlidePagerAdapter slidePagerAdapter;
    private RecyclerView rvPopular, rvRecomend;
    public PopularFragment() {
        // Required empty public constructor
    }

    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_popular, container, false);
        initView();
        bindingView();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new PopularFragment.SlideTimeLoop(),1000,2000);
        return mView;

    }

    class SlideTimeLoop extends TimerTask{

        @Override
        public void run() {
            if (getActivity() == null){
                return;
            }
            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPagerSlide.getCurrentItem() < (slideList.size()) -1){
                        viewPagerSlide.setCurrentItem(viewPagerSlide.getCurrentItem() + 1);
                    }else {
                        viewPagerSlide.setCurrentItem(0);
                    }
                }
            });
        }
    }

    private void initView(){
        rvPopular = mView.findViewById(R.id.rvPopular);
        rvRecomend = mView.findViewById(R.id.rvRecomed);
        viewPagerSlide = mView.findViewById(R.id.viewPagerLoop);
        indicator = mView.findViewById(R.id.tabLayoutLoop);
    }

    private void bindingView(){
        slideList = new ArrayList<>();
        slideList.add(new Slide("Black P", R.drawable.slide1));
        slideList.add(new Slide("Coming 2 America", R.drawable.slide2));
        slideList.add(new Slide("Spider Man", R.drawable.spidercover));
        slideList.add(new Slide("Monster Hunter", R.drawable.slide1));
        slideList.add(new Slide("Wonder Woman", R.drawable.slide2));
        slidePagerAdapter = new SlidePagerAdapter(getActivity(),slideList);
        viewPagerSlide.setAdapter(slidePagerAdapter);
        indicator.setupWithViewPager(viewPagerSlide,true);

        //binding Popular recyclerview
        popularList = new ArrayList<>();
        popularList.add(new Popular(R.drawable.moana));
        popularList.add(new Popular(R.drawable.blackp));
        popularList.add(new Popular(R.drawable.hediedwith));
        popularList.add(new Popular(R.drawable.mariasemples));
        popularList.add(new Popular(R.drawable.mov2));
        popularList.add(new Popular(R.drawable.themartian));
        popularList.add(new Popular(R.drawable.thevigitarian));
        popularList.add(new Popular(R.drawable.thewildrobot));
        popularList.add(new Popular(R.drawable.moana));
        popularList.add(new Popular(R.drawable.blackp));
        popularList.add(new Popular(R.drawable.hediedwith));
        popularList.add(new Popular(R.drawable.mariasemples));
        popularList.add(new Popular(R.drawable.mov2));
        popularList.add(new Popular(R.drawable.themartian));
        popularList.add(new Popular(R.drawable.thevigitarian));
        popularList.add(new Popular(R.drawable.thewildrobot));
        popularApdapter= new PopularAdapter(getActivity(),popularList);
        rvPopular.setAdapter(popularApdapter);
        rvPopular.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        //binding Recomend recyclerview
        recomendList = new ArrayList<>();
        recomendList.add(new Recomend(R.drawable.moana));
        recomendList.add(new Recomend(R.drawable.blackp));
        recomendList.add(new Recomend(R.drawable.hediedwith));
        recomendList.add(new Recomend(R.drawable.mariasemples));
        recomendList.add(new Recomend(R.drawable.mov2));
        recomendList.add(new Recomend(R.drawable.themartian));
        recomendList.add(new Recomend(R.drawable.thevigitarian));
        recomendList.add(new Recomend(R.drawable.thewildrobot));
        recomendList.add(new Recomend(R.drawable.moana));
        recomendList.add(new Recomend(R.drawable.blackp));
        recomendList.add(new Recomend(R.drawable.hediedwith));
        recomendList.add(new Recomend(R.drawable.mariasemples));
        recomendList.add(new Recomend(R.drawable.mov2));
        recomendList.add(new Recomend(R.drawable.themartian));
        recomendList.add(new Recomend(R.drawable.thevigitarian));
        recomendList.add(new Recomend(R.drawable.thewildrobot));
        recomendApdapter= new RecomendAdapter(getActivity(), recomendList);
        rvRecomend.setAdapter(recomendApdapter);
        rvRecomend.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
    }
}