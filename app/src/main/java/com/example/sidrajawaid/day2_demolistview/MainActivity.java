package com.example.sidrajawaid.day2_demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        final GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);

        final ArrayList<ModelClass> modelClassArrayList=new ArrayList<>();
        modelClassArrayList.add(new ModelClass(ModelClass.RECTANGLE,R.drawable.discount1));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item1));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item2));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item3));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item4));
        modelClassArrayList.add(new ModelClass(ModelClass.BANNER,R.drawable.promotion1,"New Promotion"));
        modelClassArrayList.add(new ModelClass(ModelClass.RECTANGLE,R.drawable.discount2));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item5));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item6));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item7));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item8));
        modelClassArrayList.add(new ModelClass(ModelClass.BANNER,R.drawable.promotion1,"New Promotion"));
        modelClassArrayList.add(new ModelClass(ModelClass.RECTANGLE,R.drawable.discount1));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item1));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item2));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item3));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item4));
        modelClassArrayList.add(new ModelClass(ModelClass.BANNER,R.drawable.promotion1,"New Promotion"));
        modelClassArrayList.add(new ModelClass(ModelClass.RECTANGLE,R.drawable.discount3));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item1));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item2));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item3));
        modelClassArrayList.add(new ModelClass(ModelClass.TILE,R.drawable.item4));
        modelClassArrayList.add(new ModelClass(ModelClass.BANNER,R.drawable.promotion1,"New Promotion"));
        final RecyclerViewClass adapter = new RecyclerViewClass(modelClassArrayList,this);
        RecyclerView.ItemDecoration itemDecoration=new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if(adapter.getItemViewType(position)==ModelClass.TILE ){
                    return 1;
                }
                else {
                    return 2;
                }
            }
        });
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);



    }
}
