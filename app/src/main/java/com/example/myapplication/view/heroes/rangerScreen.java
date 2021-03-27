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
import com.example.myapplication.controller.secondJob;
import com.example.myapplication.view.heroMenu;
import com.example.myapplication.view.heroes.secondJob.Archer;

public class rangerScreen extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranger_screen);

        ImageButton next, calc;
        TextView Class;
        ImageView archer, bscArcher;

        next = (ImageButton) findViewById(R.id.nextBtn);
        bscArcher = findViewById(R.id.basic_archer);
        calc = (ImageButton) findViewById(R.id.calc);


        calc.setOnClickListener(this::onClick);
        next.setOnClickListener(this::onClick);


        bscArcher.setVisibility(View.VISIBLE);

        Class = findViewById(R.id.rangerClass);
        Class.setText("RANGER");

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.calc) {

            TextView hp, mp, physAtk, physDef, mgAtk, mgDef, str, agi, intel;
            EditText inputLvl;
            TextView Class;
            ImageView bscArcher;

            bscArcher = findViewById(R.id.basic_archer);
            Class = findViewById(R.id.rangerClass);

            inputLvl = findViewById(R.id.inputLvl);
            hp = findViewById(R.id.Health);
            mp = findViewById(R.id.Mana);
            physAtk = findViewById(R.id.PhysAtk);
            physDef = findViewById(R.id.PhysDef);
            mgAtk = findViewById(R.id.MgAtk);
            mgDef = findViewById(R.id.MgDef);
            str = findViewById(R.id.Str);
            agi = findViewById(R.id.Agi);
            intel = findViewById(R.id.Int);

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

            hero basicArcher = new hero("Mei", "Ranger", 0);


            basicArcher.setHerolvl(level);
            Exp = Math.round(basicArcher.xpGrowth());
            basicArcher.setHealthPoint(30);
            basicArcher.setManaPoint(3);
            basicArcher.setHeroPhysATK(8);
            basicArcher.setHeroPhysDEF(5);
            basicArcher.setHeroMgATK(2);
            basicArcher.setHeroMgDEF(1);
            basicArcher.setHeroAgi(15);
            basicArcher.setHeroInt(13);
            basicArcher.setHeroStr(6);
            basicArcher.setHeroXP(Exp);

            pAtk = Math.round(basicArcher.physAtkGrowth());
            pDef = Math.round(basicArcher.physDefGrowth());
            mAtk = Math.round(basicArcher.mgAtkGrowth());
            mDef = Math.round(basicArcher.mgDefGrowth());
            MP = Math.round(basicArcher.mpGrowth());
            HP = Math.round(basicArcher.hpGrowth());
            strength = Math.round(basicArcher.strGrowth());
            agility = Math.round(basicArcher.agiGrowth());
            intl = Math.round(basicArcher.intGrowth());

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
        else if (v.getId() == R.id.nextBtn) {

            Intent Archer = new Intent(rangerScreen.this, com.example.myapplication.view.heroes.secondJob.Archer.class);
            startActivity(Archer);
        }


    }

}
