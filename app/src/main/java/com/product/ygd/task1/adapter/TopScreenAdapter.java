package com.product.ygd.task1.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.product.ygd.task1.R;
import com.product.ygd.task1.model.UserInfo;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class TopScreenAdapter extends RecyclerView.Adapter<TopScreenAdapter.MyViewHolder> {

    LayoutInflater layoutInflater;
    ArrayList<UserInfo> arrayList;


    public TopScreenAdapter(Context context, ArrayList<UserInfo> arrayList) {
        layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_top_user_info, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        UserInfo item = arrayList.get(position);

        switch (item.getUser_rank()) {
            case 1:
                holder.iv_top_user_best_rank.setVisibility(View.VISIBLE);
                holder.iv_top_user_best_rank.setImageResource(R.drawable.ico_chart1);
                holder.tv_top_user_name.setTextColor(Color.parseColor("#F7C352"));
                holder.tv_top_user_point.setTextColor(Color.parseColor("#F7C352"));
                break;
            case 2:
                holder.iv_top_user_best_rank.setVisibility(View.VISIBLE);
                holder.iv_top_user_best_rank.setImageResource(R.drawable.ico_chart2);
                holder.tv_top_user_name.setTextColor(Color.parseColor("#89FF9D"));
                holder.tv_top_user_point.setTextColor(Color.parseColor("#89FF9D"));
                break;
            case 3:
                holder.iv_top_user_best_rank.setVisibility(View.VISIBLE);
                holder.iv_top_user_best_rank.setImageResource(R.drawable.ico_chart3);
                holder.tv_top_user_name.setTextColor(Color.parseColor("#81FFEF"));
                holder.tv_top_user_point.setTextColor(Color.parseColor("#81FFEF"));
                break;
            default:
                holder.tv_top_user_lower_rank.setText(String.valueOf(item.getUser_rank()));
                holder.tv_top_user_name.setText(item.getUser_name());
                holder.tv_top_user_point.setText(String.valueOf(item.getUser_point()));
                break;
        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_top_user_best_rank;
        TextView tv_top_user_lower_rank;
        CircleImageView iv_top_user_avatar;
        TextView tv_top_user_name;
        TextView tv_top_user_point;

        MyViewHolder(View itemView) {
            super(itemView);

            iv_top_user_best_rank = itemView.findViewById(R.id.iv_top_user_best_rank);
            tv_top_user_lower_rank = itemView.findViewById(R.id.tv_top_user_lower_rank);
            iv_top_user_avatar = itemView.findViewById(R.id.iv_top_user_avatar);
            tv_top_user_name = itemView.findViewById(R.id.tv_top_user_name);
            tv_top_user_point = itemView.findViewById(R.id.tv_top_user_point);

        }
    }

}
