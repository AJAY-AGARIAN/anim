package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class lifeGoweb extends Activity {

    public WebView lifegoweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goweb);
       lifegoweb = (WebView) findViewById(R.id.goweb);
        lifegoweb.setWebViewClient(new WebViewClient());
        lifegoweb.getSettings().setJavaScriptEnabled(true);
        lifegoweb.getSettings().setGeolocationEnabled(true);
        //download listner
        lifegoweb.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
            switch (lifeShowlist.num4life) {
                case 0:
                    lifegoweb.loadUrl("https://todo.microsoft.com/en-us");
                    break;
                case 1:
                    lifegoweb.loadUrl("https://minutes.io/");
                    break;
                case 2:
                    lifegoweb.loadUrl("https://ifttt.com/about");
                    break;
                case 3:
                    lifegoweb.loadUrl("https://namechk.com/");
                    break;
                case 4:
                    lifegoweb.loadUrl("https://www.headspace.com/");
                    break;
                case 5:
                    lifegoweb.loadUrl("https://buffer.com/");
                    break;
                case 6:
                    lifegoweb.loadUrl("https://upwork.com/");
                    break;
            }
    }
    @Override
    public void onBackPressed() {
        if(lifegoweb.canGoBack()){
            lifegoweb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}