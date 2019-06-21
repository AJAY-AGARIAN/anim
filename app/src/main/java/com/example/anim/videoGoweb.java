package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class videoGoweb extends Activity {

    public WebView videogoweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goweb);
        videogoweb = (WebView) findViewById(R.id.goweb);
        videogoweb.setWebViewClient(new WebViewClient());
        videogoweb.getSettings().setJavaScriptEnabled(true);
        videogoweb.getSettings().setGeolocationEnabled(true);
        //download listner
       videogoweb.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
            switch (videoShowlist.num4video) {
                case 0:
                    videogoweb.loadUrl("https://www.pexels.com/videos/");
                    break;
                case 1:
                    videogoweb.loadUrl("https://talltweets.com/");
                    break;
                case 2:
                    videogoweb.loadUrl("https://flipanim.com/");
                    break;
                case 3:
                    videogoweb.loadUrl("https://www.powtoon.com/home/?");
                    break;
                case 4:
                    videogoweb.loadUrl("https://spark.adobe.com/home/");
                    break;
                case 5:
                    videogoweb.loadUrl("https://promo.com/");
                    break;
                case 6:
                    videogoweb.loadUrl("http://zerodollarmovies.com/");
                    break;
        }
    }
    @Override
    public void onBackPressed() {
        if(videogoweb.canGoBack()){
            videogoweb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}