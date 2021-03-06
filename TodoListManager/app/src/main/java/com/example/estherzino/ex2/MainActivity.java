package com.example.estherzino.ex2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    static ArrayList<String> list;
    private static ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        ListView lv = (ListView) findViewById(R.id.mainListView);
        adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,list){
            public View getView(int position, View ConvertView, ViewGroup parent){
                View view = super.getView(position, ConvertView, parent);
                TextView textView = (TextView)view.findViewById(android.R.id.text1);
                if(position % 2 == 0)
                    textView.setTextColor(Color.RED);
                else
                    textView.setTextColor(Color.BLUE);
                return view;
            }
        };
        lv.setAdapter(adapter);
        lv.setOnItemLongClickListener(
                new AdapterView.OnItemLongClickListener(){
                    @Override
                    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent ne = new Intent(MainActivity.this, Third.class);
                        Bundle b = new Bundle();
                        b.putInt("position", position);
                        ne.putExtras(b);
                        startActivity(ne);
                        return false;
                    }
                }



        );
    }

    public void addNew(View view) {
        Intent ne = new Intent(this, SecondActivity.class);
        startActivity(ne);
    }

    public ArrayAdapter<String> getAdapter(){
        return adapter;
    }

    public static void addToList(String str){
        adapter.add(str);
        return;
    }

    public static void removeFromList(int position){
        adapter.remove(adapter.getItem(position));
        return;
    }
}
