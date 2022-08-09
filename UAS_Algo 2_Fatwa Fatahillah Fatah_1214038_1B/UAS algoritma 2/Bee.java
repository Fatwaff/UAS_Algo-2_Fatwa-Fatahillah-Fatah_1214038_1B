import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        Arah();
        getWorld().showText("nilai dari database = " , 100, 100);
    }
    
    public void Arah() {
        if(Greenfoot.isKeyDown("a")){
            int x = Greenfoot.getRandomNumber(20);
            if (x > 1){
            setLocation(getX() -2, getY()); 
            }
        }
        if(Greenfoot.isKeyDown("d")){
             setLocation(getX() +2, getY()); 
        }
        if(Greenfoot.isKeyDown("w")){
             setLocation(getX(), getY() -2); 
        }
        if(Greenfoot.isKeyDown("s")){
             setLocation(getX(), getY() +2); 
        }
    }
}
