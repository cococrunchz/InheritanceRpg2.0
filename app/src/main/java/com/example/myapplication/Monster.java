package com.example.myapplication;

public class Monster extends gameUnit{

    //base stats here ->
    private String monsterName;
    private int monsterLvl;
    private double monsDef, monsAtk, monsXP; //iadjust lng ni bai, di ko sure kung unsay stats ibutang sa monster

    //constructors
    public Monster(String monsterName, int monsterLvl){
        this.monsterName = monsterName;
        this.monsterLvl = monsterLvl;;
    }

    //getters
    public String getMonsterName() {
        return monsterName;
    }
    public int getMonsterLvl() {
        return monsterLvl;
    }
    public double getMonsDef() {
        return monsDef;
    }
    public double getMonsAtk() {
        return monsAtk;
    }
    public double getMonsXP() {
        return monsXP;
    }

    //setters
    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }
    public void setMonsterLvl(int monsterLvl) {
        this.monsterLvl = monsterLvl;
    }
    public void setMonsDef(double monsDef) {
        this.monsDef = monsDef;
    }
    public void setMonsAtk(double monsAtk) {
        this.monsAtk = monsAtk;
    }
    public void setMonsXP(double monsXP) {
        this.monsXP = monsXP;
    }

    //formulas ->
    public double mons_xpGrowth() {return 9 * getMonsterLvl();} //iadjust lng pud ni HAHAHA


    Monster(){}
}
