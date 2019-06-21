package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fontGoweb extends Activity {

    public WebView fontgoweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goweb);
       fontgoweb = (WebView) findViewById(R.id.goweb);
        fontgoweb.setWebViewClient(new WebViewClient());
        fontgoweb.getSettings().setJavaScriptEnabled(true);
        fontgoweb.getSettings().setGeolocationEnabled(true);
        //download listner
        fontgoweb.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
            switch (fontShowlist.num4font) {
                case 0:
                    fontgoweb.loadUrl("https://www.myfonts.com/WhatTheFont/");
                    break;
                case 1:
                    fontgoweb.loadUrl("https://fonts.google.com/");
                    break;
                case 2:
                    fontgoweb.loadUrl("https://fontstruct.com/");
                    break;
                case 3:
                    fontgoweb.loadUrl("https://www.calligraphr.com/en/");
                    break;
                case 4:
                    fontgoweb.loadUrl("https://www.onlineocr.net/");
                    break;
            }

    }
    @Override
    public void onBackPressed() {
        if(fontgoweb.canGoBack()){
            fontgoweb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}