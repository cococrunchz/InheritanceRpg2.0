package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Scanner;

import org.w3c.dom.Text;

public class rangerScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranger_screen);

        ImageView archer = findViewById(R.id.archer);
        ImageView bscArcher = findViewById(R.id.basic_archer);
        ImageButton back = findViewById(R.id.backBtn);
        ImageButton next = findViewById(R.id.nextBtn);
        ImageButton lore = findViewById(R.id.loreBtn);
        ImageButton calc = findViewById(R.id.calc);

        calc.setOnClickListener(this);


        archer.setVisibility(View.INVISIBLE);
        bscArcher.setVisibility(View.VISIBLE);

    }
    @Override
    public void onClick(View view){

        TextView Class = findViewById(R.id.rangerClass);
        EditText inputLvl = findViewById(R.id.inputLvl);
        TextView hp = findViewById(R.id.Health);
        TextView mp = findViewById(R.id.Mana);
        TextView physAtk = findViewById(R.id.PhysAtk);
        TextView physDef = findViewById(R.id.PhysDef);
        TextView mgAtk = findViewById(R.id.MgAtk);
        TextView mgDef = findViewById(R.id.MgDef);
        TextView str = findViewById(R.id.Str);
        TextView agi = findViewById(R.id.Agi);
        TextView intel = findViewById(R.id.Int);


        hero basicArcher = new hero("Mei","Ranger",1000,0 ,9 ,50,20, 30);

        //basicArcher.setHerolvl(0); nothing changes when included, app also crashes when the rest of the stats are included

        double level = basicArcher.getHerolvl();

        //level = Double.parseDouble(inputLvl.getText().toString()); crashes when included

        if (level <= 20){ //undecided

            hp.setText(String.valueOf(Math.round(basicArcher.hpGrowth()))); //output won't show up
            mp.setText(String.valueOf(Math.round(basicArcher.mpGrowth()))); //''
            physAtk.setText(String.valueOf(Math.round(basicArcher.physAtkGrowth()))); //shows up but only shows the initial base stat

        }


    }


}