package com.example.listviewprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    Spinner spinner;
    AutoCompleteTextView actxtview;
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrID = new ArrayList<>();
    ArrayList<String> arrlanguage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);
        spinner = findViewById(R.id.spinner);
        actxtview = findViewById(R.id.actxtview);

        arrNames.add("haseeb1");
        arrNames.add("haseeb2");
        arrNames.add("haseeb3");
        arrNames.add("haseeb4");
        arrNames.add("haseeb4");
        arrNames.add("haseeb5");
        arrNames.add("haseeb6");
        arrNames.add("haseeb7");
        arrNames.add("haseeb8");
        arrNames.add("haseeb9");
        arrNames.add("haseeb10");
        arrNames.add("haseeb11");
        arrNames.add("haseeb11");
        arrNames.add("haseeb121");
        arrNames.add("haseeb111");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Toast.makeText(MainActivity.this, "clicked on name 1", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //spinner

        arrID.add("NIC 1");
        arrID.add("NIC 2");
        arrID.add("NIC 3");
        arrID.add("NIC 4");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrID);
        spinner.setAdapter(adapter2);


        //AUTOCOMPLETE TEXTVIEW


        arrlanguage.add("C");
        arrlanguage.add("C#");
        arrlanguage.add("C++");
        arrlanguage.add("PYTHON");
        arrlanguage.add("JAVA");
        arrlanguage.add("KOTLIN");

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrlanguage);
        actxtview.setAdapter(adapter3);
        actxtview.setThreshold(2);






    }
}