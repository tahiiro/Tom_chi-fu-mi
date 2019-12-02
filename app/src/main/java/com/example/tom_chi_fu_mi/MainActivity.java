package com.example.tom_chi_fu_mi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton b;
    private EditText name;

    void open(){
        Intent in=new Intent(this,game.class);
        startActivities(new Intent[] {in});
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(ImageButton) findViewById(R.id.bstart);
        name=(EditText)findViewById(R.id.name);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    open();
            }
        });


    }
}
