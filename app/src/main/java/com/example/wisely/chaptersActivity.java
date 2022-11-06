package com.example.wisely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class chaptersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);

        Intent intent = getIntent();
        int number = intent.getIntExtra(videos_subject_activity.EXTRA_NUMBER, 0);

        switch (number) {
            case 1:em1 ();
            break;
            case 2:ep1 ();
            break;
            case 3:ec1 ();
            break;
            case 4:bee ();
            break;
            case 5:mech ();
            break;
        }
    }
    public  void em1 (){
        ListView listview = findViewById(R.id.listView);
        ArrayList<Chapter> list = new ArrayList<>();
        list.add(new Chapter("Complex Number"));
        list.add(new Chapter("Partial Diff."));
        list.add(new Chapter("Application of P.D"));
        list.add(new Chapter("Successive Diff."));
        list.add(new Chapter("Matrices"));
        list.add(new Chapter("Transcendental Eq."));
        list.add(new Chapter("Linear Eq"));
        list.add(new Chapter("Expansion of Func."));
//        list.add(new Chapter("chapter 9"));
//        list.add(new Chapter("chapter 10"));



        ChapterAdapter chapterAdapter = new ChapterAdapter(this , R.layout.list_row,list);
        listview.setAdapter(chapterAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent0  = new Intent(getApplicationContext(),videoActivity.class);
                        intent0.putExtra("keyname", "https://youtube.com/playlist?list=PLKS7ZMKnbPrSsOQDQOpYrDUp-4zQO8YFX");
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1  = new Intent(getApplicationContext(),videoActivity.class);
                        intent1.putExtra("keyname", "https://youtube.com/playlist?list=PLKS7ZMKnbPrQf7IBhKlsnLXwJRZSDMhun");
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2  = new Intent(getApplicationContext(),videoActivity.class);
                        intent2.putExtra("keyname", "https://youtube.com/playlist?list=PLVCBPCYGv7bC1JwOGH-X0FS-jTI4WRbI1");
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3  = new Intent(getApplicationContext(),videoActivity.class);
                        intent3.putExtra("keyname", "https://youtube.com/playlist?list=PLKS7ZMKnbPrQDCA9bd-HG5VrGxW4ZZfLP");
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4  = new Intent(getApplicationContext(),videoActivity.class);
                        intent4.putExtra("keyname", "https://youtube.com/playlist?list=PLKS7ZMKnbPrT-Gy4k0r8jAr0mX2K32yyV");
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5  = new Intent(getApplicationContext(),videoActivity.class);
                        intent5.putExtra("keyname", "https://youtube.com/playlist?list=PLU6SqdYcYsfIk1VhXxIYNPFU67ym6gae8");
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6  = new Intent(getApplicationContext(),videoActivity.class);
                        intent6.putExtra("keyname", "https://youtube.com/playlist?list=PLU6SqdYcYsfK-Gk_te5_dgSoWyUlUMOUh");
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7  = new Intent(getApplicationContext(),videoActivity.class);
                        intent7.putExtra("keyname", "https://www.youtube.com/playlist?list=PLqx9kIanjwgY5eBjXNpmR4lWMa_M8S4mN");
                        startActivity(intent7);
                        break;
//                    case 8:
//                        Intent intent8  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent8.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent8);
//                        break;
//                    case 9:
//                        Intent intent9  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent9.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent9);
//                        break;
                }
            }
        });
    }
    public  void ep1 (){
        ListView listview = findViewById(R.id.listView);
        ArrayList<Chapter> list = new ArrayList<>();
        list.add(new Chapter("Quantum Physics"));
        list.add(new Chapter("Crystallography"));
        list.add(new Chapter("SemiConductor"));
        list.add(new Chapter("Interference"));
        list.add(new Chapter("SuperCon. & SuperCap."));
        list.add(new Chapter("Material & App."));
//        list.add(new Chapter("chapter 7"));
//        list.add(new Chapter("chapter 8"));
//        list.add(new Chapter("chapter 9"));
//        list.add(new Chapter("chapter 10"));



        ChapterAdapter chapterAdapter = new ChapterAdapter(this , R.layout.list_row,list);
        listview.setAdapter(chapterAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent0  = new Intent(getApplicationContext(),videoActivity.class);
                        intent0.putExtra("keyname", "https://youtube.com/playlist?list=PLQzUXa8lZVq8Zciw0MsOdPJ1t-bpPKV6_");
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1  = new Intent(getApplicationContext(),videoActivity.class);
                        intent1.putExtra("keyname", "https://youtube.com/playlist?list=PLQzUXa8lZVq_3F1vB3NkQEZDzxt2g5SvF");
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2  = new Intent(getApplicationContext(),videoActivity.class);
                        intent2.putExtra("keyname", "https://youtube.com/playlist?list=PLQzUXa8lZVq8lfZN5836sohUpRCt2b6oB");
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3  = new Intent(getApplicationContext(),videoActivity.class);
                        intent3.putExtra("keyname", "https://youtube.com/playlist?list=PLQzUXa8lZVq9raHeIhA8Cf5LuF3r2Pnu7");
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4  = new Intent(getApplicationContext(),videoActivity.class);
                        intent4.putExtra("keyname", "https://youtube.com/playlist?list=PLQzUXa8lZVq_DKTgVTq4LK-iSnviUFZIN");
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5  = new Intent(getApplicationContext(),videoActivity.class);
                        intent5.putExtra("keyname", "https://youtube.com/playlist?list=PLQzUXa8lZVq-GpWcleSQCxu1pczvgWTgJ");
                        startActivity(intent5);
                        break;
//                    case 6:
//                        Intent intent6  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent6.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent6);
//                        break;
//                    case 7:
//                        Intent intent7  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent7.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent7);
//                        break;
//                    case 8:
//                        Intent intent8  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent8.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent8);
//                        break;
//                    case 9:
//                        Intent intent9  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent9.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent9);
//                        break;
                }
            }
        });
    }
    public  void ec1 (){
        ListView listview = findViewById(R.id.listView);
        ArrayList<Chapter> list = new ArrayList<>();
        list.add(new Chapter("Atomic and Mol. Struc."));
        list.add(new Chapter("Aromatic System"));
        list.add(new Chapter("Inter. Forces & Cric. Phen."));
        list.add(new Chapter("Phase Rule"));
        list.add(new Chapter("Polymers"));
        list.add(new Chapter("Water"));
//        list.add(new Chapter("chapter 7"));
//        list.add(new Chapter("chapter 8"));
//        list.add(new Chapter("chapter 9"));
//        list.add(new Chapter("chapter 10"));



        ChapterAdapter chapterAdapter = new ChapterAdapter(this , R.layout.list_row,list);
        listview.setAdapter(chapterAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent0  = new Intent(getApplicationContext(),videoActivity.class);
                        intent0.putExtra("keyname", "https://youtube.com/playlist?list=PL4BETMztLJZbw5PUGSH8u4GiZOt4NG64x");
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1  = new Intent(getApplicationContext(),videoActivity.class);
                        intent1.putExtra("keyname", "https://youtube.com/playlist?list=PLaySzQJTCO1mdBoL-BLBfKrhgdwRpbOnx");
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2  = new Intent(getApplicationContext(),videoActivity.class);
                        intent2.putExtra("keyname", "https://youtube.com/playlist?list=PLqx9kIanjwgZU0MeGEhNHuOJdp8EOAf0h");
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3  = new Intent(getApplicationContext(),videoActivity.class);
                        intent3.putExtra("keyname", "https://youtube.com/playlist?list=PLLf6O8XdGj01keitLZ0scBnH80-MnNdu4");
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4  = new Intent(getApplicationContext(),videoActivity.class);
                        intent4.putExtra("keyname", "https://youtube.com/playlist?list=PLLf6O8XdGj006FPDExeXMKU5CcnHBn1mf");
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5  = new Intent(getApplicationContext(),videoActivity.class);
                        intent5.putExtra("keyname", "https://youtube.com/playlist?list=PLLf6O8XdGj03gLo6znlqJbMzgIgt8tSU1");
                        startActivity(intent5);
                        break;
//                    case 6:
//                        Intent intent6  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent6.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent6);
//                        break;
//                    case 7:
//                        Intent intent7  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent7.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent7);
//                        break;
//                    case 8:
//                        Intent intent8  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent8.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent8);
//                        break;
//                    case 9:
//                        Intent intent9  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent9.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent9);
//                        break;
                }
            }
        });
    }
    public  void bee (){
        ListView listview = findViewById(R.id.listView);
        ArrayList<Chapter> list = new ArrayList<>();
        list.add(new Chapter("Prerequisite"));
        list.add(new Chapter("DC circuits"));
        list.add(new Chapter("AC circuits"));
        list.add(new Chapter("Module 3"));
        list.add(new Chapter("Transformers"));
        list.add(new Chapter("Elec. Machines"));
//        list.add(new Chapter("Module 6"));
//        list.add(new Chapter("chapter 8"));
//        list.add(new Chapter("chapter 9"));
//        list.add(new Chapter("chapter 10"));



        ChapterAdapter chapterAdapter = new ChapterAdapter(this , R.layout.list_row,list);
        listview.setAdapter(chapterAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent0  = new Intent(getApplicationContext(),videoActivity.class);
                        intent0.putExtra("keyname", "https://www.youtube.com/watch?v=Vd2UJiIPbag&list=PL9RcWoqXmzaLTYUdnzKhF4bYug3GjGcEc&index=1&t=16s");
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1  = new Intent(getApplicationContext(),videoActivity.class);
                        intent1.putExtra("keyname", "https://youtube.com/playlist?list=PLqx9kIanjwgYgayoOquclWga8OlnGOWN_");
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2  = new Intent(getApplicationContext(),videoActivity.class);
                        intent2.putExtra("keyname", "https://youtube.com/playlist?list=PLqx9kIanjwgZTJ-Ar-jkTuv34_XIXSBET");
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3  = new Intent(getApplicationContext(),videoActivity.class);
                        intent3.putExtra("keyname", "https://youtube.com/playlist?list=PLqx9kIanjwgZWt9u6bjcTqlIf_fStX71u");
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4  = new Intent(getApplicationContext(),videoActivity.class);
                        intent4.putExtra("keyname", "https://youtube.com/playlist?list=PLohtAIfLLw8fFa2TGj3ZjUvS42nWFUQK3");
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5  = new Intent(getApplicationContext(),videoActivity.class);
                        intent5.putExtra("keyname", "https://youtube.com/playlist?list=PLohtAIfLLw8cdi1iOLyLNX1f839KSXDnl");
                        startActivity(intent5);
                        break;
//                    case 6:
//                        Intent intent6  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent6.putExtra("keyname", "https://youtube.com/playlist?list=PLqx9kIanjwgb8_P6XinNSDMNo_qBeTpYz");
//                        startActivity(intent6);
//                        break;
//                    case 7:
//                        Intent intent7  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent7.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent7);
//                        break;
//                    case 8:
//                        Intent intent8  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent8.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent8);
//                        break;
//                    case 9:
//                        Intent intent9  = new Intent(getApplicationContext(),videoActivity.class);
//                        intent9.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
//                        startActivity(intent9);
//                        break;
                }
            }
        });
    }
    public  void mech (){
        ListView listview = findViewById(R.id.listView);
        ArrayList<Chapter> list = new ArrayList<>();
        list.add(new Chapter("chapter 1"));
        list.add(new Chapter("chapter 2"));
        list.add(new Chapter("chapter 3"));
        list.add(new Chapter("chapter 4"));
        list.add(new Chapter("chapter 5"));
        list.add(new Chapter("chapter 6"));
        list.add(new Chapter("chapter 7"));
        list.add(new Chapter("chapter 8"));
        list.add(new Chapter("chapter 9"));
        list.add(new Chapter("chapter 10"));



        ChapterAdapter chapterAdapter = new ChapterAdapter(this , R.layout.list_row,list);
        listview.setAdapter(chapterAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent0  = new Intent(getApplicationContext(),videoActivity.class);
                        intent0.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1  = new Intent(getApplicationContext(),videoActivity.class);
                        intent1.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2  = new Intent(getApplicationContext(),videoActivity.class);
                        intent2.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3  = new Intent(getApplicationContext(),videoActivity.class);
                        intent3.putExtra("keyname", "https://www.youtube.com/watch?v=yDEfU3iVSoA");
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4  = new Intent(getApplicationContext(),videoActivity.class);
                        intent4.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5  = new Intent(getApplicationContext(),videoActivity.class);
                        intent5.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6  = new Intent(getApplicationContext(),videoActivity.class);
                        intent6.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7  = new Intent(getApplicationContext(),videoActivity.class);
                        intent7.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8  = new Intent(getApplicationContext(),videoActivity.class);
                        intent8.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9  = new Intent(getApplicationContext(),videoActivity.class);
                        intent9.putExtra("keyname", "https://www.youtube.com/watch?v=50VNCymT-Cs");
                        startActivity(intent9);
                        break;
                }
            }
        });
    }
}