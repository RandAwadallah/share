package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int images[]= {R.drawable.ww,R.drawable.rrr, R.drawable.rr,R.drawable.t
            ,R.drawable.download,R.drawable.s,R.drawable.m,R.drawable.tt,R.drawable.q,
            R.drawable.w};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        s1 =getResources().getStringArray(R.array.programming_languages);
        s2 =getResources().getStringArray(R.array.Description);

        MyAdapter myAdapter =new MyAdapter( this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
