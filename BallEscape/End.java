// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class End extends Actor
{

    /**
     * Act - do whatever the End wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Crab.class)) {
            Greenfoot.stop();
        }
        if (isTouching(Crab.class)) {
            Greenfoot.playSound("fanfare.wav");
            getWorld().showText("YOU WON", 260, 260);
        }
    }
}
