package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class slimeScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slime_screen);

        ImageButton back;
        TextView Class;
        Class = findViewById(R.id.golemclass);
        Class.setText("SLIME");

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

        hp.setText("1000");
        mp.setText("200");
        physAtk.setText("100");
        physDef.setText("100");
        mgAtk.setText("200");
        mgDef.setText("150");
        str.setText("50");
        agi.setText("90");
        intel.setText("20");

    }
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.backBtn){
            Intent back = new Intent(slimeScreen.this, monsterMenu.class);
            startActivity(back);
        }


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

        hp.setText("1000");
        mp.setText("200");
        physAtk.setText("100");
        physDef.setText("100");
        mgAtk.setText("200");
        mgDef.setText("150");
        str.setText("50");
        agi.setText("90");
        intel.setText("20");


    }
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.backBtn){
            Intent back = new Intent(slimeScreen.this, monsterMenu.class);
            startActivity(back);
        }

    }
