package com.example.recwithfrag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.ry1);
        MyListData[] myListData = new MyListData[]{
                new MyListData("Email", R.drawable.ic_launcher_background),
                new MyListData("Info", R.drawable.ic_launcher_background),
                new MyListData("Delete", R.drawable.ic_launcher_background),
        };

        MyAdapter myAdapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }

}
