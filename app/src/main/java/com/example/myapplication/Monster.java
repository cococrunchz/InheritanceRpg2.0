package com.example.myapplication;

public class Monster extends gameUnit{

    //base stats here ->
    private String monsterName;
    private int monsterLvl;
    private double monsPhysDEF, monsPhysATK, monsMgATK, monsMgDEF;

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
    public double getMonsPhysDEF() {
        return monsPhysDEF;
    }
    public double getMonsPhysATK() {
        return monsPhysATK;
    }
    public double getMonsMgATK() {
        return monsMgATK;
    }
    public double getMonsMgDEF() {
        return monsMgDEF;
    }

    //setters
    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }
    public void setMonsterLvl(int monsterLvl) {
        this.monsterLvl = monsterLvl;
    }
    public void setMonsPhysDEF(double monsPhysDEF) {
        this.monsPhysDEF = monsPhysDEF;
    }
    public void setMonsPhysATK(double monsPhysATK) { this.monsPhysATK = monsPhysATK; }
    public void setMonsMgATK(double monsMgATK) { this.monsMgATK = monsMgATK; }
    public void setMonsMgDEF(double monsMgDEF) { this.monsMgDEF = monsMgDEF; }

    Monster(){}
}
