package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice11PieChartView extends View {

    private static final String TAG = "Practice11PieChartView";
    private Paint mPaint;
    private float left;
    private float top;
    private float right;
    private float bottom;
    private int mMiddleWidth;
    private int mMiddleHeight;
    private int mRadius;


    public Practice11PieChartView(Context context) {
        super(context);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private void init() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);

    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);


//        mMiddleWidth = getWidth() / 2;
//        mMiddleHeight = getHeight() / 2;

        //getMeasuredHeight() 是用于测量的高度，也就是View实际的高度
        //getHeight() 是指在屏幕上显示出来的高度
        mMiddleWidth = getMeasuredHeight() / 2;
        mMiddleHeight = getMeasuredHeight() / 2;

        mRadius = getMeasuredHeight() / 3;

        left = mMiddleWidth - mRadius;
        top = mMiddleHeight - mRadius;
        right = mMiddleWidth + mRadius;
        bottom = mMiddleHeight + mRadius;
        Log.d(TAG, "mMiddleWidth=" + mMiddleWidth + "     mMiddleHeight=" + mMiddleHeight + "  mRadius=" + mRadius);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        mPaint.setStyle(Paint.Style.FILL);


        //Lollipop
        mPaint.setColor(Color.RED);
        canvas.drawArc(left-20, top-20, right-20, bottom-20, 190, 135, true, mPaint);

        //Marshmallow
        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(left, top, right, bottom, -30, 30, true, mPaint);

        //Froyo
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(left, top, right, bottom, 0, 2, true, mPaint);

        //Gingerbread
        mPaint.setColor(Color.parseColor("#FF5D0B94"));
        canvas.drawArc(left, top, right, bottom, 2, 10, true, mPaint);

        //Ice Cream Sandwich
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(left, top, right, bottom, 15, 5, true, mPaint);

        //Jelly Bean
        mPaint.setColor(Color.parseColor("#73BA18"));
        canvas.drawArc(left, top, right, bottom, 20, 45, true, mPaint);

        //Kitkat
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(left, top, right, bottom, 70, 110, true, mPaint);
    }
}
