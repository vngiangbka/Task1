package com.product.ygd.task1;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.product.ygd.task1.adapter.LanguageAdapter;
import com.product.ygd.task1.databinding.ActivityChangeLanguageBinding;
import com.product.ygd.task1.model.Language;
import com.product.ygd.task1.utils.ItemClickListener;
import com.product.ygd.task1.utils.LanguageUtils;

public class ChangeLanguageActivity extends AppCompatActivity {

    private LanguageAdapter mLanguageAdapter;
    RecyclerView recyclerViewLanguage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_change_language);
//        recyclerViewLanguage = findViewById(R.id.recycler_view_language);
//        mLanguageAdapter = new LanguageAdapter(LanguageUtils.getLanguageData());
//        mLanguageAdapter.setListener(new ItemClickListener<Language>() {
//            @Override
//            public void onClickItem(int position, Language language) {
//                if (!language.getCode().equals(LanguageUtils.getCurrentLanguage().getCode())) {
//                    onChangeLanguageSuccessfully(language);
//                }
//            }
//        });
//        LinearLayoutManager layoutManager = new LinearLayoutManager(ChangeLanguageActivity.this);
//        recyclerViewLanguage.setLayoutManager(layoutManager);
//        recyclerViewLanguage.setAdapter(mLanguageAdapter);

        ActivityChangeLanguageBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_change_language);
        mLanguageAdapter = new LanguageAdapter(LanguageUtils.getLanguageData());
        mLanguageAdapter.setListener(new ItemClickListener<Language>() {
            @Override
            public void onClickItem(int position, Language language) {
                if (!language.getCode().equals(LanguageUtils.getCurrentLanguage().getCode())) {
                    onChangeLanguageSuccessfully(language);
                }
            }
        });
        LinearLayoutManager layoutManager = new LinearLayoutManager(ChangeLanguageActivity.this);
        binding.recyclerViewLanguage.setLayoutManager(layoutManager);
        binding.recyclerViewLanguage.setAdapter(mLanguageAdapter);


    }

    private void onChangeLanguageSuccessfully(final Language language) {
        mLanguageAdapter.setCurrentLanguage(language);
        LanguageUtils.changeLanguage(language);
        setResult(RESULT_OK, new Intent());
        finish();
    }
}
