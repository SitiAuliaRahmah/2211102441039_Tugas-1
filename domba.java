import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class domba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class domba extends Actor
{
    /**
     * Act - do whatever the domba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isAtEdge())
        {
            turn(17);
        }
        
        if(Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90 - 45));
        }
        move(2);
    }
}

