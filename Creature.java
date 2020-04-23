import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   public int hp;
   public int strength;
   
   public Creature(){
       this.hp = 10;
       this.strength = 10;
   }
   
   public Creature(int hp, int strength){
       this.hp = hp >= 5 ? hp : 10;
       this.strength = strength >= 5 ? strength : 10;
   }
   
   public int damage(){
       Random rand = new Random();
       return rand.nextInt(strength) + 1;
   }
   
   public boolean isAlive(){
       return this.hp > 0 ? true : false;
   }
   
   public void takeWound(int damage){
       this.hp = this.hp - damage;
   }
}
