import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Battlefield here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battlefield
{
    private ArrayList<Creature> army1 = new ArrayList<Creature>();
    private ArrayList<Creature> army2 = new ArrayList<Creature>();
    private Random rand = new Random();
    
    public void populate(int popSize){
        for(int i = 0; i < popSize; i++){
            int popAdd = rand.nextInt(20);
            if(popAdd <= 10){
                Human humanSoldier = new Human();
                army1.add(humanSoldier);
            }else if(popAdd > 10 && popAdd <= 15){
                Elf elvanSoldier = new Elf();
                army1.add(elvanSoldier);
            }else if(popAdd > 15 && popAdd <=16){
                Demon demonSoldier = new Demon();
                army1.add(demonSoldier);
            }else if(popAdd > 16 && popAdd <=17){
                Cyberdemon cyberSoldier = new Cyberdemon();
                army1.add(cyberSoldier);
            }else{
                Balrog balrogSoldier = new Balrog();
                army1.add(balrogSoldier);
            }
        }
        
        for(int i = 0; i < popSize; i++){
            int popAdd = rand.nextInt(20);
            if(popAdd <= 10){
                Human humanSoldier = new Human();
                army2.add(humanSoldier);
            }else if(popAdd > 10 && popAdd <= 15){
                Elf elvanSoldier = new Elf();
                army2.add(elvanSoldier);
            }else if(popAdd > 15 && popAdd <=16){
                Demon demonSoldier = new Demon();
                army2.add(demonSoldier);
            }else if(popAdd > 16 && popAdd <=17){
                Cyberdemon cyberSoldier = new Cyberdemon();
                army2.add(cyberSoldier);
            }else{
                Balrog balrogSoldier = new Balrog();
                army2.add(balrogSoldier);
            }
        }
    }
    
    public void war(){
        while(army1.size() != 0 && army2.size() != 0){
            int fighter1Index = rand.nextInt(army1.size());
            int fighter2Index = rand.nextInt(army2.size());
            Creature fighter1 = army1.get(fighter1Index);
            Creature fighter2 = army2.get(fighter2Index);
            int shotFirst = rand.nextInt(2);
            if(shotFirst == 0){
                fighter2.takeWound(fighter1.damage());
                if(!fighter2.isAlive()){
                    army2.remove(fighter2Index);
                }
            }else{
                fighter1.takeWound(fighter2.damage());
                if(!fighter1.isAlive()){
                    army1.remove(fighter1Index);
                }
            }
        }
    }
    
    public void afterActionReport(){
        System.out.println("Army1 size: " + army1.size());
        System.out.println("Army2 size: " + army2.size());
        if(army1.size() > army2.size()){
            System.out.println("Army1 has emerged victorious!");
        }else{
            System.out.println("Army2 has emerged victorious!");
        }
    }
}
