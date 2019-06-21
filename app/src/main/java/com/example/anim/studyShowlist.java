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

public class studyShowlist extends Activity {

    public static String adapterStudy;
    public static int num4study;
    int[] images4study = {R.drawable.slides,R.drawable.codecademy,R.drawable.wolfram,R.drawable.grammarly,
            R.drawable.urban,R.drawable.typing,R.drawable.duolingo,R.drawable.classcental,R.drawable.instruct,
            R.drawable.gohigh,R.drawable.thunkable};

    String[] names4study = {"www.slides.com","www.codecademy.com","www.wolframalpha.com","www.grammarly.com",
            "www.urbandictionary.com","www.typing.com","www.duolingo.com","www.classcentral.com",
            "www.instructables.com","gohighbrow.com","thunkable.com"};

    String[] description4study = {"Create pixel-perfect slide decks and broadcast your presentations to an audience of any size from anywhere.",
            "The best place to learn coding online.","Gets answers directly without searching",
            "Check your writing for spelling, style, and grammatical errors.",
            "Find definitions of slangs and informal words.",
            "Master touch-typing with these practice sessions.",
            "Learn to speak Chinese, French, Spanish or any other language of your choice.",
            "A directory of free online courses offered by universities worldwide.",
            "Step-by-step guides on how to build anything and everything.",
            "Take bite-sized courses on a variety of topics, chapters are delivered by email every morning.",
            "Build your own apps for Android and iOS by dragging blocks instead of writing code."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);

        ListView listViewStudy = (ListView) findViewById(R.id.listview);
        //adapter for study
        CustomAdapter4study customadapter4study = new CustomAdapter4study();
        listViewStudy.setAdapter(customadapter4study);
        listViewStudy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position4study, long id) {
                num4study = position4study;
                adapterStudy = "customAdapter4study";
                startActivity(new Intent(studyShowlist.this, studygoweb.class));
            }

        });

    }

    class CustomAdapter4study extends BaseAdapter {

        @Override
        public int getCount() {
            return images4study.length;
        }

        @Override
        public Object getItem(int position4study) {
            return null;
        }

        @Override
        public long getItemId(int position4study) {
            return 0;
        }

        @Override
        public View getView(int position4study, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.items, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.logoweb);
            TextView textName = (TextView) convertView.findViewById(R.id.webname);
            TextView textDesc = (TextView) convertView.findViewById(R.id.description);

            imageView.setImageResource(images4study[position4study]);
            textName.setText(names4study[position4study]);
            textDesc.setText(description4study[position4study]);
            return convertView;
        }
    }
}
