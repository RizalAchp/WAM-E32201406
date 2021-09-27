package com.example.workshopactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button linear,relative,constraint,linear2,tabble,materialdg,scroll,scrollhorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*
        hanya mencoba.
        linear           = (Button) findViewById(R.id.button_linear);
        relative         = (Button) findViewById(R.id.button_relative);
        constraint       = (Button) findViewById(R.id.button_constraint);
        linear2          = (Button) findViewById(R.id.button_linear2);
        tabble           = (Button) findViewById(R.id.button_table);
        materialdg       = (Button) findViewById(R.id.button_materialdesign);
        scroll           = (Button) findViewById(R.id.button_scroll);
        scrollhorizontal = (Button) findViewById(R.id.button_scrollhorizontal);

        linear.setOnClickListener(view -> setContentView(R.layout.activity_linear_layout));
        linear2.setOnClickListener(view -> setContentView(R.layout.activity_linear_layout));
        relative.setOnClickListener(view -> setContentView(R.layout.activity_relative_layout));
        constraint.setOnClickListener(view -> setContentView(R.layout.activity_constraint_layout));
        tabble.setOnClickListener(view -> setContentView(R.layout.activity_table_layout));
        materialdg.setOnClickListener(view -> setContentView(R.layout.activity_material_design));
        scroll.setOnClickListener(view -> setContentView(R.layout.activity_scroll_view));
        scrollhorizontal.setOnClickListener(view -> setContentView(R.layout.activity_horizontal_scroll_view));
    */
    }
}