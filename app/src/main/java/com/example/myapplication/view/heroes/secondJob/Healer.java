package com.example.myapplication.view.heroes.secondJob;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.controller.hero;
import com.example.myapplication.controller.secondJob;
import com.example.myapplication.view.heroes.mageScreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Healer extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healer);

        ImageButton next, calc;

        next = findViewById(R.id.nextBtn7);
        calc = findViewById(R.id.calc6);

        calc.setOnClickListener(this::onClick);
        next.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View v){

        if(v.getId() == R.id.calc6) {
            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;

            inputLvl = findViewById(R.id.inputLvl7);
            hp = findViewById(R.id.health6);
            mp = findViewById(R.id.mana6);
            physAtk = findViewById(R.id.physAtk6);
            physDef = findViewById(R.id.physDef6);
            mgAtk = findViewById(R.id.mgAtk6);
            mgDef = findViewById(R.id.mgDef6);
            str = findViewById(R.id.str6);
            agi = findViewById(R.id.agi6);
            intel = findViewById(R.id.int6);

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

            secondJob healer = new secondJob();

            healer.setHerolvl(level);
            Exp = Math.round(healer.xpGrowth());
            healer.setHealthPoint(30);
            healer.setManaPoint(3);
            healer.setHeroPhysATK(8);
            healer.setHeroPhysDEF(5);
            healer.setHeroMgATK(2);
            healer.setHeroMgDEF(1);
            healer.setHeroAgi(15);
            healer.setHeroInt(13);
            healer.setHeroStr(6);
            healer.setHeroXP(Exp);

            pAtk = Math.round(healer.physAtkGrowth());
            pDef = Math.round(healer.physDefGrowth());
            mAtk = Math.round(healer.mgAtkGrowth());
            mDef = Math.round(healer.mgDefGrowth());
            MP = Math.round(healer.mpGrowth());
            HP = Math.round(healer.hpGrowth());
            strength = Math.round(healer.strGrowth());
            agility = Math.round(healer.agiGrowth());
            intl = Math.round(healer.intGrowth());

            physAtk.setText(Double.toString(pAtk));
            physDef.setText(Double.toString(pDef));
            hp.setText(Double.toString(HP));
            mp.setText(Double.toString(MP));
            mgAtk.setText(Double.toString(mAtk));
            mgDef.setText(Double.toString(mDef));
            str.setText(Double.toString(strength));
            agi.setText(Double.toString(agility));
            intel.setText(Double.toString(intl));
        }
        else if (v.getId() == R.id.nextBtn7){

            Intent summoner = new Intent(Healer.this, Summoner.class);
            startActivity(summoner);
        }

    }
}