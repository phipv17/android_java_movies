package com.example.movies.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.movies.R;
import com.example.movies.adapter.UpcomingAdapter;
import com.example.movies.model.Upcoming;

import java.util.ArrayList;
import java.util.List;


public class UpComingFragment extends Fragment {
    private View mView;
    private RecyclerView rvUpcoming;
    UpcomingAdapter upcomingAdapter;
    List<Upcoming> upcomingList;
    public UpComingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_up_coming, container, false);
        rvUpcoming = mView.findViewById(R.id.rvUpcoming);
        upcomingList = new ArrayList<>();
        upcomingList.add(new Upcoming(R.drawable.blackp));
        upcomingList.add(new Upcoming(R.drawable.hediedwith));
        upcomingList.add(new Upcoming(R.drawable.mariasemples));
        upcomingList.add(new Upcoming(R.drawable.moana));
        upcomingList.add(new Upcoming(R.drawable.mov2));
        upcomingList.add(new Upcoming(R.drawable.themartian));
        upcomingList.add(new Upcoming(R.drawable.thevigitarian));
        upcomingList.add(new Upcoming(R.drawable.thewildrobot));
        upcomingList.add(new Upcoming(R.drawable.blackp));
        upcomingList.add(new Upcoming(R.drawable.hediedwith));
        upcomingList.add(new Upcoming(R.drawable.mariasemples));
        upcomingList.add(new Upcoming(R.drawable.moana));
        upcomingList.add(new Upcoming(R.drawable.mov2));
        upcomingList.add(new Upcoming(R.drawable.themartian));
        upcomingList.add(new Upcoming(R.drawable.thevigitarian));
        upcomingList.add(new Upcoming(R.drawable.thewildrobot));
        upcomingList.add(new Upcoming(R.drawable.blackp));
        upcomingList.add(new Upcoming(R.drawable.hediedwith));
        upcomingAdapter = new UpcomingAdapter(getActivity(),upcomingList);
        rvUpcoming.setAdapter(upcomingAdapter);
        rvUpcoming.setLayoutManager(new GridLayoutManager(getActivity(),3));
        return mView;
    }
}