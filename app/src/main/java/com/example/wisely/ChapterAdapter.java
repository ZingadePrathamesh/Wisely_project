package com.example.wisely;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ChapterAdapter extends ArrayAdapter<Chapter> {
private Context mcontext;
private int  mResource;

    public ChapterAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Chapter> objects) {
        super(context, resource, objects);





        this.mcontext=context;
        this.mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater  layoutInflater = LayoutInflater.from(mcontext);

        convertView = layoutInflater.inflate(mResource,parent,false );

        TextView chapterName = convertView.findViewById(R.id.chapter_Name);

        chapterName.setText(getItem(position).getTitle());

        return  convertView;
    }
}
