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

        ListView listview = findViewById(R.id.listView);
        List<String> list = new ArrayList<String>();
        list.add("chapter 1");
        list.add("chapter 2");
        list.add("chapter 3");
        list.add("chapter 4");
        list.add("chapter 5");
        list.add("chapter 6");
        list.add("chapter 7");
        list.add("chapter 8");
        list.add("chapter 9");
        list.add("chapter 10");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listview.setAdapter(arrayAdapter);

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