// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{
    private int counter = 0;
    private GreenfootImage image1;
    private GreenfootImage image2;

    /**
     * 
     */
    public Crab()
    {
        image1 =  new GreenfootImage("crab.png");
        image2 =  new GreenfootImage("crab2.png");
        setImage(image1);
    }

    /**
     * 
     */
    public void switchImage()
    {
        if (getImage() == image1) {
            setImage(image2);
        }
        else {
            setImage(image1);
        }
    }

    /**
     * Act - do whatever the ball wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(10);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        if (isTouching(Star.class)) {
            removeTouching(Star.class);
            counter = counter + 10;
            getWorld().showText("score: " + counter, 260, 260);
        }
        if (isTouching(Fly.class)) {
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
        switchImage();
    }
}
