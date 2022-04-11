package day11.task2;

public abstract class Hero {
   public final int MAX_HEALTH = 100;
   public final int MIN_HEALTH = 0;
   protected double health;

   public Hero(double health){
      this.health = health;
   }

   public void setHealth(double health){
      this.health += health;
      if(this.health > MAX_HEALTH)
         this.health = MAX_HEALTH;
   }

   public void getHealth(){
      System.out.println("health = " + this.health);
   }
   public abstract void PhysDef(int attack);

   public abstract void MagicDef(int attack);



}
