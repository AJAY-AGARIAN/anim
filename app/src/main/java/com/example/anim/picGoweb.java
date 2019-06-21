package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class picGoweb  extends Activity {

    public WebView picgoweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goweb);
        picgoweb = (WebView) findViewById(R.id.goweb);
        picgoweb.setWebViewClient(new WebViewClient());
        picgoweb.getSettings().setJavaScriptEnabled(true);
        picgoweb.getSettings().setGeolocationEnabled(true);
        //download listner
        picgoweb.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


            switch (picShowlist.num4pic) {
                case 0:
                    picgoweb.loadUrl("https://unsplash.com/");
                    break;
                case 1:
                    picgoweb.loadUrl("https://photos.icons8.com/creator");
                    break;
                case 2:
                    picgoweb.loadUrl("https://www.pixton.com/");
                    break;
                case 3:
                    picgoweb.loadUrl("https://designer.gravit.io/");
                    break;
                case 4:
                    picgoweb.loadUrl("https://vectr.com/tmp/a5msD19CI/fuPSX56YD");
                    break;
                case 5:
                    picgoweb.loadUrl("https://squoosh.app/");
                    break;
                case 6:
                    picgoweb.loadUrl("https://color.adobe.com/create");
                    break;
                case 7:
                    picgoweb.loadUrl("https://www.canva.com/");
                    break;
                case 8:
                    picgoweb.loadUrl("http://kleki.com/");
                    break;
                case 9:
                    picgoweb.loadUrl("https://www.draw.io/");
                    break;
                case 10:
                    picgoweb.loadUrl("http://exif.regex.info/exif.cgi");
                    break;
                case 11:
                    picgoweb.loadUrl("https://screenshot.guru/");
                    break;
                case 12:
                    picgoweb.loadUrl("https://www.labnol.org/internet/mobile-reverse-image-search/29014/");
                    break;
                case 13:
                    picgoweb.loadUrl("https://www.autodraw.com/");
                    break;
        }
    }
    @Override
    public void onBackPressed() {
        if(picgoweb.canGoBack()){
            picgoweb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }

}