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

public class voiceShowlist extends Activity {

    public static int adapter4voice;
    public static int num4voice;

    int[] images4voice={R.drawable.clyp,R.drawable.noisli,R.drawable.anchor, R.drawable.website};

    String[] names4voice={"clyp.it","www.noisli.com","anchor.fm","www.dictation.io"};

    String[] description4voice ={"Record your own voice or upload an audio file without creating any account. ",
            "Ambient noises to help you improve focus and boost productivity.",
            "The easiest way to record a podcast that you can distribute on iTunes without have to pay for hosting.",
            "Accurate and quick voice recognition in your browser itself."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);

        ListView listViewVoice= (ListView) findViewById(R.id.listview);
        CustomAdapter4voice customAdapter4voice=new CustomAdapter4voice();
        listViewVoice.setAdapter(customAdapter4voice);
        listViewVoice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                num4voice=position;
                adapter4voice=1;
                startActivity(new Intent(voiceShowlist.this,voiceGoweb.class));
            }

        });
    }
    class CustomAdapter4voice extends BaseAdapter {

        @Override
        public int getCount() {
            return images4voice.length;
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

            imageView.setImageResource(images4voice[position]);
            textName.setText(names4voice[position]);
            textDesc.setText(description4voice[position]);
            return convertView;
        }
    }
}