package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{
    private double physDef;
    private double magicDef;
    private int    physAtt;
    private int    magicAtt;

    public Paladin(){
        super(100);
        this.physDef = 50;
        this.magicDef = 20;
        this.physAtt = 15;
        this.magicAtt = 0;

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
    public String toString() {
        return "Paladin{" +
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



    @Override
    public void healHimself() {
        this.health += 25;
        if(this.health > MAX_HEALTH)
            this.health = MAX_HEALTH;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(10);
    }
}
