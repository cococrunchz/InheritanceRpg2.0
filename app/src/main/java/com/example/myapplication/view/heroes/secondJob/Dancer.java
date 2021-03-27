package com.example.myapplication.view.heroes.secondJob;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.controller.secondJob;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Dancer extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dancer);

        ImageButton calc;

        calc = findViewById(R.id.calc9);
        calc.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.calc9) {
            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;

            inputLvl = findViewById(R.id.inputLvl10);
            hp = findViewById(R.id.health9);
            mp = findViewById(R.id.mana9);
            physAtk = findViewById(R.id.physAtk9);
            physDef = findViewById(R.id.physDef9);
            mgAtk = findViewById(R.id.mgAtk9);
            mgDef = findViewById(R.id.mgDef9);
            str = findViewById(R.id.str9);
            agi = findViewById(R.id.agi9);
            intel = findViewById(R.id.int9);

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

            secondJob dancer = new secondJob();

            dancer.setHerolvl(level);
            Exp = Math.round(dancer.xpGrowth());
            dancer.setHealthPoint(40);
            dancer.setHeroXP(Exp);
            dancer.setManaPoint(4);
            dancer.setHeroPhysATK(9);
            dancer.setHeroPhysDEF(6);
            dancer.setHeroMgATK(3);
            dancer.setHeroMgDEF(2);
            dancer.setHeroAgi(18);
            dancer.setHeroInt(15);
            dancer.setHeroStr(8);

            HP = Math.round(dancer.hpGrowth());
            pAtk = Math.round(dancer.physAtkGrowth());
            pDef = Math.round(dancer.physDefGrowth());
            mAtk = Math.round(dancer.mgAtkGrowth());
            mDef = Math.round(dancer.mgDefGrowth());
            MP = Math.round(dancer.mpGrowth());
            strength = Math.round(dancer.strGrowth());
            agility = Math.round(dancer.agiGrowth());
            intl = Math.round(dancer.intGrowth());

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