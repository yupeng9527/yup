package com.bawei.yuekao_yupeng20190731.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.bawei.yuekao_yupeng20190731.R;
import com.bawei.yuekao_yupeng20190731.view.activity.Main2Activity;

public class SouFragment extends Fragment implements View.OnClickListener {
    private MyLiuView myLiuView;
    private TextView textView;
    private EditText editText;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_sousuo, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        myLiuView = view.findViewById(R.id.liu);
        textView = view.findViewById(R.id.et_s);
        editText = view.findViewById(R.id.et_liu);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.et_s:
                String trim = editText.getText().toString().trim();
                TextView textView1 = new TextView(getActivity());
                editText.setText("");
                textView1.setText(trim);
                textView1.setBackgroundColor(R.attr.color);
                myLiuView.addView(textView1);
                textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(),Main2Activity.class));
                    }
                });
                break;
        }
    }
}
