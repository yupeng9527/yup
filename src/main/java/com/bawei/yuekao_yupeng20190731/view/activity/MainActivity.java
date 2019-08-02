package com.bawei.yuekao_yupeng20190731.view.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.bawei.yuekao_yupeng20190731.R;
import com.bawei.yuekao_yupeng20190731.view.fragment.SouFragment;
import com.bawei.yuekao_yupeng20190731.view.fragment.WebFragment;

/*
* 姓名：于鹏
* 时间：2019年7月31日09:57:08
* 功能：Fragment+TabLayout
* */public class MainActivity extends BaseView {
    private FragmentManager manager;
    private SouFragment souFragment;
    private WebFragment webFragment;
    private RadioGroup group;
    @Override
    int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    void initfind() {
    manager = getSupportFragmentManager();
    souFragment = new SouFragment();
    webFragment = new WebFragment();
    group = findViewById(R.id.group);
    }

    @Override
    void initData() {
  manager.beginTransaction()
          .add(R.id.frag,souFragment)
          .add(R.id.frag,webFragment)
          .show(souFragment)
          .hide(webFragment)
          .commit();
  group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(RadioGroup group, int checkedId) {
          FragmentTransaction transaction = manager.beginTransaction();
          switch (checkedId){
              case R.id.main_but:
                  transaction.show(souFragment)
                          .hide(webFragment);
                  break;
              case R.id.main_but1:
                  transaction.show(webFragment)
                          .hide(souFragment);
                  break;
          }
          transaction.commit();
      }
  });
    }

    @Override
    void initListen() {

    }


}
