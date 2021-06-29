package com.release.demoapk.RecyclerViews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.release.demoapk.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {


    RecyclerView recyclerView ;
    List<Products> productsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recycler);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);

        getProductList();


        RecyclerAdapter adapter = new RecyclerAdapter(productsList);

        recyclerView.setAdapter(adapter);

    }

    private void getProductList() {
        productsList = new ArrayList<>();


        productsList.add(new Products("Oreo Cookies","Yummy tasty .....","180"));
        productsList.add(new Products(" Face Wash","Yummy tasty .....","150"));
        productsList.add(new Products("Cream Biscoot","Yummy tasty .....","80"));
        productsList.add(new Products("Binod Cookies","","1800"));
        productsList.add(new Products("nirma Cookies","Yummy tasty .....","10"));
        productsList.add(new Products("Faltu Cookies","Yummy tasty .....","100"));
        productsList.add(new Products("hohohoho Cookies","Yummy tasty .....","18900"));


    }
}