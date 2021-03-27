package com.example.myapplication.view.monsters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.view.monsterMenu;

public class golemScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golem_screen);

        ImageButton back;
        TextView Class;
        Class = findViewById(R.id.golemclass);
        Class.setText("GOLEM");

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

        hp.setText("2000");
        mp.setText("300");
        physAtk.setText("1050");
        physDef.setText("1500");
        mgAtk.setText("100");
        mgDef.setText("200");
        str.setText("950");
        agi.setText("300");
        intel.setText("500");


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.backBtn) {
            Intent back = new Intent(golemScreen.this, monsterMenu.class);
            startActivity(back);
        }

    }
}