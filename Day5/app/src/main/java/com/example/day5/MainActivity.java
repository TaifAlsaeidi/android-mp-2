package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.movieslist.MovieAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private com.example.movieslist.MovieAdapter MovieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Movie> myMovies = new ArrayList<>();



        Movie m1 = new Movie("Harry Potter",2,4.5,"Fantesy",1994,false,R.drawable.h1);
        Movie m2 = new Movie("Lion King",1.5,4,"kids",1994,true,R.drawable.l1);
        Movie m3 = new Movie("Lion King2",1.5,9,"kids",2000,true,R.drawable.l2);

        Movie m4 = new Movie("Harry Potter2",2.0,5.9,"Fantesy",2002,false,R.drawable.h2);

        myMovies.add(m1);
        myMovies.add(m2);
        myMovies.add(m3);
        myMovies.add(m4);

        RecyclerView Movieslist = findViewById(R.id.RV);

        Movieslist.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        Movieslist.setLayoutManager(lm);

        MovieAdapter MA = new MovieAdapter(myMovies,MainActivity.this);
        Movieslist.setAdapter(MA);
    }
}