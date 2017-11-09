package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint mCoordinatePaint;
    private Paint mRectPaint;
    private Paint mTextPaint;
    private final int PADDING = 20;//间隔
    private final int WIDTH_ITEM = 90;//宽度
    int[] heights = {5, 30, 30, 150, 200, 250, 125};
    String[] lables = {"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};
    private final int startXOffset = 100;
    private final int startYOffset = 100;
    private final int height = 400;

    private int width;

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mCoordinatePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mCoordinatePaint.setColor(Color.WHITE);
        mCoordinatePaint.setStrokeWidth(3);
        mRectPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mRectPaint.setColor(0xff72B916);
        mRectPaint.setStyle(Paint.Style.FILL);
        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(Color.WHITE);
        mTextPaint.setTextSize(30);

        int size = lables.length;
        width = size * WIDTH_ITEM + (size + 1) * PADDING;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        //绘制坐标系
        canvas.drawLine(startXOffset, startYOffset, startXOffset, startYOffset + height, mCoordinatePaint);
        canvas.drawLine(startXOffset, startYOffset + height, startXOffset + width, startYOffset + height, mCoordinatePaint);

        int lastPosition = startXOffset - WIDTH_ITEM;
        for (int i = 0; i < lables.length; i++) {
            canvas.drawRect(lastPosition + WIDTH_ITEM + PADDING, startYOffset + height - heights[i], lastPosition + WIDTH_ITEM * 2 + PADDING, startYOffset + height, mRectPaint);
            canvas.drawText(lables[i], lastPosition + WIDTH_ITEM + PADDING + (WIDTH_ITEM - mTextPaint.measureText(lables[i])) / 2, startYOffset + height + 60, mTextPaint);
            lastPosition = lastPosition + WIDTH_ITEM + PADDING;
        }


    }
}