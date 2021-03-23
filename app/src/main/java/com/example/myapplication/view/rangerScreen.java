package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class rangerScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranger_screen);

        ImageView archer = findViewById(R.id.archer);
        ImageView bscArcher = findViewById(R.id.basic_archer);
        ImageButton back = findViewById(R.id.backBtn);
        ImageButton next = findViewById(R.id.nextBtn);
        ImageButton lore = findViewById(R.id.loreBtn);

        EditText lvl = findViewById(R.id.inputLvl);
        EditText hp = findViewById(R.id.Hp);
        EditText mp = findViewById(R.id.mp);
        EditText physAtk = findViewById(R.id.physAtk);
        EditText physDef = findViewById(R.id.PhysDef);
        EditText mgAtk = findViewById(R.id.mgDef);
        EditText str = findViewById(R.id.Str);
        EditText agi = findViewById(R.id.Agi);
        EditText intel = findViewById(R.id.Int);

        archer.setVisibility(View.INVISIBLE);
        bscArcher.setVisibility(View.INVISIBLE;


        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent back = new Intent(rangerScreen.this, heroMenu.class);
                        startActivity(back);
                    }
                }
        );


    }


}