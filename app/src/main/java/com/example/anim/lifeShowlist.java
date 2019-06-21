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

public class lifeShowlist extends Activity {

    public static int adapter4life;
    public static int num4life;
    int[] images4life={R.drawable.todo,
            R.drawable.website,R.drawable.ifttt,
            R.drawable.namechk,R.drawable.headspace,R.drawable.buff,R.drawable.upwork};

    String[] names4life={"todo.microsoft.com",
            "minutes.io","ifttt.com",
            "namechk.com","my.headspace.com","buffer.com","www.upwork.com"};

    String[] description4life ={"A beautiful todo app and task manager",
            "Quickly capture effective notes during meetings.",
            "Create a connection between all your online accounts.",
            "Search for your desired username across hundreds of social networks and domain names.",
            "Learn the art of meditation and reduct stress, focus more and even sleep better.",
            "The easily way to post and schedule updates on Twitter, Instagram, LinkedIn, Google+ and Facebook.",
            "Find freelancers and subject experts to work on any kind of project.",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);

        ListView listViewLife = (ListView) findViewById(R.id.listview);
        CustomAdapter4life customAdapter4life=new CustomAdapter4life();
        listViewLife.setAdapter(customAdapter4life);
        listViewLife.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                num4life=position;
                adapter4life=1;
                startActivity(new Intent(lifeShowlist.this,lifeGoweb.class));
            }

        });
    }
    class  CustomAdapter4life extends BaseAdapter {

        @Override
        public int getCount() {
            return images4life.length;
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

            imageView.setImageResource(images4life[position]);
            textName.setText(names4life[position]);
            textDesc.setText(description4life[position]);
            return convertView;
        }
    }

}
