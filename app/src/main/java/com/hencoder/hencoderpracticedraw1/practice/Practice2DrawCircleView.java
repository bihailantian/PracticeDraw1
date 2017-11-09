package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint mPaint;

    public Practice2DrawCircleView(Context context) {
        super(context);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     *初始化
     */
    private void init(){
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        //实心圆
        canvas.drawCircle(150,120,100,mPaint);

        //空心圆
        mPaint.setStrokeWidth(3);
        mPaint.setStyle(Style.STROKE);
        canvas.drawCircle(400,120,100,mPaint);

        //蓝色实心圆
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Style.FILL);
        canvas.drawCircle(150,350,100,mPaint);

        //线宽为 20 的空心圆
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(20);
        mPaint.setStyle(Style.STROKE);
        canvas.drawCircle(400,350,100,mPaint);
        mPaint.reset();


    }
}
