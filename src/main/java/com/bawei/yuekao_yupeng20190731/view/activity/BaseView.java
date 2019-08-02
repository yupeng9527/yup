package com.bawei.yuekao_yupeng20190731.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseView extends AppCompatActivity {
    abstract int getLayout();
    abstract void initfind();
    abstract void initData();
    abstract void initListen();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initfind();
        initData();
        initListen();
    }
}
