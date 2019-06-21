package com.example.anim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class othrShowlist extends Activity {

    public static int adapter4other;
    public static int num4other;
    int[] images4other={ R.drawable.apify,R.drawable.sway,R.drawable.website,  R.drawable.website,
            R.drawable.jotti, R.drawable.flight,
            R.drawable.website, R.drawable.eggtimer, R.drawable.pdfescape, R.drawable.filepizza,
            R.drawable.similarsite, R.drawable.bubble, R.drawable.privnote, R.drawable.googledomain,
            R.drawable.website, R.drawable.gtmetrix, R.drawable.builtwith, R.drawable.seatguru,
            R.drawable.webmaker, R.drawable.website, R.drawable.infogram, R.drawable.marvel, R.drawable.htmlmail,
            R.drawable.wirecutter, R.drawable.asci};

    String[] names4other={"apify.com","sway.office.com","ctrlq.org","archive.is",
            "virusscan.jotti.org", "www.flightstats.com",
            "www.everytimezone.com", "e.ggtimer.com", "www.pdfescape.com","file.pizza", "www.similarsites.com",
            "bubbl.us", "www.privnote.com", "domains.google.com", "downforeveryoneorjustme.com","gtmetrix.com",
            "builtwith.com", "www.seatguru.com", "webmakerapp.com", "forms.studio", "infogram.com","marvelapp.com",
            "htmlmail.pro", "thewirecutter.com", "asciiflow.com"};

    String[] description4other ={"The perfect web scraping tool that lets you extract data from nearly any website.",
            "Create and share interactive reports, newsletters, presentations, and for storytelling.",
            "Find the postal address of your current location on Google maps.",
            "Take a snapshot of any web page and it will be exist forever even if the original page is gone.",
            "Scan any suspicious file or email attachment for viruses.",
            "Track flight status at airports worldwide.",
            "A less confusing view of the world time zones.",
            "a simple online timer for your daily needs.",
            "Lets you quickly edit PDF in the browser without Acrobat.",
            "Peer to peer file transfer over WebRTC without any middleman.",
            "Discover new sites that are similar to what you like already.",
            "Create mind-maps, brainstorm ideas in the browser.",
            "Create text notes that will self-destruct after being read.",
            "Quickly search domain names for your next big idea!",
            "Find if your favorite website is offline or not?",
            "The perfect tool for measuring your site performance online.",
            "Find the web hosting company, email provider and everything else about a website.",
            "Consult this site before choosing a seat for your next flight.",
            "An offline playground for building web projects in HTML, CSS and JavaScript.",
            "Receive files from anyone in your Google Drive with File Upload Forms.",
            "Make data-driven graphics, charts and infographics.",
            "Create interactive wireframes and product mockups.",
            "Send rich-text emails with gmail mail merge.",
            "Weather you need a vacuum cleaner or an SD card, this is the best product recommendation website on the Internet.",
            "A WYSIWYG editor to draw ASCII diagrams that you can embed in emails and tweets."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);

        ListView listViewOther = (ListView) findViewById(R.id.listview);
        CustomAdapter4other customAdapter4other=new CustomAdapter4other();
        listViewOther.setAdapter(customAdapter4other);
        listViewOther.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                num4other=position;
                adapter4other   =1;
                startActivity(new Intent(othrShowlist.this,othrGoweb.class));
            }

        });
    }
    class CustomAdapter4other extends BaseAdapter {

        @Override
        public int getCount() {
            return images4other.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.items, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.logoweb);
            TextView textName = (TextView) convertView.findViewById(R.id.webname);
            TextView textDesc = (TextView) convertView.findViewById(R.id.description);

            imageView.setImageResource(images4other[position]);
            textName.setText(names4other[position]);
            textDesc.setText(description4other[position]);
            return convertView;
        }
    }

}
