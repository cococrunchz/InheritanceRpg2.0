package com.example.myapplication.view.heroes.secondJob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.controller.secondJob;

public class Warrior extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warrior);

        ImageButton calc;

        calc = findViewById(R.id.calc7);

        calc.setOnClickListener(this::onClick);

    }
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.calc7) {
            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;

            inputLvl = findViewById(R.id.inputLvl8);
            hp = findViewById(R.id.health7);
            mp = findViewById(R.id.mana7);
            physAtk = findViewById(R.id.physAtk7);
            physDef = findViewById(R.id.physDef7);
            mgAtk = findViewById(R.id.mgAtk7);
            mgDef = findViewById(R.id.mgDef7);
            str = findViewById(R.id.str7);
            agi = findViewById(R.id.agi7);
            intel = findViewById(R.id.int7);

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

            secondJob warrior = new secondJob();

            warrior.setHerolvl(level);
            Exp = Math.round(warrior.xpGrowth());
            warrior.setHealthPoint(40);
            warrior.setHeroXP(Exp);
            warrior.setManaPoint(4);
            warrior.setHeroPhysATK(9);
            warrior.setHeroPhysDEF(6);
            warrior.setHeroMgATK(3);
            warrior.setHeroMgDEF(2);
            warrior.setHeroAgi(18);
            warrior.setHeroInt(15);
            warrior.setHeroStr(8);

            HP = Math.round(warrior.hpGrowth());
            pAtk = Math.round(warrior.physAtkGrowth());
            pDef = Math.round(warrior.physDefGrowth());
            mAtk = Math.round(warrior.mgAtkGrowth());
            mDef = Math.round(warrior.mgDefGrowth());
            MP = Math.round(warrior.mpGrowth());
            strength = Math.round(warrior.strGrowth());
            agility = Math.round(warrior.agiGrowth());
            intl = Math.round(warrior.intGrowth());

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




    }
}