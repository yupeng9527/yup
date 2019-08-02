package com.bawei.yuekao_yupeng20190731.model.httpurl;

import android.util.Log;
/*
* 姓名：于鹏
* 时间：2019年7月31日09:13:50
* 功能：全局异常捕获
* */
public class Quanjubuhuo implements Thread.UncaughtExceptionHandler {
    private static Quanjubuhuo quanjubuhuo;
    private Quanjubuhuo(){

    }
    public static Quanjubuhuo getQuanjubuhuo(){
        if (quanjubuhuo == null){
            return new Quanjubuhuo();
        }
        return quanjubuhuo;
    }
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        Log.i("错误信息",e.getMessage());
        Log.i("错误信息",e.getLocalizedMessage());
    }
}
