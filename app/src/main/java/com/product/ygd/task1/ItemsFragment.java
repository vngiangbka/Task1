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

import com.product.ygd.task1.adapter.ItemScreenAdapter;
import com.product.ygd.task1.adapter.StoreScreenAdapter;
import com.product.ygd.task1.model.ItemPack;
import com.product.ygd.task1.model.StorePack;

import java.util.ArrayList;

public class ItemsFragment extends Fragment {


    RecyclerView rv_items_screen;
    ItemScreenAdapter adapter;
    ArrayList<ItemPack> arrayList;

    public ItemsFragment (){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_items, container, false);


        rv_items_screen = view.findViewById(R.id.rv_items_screen);
        arrayList = new ArrayList<>();
        fake_data_items();
        adapter = new ItemScreenAdapter(getContext(), arrayList);
        rv_items_screen.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_items_screen.setHasFixedSize(true);
        rv_items_screen.setAdapter(adapter);

        return view;
    }

    private void fake_data_items() {
        arrayList.add(new ItemPack("golden swort", 50, 25));
        arrayList.add(new ItemPack("silver swort", 40, 25));
        arrayList.add(new ItemPack("golden armor", 30, 25));
        arrayList.add(new ItemPack("silver armor", 20, 25));
        arrayList.add(new ItemPack("leather shoe", 10, 25));
        arrayList.add(new ItemPack("slim shoe", 50, 25));
        arrayList.add(new ItemPack("hat", 40, 25));
        arrayList.add(new ItemPack("gloves", 30, 25));
        arrayList.add(new ItemPack("horse", 20, 25));
    }

}
