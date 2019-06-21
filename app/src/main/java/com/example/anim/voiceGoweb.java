package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class voiceGoweb extends Activity {

    public WebView voicegoweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goweb);
       voicegoweb = (WebView) findViewById(R.id.goweb);
      voicegoweb.setWebViewClient(new WebViewClient());
        voicegoweb.getSettings().setJavaScriptEnabled(true);
        voicegoweb.getSettings().setGeolocationEnabled(true);
        //download listner
        voicegoweb.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
            switch (voiceShowlist.num4voice) {
                case 0:
                    voicegoweb.loadUrl("https://clyp.it/");
                    break;
                case 1:
                    voicegoweb.loadUrl("https://www.noisli.com/");
                    break;
                case 2:
                    voicegoweb.loadUrl("https://anchor.fm/");
                    break;
                case 3:
                    voicegoweb.loadUrl("https://dictation.io/");
                    break;
            }
    }
    @Override
    public void onBackPressed() {
        if(voicegoweb.canGoBack()){
            voicegoweb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
