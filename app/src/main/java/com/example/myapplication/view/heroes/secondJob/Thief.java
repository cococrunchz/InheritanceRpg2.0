package com.example.myapplication.view.heroes.secondJob;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.controller.secondJob;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Thief extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thief);

        ImageButton calc;

        calc = findViewById(R.id.calc11);

        calc.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View v){
        TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
        EditText inputLvl;

        inputLvl = findViewById(R.id.inputLvl12);
        hp = findViewById(R.id.health11);
        mp = findViewById(R.id.mana11);
        physAtk = findViewById(R.id.physAtk11);
        physDef = findViewById(R.id.physDef11);
        mgAtk = findViewById(R.id.mgAtk11);
        mgDef = findViewById(R.id.mgDef11);
        str = findViewById(R.id.str11);
        agi = findViewById(R.id.agi11);
        intel = findViewById(R.id.int11);

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

        secondJob thief = new secondJob();

        thief.setHerolvl(level);
        Exp = Math.round(thief.xpGrowth());
        thief.setHealthPoint(40);
        thief.setHeroXP(Exp);
        thief.setManaPoint(4);
        thief.setHeroPhysATK(9);
        thief.setHeroPhysDEF(6);
        thief.setHeroMgATK(3);
        thief.setHeroMgDEF(2);
        thief.setHeroAgi(18);
        thief.setHeroInt(15);
        thief.setHeroStr(8);

        HP = Math.round(thief.hpGrowth());
        pAtk = Math.round(thief.physAtkGrowth());
        pDef = Math.round(thief.physDefGrowth());
        mAtk = Math.round(thief.mgAtkGrowth());
        mDef = Math.round(thief.mgDefGrowth());
        MP = Math.round(thief.mpGrowth());
        strength = Math.round(thief.strGrowth());
        agility = Math.round(thief.agiGrowth());
        intl = Math.round(thief.intGrowth());

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