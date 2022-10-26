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
    public  void ep1 (){
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
    public  void ec1 (){
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
    public  void bee (){
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