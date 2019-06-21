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

public class videoShowlist extends Activity {
    public static int adapter4video;
    public static int num4video;
    int[] images4video = {R.drawable.pexels,R.drawable.website,R.drawable.flipanim,
            R.drawable.powtoon,R.drawable.adobespark,R.drawable.promo,R.drawable.zero};

    String[] names4video = {"www.pexels.com","talltweets.com","flipanim.com",
            "www.powtoon.com","spark.adobe.com","promo.com","zerodollarmovies.com"};

    String[] description4video = {"An online library of free HD videos you can use everywhere.",
            "Turn Google Slides in animated GIF presentations.",
            "Create flipbook animations, includes an onion skin tool to let you see the previous frame as you draw the next one.",
            "Create engaging whiteboard videos and presentations with your own voiceovers",
            "Make stunning video presentations with voice narration and wow everyone.",
            "Make marketing videos and branded stories for Instagram, Facebook and YouTube trailers.",
            "A huge collection of free movies curated from YouTube."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);

        ListView listViewVideo = (ListView) findViewById(R.id.listview);
        CustomAdapter4video customAdapter4video = new CustomAdapter4video();
        listViewVideo.setAdapter(customAdapter4video);
        listViewVideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                num4video = position;
                adapter4video = 1;
                startActivity(new Intent(videoShowlist.this, videoGoweb.class));
            }

        });

    }
    class  CustomAdapter4video extends BaseAdapter {

        @Override
        public int getCount() {
            return images4video.length;
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

            imageView.setImageResource(images4video[position]);
            textName.setText(names4video[position]);
            textDesc.setText(description4video[position]);
            return convertView;
        }
    }
}
