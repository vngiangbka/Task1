package com.product.ygd.task1;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import com.product.ygd.task1.adapter.TopScreenAdapter;
import com.product.ygd.task1.model.UserInfo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rv_top_screen;
    LinearLayout ll_top_screen_button_back;
    LinearLayout ll_top_screen_button_global;
    LinearLayout ll_top_screen_button_friend;
    LinearLayout ll_top_screen_button_reward;

    TopScreenAdapter adapter;
    ArrayList<UserInfo> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_top_screen = findViewById(R.id.rv_top_screen);
        ll_top_screen_button_back = findViewById(R.id.ll_top_screen_button_back);
        ll_top_screen_button_global = findViewById(R.id.ll_top_screen_button_global);
        ll_top_screen_button_friend = findViewById(R.id.ll_top_screen_button_friend);
        ll_top_screen_button_reward = findViewById(R.id.ll_top_screen_button_reward);

        ll_top_screen_button_reward.setOnClickListener(this);


        arrayList = new ArrayList<>();
        fake_data();
        adapter = new TopScreenAdapter(MainActivity.this, arrayList);
        rv_top_screen.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rv_top_screen.setHasFixedSize(true);
        rv_top_screen.setAdapter(adapter);

    }

    private void fake_data() {
        arrayList.add(new UserInfo(1, "", "Christie Wallace", 999999999));
        arrayList.add(new UserInfo(2, "", "Annaliese Frederick", 900123));
        arrayList.add(new UserInfo(3, "", "Tia Goulding", 890213));
        arrayList.add(new UserInfo(4, "", "Christie Wallace", 789123));
        arrayList.add(new UserInfo(5, "", "Emillie Mcguire", 678213));
        arrayList.add(new UserInfo(6, "", "Jaimee Zimmerman", 567899));
        arrayList.add(new UserInfo(7, "", "Elsie-Mae Reynolds", 456789));
        arrayList.add(new UserInfo(8, "", "Yazmin Woolley", 345678));
        arrayList.add(new UserInfo(9, "", "Mack Parry", 234567));
        arrayList.add(new UserInfo(10, "", "CNur Mosley", 123456));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_top_screen_button_reward:
                ViewDialog alert = new ViewDialog();
                alert.showDialog(MainActivity.this);
                break;
        }
    }

    public class ViewDialog {

        void showDialog(Activity activity) {
            final Dialog dialog = new Dialog(activity);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.dialog_setting);

//            TextView text = (TextView) dialog.findViewById(R.id.text_dialog);
//            text.setText(msg);
//
//            Button dialogButton = (Button) dialog.findViewById(R.id.btn_dialog);
//            dialogButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    dialog.dismiss();
//                }
//            });

            dialog.show();

        }
    }

}
