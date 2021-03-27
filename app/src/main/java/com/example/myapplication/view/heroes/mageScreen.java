package com.example.myapplication.view.heroes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.controller.hero;
import com.example.myapplication.view.heroes.secondJob.Healer;
import com.example.myapplication.view.heroes.secondJob.Knight;

public class mageScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mage_screen);

        ImageButton next, calc;

        next = findViewById(R.id.nextBtn6);
        calc = findViewById(R.id.calc5);

        calc.setOnClickListener(this::onClick);
        next.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View v){

        if(v.getId() == R.id.calc5) {
            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;

            inputLvl = findViewById(R.id.inputLvl6);
            hp = findViewById(R.id.health5);
            mp = findViewById(R.id.mana5);
            physAtk = findViewById(R.id.physAtk5);
            physDef = findViewById(R.id.physDef5);
            mgAtk = findViewById(R.id.mgAtk5);
            mgDef = findViewById(R.id.mgDef5);
            str = findViewById(R.id.str5);
            agi = findViewById(R.id.agi5);
            intel = findViewById(R.id.int5);

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

            hero mage = new hero("Rosalie", "Mage", 0);

            mage.setHerolvl(level);
            Exp = Math.round(mage.xpGrowth());
            mage.setHealthPoint(30);
            mage.setManaPoint(3);
            mage.setHeroPhysATK(8);
            mage.setHeroPhysDEF(5);
            mage.setHeroMgATK(2);
            mage.setHeroMgDEF(1);
            mage.setHeroAgi(15);
            mage.setHeroInt(13);
            mage.setHeroStr(6);
            mage.setHeroXP(Exp);

            pAtk = Math.round(mage.physAtkGrowth());
            pDef = Math.round(mage.physDefGrowth());
            mAtk = Math.round(mage.mgAtkGrowth());
            mDef = Math.round(mage.mgDefGrowth());
            MP = Math.round(mage.mpGrowth());
            HP = Math.round(mage.hpGrowth());
            strength = Math.round(mage.strGrowth());
            agility = Math.round(mage.agiGrowth());
            intl = Math.round(mage.intGrowth());

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
        else if (v.getId() == R.id.nextBtn6){

            Intent Healer = new Intent(mageScreen.this, com.example.myapplication.view.heroes.secondJob.Healer.class);
            startActivity(Healer);
        }

    }
}