package com.example.myapplication.controller;

public class hero extends gameUnit {

    //base stats
    private String heroName, heroClass;
    private int herolvl, heroID;
    private double heroHP, heroPhysATK, heroMgATK, heroPhysDEF, heroMgDEF, heroInt, heroStr, heroAgi;

    //constructors
    public hero(String heroName, String heroClass, int heroID, int herolvl, double heroHP,
                double heroPhysATK, double heroMgATK, double heroPhysDEF, double heroMgDEF, int healthPoint, int manaPoint,
                double heroInt, double heroStr, double heroAgi){
        this.heroName = heroName;
        this.heroClass = heroClass;
        this.heroID = heroID;
        this.herolvl = herolvl;
        this.heroHP = heroHP;
        this.heroPhysATK = heroPhysATK;
        this.heroMgATK = heroMgATK;
        this.heroPhysDEF = heroPhysDEF;
        this.heroMgDEF = heroMgDEF;
        this.heroInt = heroInt;
        this.heroStr = heroStr;
        this.heroAgi = heroAgi;
        super.healthPoint(healthPoint);
        super.manaPoint(manaPoint);
    }

    //getters
    public String getHeroName() {
        return heroName;
    }
    public String getHeroClass() {
        return heroClass;
    }
    public int getHeroID() {
        return heroID;
    }
    public int getHerolvl() {
        return herolvl;
    }
    public double getHeroHP() {
        return heroHP;
    }
    public double getHeroMgATK() {
        return heroMgATK;
    }
    public double getHeroMgDEF() {
        return heroMgDEF;
    }
    public double getHeroPhysATK() {
        return heroPhysATK;
    }
    public double getHeroPhysDEF() {
        return heroPhysDEF;
    }
    public double getHeroInt() {
        return heroInt;
    }
    public double getHeroAgi() {
        return heroAgi;
    }
    public double getHeroStr() {
        return heroStr;
    }

    //setters
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }
    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }
    public void setHerolvl(int herolvl) {
        this.herolvl = herolvl;
    }
    public void setHeroMgATK(double heroMgATK) {
        this.heroMgATK = heroMgATK;
    }
    public void setHeroHP(double heroHP) {
        this.heroHP = heroHP;
    }
    public void setHeroMgDEF(double heroMgDEF) {
        this.heroMgDEF = heroMgDEF;
    }
    public void setHeroPhysDEF(double heroPhysDEF) {
        this.heroPhysDEF = heroPhysDEF;
    }
    public void setHeroPhysATK(double heroPhysATK) {
        this.heroPhysATK = heroPhysATK;
    }
    public void setHeroStr(double heroStr) {
        this.heroStr = heroStr;
    }
    public void setHeroAgi(double heroAgi) {
        this.heroAgi = heroAgi;
    }
    public void setHeroInt(double heroInt) {
        this.heroInt = heroInt;
    }

    //set stat formulas here ->


    public hero(){}
}

