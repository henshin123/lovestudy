package com.example.henshin.study.floatbackground;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

import com.dean.library.FloatObject;

/**
 * Created by DeanGuo on 1/7/17.
 */

public class FloatRect extends FloatObject {

    int rotate;
    int width;

    public FloatRect(float posX, float posY, int rotate, int width) {
        super(posX, posY);
        this.rotate = rotate;
        this.width = width;
        setAlpha(88);
        setColor(Color.WHITE);
    }
    @Override
    public void drawFloatObject(Canvas canvas, float x, float y, Paint paint) {
        RectF f = new RectF(x-width/8, y-width, x+width/8, y+width);
        canvas.drawRect(f, paint);
    }
}
