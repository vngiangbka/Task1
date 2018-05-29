package com.product.ygd.task1.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.product.ygd.task1.R;
import com.product.ygd.task1.model.ItemPack;
import com.product.ygd.task1.model.StorePack;

import java.util.ArrayList;

public class ItemScreenAdapter extends RecyclerView.Adapter<ItemScreenAdapter.ItemsViewHolder> {
    LayoutInflater inflater;
    ArrayList<ItemPack> arrayList;


    public ItemScreenAdapter(Context context,ArrayList<ItemPack> arrayList){
        inflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_items, parent, false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
        ItemPack item = arrayList.get(position);
        holder.tv_items_pack_name.setText(item.getItem_pack_name());
        holder.tv_items_pack_value.setText(String.valueOf(item.getItem_pack_value()));
        holder.tv_items_pack_cost.setText(String.valueOf(item.getItem_pack_cost()));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ItemsViewHolder extends RecyclerView.ViewHolder {
        TextView tv_items_pack_name;
        TextView tv_items_pack_value;
        LinearLayout ll_items_pack_button_buy;
        TextView tv_items_pack_cost;

        ItemsViewHolder(View itemView) {
            super(itemView);

            tv_items_pack_name = itemView.findViewById(R.id.tv_items_pack_name);
            tv_items_pack_value = itemView.findViewById(R.id.tv_items_pack_value);
            ll_items_pack_button_buy = itemView.findViewById(R.id.ll_items_pack_button_buy);
            tv_items_pack_cost = itemView.findViewById(R.id.tv_items_pack_cost);

        }
    }
}
