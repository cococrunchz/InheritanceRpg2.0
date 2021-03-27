package com.example.myapplication.view.heroes.secondJob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.controller.secondJob;

public class Archer extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archer);

        ImageButton next, archerCalc;
        ImageView archer;

        archer = findViewById(R.id.archer2);
        archerCalc = findViewById(R.id.archerCalc);
        next = findViewById(R.id.nextBtn3);

        archerCalc.setOnClickListener(this);
        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.archerCalc) {
            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;

            inputLvl = findViewById(R.id.inputLvl3);
            hp = findViewById(R.id.health2);
            mp = findViewById(R.id.mana2);
            physAtk = findViewById(R.id.physAtk2);
            physDef = findViewById(R.id.physDef2);
            mgAtk = findViewById(R.id.mgAtk2);
            mgDef = findViewById(R.id.mgDef2);
            str = findViewById(R.id.str2);
            agi = findViewById(R.id.agi2);
            intel = findViewById(R.id.int2);

            int level = 0;
            double HP = 0;
            double MP = 0;
            double Exp = 0;
            double strength = 0;
            double agility = 0;
            double intl = 0;
            double pAtk = 0;
            double pDef = 0;
            double mAtk = 0;
            double mDef = 0;

            level = Integer.parseInt(inputLvl.getText().toString());

            secondJob Archer = new secondJob();

            Archer.setHerolvl(level);
            Exp = Math.round(Archer.xpGrowth());
            Archer.setHealthPoint(40);
            Archer.setHeroXP(Exp);
            Archer.setManaPoint(4);
            Archer.setHeroPhysATK(9);
            Archer.setHeroPhysDEF(6);
            Archer.setHeroMgATK(3);
            Archer.setHeroMgDEF(2);
            Archer.setHeroAgi(18);
            Archer.setHeroInt(15);
            Archer.setHeroStr(8);

            HP = Math.round(Archer.hpGrowth());
            pAtk = Math.round(Archer.physAtkGrowth());
            pDef = Math.round(Archer.physDefGrowth());
            mAtk = Math.round(Archer.mgAtkGrowth());
            mDef = Math.round(Archer.mgDefGrowth());
            MP = Math.round(Archer.mpGrowth());
            strength = Math.round(Archer.strGrowth());
            agility = Math.round(Archer.agiGrowth());
            intl = Math.round(Archer.intGrowth());

            hp.setText(Double.toString(HP));
            mp.setText(Double.toString(MP));
            mgAtk.setText(Double.toString(mAtk));
            mgDef.setText(Double.toString(mDef));
            str.setText(Double.toString(strength));
            agi.setText(Double.toString(agility));
            intel.setText(Double.toString(intl));
            physAtk.setText(Double.toString(pAtk));
            physDef.setText(Double.toString(pDef));
        }
        else if (v.getId() == R.id.nextBtn3){
            Intent dancer = new Intent(Archer.this, Thief.class);
            startActivity(dancer);
        }
    }

}