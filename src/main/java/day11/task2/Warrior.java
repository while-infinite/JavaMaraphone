package day11.task2;

import day11.task1.Warehouse;

public class Warrior extends Hero implements PhysAttack{
    private double physDef;
    private double magicDef;
    private int    physAtt;


    public Warrior(){
        super(100);
        this.physDef = 80;
        this.magicDef = 0;
        this.physAtt = 30;

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
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                '}';
    }


    @Override
    public void physicalAttack(Hero hero) {
            hero.PhysDef(this.physAtt);
    }
}
