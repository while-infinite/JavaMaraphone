package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack{
    private final int MAX_HEALTH = 100;
    private final int MIN_HEALTH = 0;
    private double health;
    private double physDef;
    private double magicDef;
    private int    physAtt;
    private int    magicAtt;

    public Shaman(){
        this.health = 100;
        this.physDef = 20;
        this.magicDef = 20;
        this.physAtt = 10;
        this.magicAtt = 15;

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
        this.health -= (attack - attack * (this.magicDef/100));
        if(this.health < MIN_HEALTH)
            this.health = MIN_HEALTH;

    }

    @Override
    public void getHealth() {
        System.out.println("health = " + this.health);
    }


    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }


    @Override
    public void healHimself() {
        this.health += 50;
        if(this.health > MAX_HEALTH)
            this.health = MAX_HEALTH;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(30);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.MagicDef(this.magicAtt);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.PhysDef(this.physAtt);
    }
}
