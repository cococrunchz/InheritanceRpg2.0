package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class monsterMenu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_menu);

        ImageButton slime = findViewById(R.id.slimebtn);
        ImageButton troll = findViewById(R.id.trollbtn);
        ImageButton golem = findViewById(R.id.golembtn);
        ImageButton demon = findViewById(R.id.demonbtn);

        slime.setOnClickListener(this);
        troll.setOnClickListener(this);
        golem.setOnClickListener(this);
        demon.setOnClickListener(this);



    }
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.slimebtn){
            Intent slime = new Intent(monsterMenu.this, slimeScreen.class);
            startActivity(slime);
        }
        else if (view.getId() == R.id.trollbtn) {
            Intent troll = new Intent(monsterMenu.this, trollScreen.class);
            startActivity(troll);
        }
        else if (view.getId() == R.id.golembtn) {
            Intent golem = new Intent(monsterMenu.this, golemScreen.class);
            startActivity(golem);
        }
        else if (view.getId() == R.id.demonbtn) {
            Intent demon = new Intent(monsterMenu.this, demonScreen.class);
            startActivity(demon);

        }
    }
