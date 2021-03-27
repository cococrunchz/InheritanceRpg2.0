package com.example.myapplication.view.heroes;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.controller.hero;
import com.example.myapplication.view.heroes.secondJob.Bard;
import com.example.myapplication.view.heroes.secondJob.Knight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class wandererScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wanderer_screen);

        ImageButton next, calc;

        next = findViewById(R.id.nextBtn5);
        calc = findViewById(R.id.calc4);

        calc.setOnClickListener(this::onClick);
        next.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View v){
        if(v.getId() == R.id.calc4) {
            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;

            inputLvl = findViewById(R.id.inputLvl5);
            hp = findViewById(R.id.health4);
            mp = findViewById(R.id.mana4);
            physAtk = findViewById(R.id.physAtk4);
            physDef = findViewById(R.id.physDef4);
            mgAtk = findViewById(R.id.mgAtk4);
            mgDef = findViewById(R.id.mgDef4);
            str = findViewById(R.id.str4);
            agi = findViewById(R.id.agi4);
            intel = findViewById(R.id.int4);

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

            hero wanderer = new hero("Wendi", "Wanderer", 0);

            wanderer.setHerolvl(level);
            Exp = Math.round(wanderer.xpGrowth());
            wanderer.setHealthPoint(30);
            wanderer.setManaPoint(3);
            wanderer.setHeroPhysATK(8);
            wanderer.setHeroPhysDEF(5);
            wanderer.setHeroMgATK(2);
            wanderer.setHeroMgDEF(1);
            wanderer.setHeroAgi(15);
            wanderer.setHeroInt(13);
            wanderer.setHeroStr(6);
            wanderer.setHeroXP(Exp);

            pAtk = Math.round(wanderer.physAtkGrowth());
            pDef = Math.round(wanderer.physDefGrowth());
            mAtk = Math.round(wanderer.mgAtkGrowth());
            mDef = Math.round(wanderer.mgDefGrowth());
            MP = Math.round(wanderer.mpGrowth());
            HP = Math.round(wanderer.hpGrowth());
            strength = Math.round(wanderer.strGrowth());
            agility = Math.round(wanderer.agiGrowth());
            intl = Math.round(wanderer.intGrowth());

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
        else if (v.getId() == R.id.nextBtn5){

            Intent bard = new Intent(wandererScreen.this, Bard.class);
            startActivity(bard);
        }

    }
}