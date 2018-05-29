package com.product.ygd.task1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.product.ygd.task1.adapter.StoreScreenAdapter;
import com.product.ygd.task1.model.StorePack;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity implements View.OnClickListener {


    LinearLayout ll_store_screen_button_back;
    LinearLayout ll_store_screen_button_store;
    LinearLayout ll_store_screen_button_items;
    LinearLayout ll_store_screen_button_video;

    LinearLayout ll_layout_replace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        ll_layout_replace = findViewById(R.id.ll_layout_replace);

        ll_store_screen_button_back = findViewById(R.id.ll_store_screen_button_back);
        ll_store_screen_button_store = findViewById(R.id.ll_store_screen_button_store);
        ll_store_screen_button_items = findViewById(R.id.ll_store_screen_button_items);
        ll_store_screen_button_video = findViewById(R.id.ll_store_screen_button_video);

        ll_store_screen_button_back.setOnClickListener(this);
        ll_store_screen_button_store.setOnClickListener(this);
        ll_store_screen_button_items.setOnClickListener(this);
        ll_store_screen_button_video.setOnClickListener(this);




        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.ll_layout_replace, new StoreFragment());
        transaction.addToBackStack(null);
        transaction.commit();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_store_screen_button_back:
                finish();
                break;
            case R.id.ll_store_screen_button_store:
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.ll_layout_replace, new StoreFragment());
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.ll_store_screen_button_items:
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                FragmentTransaction transaction1 = fragmentManager1.beginTransaction();
                transaction1.replace(R.id.ll_layout_replace, new ItemsFragment());
                transaction1.addToBackStack(null);
                transaction1.commit();
                break;
            case R.id.ll_store_screen_button_video:

                break;
        }
    }
}
