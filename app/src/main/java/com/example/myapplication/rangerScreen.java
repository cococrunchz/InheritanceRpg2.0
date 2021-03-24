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

    ImageView archer, bscArcher, back, next, lore, calc;
    TextView Class, hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
    EditText inputLvl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranger_screen);

        archer.findViewById(R.id.archer);
        bscArcher.findViewById(R.id.basic_archer);
        back.findViewById(R.id.backBtn);
        next.findViewById(R.id.nextBtn);
        lore.findViewById(R.id.loreBtn);
        calc.findViewById(R.id.calc);
        Class.findViewById(R.id.rangerClass);
        Class.setText("Basic Archer");

        calc.setOnClickListener(this);

        archer.setVisibility(View.INVISIBLE);
        bscArcher.setVisibility(View.VISIBLE);

    }

    @Override
    public void onClick(View view) {

        inputLvl.findViewById(R.id.inputLvl);
        hp.findViewById(R.id.Health);
        mp.findViewById(R.id.Mana);
        physAtk.findViewById(R.id.PhysAtk);
        physDef.findViewById(R.id.PhysDef);
        mgAtk.findViewById(R.id.MgAtk);
        mgDef.findViewById(R.id.MgDef);
        str.findViewById(R.id.Str);
        agi.findViewById(R.id.Agi);
        intel.findViewById(R.id.Int);

        hero basicArcher = new hero("Mei", "Ranger", 1000, 1, 9, 50, 20, 30);

        //basicArcher.setHerolvl(0); nothing changes when included, app also crashes when the rest of the stats are included

        double level = basicArcher.getHerolvl();


        basicArcher.getHerolvl();

        if (basicArcher.getHerolvl() <= 20) { //undecided
            level = Double.parseDouble(inputLvl.getText().toString()); //crashes when included
            hp.setText(String.valueOf(Math.round(basicArcher.hpGrowth()))); //output won't show up
            mp.setText(String.valueOf(Math.round(basicArcher.mpGrowth()))); //''
            physAtk.setText(String.valueOf(Math.round(basicArcher.physAtkGrowth())));//shows up but only shows the initial base stat
            physDef.setText(String.valueOf(Math.round(basicArcher.physDefGrowth())));

        }


    }

}

