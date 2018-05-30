package com.example.henshin.study.floatbackground;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.dean.library.FloatObject;

/**
 * Created by DeanGuo on 1/7/17.
 */

public class FloatText extends FloatObject {
    String text;

    public FloatText(float posX, float posY, String text) {
        super(posX, posY);
        this.text = text;
        setAlpha(88);
        setColor(Color.WHITE);
    }

    @Override
    public void drawFloatObject(Canvas canvas, float x, float y, Paint paint) {
        paint.setTextSize(65);
        canvas.drawText(text, x, y, paint);
    }
}
