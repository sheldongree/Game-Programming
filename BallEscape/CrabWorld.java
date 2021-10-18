// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class CrabWorld extends World
{

    /* (Actor, World, Greenfoot, GreenfootImage)*/

    /**
     * Create the crab world (the beach). Our world has a size of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
        addObject( new Fly(), 1, 2);
        for (int i = 0;i <= 0;i++) {
            int x = Greenfoot.getRandomNumber(getWidth() - 1);
            int y = Greenfoot.getRandomNumber(getHeight() - 1);
            addObject( new Fly(), x, y);
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab Crab =  new Crab();
        addObject(Crab, 266, 536);
        End end =  new End();
        addObject(end, 282, 47);
        Crab.setLocation(283, 532);
        Fly crab =  new Fly();
        addObject(crab, 59, 215);
        Fly crab2 =  new Fly();
        addObject(crab2, 498, 399);
        Skull cactus =  new Skull();
        addObject(cactus, 78, 469);
        Skull cactus2 =  new Skull();
        addObject(cactus2, 113, 84);
        Skull cactus3 =  new Skull();
        addObject(cactus3, 352, 47);
        cactus2.setLocation(43, 59);
        cactus3.setLocation(522, 58);
        cactus.setLocation(36, 523);
        Skull cactus4 =  new Skull();
        addObject(cactus4, 516, 513);
        cactus3.setLocation(524, 40);
        cactus2.setLocation(47, 69);
        cactus.setLocation(35, 532);
        cactus4.setLocation(515, 519);
        cactus2.setLocation(44, 78);
        cactus2.setLocation(39, 53);
        cactus.setLocation(40, 504);
        cactus4.setLocation(516, 516);
        crab2.setLocation(458, 285);
        crab2.setLocation(423, 356);
        removeObject(crab2);
        crab.setLocation(52, 303);
        Star straw =  new Star();
        addObject(straw, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        Star straw2 =  new Star();
        addObject(straw2, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        Star straw3 =  new Star();
        addObject(straw3, Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        addObject(straw3, 501, 194);
    }
}
