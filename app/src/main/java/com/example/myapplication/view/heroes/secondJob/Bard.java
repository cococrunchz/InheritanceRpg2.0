package com.example.myapplication.view.heroes.secondJob;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.controller.secondJob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Bard extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bard);

        ImageButton calc, next;

        calc = findViewById(R.id.calc8);
        next = findViewById(R.id.nextBtn8);

        calc.setOnClickListener(this::onClick);
        next.setOnClickListener(this::onClick);

    }
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.calc8) {
            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;

            inputLvl = findViewById(R.id.inputLvl9);
            hp = findViewById(R.id.health8);
            mp = findViewById(R.id.mana8);
            physAtk = findViewById(R.id.physAtk8);
            physDef = findViewById(R.id.physDef8);
            mgAtk = findViewById(R.id.mgAtk8);
            mgDef = findViewById(R.id.mgDef8);
            str = findViewById(R.id.str8);
            agi = findViewById(R.id.agi8);
            intel = findViewById(R.id.int8);

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

            secondJob bard = new secondJob();

            bard.setHerolvl(level);
            Exp = Math.round(bard.xpGrowth());
            bard.setHealthPoint(40);
            bard.setHeroXP(Exp);
            bard.setManaPoint(4);
            bard.setHeroPhysATK(9);
            bard.setHeroPhysDEF(6);
            bard.setHeroMgATK(3);
            bard.setHeroMgDEF(2);
            bard.setHeroAgi(18);
            bard.setHeroInt(15);
            bard.setHeroStr(8);

            HP = Math.round(bard.hpGrowth());
            pAtk = Math.round(bard.physAtkGrowth());
            pDef = Math.round(bard.physDefGrowth());
            mAtk = Math.round(bard.mgAtkGrowth());
            mDef = Math.round(bard.mgDefGrowth());
            MP = Math.round(bard.mpGrowth());
            strength = Math.round(bard.strGrowth());
            agility = Math.round(bard.agiGrowth());
            intl = Math.round(bard.intGrowth());

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
        else if (v.getId() == R.id.nextBtn8){
            Intent dancer = new Intent(Bard.this, Dancer.class);
            startActivity(dancer);
        }
    }
}