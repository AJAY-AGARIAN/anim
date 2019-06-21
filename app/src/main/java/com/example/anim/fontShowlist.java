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

public class fontShowlist extends Activity {

    public static int adapter4font;
    public static int num4font;
    int[] images4font = {R.drawable.myfont,
            R.drawable.googlefont,
            R.drawable.fontstruct,
            R.drawable.calligraphr,R.drawable.ocr};

    String[] names4font = {
            "www.myfonts.com",
            "fonts.google.com",
            "www.fontstruct.com",
            "www.calligraphr.com","www.onlineocr.net"};

    String[] description4font = {"Upload an image of any text and quickly determine the font family.",
            "The best collection of open source fonts that you can use anywhere without restrictions.",
            "Draw and build your own fonts and use them in any application.",
            "Transform your handwriting into a real font.","Recognize text from scanned PDFs"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);

        ListView listViewFont = (ListView) findViewById(R.id.listview);
        CustomAdapter4font customAdapter4font=new CustomAdapter4font();
        listViewFont.setAdapter(customAdapter4font);
        listViewFont.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                num4font=position;
                adapter4font=1;
                startActivity(new Intent(fontShowlist.this,fontGoweb.class));
            }

        });
    }
    class CustomAdapter4font extends BaseAdapter {

        @Override
        public int getCount() {
            return images4font.length;
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

            imageView.setImageResource(images4font[position]);
            textName.setText(names4font[position]);
            textDesc.setText(description4font[position]);
            return convertView;
        }
    }
}
