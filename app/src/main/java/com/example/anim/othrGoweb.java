package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class othrGoweb extends Activity {

    public WebView othergoweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goweb);
        othergoweb = (WebView) findViewById(R.id.goweb);
        othergoweb.setWebViewClient(new WebViewClient());
        othergoweb.getSettings().setJavaScriptEnabled(true);
        othergoweb.getSettings().setGeolocationEnabled(true);
        //download listner
        othergoweb.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
            switch (othrShowlist.num4other) {
                case 0:
                    othergoweb.loadUrl("https://apify.com/");
                    break;
                case 1:
                    othergoweb.loadUrl("https://sway.office.com/");
                    break;
                case 2:
                    othergoweb.loadUrl("https://ctrlq.org/maps/where/");
                    break;
                case 3:
                    othergoweb.loadUrl("https://archive.is/");
                    break;
                case 4:
                    othergoweb.loadUrl("https://virusscan.jotti.org/en");
                    break;
                case 5:
                    othergoweb.loadUrl("https://www.flightstats.com/v2/");
                    break;
                case 6:
                    othergoweb.loadUrl("https://everytimezone.com/");
                    break;
                case 7:
                    othergoweb.loadUrl("http://e.ggtimer.com/");
                    break;
                case 8:
                    othergoweb.loadUrl("https://www.pdfescape.com/");
                    break;
                case 9:
                    othergoweb.loadUrl("https://file.pizza/");
                    break;
                case 10:
                    othergoweb.loadUrl("https://www.similarsites.com/");
                    break;
                case 11:
                    othergoweb.loadUrl("https://bubbl.us/");
                    break;
                case 12:
                    othergoweb.loadUrl("https://privnote.com/");
                    break;
                case 13:
                    othergoweb.loadUrl("https://domains.google.com");
                    break;
                case 14:
                    othergoweb.loadUrl("https://downforeveryoneorjustme.com/");
                    break;
                case 15:
                    othergoweb.loadUrl("https://gtmetrix.com/");
                    break;
                case 16:
                    othergoweb.loadUrl("https://builtwith.com/");
                    break;
                case 17:
                    othergoweb.loadUrl("https://www.seatguru.com/");
                    break;
                case 18:
                    othergoweb.loadUrl("https://webmakerapp.com/app/");
                    break;
                case 19:
                    othergoweb.loadUrl("https://forms.studio/");
                    break;
                case 20:
                    othergoweb.loadUrl("https://infogram.com/");
                    break;
                case 21:
                    othergoweb.loadUrl("https://marvelapp.com/");
                    break;
                case 22:
                    othergoweb.loadUrl("https://htmlmail.pro/");
                    break;
                case 23:
                    othergoweb.loadUrl("https://thewirecutter.com/");
                    break;
                case 24:
                    othergoweb.loadUrl("http://asciiflow.com/");
                    break;

            }

    }
    @Override
    public void onBackPressed() {
        if(othergoweb.canGoBack()){
            othergoweb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}