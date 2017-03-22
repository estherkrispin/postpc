package com.example.estherzino.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Third extends AppCompatActivity {

    private int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        position = getIntent().getExtras().getInt("position");
    }

    public void delete(View view) {
        MainActivity.removeFromList(position);
        finish();
    }
}
