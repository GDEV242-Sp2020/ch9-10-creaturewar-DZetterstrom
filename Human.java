import java.util.Random;
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    private Random rand = new Random();
    public Human(){
        this.hp = rand.nextInt(21) + 10;
        this.strength = rand.nextInt(14) + 5;
    }
}
