package day11.task2;

import day11.task1.Warehouse;

public class Warrior extends Hero implements PhysAttack{
    private final int MAX_HEALTH = 100;
    private final int MIN_HEALTH = 0;
    private double health;
    private double physDef;
    private double magicDef;
    private int    physAtt;
    private int    magicAtt;

    public Warrior(){
        this.health = 100;
        this.physDef = 80;
        this.magicDef = 0;
        this.physAtt = 30;
        this.magicAtt = 0;

    }

    @Override
    public void setHealth(int health) {
            this.health += health;
            if(this.health > MAX_HEALTH)
                this.health = MAX_HEALTH;

    }

    @Override
    public void PhysDef(int attack) {
          this.health -= (attack - attack * (this.physDef/100));
          if(this.health < MIN_HEALTH)
              this.health = MIN_HEALTH;

    }

    @Override
    public void MagicDef(int attack) {
        this.health -= attack;
        if(this.health < MIN_HEALTH)
            this.health = MIN_HEALTH;

    }

    @Override
    public void getHealth() {
        System.out.println("health = " + this.health);
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }


    @Override
    public void physicalAttack(Hero hero) {
            hero.PhysDef(this.physAtt);
    }
}
