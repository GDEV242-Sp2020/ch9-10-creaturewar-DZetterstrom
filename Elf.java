import java.util.Random;
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
   private Random rand = new Random();
   
   public Elf(){
       this.hp = rand.nextInt(18) + 8;
       this.strength = rand.nextInt(14) + 5;
   }
   
   public int damage(){
       int magicChance = rand.nextInt(10);
       if(magicChance == 2){
           return rand.nextInt(this.strength * 2) + 1;
       }
       return rand.nextInt(this.strength) + 1;
   }
}
