package com.example.sidrajawaid.day2_demolistview;

public class ModelClass {
    public static final int RECTANGLE=0;
    public static final int TILE=1;
    public static final int BANNER=2;

    public int TYPE;
    public String TEXT;
    public int IMAGE;

    public ModelClass(int type,int image)
    {
        this.TYPE=type;
        this.IMAGE=image;

    }
    public ModelClass(int type,int image,String text)
    {
        this.TYPE=type;

        this.IMAGE=image;
        this.TEXT=text;
    }





}
