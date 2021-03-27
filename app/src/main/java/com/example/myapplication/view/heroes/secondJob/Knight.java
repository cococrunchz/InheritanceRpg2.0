package com.example.myapplication.view.heroes.secondJob;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.controller.secondJob;
import com.example.myapplication.view.heroes.wandererScreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Knight extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knight);

        ImageButton next, calc;

        calc = findViewById(R.id.calc3);
        next = findViewById(R.id.nextBtn4);

        calc.setOnClickListener(this::onClick);
        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){

        if (v.getId() == R.id.calc3) {
            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;

            inputLvl = findViewById(R.id.inputLvl4);
            hp = findViewById(R.id.health3);
            mp = findViewById(R.id.mana3);
            physAtk = findViewById(R.id.physAtk3);
            physDef = findViewById(R.id.physDef3);
            mgAtk = findViewById(R.id.mgAtk3);
            mgDef = findViewById(R.id.mgDef3);
            str = findViewById(R.id.str3);
            agi = findViewById(R.id.agi3);
            intel = findViewById(R.id.int3);

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

            secondJob Knight = new secondJob();

            Knight.setHerolvl(level);
            Exp = Math.round(Knight.xpGrowth());
            Knight.setHealthPoint(40);
            Knight.setHeroXP(Exp);
            Knight.setManaPoint(4);
            Knight.setHeroPhysATK(9);
            Knight.setHeroPhysDEF(6);
            Knight.setHeroMgATK(3);
            Knight.setHeroMgDEF(2);
            Knight.setHeroAgi(18);
            Knight.setHeroInt(15);
            Knight.setHeroStr(8);

            HP = Math.round(Knight.hpGrowth());
            pAtk = Math.round(Knight.physAtkGrowth());
            pDef = Math.round(Knight.physDefGrowth());
            mAtk = Math.round(Knight.mgAtkGrowth());
            mDef = Math.round(Knight.mgDefGrowth());
            MP = Math.round(Knight.mpGrowth());
            strength = Math.round(Knight.strGrowth());
            agility = Math.round(Knight.agiGrowth());
            intl = Math.round(Knight.intGrowth());

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
        else if (v.getId() == R.id.nextBtn4){
            Intent warrior = new Intent(Knight.this, Warrior.class);
            startActivity(warrior);
        }
    }
}