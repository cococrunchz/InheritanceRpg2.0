package com.example.myapplication;

public class gameUnit {
    int healthPoint;
    int manaPoint;
    double armorPoint;

    public gameUnit(){}

    public gameUnit(int healthPoint, int manaPoint, double armorPoint){
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.armorPoint = armorPoint;
    }
    //getters
    public int getHealthPoint() {
        return healthPoint;
    }
    public int getManaPoint() {
        return manaPoint;
    }
    public double getArmorPoint() {
        return armorPoint;
    }
    //setters
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    public void setManaPoint(int manaPoint) {
        this.manaPoint = manaPoint;
    }
    public void setArmorPoint(double armorPoint) {
        this.armorPoint = armorPoint;
    }

    protected void healthPoint(int healthPoint) {
    }
    protected void manaPoint(int manaPoint) {
    }
}

