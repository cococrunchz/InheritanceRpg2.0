package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.myapplication.R;
import com.example.myapplication.view.heroes.mageScreen;
import com.example.myapplication.view.heroes.rangerScreen;
import com.example.myapplication.view.heroes.swordsmanScreen;
import com.example.myapplication.view.heroes.wandererScreen;

public class heroMenu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_menu);

        ImageButton ranger = findViewById(R.id.rangedBtn);
        ImageButton mage = findViewById(R.id.mageBtn);
        ImageButton swordsman = findViewById(R.id.swordBtn);
        ImageButton wanderer = findViewById(R.id.wanderBtn);

        ranger.setOnClickListener(this);
        mage.setOnClickListener(this);
        swordsman.setOnClickListener(this);
        wanderer.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.rangedBtn){
            Intent ranger = new Intent(heroMenu.this, rangerScreen.class);
            startActivity(ranger);
        }
        else if (view.getId() == R.id.mageBtn) {
            Intent mage = new Intent(heroMenu.this, mageScreen.class);
            startActivity(mage);
        }
        else if (view.getId() == R.id.swordBtn) {
            Intent sword = new Intent(heroMenu.this, swordsmanScreen.class);
            startActivity(sword);
        }
        else if (view.getId() == R.id.wanderBtn) {
            Intent wander = new Intent(heroMenu.this, wandererScreen.class);
            startActivity(wander);
        }
    }

}