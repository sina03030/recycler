package com.example.propro.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import main.com.pro.R;

public class ActivityMain extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Categori Book", "The Cats of Ulthar", "Description book", R.drawable.cats));
        lstBook.add(new Book("Categori Book", "A Dark Brown Dog", "Description book", R.drawable.darkbrowndog));
        lstBook.add(new Book("Categori Book", "the Cripple", "Description book", R.drawable.cripple));
        lstBook.add(new Book("Categori Book", "the journey", "Description book", R.drawable.journey));
        lstBook.add(new Book("Categori Book", "the build and fire", "Description book", R.drawable.fire));
        lstBook.add(new Book("Categori Book", "The Cats of Ulthar", "Description book", R.drawable.cats));
        lstBook.add(new Book("Categori Book", "A Dark Brown Dog", "Description book", R.drawable.darkbrowndog));
        lstBook.add(new Book("Categori Book", "the Cripple", "Description book", R.drawable.cripple));
        lstBook.add(new Book("Categori Book", "the journey", "Description book", R.drawable.journey));
        lstBook.add(new Book("Categori Book", "the build and fire", "Description book", R.drawable.fire));

        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);

    }

}
