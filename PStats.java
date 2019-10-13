/******************************************
 * Class Name: PStats
 * Programmer:Yousef El-Qawasmi
 * Date: December 21, 2018
 * Description: This class is the super class for this program. This class has 
 * two constructors, one that accepts arguments and one that doesn't accept 
 * arguments. This class also has various mutator and accesor methods to 
 * change and send the corresponding fields. This class then also has a 
 * addHealth and subtractHealth method that changes the value in the health field.
 * This class also has addScore and subtractScore fields that change the value
 * in the score field
 */
package culminating;

public class PStats {
    //Fields
    protected int health;
    protected int score;
    protected String name;
    
    //Constructor that initalizes the fields with the given parameters
    public PStats(int h, int s, String n){
        health=h;
        score=s;
        name=n;
    }//end contructor
    
    //Constructor that initalizes the fields if there are no arguments sent to the class
    public PStats(){
        health=0;
        score=0;
        name=null;
    }//end contructor
    
    //Mutator method that sets h to health
    public void setHealth(int h){
        health=h;
    }//end setHealth
    
    //Mutator method that sets s to score
    public void setScore(int s){
        score=s;
    }//end setScore
    
    //Mutator method that sets n to name
    public void setName(String n){
        name=n;
    }//end setName
    
    //Accesor method that returns the value in health
    public int getHealth(){
        return health;
    }//end getHealth
    
    //Accesor method that returns the value in score
    public int getScore(){
        return score;
    }//end getScore
    
    //Accesor method that returns the value in name
    public String getName(){
        return name;
    }//end getName
    
    //Method to add h to the value in health
    public void addHealth(int h){
        health+=h;
    }//end addHealth
    
    //Method to subtract h from the value in health
    public void subtractHealth(int h){
        health-=h;
    }//end subtractHealth
    
    //Method to add s to the value in score
    public void addScore(int s){
        score+=s;
    }//end addScore
    
    //Method to subtract s from the value in score
    public void subtractScore(int s){
        score-=s;
    }//end subtractScore
}

