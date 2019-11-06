package dev.ujjwal.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        String[] languages = {"JavaScript", "Python", "Java", "C", "C++", "PHP", "Swift", "C#", "Ruby", "Objective-C", "SQL", "Go", "Perl", "Scala", "Apex", "R", "SAS"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, languages);
        listView.setAdapter(arrayAdapter);
    }
}
