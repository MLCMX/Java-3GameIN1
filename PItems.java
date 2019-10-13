/******************************************
 * Class Name: PItems
 * Programmer: Yousef El-Qawasmi
 * Date: December 21, 2018
 * Description: This class is the sub class for this program. This class uses
 * the constructor from the super class. This class also has various mutator 
 * and accesor methods to change and send the corresponding fields. This class
 * then also has a addPotion and subtractPotion method that changes the value 
 * in the hPotion field.
 */
package culminating;

public class PItems extends PStats{
    //Fields
    private int hPotion;
    
    //Constructor that initalizes the fields with the given parameters
    public PItems(int h, int s, String n, int p){
        super(h,s,n);
        hPotion=p;
    }//end contructor
        
    public PItems(){
        super();
        hPotion=0;
    }
    
    //Mutator method that sets p to hPotion
    public void setHPotion(int p){
        hPotion=p;
    }
    
    //Accesor method that returns the value in hPotion
    public int getHPotion(){
        return hPotion;
    }
    
    //Method to add p to the value in hPotion
    public void addPotion(int p){
        hPotion+=p;
    }
    
    //Method to subtract s from the value in hPotion
    public void subtractPotion(int p){
        hPotion-=p;
    }
}
