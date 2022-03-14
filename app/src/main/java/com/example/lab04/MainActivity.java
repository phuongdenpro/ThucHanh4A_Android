package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Language> listLanguage;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "ca_nau_lau", "Shop Devang"));
        listLanguage.add(new Language(2, "Lập Trình Android", "Shop Devang"));
        listLanguage.add(new Language(3, "Lập Trình JavaFX", "Shop Devang"));
        listLanguage.add(new Language(4, "Lập Trình Web", "Shop Devang"));
        listLanguage.add(new Language(5, "Lập Trình Ruby", "Shop Devang"));
        listLanguage.add(new Language(6, "Lập Trình C++", "Shop Devang"));
        listLanguage.add(new Language(7, "Lập Trình PHP", "Shop Devang"));


        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item, listLanguage);
        listView.setAdapter(adapter);
    }
}