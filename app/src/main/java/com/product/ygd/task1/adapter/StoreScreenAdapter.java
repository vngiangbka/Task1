package com.product.ygd.task1.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.product.ygd.task1.R;
import com.product.ygd.task1.model.StorePack;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class StoreScreenAdapter extends RecyclerView.Adapter<StoreScreenAdapter.StoreViewHolder> {
    LayoutInflater layoutInflater;
    ArrayList<StorePack> arrayList;

    public StoreScreenAdapter(Context context, ArrayList<StorePack> arrayList) {
        layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public StoreScreenAdapter.StoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_store_pack, parent, false);
        return new StoreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoreViewHolder holder, int position) {

        StorePack store = arrayList.get(position);
        holder.tv_store_pack_name.setText(store.getStore_pack_name());
        holder.tv_store_pack_value.setText(editNumber(store.getStore_pack_value()));
        holder.tv_store_pack_cost.setText(editNumber(store.getStore_pack_cost()));

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    class StoreViewHolder extends RecyclerView.ViewHolder {
        TextView tv_store_pack_name;
        TextView tv_store_pack_value;
        LinearLayout ll_store_pack_button_buy;
        TextView tv_store_pack_cost;

        StoreViewHolder(View itemView) {
            super(itemView);

            tv_store_pack_name = itemView.findViewById(R.id.tv_store_pack_name);
            tv_store_pack_value = itemView.findViewById(R.id.tv_store_pack_value);
            ll_store_pack_button_buy = itemView.findViewById(R.id.ll_store_pack_button_buy);
            tv_store_pack_cost = itemView.findViewById(R.id.tv_store_pack_cost);

        }
    }


    private String editNumber(int value) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(value);
    }

}
