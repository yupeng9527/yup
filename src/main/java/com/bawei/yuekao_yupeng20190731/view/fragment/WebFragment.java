package com.bawei.yuekao_yupeng20190731.view.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.bawei.yuekao_yupeng20190731.R;
/*
* 姓名：于鹏
* */
public class WebFragment extends Fragment implements View.OnClickListener {
    private WebView webView;
    private Button button;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_web, container, false);
        initView(view);
        return view;
    }

    @SuppressLint("JavascriptInterface")
    private void initView(View view) {
        webView = view.findViewById(R.id.web);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                return super.onJsAlert(view, url, message, result);
            }
        });
        webView.loadUrl("http://blog.zhaoliang5156.cn/zixunnew/calculator/index.html");
        webView.addJavascriptInterface(new AndroidJs(),"android");
    }

    @Override
    public void onClick(View v) {
    webView.loadUrl("javascript:welcome('"+"于鹏"+"')");
    }

    private class AndroidJs {
        @JavascriptInterface
        public void toast(String val){

            Toast.makeText(getActivity(), val, Toast.LENGTH_SHORT).show();
        }
    }
}
