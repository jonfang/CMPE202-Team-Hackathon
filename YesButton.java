import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YesButton extends MonitorButton
{
    private static String text = "Yes";
    public YesButton(){
        super();
        getImage().drawString(text,10,20);
        setButtonVal(text);
    }
}
