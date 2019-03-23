package com.example.helpinghands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class LendPage extends AppCompatActivity {

    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lend_page);

        // set the spinner data programmatically, from a string array or list


        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LendPage.this,Submit.class));
            }
        });

// (1) get a reference to the spinner
        Spinner spinner1 = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2);

// (2) create a simple static list of strings
        List<String> spinnerArray = new ArrayList<>();
        spinnerArray.add("1");
        spinnerArray.add("2");
        spinnerArray.add("3+");


        List<String> spinnerArray2 = new ArrayList<>();
        spinnerArray2.add("yes");
        spinnerArray2.add("no");


// (3) create an adapter from the list
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                LendPage.this,
                android.R.layout.simple_spinner_item,
                spinnerArray
        );

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(
                LendPage.this,
                android.R.layout.simple_spinner_item,
                spinnerArray2
        );

//adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// (4) set the adapter on the spinner
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter2);
    }



//    Spinner dropdown = findViewById(R.id.spinner1);
//
//    String[] items = new String[]{"1", "2", "three"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//    dropdown.setAdapter(adapter);
}
