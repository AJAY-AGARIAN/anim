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

public class picShowlist extends Activity {

    public static int num4pic;
    public  static int adapter4pic;

    int[] images4pic={R.drawable.unsplash,R.drawable.website,R.drawable.pixton,
            R.drawable.gravit,R.drawable.vectr,R.drawable.squoosh,R.drawable.website,
            R.drawable.canva,R.drawable.website,R.drawable.drawio,R.drawable.website,R.drawable.website,R.drawable.website,
            R.drawable.autodraw};

    String[] names4pic={"www.unsplash.com","photos.icons8.com","www.pixton.com",
            "designer.gravit.io","vectr.com","squoosh.app","color.adobe.com",
            "www.canva.com","kleki.com","www.draw.io","exif.regex.info/exif.cgi","www.screenshot.guru",
            "www.labnol.org/internet/mobile-reverse-image-search","www.autodraw.com"};

    String[] description4pic={"The best place to download images absolutely free.",
            "Make your own stock photographs in high-resolution with custom backgrounds, models and facial expressions.",
            "Create your own comic strips with your own characters and move them into any pose.",
            "A full-featured vector drawing tool that works everywhere.",
            "Create vector graphics and export them as SVG or PNG files.",
            "Compress images on the fly. Site works offline as well.",
            "Get color ideas, also extract colors from photographs.",
            "Make beautiful graphics, presentations, resumes and more with readymade template designs.",
            "Create paintings and sketches with a wide variety of brushes.",
            "Create diagrams, wireframe and flowcharts in the browser.",
            "Find data hidden in your photographs",
            "Take high-resolution screenshots of web pages on mobile and desktops.",
            "Upload an image and find similar pictures on the web.",
            "Create freehand doodles and watch them magically transform into beautiful drawings powered by machine learning.",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);

        ListView listViewPic = (ListView) findViewById(R.id.listview);
        CustomAdapter4pic customAdapter4pic=new picShowlist.CustomAdapter4pic();
        listViewPic.setAdapter(customAdapter4pic);
        listViewPic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position4pic, long id) {
                num4pic=position4pic;
                adapter4pic=1;
                startActivity(new Intent(picShowlist.this,picGoweb.class));
            }

        });
    }
    class  CustomAdapter4pic extends BaseAdapter {

        @Override
        public int getCount() {
            return images4pic.length;
        }

        @Override
        public Object getItem(int position4pic) {
            return null;
        }

        @Override
        public long getItemId(int position4pic) {
            return 0;
        }

        @Override
        public View getView(int position4pic, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.items, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.logoweb);
            TextView textName = (TextView) convertView.findViewById(R.id.webname);
            TextView textDesc = (TextView) convertView.findViewById(R.id.description);

            imageView.setImageResource(images4pic[position4pic]);
            textName.setText(names4pic[position4pic]);
            textDesc.setText(description4pic[position4pic]);
            return convertView;
        }
    }

}
