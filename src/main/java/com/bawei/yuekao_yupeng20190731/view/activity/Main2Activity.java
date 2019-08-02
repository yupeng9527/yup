package com.bawei.yuekao_yupeng20190731.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.bawei.yuekao_yupeng20190731.R;
import com.bawei.yuekao_yupeng20190731.model.bean.Bean;
import com.bawei.yuekao_yupeng20190731.model.httpurl.HttpUtil;
import com.bawei.yuekao_yupeng20190731.view.adapter.MyAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private String str="http://172.17.8.100/small/commodity/v1/findCommodityByKeyword?page=1&count=10&keyword=%E7%94%B5%E8%84%91";
    private ListView listView;
    private List<Bean> list = new ArrayList<>();
    private HttpUtil httpUtil = HttpUtil.getHttpUtil();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=findViewById(R.id.lisw);
        getdata();
        MyAdapter adapter = new MyAdapter(Main2Activity.this,list);
        listView.setAdapter(adapter);

    }

    private void getdata() {
        httpUtil.Task(str, new HttpUtil.Back() {
            @Override
            public void getData(String s) {
                try {
                    JSONObject object = new JSONObject(s);
                    JSONArray result = object.getJSONArray("result");
                    for (int i = 0; i < result.length(); i++) {
                        JSONObject obj = (JSONObject) result.get(i);
                        String commodityName = obj.getString("commodityName");
                        String masterPic = obj.getString("masterPic");
                        list.add(new Bean(commodityName,masterPic));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
