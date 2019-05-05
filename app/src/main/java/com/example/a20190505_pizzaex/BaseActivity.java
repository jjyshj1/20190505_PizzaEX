package com.example.a20190505_pizzaex;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public abstract  class BaseActivity extends AppCompatActivity {

     Context mContext = this;

    public abstract void bindViews();
    public abstract void setValues();
    public abstract void setupEvents();
}
