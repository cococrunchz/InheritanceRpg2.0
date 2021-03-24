package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class homeScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        ImageButton hero = findViewById(R.id.heroBtn);
        ImageButton monster = findViewById(R.id.monsterBtn);

        hero.setOnClickListener(this);
        monster.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.heroBtn){
            Intent hero = new Intent(homeScreen.this, heroMenu.class);
            startActivity(hero);
        }
        else if (view.getId() == R.id.monsterBtn){
            Intent monster = new Intent(homeScreen.this, monsterMenu.class);
            startActivity(monster);
        }
    }
}