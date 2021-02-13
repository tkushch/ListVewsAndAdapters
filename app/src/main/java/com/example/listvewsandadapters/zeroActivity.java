package com.example.listvewsandadapters;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.listvewsandadapters.R;

public class zeroActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {
    Button button;
    String[] myArr = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    String[] forbs;
    ListView listView;
    ArrayAdapter<String> monthAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zero);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        listView = findViewById(R.id.list);
        forbs = getResources().getStringArray(R.array.forbes);

        monthAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, forbs);
        listView.setAdapter(monthAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.button)){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
    }
}