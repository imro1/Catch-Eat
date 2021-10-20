// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class spidah extends Actor
{

    /**
     * Act - do whatever the spidah wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(7);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-7);
        }
        if (isTouching(fly.class)) {
            Greenfoot.playSound("eating.wav");
        }
        if (getWorld().getObjects(fly.class).isEmpty()) {
            Greenfoot.stop();
        }
        if (isTouching(fly.class)) {
            removeTouching(fly.class);
        }
    }
}
