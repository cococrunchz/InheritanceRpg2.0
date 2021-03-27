package com.example.myapplication.view.heroes;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.controller.hero;
import com.example.myapplication.view.heroes.secondJob.Knight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class swordsmanScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swordsman_screen);


        ImageButton next, calc;
        TextView Class;
        ImageView bscknight;

        next = findViewById(R.id.nextBtn2);
        bscknight = findViewById(R.id.basicKnight);
        calc = findViewById(R.id.calc2);
        Class = findViewById(R.id.swordClass);

        calc.setOnClickListener(this::onClick);
        next.setOnClickListener(this::onClick);

        bscknight.setVisibility(View.VISIBLE);

        Class.setText("Swordsman");

    }
    @Override
    public void onClick(View v){

        if(v.getId() == R.id.calc2) {

            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;
            TextView Class;
            ImageView bscknight, swordman, claymore;

            bscknight = findViewById(R.id.basicKnight);

            inputLvl = findViewById(R.id.inputLvl2);
            hp = findViewById(R.id.health);
            mp = findViewById(R.id.mana);
            physAtk = findViewById(R.id.physAtk);
            physDef = findViewById(R.id.physDef);
            mgAtk = findViewById(R.id.mgAtk);
            mgDef = findViewById(R.id.mgDef);
            str = findViewById(R.id.str);
            agi = findViewById(R.id.agi);
            intel = findViewById(R.id.int1);

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

            hero basicKnight = new hero("Arthur", "Swordsman", 0);

            basicKnight.setHerolvl(level);
            Exp = Math.round(basicKnight.xpGrowth());
            basicKnight.setHealthPoint(30);
            basicKnight.setManaPoint(3);
            basicKnight.setHeroPhysATK(8);
            basicKnight.setHeroPhysDEF(5);
            basicKnight.setHeroMgATK(2);
            basicKnight.setHeroMgDEF(1);
            basicKnight.setHeroAgi(15);
            basicKnight.setHeroInt(13);
            basicKnight.setHeroStr(6);
            basicKnight.setHeroXP(Exp);

            pAtk = Math.round(basicKnight.physAtkGrowth());
            pDef = Math.round(basicKnight.physDefGrowth());
            mAtk = Math.round(basicKnight.mgAtkGrowth());
            mDef = Math.round(basicKnight.mgDefGrowth());
            MP = Math.round(basicKnight.mpGrowth());
            HP = Math.round(basicKnight.hpGrowth());
            strength = Math.round(basicKnight.strGrowth());
            agility = Math.round(basicKnight.agiGrowth());
            intl = Math.round(basicKnight.intGrowth());

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
        else if (v.getId() == R.id.nextBtn2){

            Intent knight = new Intent(swordsmanScreen.this, Knight.class);
            startActivity(knight);
        }
    }
}