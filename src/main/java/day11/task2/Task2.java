package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        paladin.getHealth();
        paladin.physicalAttack(magician);
        magician.getHealth();
        shaman.healTeammate(magician);
        magician.getHealth();
        magician.magicalAttack(paladin);
        paladin.getHealth();
        shaman.physicalAttack(warrior);
        warrior.getHealth();
        paladin.healHimself();
        paladin.getHealth();
        warrior.physicalAttack(magician);
        magician.getHealth();
        warrior.physicalAttack(magician);
        magician.getHealth();
        warrior.physicalAttack(magician);
        magician.getHealth();
        warrior.physicalAttack(magician);
        magician.getHealth();
        warrior.physicalAttack(magician);
        magician.getHealth();

    }
}
