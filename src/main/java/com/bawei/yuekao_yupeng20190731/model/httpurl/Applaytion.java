package com.bawei.yuekao_yupeng20190731.model.httpurl;

import android.app.Application;
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class Applaytion extends Application {
    private Context context;
    private static RequestQueue requestQueue;
    private Quanjubuhuo quanjubuhuo;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        quanjubuhuo = Quanjubuhuo.getQuanjubuhuo();
       // Thread.setDefaultUncaughtExceptionHandler(quanjubuhuo);
        requestQueue = Volley.newRequestQueue(context);
    }
    public static RequestQueue getRequestQueue(){
        return requestQueue;
    }
}
