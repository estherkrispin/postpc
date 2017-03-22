package com.example.estherzino.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void save(View view) {
        EditText et = (EditText) findViewById(R.id.editText2);
        String str = et.getText().toString();
        MainActivity.addToList(str);
        finish();
    }


}
