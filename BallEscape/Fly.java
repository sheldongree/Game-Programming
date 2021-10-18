// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Fly extends Actor
{

    /**
     * This method defines what the crab does.
     */
    public void act()
    {
        move(5);
        if (Greenfoot.getRandomNumber(100) < 50) {
            turn(Greenfoot.getRandomNumber(90) - 40);
        }
        if (isTouching(Crab.class)) {
            Greenfoot.stop();
        }
    }
}
