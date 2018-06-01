package com.product.ygd.task1;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.product.ygd.task1.utils.Constants;
import com.product.ygd.task1.utils.CustomTextView;
import com.product.ygd.task1.utils.LanguageUtils;
import com.product.ygd.task1.utils.LocaleHelper;

import java.util.Locale;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = "FullScreenDialog";

    ImageView iv_setting_dialog_button_exit;

    LinearLayout ll_setting_dialog_language;
    LinearLayout ll_setting_dialog_bg_sound;
    LinearLayout ll_setting_dialog_sfx_sound;
    LinearLayout ll_setting_dialog_feedback;
    LinearLayout ll_setting_dialog_quit_game;

    ImageView iv_setting_dialog_language_logo;
    ImageView iv_setting_dialog_bg_sound_logo;
    ImageView iv_setting_dialog_sfx_sound_logo;
    ImageView iv_setting_dialog_feedback_logo;

    CustomTextView tv_setting_dialog_title;
    CustomTextView tv_setting_dialog_language_title;
    CustomTextView tv_setting_dialog_language_state;
    CustomTextView tv_setting_dialog_bg_sound_title;
    CustomTextView tv_setting_dialog_bg_sound_state;
    CustomTextView tv_setting_dialog_sfx_sound_title;
    CustomTextView tv_setting_dialog_sfx_sound_state;
    CustomTextView tv_setting_dialog_feedback_title;
    CustomTextView tv_setting_dialog_feedback_state;
    CustomTextView tv_setting_dialog_quit_game_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_setting);

        iv_setting_dialog_button_exit = findViewById(R.id.iv_setting_dialog_button_exit);
        tv_setting_dialog_title = findViewById(R.id.tv_setting_dialog_title);

        ll_setting_dialog_language = findViewById(R.id.ll_setting_dialog_language);
        ll_setting_dialog_bg_sound = findViewById(R.id.ll_setting_dialog_bg_sound);
        ll_setting_dialog_sfx_sound = findViewById(R.id.ll_setting_dialog_sfx_sound);
        ll_setting_dialog_feedback = findViewById(R.id.ll_setting_dialog_feedback);
        ll_setting_dialog_quit_game = findViewById(R.id.ll_setting_dialog_quit_game);

        iv_setting_dialog_language_logo = findViewById(R.id.iv_setting_dialog_language_logo);
        iv_setting_dialog_bg_sound_logo = findViewById(R.id.iv_setting_dialog_bg_sound_logo);
        iv_setting_dialog_sfx_sound_logo = findViewById(R.id.iv_setting_dialog_sfx_sound_logo);
        iv_setting_dialog_feedback_logo = findViewById(R.id.iv_setting_dialog_feedback_logo);

        tv_setting_dialog_language_title = findViewById(R.id.tv_setting_dialog_language_title);
        tv_setting_dialog_language_state = findViewById(R.id.tv_setting_dialog_language_state);
        tv_setting_dialog_bg_sound_title = findViewById(R.id.tv_setting_dialog_bg_sound_title);
        tv_setting_dialog_bg_sound_state = findViewById(R.id.tv_setting_dialog_bg_sound_state);
        tv_setting_dialog_sfx_sound_title = findViewById(R.id.tv_setting_dialog_sfx_sound_title);
        tv_setting_dialog_sfx_sound_state = findViewById(R.id.tv_setting_dialog_sfx_sound_state);
        tv_setting_dialog_feedback_title = findViewById(R.id.tv_setting_dialog_feedback_title);
        tv_setting_dialog_feedback_state = findViewById(R.id.tv_setting_dialog_feedback_state);
        tv_setting_dialog_quit_game_title = findViewById(R.id.tv_setting_dialog_quit_game_title);

        iv_setting_dialog_button_exit.setOnClickListener(this);
        ll_setting_dialog_language.setOnClickListener(this);
        ll_setting_dialog_bg_sound.setOnClickListener(this);
        ll_setting_dialog_sfx_sound.setOnClickListener(this);
        ll_setting_dialog_feedback.setOnClickListener(this);
        ll_setting_dialog_quit_game.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_setting_dialog_language:
//                String state = tv_setting_dialog_language_state.getText().toString();
//                if (state.equals("en")) {
//                    iv_setting_dialog_language_logo.setImageResource(R.drawable.flag_vi);
//                    tv_setting_dialog_language_state.setText("vn");
//                    tv_setting_dialog_language_title.setText("Ngôn Ngữ");
//                    setLocale("vi");
//                } else {
//                    iv_setting_dialog_language_logo.setImageResource(R.drawable.flag_en);
//                    tv_setting_dialog_language_state.setText("en");
//                    tv_setting_dialog_language_title.setText("Language");
//                    setLocale("en");
//                }

               openLanguageScreen();
                break;

            case R.id.ll_setting_dialog_bg_sound:
                String state_bg_sound = tv_setting_dialog_bg_sound_state.getText().toString();
                switch (state_bg_sound) {
                    case "on":
                        iv_setting_dialog_bg_sound_logo.setImageResource(R.drawable.ico_sound_off);
                        tv_setting_dialog_bg_sound_state.setText("off");
                        break;
                    case "off":
                        iv_setting_dialog_bg_sound_logo.setImageResource(R.drawable.ico_sound_on);
                        tv_setting_dialog_bg_sound_state.setText("on");
                        break;
                    case "mở":
                        iv_setting_dialog_bg_sound_logo.setImageResource(R.drawable.ico_sound_off);
                        tv_setting_dialog_bg_sound_state.setText("tắt");
                        break;
                    default:
                        iv_setting_dialog_bg_sound_logo.setImageResource(R.drawable.ico_sound_on);
                        tv_setting_dialog_bg_sound_state.setText("mở");
                        break;
                }
                break;
            case R.id.ll_setting_dialog_sfx_sound:
                String state_sfx_sound = tv_setting_dialog_sfx_sound_state.getText().toString();
                switch (state_sfx_sound) {
                    case "on":
                        iv_setting_dialog_sfx_sound_logo.setImageResource(R.drawable.ico_sound_off);
                        tv_setting_dialog_sfx_sound_state.setText("off");
                        break;
                    case "off":
                        iv_setting_dialog_sfx_sound_logo.setImageResource(R.drawable.ico_sound_on);
                        tv_setting_dialog_sfx_sound_state.setText("on");
                        break;
                    case "mở":
                        iv_setting_dialog_sfx_sound_logo.setImageResource(R.drawable.ico_sound_off);
                        tv_setting_dialog_sfx_sound_state.setText("tắt");
                        break;
                    default:
                        iv_setting_dialog_sfx_sound_logo.setImageResource(R.drawable.ico_sound_on);
                        tv_setting_dialog_sfx_sound_state.setText("mở");
                        break;
                }
                break;
            case R.id.ll_setting_dialog_feedback:

                break;

            case R.id.iv_setting_dialog_button_exit:
                finish();
                break;
        }
    }


    public void setLocale(String lang) {
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        finish();
        Intent refresh = new Intent(this, SettingActivity.class);
        startActivity(refresh);
    }

    public void openLanguageScreen() {
        Intent intent = new Intent(SettingActivity.this, ChangeLanguageActivity.class);
        startActivityForResult(intent, Constants.RequestCode.CHANGE_LANGUAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case Constants.RequestCode.CHANGE_LANGUAGE:
                if (resultCode == RESULT_OK) {
                    updateViewByLanguage();
                }
                break;
        }
    }

    private void updateViewByLanguage() {
        tv_setting_dialog_title.setText(getString(R.string.setting_string_setting));
        tv_setting_dialog_language_title.setText(getString(R.string.setting_string_language));
        tv_setting_dialog_language_state.setText(getString(R.string.setting_string_language_en));
        tv_setting_dialog_bg_sound_title.setText(getString(R.string.setting_string_bg_sound));
        tv_setting_dialog_bg_sound_state.setText(getString(R.string.setting_string_bg_sound_on));
        tv_setting_dialog_sfx_sound_title.setText(getString(R.string.setting_string_sfx_sound));
        tv_setting_dialog_sfx_sound_state.setText(getString(R.string.setting_string_sfx_sound_on));
        tv_setting_dialog_feedback_title.setText(getString(R.string.setting_string_feedback));
        tv_setting_dialog_feedback_state.setText(getString(R.string.setting_string_feedback_send));
        tv_setting_dialog_quit_game_title.setText(getString(R.string.setting_string_quit_game));

    }
}
