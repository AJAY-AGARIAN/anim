package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class goweb extends Activity {

    public WebView goweb;
    //public WebView studygoweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goweb);
        goweb = (WebView) findViewById(R.id.goweb);
        goweb.setWebViewClient(new WebViewClient());
        goweb.getSettings().setJavaScriptEnabled(true);
        goweb.getSettings().setGeolocationEnabled(true);
        goweb.getSettings().setPluginState(WebSettings.PluginState.ON);
        goweb.getSettings().setAllowFileAccess(true);
        //download listner
        goweb.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        if (showlist.adapter4all == 1) {
            switch (showlist.num4all) {
                case 0:
                    goweb.loadUrl("https://www.noisli.com/");
                    break;
                case 1:
                    goweb.loadUrl("https://www.autodraw.com/");
                    break;
                case 2:
                    goweb.loadUrl("https://fast.com/");
                    break;
                case 3:
                    goweb.loadUrl("https://slides.com/");
                    break;
                case 4:
                    goweb.loadUrl("https://screenshot.guru/");
                    break;
                case 5:
                    goweb.loadUrl("https://dictation.io/");
                    break;
                case 6:
                    goweb.loadUrl("https://www.labnol.org/internet/mobile-reverse-image-search/29014/");
                    break;
                case 7:
                    goweb.loadUrl("https://copychar.cc/");
                    break;
                case 8:
                    goweb.loadUrl("https://www.codecademy.com/");
                    break;
                case 9:
                    goweb.loadUrl("https://archive.is/");
                    break;
                case 10:
                    goweb.loadUrl("https://www.flaticon.com/");
                    break;
                case 11:
                    goweb.loadUrl("https://virusscan.jotti.org/en");
                    break;
                case 12:
                    goweb.loadUrl("https://www.wolframalpha.com/");
                    break;
                case 13:
                    goweb.loadUrl("https://www.flightstats.com/v2/");
                    break;
                case 14:
                    goweb.loadUrl("https://unsplash.com/");
                    break;
                case 15:
                    goweb.loadUrl("https://www.pexels.com/videos/");
                    break;
                case 16:
                    goweb.loadUrl("https://everytimezone.com/");
                    break;
                case 17:
                    goweb.loadUrl("http://e.ggtimer.com/");
                    break;
                case 18:
                    goweb.loadUrl("https://www.random.org/");
                    break;
                case 19:
                    goweb.loadUrl("https://earn.com/");
                    break;
                case 20:
                    goweb.loadUrl("https://www.myfonts.com/WhatTheFont/");
                    break;
                case 21:
                    goweb.loadUrl("https://fonts.google.com/");
                    break;
                case 22:
                    goweb.loadUrl("https://fontstruct.com/");
                    break;
                case 23:
                    goweb.loadUrl("https://www.calligraphr.com/en/");
                    break;
                case 24:
                    goweb.loadUrl("http://exif.regex.info/exif.cgi");
                    break;
                case 25:
                    goweb.loadUrl("https://remotedesktop.google.com/home");
                    break;
                case 26:
                    goweb.loadUrl("https://www.homestyler.com/int/");
                    break;
                case 27:
                    goweb.loadUrl("https://www.pdfescape.com/");
                    break;
                case 28:
                    goweb.loadUrl("https://www.draw.io/");
                    break;
                case 29:
                    goweb.loadUrl("https://www.onlineocr.net/");
                    break;
                case 30:
                    goweb.loadUrl("https://wetransfer.com/");
                    break;
                case 31:
                    goweb.loadUrl("https://file.pizza/");
                    break;
                case 32:
                    goweb.loadUrl("https://onedoes.github.io/snapdrop/");
                    break;
                case 33:
                    goweb.loadUrl("http://hundredzeros.com/");
                    break;
                case 34:
                    goweb.loadUrl("https://www.grammarly.com/");
                    break;
                case 35:
                    goweb.loadUrl("https://www.noteflight.com/");
                    break;
                case 36:
                    goweb.loadUrl("http://kleki.com/");
                    break;
                case 37:
                    goweb.loadUrl("https://www.similarsites.com/");
                    break;
                case 38:
                    goweb.loadUrl("https://bubbl.us/");
                    break;
                case 39:
                    goweb.loadUrl("https://color.adobe.com/create");
                    break;
                case 40:
                    goweb.loadUrl("https://www.canva.com/");
                    break;
                case 41:
                    goweb.loadUrl("https://beta.midomi.com/");
                    break;
                case 42:
                    goweb.loadUrl("https://tinychat.com/#category=all");
                    break;
                case 43:
                    goweb.loadUrl("https://privnote.com/");
                    break;
                case 44:
                    goweb.loadUrl("https://domains.google/#/");
                    break;
                case 45:
                    goweb.loadUrl("https://squoosh.app/");
                    break;
                case 46:
                    goweb.loadUrl("https://downforeveryoneorjustme.com/");
                    break;
                case 47:
                    goweb.loadUrl("https://gtmetrix.com/");
                    break;
                case 48:
                    goweb.loadUrl("https://builtwith.com/");
                    break;
                case 49:
                    goweb.loadUrl("https://www.urbandictionary.com/");
                    break;
                case 50:
                    goweb.loadUrl("https://www.seatguru.com/");
                    break;
                case 51:
                    goweb.loadUrl("https://www.google.com/maps/d/u/0/");
                    break;
                case 52:
                    goweb.loadUrl("https://www.snopes.com/");
                    break;
                case 53:
                    goweb.loadUrl("https://www.typing.com/");
                    break;
                case 54:
                    goweb.loadUrl("https://todo.microsoft.com/en-us");
                    break;
                case 55:
                    goweb.loadUrl("https://minutes.io/");
                    break;
                case 56:
                    goweb.loadUrl("https://talltweets.com/");
                    break;
                case 57:
                    goweb.loadUrl("https://ifttt.com/about");
                    break;
                case 58:
                    goweb.loadUrl("https://namechk.com/");
                    break;
                case 59:
                    goweb.loadUrl("https://flipanim.com/");
                    break;
                case 60:
                    goweb.loadUrl("https://www.powtoon.com/home/?");
                    break;
                case 61:
                    goweb.loadUrl("https://clyp.it/");
                    break;
                case 62:
                    goweb.loadUrl("https://carrd.co/");
                    break;
                case 63:
                    goweb.loadUrl("https://spark.adobe.com/home/");
                    break;
                case 64:
                    goweb.loadUrl("https://anchor.fm/");
                    break;
                case 65:
                    goweb.loadUrl("https://www.duolingo.com/");
                    break;
                case 66:
                    goweb.loadUrl("https://webmakerapp.com/app/");
                    break;
                case 67:
                    goweb.loadUrl("https://www.pixton.com/");
                    break;
                case 68:
                    goweb.loadUrl("https://designer.gravit.io/");
                    break;
                case 69:
                    goweb.loadUrl("https://vectr.com/tmp/a5msD19CI/fuPSX56YD");
                    break;
                case 70:
                    goweb.loadUrl("https://www.headspace.com/");
                    break;
                case 71:
                    goweb.loadUrl("https://forms.studio/");
                    break;
                case 72:
                    goweb.loadUrl("https://www.classcentral.com/");
                    break;
                case 73:
                    goweb.loadUrl("https://artsandculture.google.com/partner");
                    break;
                case 74:
                    goweb.loadUrl("https://www.instructables.com/");
                    break;
                case 75:
                    goweb.loadUrl("https://infogram.com/");
                    break;
                case 76:
                    goweb.loadUrl("https://marvelapp.com/");
                    break;
                case 77:
                    goweb.loadUrl("https://promo.com/");
                    break;
                case 78:
                    goweb.loadUrl("https://photos.icons8.com/creator");
                    break;
                case 79:
                    goweb.loadUrl("https://gohighbrow.com/");
                    break;
                case 80:
                    goweb.loadUrl("https://htmlmail.pro/");
                    break;
                case 81:
                    goweb.loadUrl("https://thewirecutter.com/");
                    break;
                case 82:
                    goweb.loadUrl("https://camelcamelcamel.com/");
                    break;
                case 83:
                    goweb.loadUrl("http://asciiflow.com/");
                    break;
                case 84:
                    goweb.loadUrl("https://buffer.com/");
                    break;
                case 85:
                    goweb.loadUrl("https://www.10minutemail.com/");
                    break;
                case 86:
                    goweb.loadUrl("https://ctrlq.org/maps/where/");
                    break;
                case 87:
                    goweb.loadUrl("https://sway.office.com/");
                    break;
                case 88:
                    goweb.loadUrl("https://apify.com/");
                    break;
                case 89:
                    goweb.loadUrl("https://thunkable.com/#/");
                    break;
                case 90:
                    goweb.loadUrl("http://zerodollarmovies.com/");
                    break;
                case 91:
                    goweb.loadUrl("https://www.upwork.com/");
                    break;
                case 92:
                    goweb.loadUrl("http://myfridgefood.com/");
                    break;
                case 93:
                    goweb.loadUrl("https://www.mathway.com/");
                    break;
                case 94:
                    goweb.loadUrl("https://radio.garden");
                    break;
                case 95:
                    goweb.loadUrl("https://sleepyti.me/");
                    break;
                case 96:
                    goweb.loadUrl("https://www.ocearch.org/");
                    break;
                case 97:
                    goweb.loadUrl("https://thetruesize.com/");
                    break;
                case 98:
                    goweb.loadUrl("https://localingual.com/");
                    break;
                case 99:
                    goweb.loadUrl("http://webkay.robinlinus.com/");
                    break;


            }

        }

        }

    @Override
    public void onBackPressed() {
        if(goweb.canGoBack()){
            goweb.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
