package day11.task2;

public class Magician extends Hero implements MagicAttack{
    private double physDef;
    private double magicDef;
    private int    physAtt;
    private int    magicAtt;

    public Magician(){
        super(100);
        this.physDef = 0;
        this.magicDef = 80;
        this.physAtt = 5;
        this.magicAtt = 20;

    }

    @Override
    public void PhysDef(int attack) {
        this.health -= attack;
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
        return "Magician{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }


    @Override
    public void magicalAttack(Hero hero) {
        hero.MagicDef(this.magicAtt);
    }
}
