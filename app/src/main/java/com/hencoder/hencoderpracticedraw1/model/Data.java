package com.hencoder.hencoderpracticedraw1.model;

import android.graphics.Color;

/**
 * 柱状图数据
 */

public class Data {

    private String name; //名称
    private float hight; //高度
    private int color;   //颜色

    public Data(String name, float hight, int color) {
        this.name = name;
        this.hight = hight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHight() {
        return hight;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", hight=" + hight +
                ", color=" + color +
                '}';
    }
}
