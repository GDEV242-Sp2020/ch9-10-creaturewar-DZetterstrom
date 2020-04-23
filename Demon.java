import java.util.Random;
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    public int damage(){
        Random rand = new Random();
        int magicChance = rand.nextInt(20);
        if(magicChance == 2){
            return rand.nextInt(this.strength) + 51;
        }
        return rand.nextInt(this.strength) + 1;
    }
}
