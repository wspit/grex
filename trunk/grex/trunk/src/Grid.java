
import greenfoot.World;
import greenfoot.core.WorldHandler;

/**
 * Write a description of class Grid here.
 * 
 * @author (wspit) 
 * @version (1.0)
 */
public class Grid  extends World
{

    /**
     * Constructor for objects of class Grid.
     * 
     */
    public Grid()
    {   
    	
        super(800, 600, 1); 
        new GridActor(getWidth(),getHeight(),10,10);

        
               
    }
}
