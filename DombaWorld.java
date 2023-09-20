import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class DombaWorld extends World
{
    public DombaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Random rnd = new Random();
        Boolean isRunning = false;
        for (int i=0; i<20; i++){
            int x = rnd.nextInt(this.getWidth()-1);
            int y = rnd.nextInt(this.getHeight()-1);
            domba kambing1 = new domba();
            kambing1.setRotation(75*rnd.nextInt(1));
            this.addObject(kambing1, x, y);
        }
    }
}
