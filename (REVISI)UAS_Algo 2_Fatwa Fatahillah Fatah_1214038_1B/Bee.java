import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author Fatwa Fatahillah Fatah 
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
        
        Koneksi koneksi = new Koneksi();
        String s = koneksi.sampleMethod();
        getWorld().showText("Nilai Dari Database = " + s, 100, 100);
        checkKeyPress(s);
        s = String.valueOf(s);
    }
    private void checkKeyPress(String s){
        if (s.equals("w")){
             setLocation(getX(), getY()-2);
        }
        if (s.equals("s")){
             setLocation(getX(), getY()+2);
        }
        if (s.equals("a")){
             setLocation(getX()-2, getY());
        }
        if (s.equals("d")){
             setLocation(getX()+2, getY());
        }
    }
}
