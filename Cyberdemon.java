import java.util.Random;
/**
 * Write a description of class Cyberdemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cyberdemon extends Demon
{
    private Random rand = new Random();
    
    public Cyberdemon(){
        this.hp = rand.nextInt(76) + 25;
        this.strength = rand.nextInt(21) + 20;
    }
}
