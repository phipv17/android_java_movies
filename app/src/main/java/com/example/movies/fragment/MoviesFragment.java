package com.example.movies.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.movies.R;
import com.example.movies.adapter.MoviesApdapter;
import com.example.movies.adapter.TopGenresAdapter;
import com.example.movies.model.Movies;
import com.example.movies.model.TopByGenres;

import java.util.ArrayList;
import java.util.List;


public class MoviesFragment extends Fragment {
    private RecyclerView rvNowPlaying,rvTrending,rvTopRated,rvTopByGenres;
    private List<Movies> movies;
    private MoviesApdapter moviesApdapter;
    private List<TopByGenres> byGenresList;
    private TopGenresAdapter topGenresAdapter;
    SearchView searchView;

    public MoviesFragment() {
    }

    private  View mView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_movies, container, false);
        initView();
        bindingView();
        return mView;
    }

    private void bindingView() {
        movies = new ArrayList<>();
        movies.add(new Movies(R.drawable.moana));
        movies.add(new Movies(R.drawable.mov2));
        movies.add(new Movies(R.drawable.themartian));
        movies.add(new Movies(R.drawable.blackp));
        movies.add(new Movies(R.drawable.thewildrobot));
        movies.add(new Movies(R.drawable.hediedwith));
        movies.add(new Movies(R.drawable.mariasemples));
        movies.add(new Movies(R.drawable.thevigitarian));
        movies.add(new Movies(R.drawable.moana));
        movies.add(new Movies(R.drawable.mov2));
        movies.add(new Movies(R.drawable.themartian));
        movies.add(new Movies(R.drawable.blackp));
        movies.add(new Movies(R.drawable.thewildrobot));
        movies.add(new Movies(R.drawable.hediedwith));
        movies.add(new Movies(R.drawable.mariasemples));
        movies.add(new Movies(R.drawable.thevigitarian));
        movies.add(new Movies(R.drawable.moana));
        movies.add(new Movies(R.drawable.mov2));
        movies.add(new Movies(R.drawable.themartian));
        movies.add(new Movies(R.drawable.blackp));
        movies.add(new Movies(R.drawable.thewildrobot));
        movies.add(new Movies(R.drawable.hediedwith));
        movies.add(new Movies(R.drawable.mariasemples));
        movies.add(new Movies(R.drawable.thevigitarian));
        moviesApdapter = new MoviesApdapter(getActivity(),movies);
        rvNowPlaying.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        rvTrending.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        rvTopRated.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        rvTrending.setAdapter(moviesApdapter);
        rvNowPlaying.setAdapter(moviesApdapter);
        rvTopRated.setAdapter(moviesApdapter);

        byGenresList = new ArrayList<>();
        byGenresList.add(new TopByGenres("Action"));
        byGenresList.add(new TopByGenres("Adventure"));
        byGenresList.add(new TopByGenres("Animation"));
        byGenresList.add(new TopByGenres("Comedy"));
        byGenresList.add(new TopByGenres("Crime"));
        byGenresList.add(new TopByGenres("Documentary"));
        byGenresList.add(new TopByGenres("Drama"));
        byGenresList.add(new TopByGenres("Family"));
        byGenresList.add(new TopByGenres("Fantasy"));
        byGenresList.add(new TopByGenres("History"));
        byGenresList.add(new TopByGenres("Horror"));
        byGenresList.add(new TopByGenres("Music"));
        byGenresList.add(new TopByGenres("Mystery"));
        byGenresList.add(new TopByGenres("Romamce"));
        byGenresList.add(new TopByGenres("Science Fiction"));

        topGenresAdapter = new TopGenresAdapter(getActivity(),byGenresList);
        rvTopByGenres.setAdapter(topGenresAdapter);
        rvTopByGenres.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));


    }


    private void initView(){
        rvNowPlaying = mView.findViewById(R.id.rvNowPlaying);
        rvTrending = mView.findViewById(R.id.rvTrending);
        rvTopRated = mView.findViewById(R.id.rvTopRated);
        rvTopByGenres = mView.findViewById(R.id.rvTopByGenres);
//        searchView = mView.findViewById(R.id.search);
    }
}