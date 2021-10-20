import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class fly extends Actor
{

    /**
     * Act - do whatever the fly wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        

        GreenfootImage image = getImage();  
        image.scale(35, 34);
        setImage(image);
        
        {
        if(Greenfoot.getRandomNumber(100) < 35);
        {
        turn(Greenfoot.getRandomNumber(90) - 45);
        }
        {
        move(8);
        if(isTouching (spiderweb.class));
        move(2);
        }
        
        }
        
    }
            
       
 }      
       //getting ate effect with sound
        //
    

