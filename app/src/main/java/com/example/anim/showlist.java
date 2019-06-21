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

public class showlist extends Activity {
    public static int num4all;
    public  static int adapter4all=0;
    //for all
    int[] images={R.drawable.noisli,R.drawable.autodraw,R.drawable.fast,R.drawable.slides,R.drawable.website,
            R.drawable.website,R.drawable.website,R.drawable.website,R.drawable.codecademy,R.drawable.website,
            R.drawable.flaticon,R.drawable.jotti,R.drawable.wolfram,R.drawable.flight,R.drawable.unsplash,R.drawable.pexels
            ,R.drawable.website,R.drawable.eggtimer,R.drawable.random,R.drawable.earn,R.drawable.myfont,
            R.drawable.googlefont,R.drawable.fontstruct,R.drawable.calligraphr,R.drawable.website,R.drawable.website
            ,R.drawable.homestyler,R.drawable.pdfescape,R.drawable.drawio,R.drawable.ocr,R.drawable.webtransfer
            ,R.drawable.filepizza,R.drawable.snapdrop,R.drawable.website,R.drawable.grammarly,R.drawable.noteflight,
            R.drawable.website,R.drawable.similarsite,R.drawable.bubble,R.drawable.website,R.drawable.canva
            ,R.drawable.website,R.drawable.tinychat,R.drawable.privnote,R.drawable.googledomain,R.drawable.squoosh
            ,R.drawable.website,R.drawable.gtmetrix,R.drawable.builtwith,R.drawable.urban,R.drawable.seatguru
            ,R.drawable.map,R.drawable.snoopes,R.drawable.typing,R.drawable.todo,R.drawable.website
            ,R.drawable.website,R.drawable.ifttt,R.drawable.namechk,R.drawable.flipanim,R.drawable.powtoon
            ,R.drawable.clyp,R.drawable.carrd,R.drawable.adobespark,R.drawable.anchor,R.drawable.duolingo
            ,R.drawable.webmaker,R.drawable.pixton,R.drawable.gravit,R.drawable.vectr,R.drawable.headspace
            ,R.drawable.website,R.drawable.classcental,R.drawable.googlearts,R.drawable.instruct,R.drawable.infogram
            ,R.drawable.marvel,R.drawable.promo,R.drawable.website,R.drawable.gohigh,R.drawable.htmlmail
            ,R.drawable.wirecutter,R.drawable.camel,R.drawable.asci,R.drawable.buff,R.drawable.website
            ,R.drawable.website,R.drawable.sway,R.drawable.apify,R.drawable.thunkable,R.drawable.zero
            ,R.drawable.upwork,R.drawable.myfridge,R.drawable.mathway,R.drawable.radiogarden,R.drawable.website,
            R.drawable.ocearch,R.drawable.website,R.drawable.localingual,R.drawable.webkay};

    String[] names={"www.noisli.com","www.autodraw.com","www.fast.com","www.slides.com","www.screenshot.guru",
            "www.dictation.io","www.labnol.org/internet/mobile-reverse-image-search/29014/",
            "www.copychar.cc","www.codecademy.com","archive.is","www.flaticon.com","virusscan.jotti.org",
            "www.wolframalpha.com","www.flightstats.com","www.unsplash.com","www.pexels.com","www.everytimezone.com",
            "e.ggtimer.com","www.random.org","www.earn.com","www.myfonts.com","fonts.google.com","www.fontstruct.com",
            "www.calligraphr.com","exif.regex.info/exif.cgi","remotedesktop.google.com","www.homestyler.com",
            "www.pdfescape.com","www.draw.io","www.onlineocr.net","wetransfer.com","file.pizza","www.snapdrop.com",
            "hundredzeros.com","www.grammarly.com","www.noteflight.com","kleki.com","www.similarsites.com",
            "bubbl.us","color.adobe.com","www.canva.com","beta.midomi.com","tinychat.com","www.privnote.com",
            "domains.google.com","squoosh.app","downforeveryoneorjustme.com","gtmetrix.com","builtwith.com","www.urbandictionary.com",
            "www.seatguru.com","www.google.com/maps","www.snopes.com","www.typing.com","todo.microsoft.com",
            "minutes.io","talltweets.com","ifttt.com","namechk.com","flipanim.com","www.powtoon.com","clyp.it","carrd.co",
            "spark.adobe.com","anchor.fm","www.duolingo.com","webmakerapp.com","www.pixton.com","designer.gravit.io",
            "vectr.com","my.headspace.com","forms.studio","www.classcentral.com","artsandculture.google.com",
            "www.instructables.com","infogram.com","marvelapp.com","promo.com","photos.icons8.com","gohighbrow.com",
            "htmlmail.pro","thewirecutter.com","camelcamelcamel.com","asciiflow.com","buffer.com","www.10minutemail.com",
            "ctrlq.org","sway.office.com","apify.com","thunkable.com","zerodollarmovies.com","www.upwork.com",
            "myfridgefood.com","www.mathway.com","radio.garden","sleepyti.me","www.ocearch.org","thetruesize.com",
            "localingual.com","webkay.robinlinus.com"};

    String[] description ={"Ambient noises to help you improve focus and boost productivity.",
            "Create freehand doodles and watch them magically transform into beautiful drawings powered by machine learning.",
            "Check the current speed of your Internet connection.",
            "Create pixel-perfect slide decks and broadcast your presentations to an audience of any size from anywhere.",
            "Take high-resolution screenshots of web pages on mobile and desktops.",
            "Accurate and quick voice recognition in your browser itself.",
            "Upload an image and find similar pictures on the web.",
            "Copy special characters and emojis that are not on your keyboard.",
            "The best place to learn coding online.",
            "Take a snapshot of any web page and it will be exist forever even if the original page is gone.",
             "Millions of icons for all kinds of projects",
            "Scan any suspicious file or email attachment for viruses.",
            "Gets answers directly without searching",
            "Track flight status at airports worldwide.","The best place to download images absolutely free.",
            "An online library of free HD videos you can use everywhere.",
            "A less confusing view of the world time zones.","a simple online timer for your daily needs.",
            "Pick random numbers, flip coins, and more.","Replace your email with a mailbox that pays when you reply to someone’s email.",
            "Upload an image of any text and quickly determine the font family.",
            "The best collection of open source fonts that you can use anywhere without restrictions.",
            "Draw and build your own fonts and use them in any application.",
            "Transform your handwriting into a real font.","Find data hidden in your photographs",
            "Access other computers or allow others to remote access your computer over the Internet.",
            "Design from scratch or re-model your home in 3D.","Lets you quickly edit PDF in the browser without Acrobat.",
            "Create diagrams, wireframe and flowcharts in the browser.","Recognize text from scanned PDFs",
            "For sharing really big files online.","Peer to peer file transfer over WebRTC without any middleman.",
            "Like Apple AirDrop but for the web. Share files directly between devices in the same network without having to upload them to any server first.",
            "the site lets you download free Kindle books.","Check your writing for spelling, style, and grammatical errors.",
            "Print music sheets, write your own music online","Create paintings and sketches with a wide variety of brushes.",
            "Discover new sites that are similar to what you like already.",
            "Create mind-maps, brainstorm ideas in the browser.","Get color ideas, also extract colors from photographs.",
            "Make beautiful graphics, presentations, resumes and more with readymade template designs.",
            "When you need to find the name of a song.","Setup your own private chat room in micro-seconds.",
            "Create text notes that will self-destruct after being read.","Quickly search domain names for your next big idea!",
            "Compress images on the fly. Site works offline as well.","Find if your favorite website is offline or not?",
            "The perfect tool for measuring your site performance online.",
            "Find the web hosting company, email provider and everything else about a website.",
            "Find definitions of slangs and informal words.","Consult this site before choosing a seat for your next flight.",
            "Create custom Google Maps with scribbles, pins and custom shapes.",
            "Find if that email offer you received is real or just another scam.",
            "Master touch-typing with these practice sessions.","A beautiful todo app and task manager",
            "Quickly capture effective notes during meetings.","Turn Google Slides in animated GIF presentations.",
            "Create a connection between all your online accounts.",
            "Search for your desired username across hundreds of social networks and domain names.",
            "Create flipbook animations, includes an onion skin tool to let you see the previous frame as you draw the next one.",
            "Create engaging whiteboard videos and presentations with your own voiceovers",
            "Record your own voice or upload an audio file without creating any account. ",
            "Build one-page fully responsive websites that look good on every screen.",
            "Make stunning video presentations with voice narration and wow everyone.",
            "The easiest way to record a podcast that you can distribute on iTunes without have to pay for hosting.",
            "Learn to speak Chinese, French, Spanish or any other language of your choice.",
            "An offline playground for building web projects in HTML, CSS and JavaScript.",
            "Create your own comic strips with your own characters and move them into any pose.",
            "A full-featured vector drawing tool that works everywhere.","Create vector graphics and export them as SVG or PNG files.",
            "Learn the art of meditation and reduct stress, focus more and even sleep better.",
            "Receive files from anyone in your Google Drive with File Upload Forms.",
            "A directory of free online courses offered by universities worldwide.",
            "Discover museums, famous paintings and art treasure from all around the world.",
            "Step-by-step guides on how to build anything and everything.","Make data-driven graphics, charts and infographics.",
            "Create interactive wireframes and product mockups.",
            "Make marketing videos and branded stories for Instagram, Facebook and YouTube trailers.",
            "Make your own stock photographs in high-resolution with custom backgrounds, models and facial expressions.",
            "Take bite-sized courses on a variety of topics, chapters are delivered by email every morning.",
            "Send rich-text emails with gmail mail merge.",
            "Weather you need a vacuum cleaner or an SD card, this is the best product recommendation website on the Internet.",
            "Free Amazon price tracker monitors millions of products and alerts you when prices drop.",
            "A WYSIWYG editor to draw ASCII diagrams that you can embed in emails and tweets.",
            "The easily way to post and schedule updates on Twitter, Instagram, LinkedIn, Google+ and Facebook.",
            "Create disposable email addresses for putting inside sign-up forms.",
            "Find the postal address of your current location on Google maps.",
            "Create and share interactive reports, newsletters, presentations, and for storytelling.",
            "The perfect web scraping tool that lets you extract data from nearly any website.",
            "Build your own apps for Android and iOS by dragging blocks instead of writing code.",
            "A huge collection of free movies curated from YouTube.",
            "Find freelancers and subject experts to work on any kind of project.",
            "Just check off what's in your fridge, and the website will spit out a bunch of recipes you can make",
            "A great site for students, it solves algebra, calculus, and even chemistry problems",
            "You can listen to radio stations anywhere in the world",
            "This website calculates the best time for you to fall asleep.","Track sharks in real time.",
            "See the real size of various countries and states and compare them to each other",
            "Listen to people's voices for all over the world","Find what your browser knows about you"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);

        ListView listView=(ListView)findViewById(R.id.listview);


        //adapter for all
        CustomAdapter4all customAdapter4all=new CustomAdapter4all();
        listView.setAdapter(customAdapter4all);
        //for item onclick
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                num4all=position;
                adapter4all=1;
                startActivity(new Intent(showlist.this,goweb.class));
            }

        });

    }

    //ALL
    class CustomAdapter4all extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
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

                    imageView.setImageResource(images[position]);
                    textName.setText(names[position]);
                    textDesc.setText(description[position]);
                    return convertView;}
    }

}
