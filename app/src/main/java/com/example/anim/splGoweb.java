package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class splGoweb extends Activity {

    public WebView splgoweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goweb);
        splgoweb = (WebView) findViewById(R.id.goweb);
        splgoweb.setWebViewClient(new WebViewClient());
        splgoweb.getSettings().setJavaScriptEnabled(true);
        splgoweb.getSettings().setGeolocationEnabled(true);
        //download listner
        splgoweb.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
            switch (splShowlist.num4spl) {
                case 0:
                    splgoweb.loadUrl("https://fast.com/");
                    break;
                case 1:
                    splgoweb.loadUrl("https://copychar.cc/");
                    break;
                case 2:
                    splgoweb.loadUrl("https://www.flaticon.com/");
                    break;
                case 3:
                    splgoweb.loadUrl("https://www.random.org/");
                    break;
                case 4:
                    splgoweb.loadUrl("https://earn.com/");
                    break;
                case 5:
                    splgoweb.loadUrl("https://remotedesktop.google.com/home");
                    break;
                case 6:
                    splgoweb.loadUrl("https://www.homestyler.com/int/");
                    break;
                case 7:
                    splgoweb.loadUrl("https://wetransfer.com/");
                    break;
                case 8:
                    splgoweb.loadUrl("https://onedoes.github.io/snapdrop/");
                    break;
                case 9:
                    splgoweb.loadUrl("http://hundredzeros.com/");
                    break;
                case 10:
                    splgoweb.loadUrl("https://www.noteflight.com/");
                    break;
                case 11:
                    splgoweb.loadUrl("https://beta.midomi.com/");
                    break;
                case 12:
                    splgoweb.loadUrl("https://tinychat.com/#category=all");
                    break;
                case 13:
                    splgoweb.loadUrl("https://www.google.com/maps/d/u/0/");
                    break;
                case 14:
                    splgoweb.loadUrl("https://www.snopes.com/");
                    break;
                case 15:
                    splgoweb.loadUrl("https://carrd.co/");
                    break;
                case 16:
                    splgoweb.loadUrl("https://artsandculture.google.com/partner");
                    break;
                case 17:
                    splgoweb.loadUrl("https://camelcamelcamel.com/");
                    break;
                case 18:
                    splgoweb.loadUrl("https://www.10minutemail.com/");
                    break;
                case 19:
                    splgoweb.loadUrl("https://ctrlq.org/maps/where/");
                    break;
            }

    }
    @Override
    public void onBackPressed() {
        if(splgoweb.canGoBack()){
            splgoweb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
