package com.example.nguyenhuynhkieng_17040321;

import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvShirt;
    CustomShirtAdapter adt;
    ArrayList<Shirt> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvShirt = findViewById(R.id.lvShirt);

        arrayList = new ArrayList<>();
        arrayList.add(
                new Shirt("Developer", "$92", R.drawable.android_software_developer));
        arrayList.add(
                new Shirt("Android Studio", "$80", R.drawable.android_studio_t_shirt_golden_yellow));

        adt = new CustomShirtAdapter(this, R.layout.item_listview, arrayList);

        lvShirt.setAdapter(adt);
    }
}