package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class trollScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troll_screen);

        ImageButton back;
        TextView Class;
        Class = findViewById(R.id.golemclass);
        Class.setText("TROLL");

        back = findViewById(R.id.backBtn);

        back.setOnClickListener(this::onClick);

        TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;


        Class = findViewById(R.id.golemclass);


        hp = findViewById(R.id.golemhp);
        mp = findViewById(R.id.golemmp);
        physAtk = findViewById(R.id.golemphysatk);
        physDef = findViewById(R.id.golemphysdef);
        mgAtk = findViewById(R.id.golemmgatk);
        mgDef = findViewById(R.id.golemmgdef);
        str = findViewById(R.id.golemstr);
        agi = findViewById(R.id.golemagi);
        intel = findViewById(R.id.trollint);

        hp.setText("1500");
        mp.setText("350");
        physAtk.setText("950");
        physDef.setText("1000");
        mgAtk.setText("150");
        mgDef.setText("200");
        str.setText("300");
        agi.setText("250");
        intel.setText("50");

    }
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.backBtn){
            Intent back = new Intent(trollScreen.this, monsterMenu.class);
            startActivity(back);
        }

    }
   
