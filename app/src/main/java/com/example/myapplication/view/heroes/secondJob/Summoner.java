package com.example.myapplication.view.heroes.secondJob;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.controller.secondJob;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Summoner extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summoner);

        ImageButton calc;

        calc = findViewById(R.id.calc10);
        calc.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View v){

        if (v.getId() == R.id.calc10) {
            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;

            inputLvl = findViewById(R.id.inputLvl11);
            hp = findViewById(R.id.health10);
            mp = findViewById(R.id.mana10);
            physAtk = findViewById(R.id.physAtk10);
            physDef = findViewById(R.id.physDef10);
            mgAtk = findViewById(R.id.mgAtk10);
            mgDef = findViewById(R.id.mgDef10);
            str = findViewById(R.id.str10);
            agi = findViewById(R.id.agi10);
            intel = findViewById(R.id.int10);

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

            secondJob summoner = new secondJob();

            summoner.setHerolvl(level);
            Exp = Math.round(summoner.xpGrowth());
            summoner.setHealthPoint(40);
            summoner.setHeroXP(Exp);
            summoner.setManaPoint(4);
            summoner.setHeroPhysATK(9);
            summoner.setHeroPhysDEF(6);
            summoner.setHeroMgATK(3);
            summoner.setHeroMgDEF(2);
            summoner.setHeroAgi(18);
            summoner.setHeroInt(15);
            summoner.setHeroStr(8);

            HP = Math.round(summoner.hpGrowth());
            pAtk = Math.round(summoner.physAtkGrowth());
            pDef = Math.round(summoner.physDefGrowth());
            mAtk = Math.round(summoner.mgAtkGrowth());
            mDef = Math.round(summoner.mgDefGrowth());
            MP = Math.round(summoner.mpGrowth());
            strength = Math.round(summoner.strGrowth());
            agility = Math.round(summoner.agiGrowth());
            intl = Math.round(summoner.intGrowth());

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