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

public class splShowlist extends Activity {
    public static int adapter4spl;
    public static int num4spl;
    int[] images4spcl = {R.drawable.fast,R.drawable.website,R.drawable.flaticon,
            R.drawable.random,R.drawable.earn,R.drawable.website,R.drawable.homestyler,R.drawable.webtransfer,R.drawable.snapdrop,
            R.drawable.zero,R.drawable.noteflight,R.drawable.website,R.drawable.tinychat,R.drawable.map,
            R.drawable.snoopes,R.drawable.carrd,R.drawable.googlearts,R.drawable.camel,R.drawable.website};

    String[] names4spcl = {"www.fast.com","www.copychar.cc","www.flaticon.com",
            "www.random.org","www.earn.com","remotedesktop.google.com", "www.homestyler.com","wetransfer.com","www.snapdrop.com",
            "hundredzeros.com","www.noteflight.com","beta.midomi.com","tinychat.com", "www.google.com/maps",
            "www.snopes.com","carrd.co","artsandculture.google.com", "camelcamelcamel.com","www.10minutemail.com"};

    String[] description4spcl = { "Check the current speed of your Internet connection.",
            "Copy special characters and emojis that are not on your keyboard.",
            "Millions of icons for all kinds of projects",
            "Pick random numbers, flip coins, and more.",
            "Replace your email with a mailbox that pays when you reply to someone’s email.",
            "Access other computers or allow others to remote access your computer over the Internet.",
            "Design from scratch or re-model your home in 3D.",
            "For sharing really big files online.",
            "Like Apple AirDrop but for the web. Share files directly between devices in the same network without having to upload them to any server first.",
            "the site lets you download free Kindle books.",
            "Print music sheets, write your own music online",
            "When you need to find the name of a song.",
            "Setup your own private chat room in micro-seconds.",
            "Create custom Google Maps with scribbles, pins and custom shapes.",
            "Find if that email offer you received is real or just another scam.",
            "Build one-page fully responsive websites that look good on every screen.",
            "Discover museums, famous paintings and art treasure from all around the world.",
            "Free Amazon price tracker monitors millions of products and alerts you when prices drop.",
            "Create disposable email addresses for putting inside sign-up forms."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);

        ListView listViewSpl = (ListView) findViewById(R.id.listview);
        CustomAdapter4spl customAdapter4spl=new CustomAdapter4spl();
        listViewSpl.setAdapter(customAdapter4spl);
        listViewSpl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                num4spl=position;
                adapter4spl=1;
                startActivity(new Intent(splShowlist.this,splGoweb.class));
            }

        });

    }
    class CustomAdapter4spl extends BaseAdapter {

        @Override
        public int getCount() {
            return images4spcl.length;
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

            imageView.setImageResource(images4spcl[position]);
            textName.setText(names4spcl[position]);
            textDesc.setText(description4spcl[position]);
            return convertView;
        }
    }
}
