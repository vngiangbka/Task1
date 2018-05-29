package com.product.ygd.task1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.product.ygd.task1.adapter.StoreScreenAdapter;
import com.product.ygd.task1.model.StorePack;

import java.util.ArrayList;

public class StoreFragment extends Fragment {

    RecyclerView rv_store_screen;
    StoreScreenAdapter adapter;
    ArrayList<StorePack> arrayList;

    public StoreFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_store, container, false);


        rv_store_screen = view.findViewById(R.id.rv_store_screen);
        arrayList = new ArrayList<>();
        fake_data_store();
        adapter = new StoreScreenAdapter(getContext(), arrayList);
        rv_store_screen.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_store_screen.setHasFixedSize(true);
        rv_store_screen.setAdapter(adapter);

        return view;
    }

    private void fake_data_store() {
        arrayList.add(new StorePack("giant pack", 500000, 250000));
        arrayList.add(new StorePack("great pack", 200000, 100000));
        arrayList.add(new StorePack("big pack", 100000, 50000));
        arrayList.add(new StorePack("suit pack", 50000, 25000));
        arrayList.add(new StorePack("small pack", 20000, 10000));
        arrayList.add(new StorePack("basic pack", 10000, 5000));
    }

}
