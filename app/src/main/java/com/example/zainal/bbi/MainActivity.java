package com.example.zainal.bbi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private GridView gridMenuItem;
    private ImageView imageCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ambil view dari xml
        gridMenuItem = (GridView) findViewById(R.id.list_item_card);
        imageCover = (ImageView)findViewById(R.id.img_cover);

    }
}
