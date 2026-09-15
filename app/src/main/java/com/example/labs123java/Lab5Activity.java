package com.example.labs123java;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Lab5Activity extends Activity {
    private static final String[] ITEMS = {
            "Image 1 - Новости Android",
            "Image 2 - Java разработка",
            "Image 3 - Мобильные приложения",
            "Image 4 - Лабораторные работы",
            "Image 5 - Эмулятор запущен"
    };
    private static final int[] ICONS = {
            android.R.drawable.ic_menu_gallery,
            android.R.drawable.ic_menu_edit,
            android.R.drawable.ic_menu_manage,
            android.R.drawable.ic_menu_agenda,
            android.R.drawable.ic_menu_view
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5);
        ListView listView = findViewById(R.id.listViewImages);
        listView.setAdapter(new ImageListAdapter(this, ITEMS));
    }

    private static class ImageListAdapter extends ArrayAdapter<String> {
        ImageListAdapter(Context context, String[] items) {
            super(context, R.layout.list_item, R.id.textViewItem, items);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            ImageView image = row.findViewById(R.id.imageViewItem);
            TextView text = row.findViewById(R.id.textViewItem);
            image.setImageResource(ICONS[position]);
            text.setText(getItem(position));
            return row;
        }
    }
}
