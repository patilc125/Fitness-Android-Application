package com.example.book_infromation.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.book_infromation.adapters.AdapateClass;
import com.example.book_infromation.ModelClass;
import com.example.book_infromation.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass>arrayList;
    private AdapateClass adapate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleView);
       // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        arrayList=new ArrayList<>();

       // recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        ModelClass modelClass1=new ModelClass("yoga","Yoga");
        ModelClass modelClass2=new ModelClass("fitness","Fitness");
        ModelClass modelClass3=new ModelClass("motivation","Motivation");
        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        adapate=new AdapateClass(arrayList,this);
        recyclerView.setAdapter(adapate);
    }
}