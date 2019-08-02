package com.bawei.yuekao_yupeng20190731.presenter;

import com.bawei.yuekao_yupeng20190731.view.activity.MainActivity;

public class HomePresenter<V> {
    private V mainView;
    public void attarach(MainActivity mainActivity){
        mainView = (V) mainActivity;
    }
    public void decath(){
        mainView = null;
    }
    public V getdata(){
        return mainView;
    }
}
