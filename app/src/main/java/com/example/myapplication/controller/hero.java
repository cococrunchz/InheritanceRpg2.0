package com.example.myapplication.controller;

public class hero extends gameUnit {

    //base stats
    private String heroName, heroClass;
    private int herolvl, heroId, heroPhysDEF;
    private double heroPhysATK, heroMgATK, heroMgDEF, heroInt, heroStr, heroAgi, heroXP;

    //constructors
    public hero(String heroName, String heroClass, int heroId){
        this.heroName = heroName;
        this.heroClass = heroClass;
        this.heroId = heroId;
    }

    //getters
    public String getHeroName() {
        return heroName;
    }
    public String getHeroClass() {
        return heroClass;
    }
    public int getHeroId() {
        return heroId;
    }
    public int getHerolvl() {
        return herolvl;
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
    public double getHeroXP() {
        return heroXP;
    }

    //setters
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }
    public void setHerolvl(int herolvl) {
        this.herolvl = herolvl;
    }
    public void setHeroMgATK(double heroMgATK) {
        this.heroMgATK = heroMgATK;
    }
    public void setHeroMgDEF(double heroMgDEF) {
        this.heroMgDEF = heroMgDEF;
    }
    public void setHeroPhysDEF(int heroPhysDEF) {
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
    public void setHeroXP(double heroXP) {
        this.heroXP = heroXP;
    }
    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    //set stat formulas here ->
    public double xpGrowth() {return 9 * herolvl;}
    public double hpGrowth() {return super.getHealthPoint() + (getHeroXP() * getHerolvl());}
    public double mpGrowth() {return super.getManaPoint() + (getHeroXP() * getHerolvl());}
    public double physAtkGrowth() {return getHeroPhysATK() + (getHeroXP() * getHerolvl());}
    public double physDefGrowth() {return getHeroPhysDEF() + (getHeroXP() * getHerolvl());}
    public double mgAtkGrowth() {return getHeroMgATK() + (getHeroXP() * getHerolvl());}
    public double mgDefGrowth() {return getHeroMgDEF() + (getHeroXP() * getHerolvl());}
    public double strGrowth() {return getHeroStr() + (getHeroXP() * getHerolvl());}
    public double agiGrowth() {return getHeroAgi() + (getHeroXP() * getHerolvl());}
    public double intGrowth() {return getHeroInt() + (getHeroXP() * getHerolvl());}

    public hero(){}
}


