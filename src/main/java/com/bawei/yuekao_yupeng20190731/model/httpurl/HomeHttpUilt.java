package com.bawei.yuekao_yupeng20190731.model.httpurl;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.bawei.yuekao_yupeng20190731.model.bean.RecylaBean;
import com.bawei.yuekao_yupeng20190731.model.conte.Homeinterface;
import com.google.gson.Gson;

public class HomeHttpUilt {
private static HomeHttpUilt homeHttpUilt;
private HomeHttpUilt(){

}
public static HomeHttpUilt getHomeHttpUilt(){
    if (homeHttpUilt == null){
        return new HomeHttpUilt();
    }
    return homeHttpUilt;
}
public void getrecaly(final Homeinterface.CallBackData callBackData){
    StringRequest stringRequest = new StringRequest(Httpurl.recal, new Response.Listener<String>() {
        @Override
        public void onResponse(String response) {
            Gson gson = new Gson();
            RecylaBean recylaBean = gson.fromJson(response,RecylaBean.class);
        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {

        }
    });
    Applaytion.getRequestQueue().add(stringRequest);
}
}
