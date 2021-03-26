package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class demonScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demon_screen);

        ImageButton back;
        TextView Class;
        Class = findViewById(R.id.golemclass);
        Class.setText("DEMON");

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

        hp.setText("3000");
        mp.setText("1500");
        physAtk.setText("1000");
        physDef.setText("950");
        mgAtk.setText("1500");
        mgDef.setText("1000");
        str.setText("1050");
        agi.setText("1500");
        intel.setText("900");



    }
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.backBtn){
            Intent back = new Intent(demonScreen.this, monsterMenu.class);
            startActivity(back);
        }





    }
}
