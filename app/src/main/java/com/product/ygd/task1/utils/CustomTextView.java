package com.product.ygd.task1.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class CustomTextView extends AppCompatTextView {

    private static final String ANDROID_SCHEMA = "http://schemas.android.com/apk/res/android";

    public CustomTextView(Context context) {
        super(context);
        if (!isInEditMode()) {
            setTypeface(getTypefaceFont(context,"fonts/icielsoupofjustice.ttf"));
        }
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context,attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context,attrs);
    }

    private void applyCustomFont(Context context, AttributeSet attrs) {
        if (!isInEditMode()) {
            int textStyle = attrs.getAttributeIntValue(ANDROID_SCHEMA, "textStyle", Typeface.NORMAL);
            Typeface customFont = TypeFaceProvider.getTypeFace(context, textStyle);
            setTypeface(customFont);
        }
    }
    public static Typeface getTypefaceFont(Context context, String fontName) {
        return Typeface.createFromAsset(context.getAssets(), fontName);
    }


}
