package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class studygoweb extends Activity {

    public WebView studygoweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goweb);
        studygoweb = (WebView) findViewById(R.id.goweb);
        studygoweb.setWebViewClient(new WebViewClient());
        studygoweb.getSettings().setJavaScriptEnabled(true);
        studygoweb.getSettings().setGeolocationEnabled(true);
        //download listner
        studygoweb.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        if (studyShowlist.num4study == 0) {
            studygoweb.loadUrl("https://slides.com/");
        } else if (studyShowlist.num4study == 1) {
            studygoweb.loadUrl("https://www.codecademy.com/");
        } else if (studyShowlist.num4study == 2) {
            studygoweb.loadUrl("https://www.wolframalpha.com/");
        } else if (studyShowlist.num4study == 3) {
            studygoweb.loadUrl("https://www.grammarly.com/");
        } else if (studyShowlist.num4study == 4) {
            studygoweb.loadUrl("https://www.urbandictionary.com/");
        } else if (studyShowlist.num4study==5) {
            studygoweb.loadUrl("https://www.typing.com/");
        } else if (studyShowlist.num4study == 6) {
            studygoweb.loadUrl("https://www.duolingo.com/");
        } else if (studyShowlist.num4study == 7) {
            studygoweb.loadUrl("https://www.classcentral.com/");
        } else if (studyShowlist.num4study == 8) {
            studygoweb.loadUrl("https://www.instructables.com/");
        }else if (studyShowlist.num4study == 9) {
            studygoweb.loadUrl("https://gohighbrow.com/");
        }else if (studyShowlist.num4study == 10) {
            studygoweb.loadUrl("https://thunkable.com/#/");
        }
    }
    @Override
    public void onBackPressed() {
        if(studygoweb.canGoBack()){
            studygoweb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
