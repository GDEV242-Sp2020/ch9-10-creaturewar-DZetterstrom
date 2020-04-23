import java.util.Random;
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    private Random rand = new Random();
    private boolean attackTwice = false;
    public Balrog(){
        this.hp = rand.nextInt(121) + 80;
        this.strength = rand.nextInt(51) + 50;
    }
    
    public int damage(){
        //Balrog too OP please nerf
        if(attackTwice){
            attackTwice = false;
            return rand.nextInt(this.strength) + 1;
        }
        attackTwice = true;
        return rand.nextInt(this.strength) + 1 + damage();
    }
}
