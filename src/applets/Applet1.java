package applets;/*
* Aditi Gubba
* 6/1/19
* Applet1.java
* 2.19  Write an applet that draws some balloons tied to strings. Make the balloons various colors.
*/


import java.applet.Applet;
import java.awt.*;

public class Applet1 extends Applet{

    /**
     * Life Cycle Methods
     * @param g
     */

    public void init(){
        System.out.println("Applet1 : Inititializing Applet");
    }
    public void start(){
        System.out.println("Applet1 : Starting Applet");

    }
    public void stop(){
        System.out.println("Applet1: Stopping Applet");

    }
    public void destroy(){
        System.out.println("Applet1: Destroying Applet");
    }

    /**
     * Painting Applet
     * @param g
     */

    public void paint(Graphics g){

        int base_x=150;
        int base_y=150;

        // draw the strings
        g.setColor (Color.black);
        g.drawLine (base_x+50, base_y+95, base_x+90, base_y+300);
        g.drawLine (base_x+95, base_y+90, base_x+90, base_y+300);
        g.drawLine (base_x+63, base_y+30, base_x+90, base_y+300);
        g.drawLine (base_x+122, base_y+85, base_x+90, base_y+300);
        g.drawLine (base_x+140, base_y+100, base_x+90,base_y+300);
        g.drawLine (base_x+170, base_y+120, base_x+90, base_y+300);
        g.drawLine (base_x+25, base_y+130, base_x+90, base_y+300);

        // draw the balloons
        g.setColor (Color.blue);
        g.fillOval (base_x+20, base_y+60, 50, 55);
        g.setColor (Color.yellow);
        g.fillOval (base_x+70, base_y+40, 50, 55);
        g.setColor (Color.green);
        g.fillOval (base_x+40, base_y+20, 50, 55);
        g.setColor (Color.red);
        g.fillOval (base_x+100, base_y+30, 50, 55);
        g.setColor (Color.pink);
        g.fillOval (base_x+150, base_y+70, 50, 55);
        g.setColor (Color.cyan);
        g.fillOval (base_x+120, base_y+55, 50, 55);
        g.setColor (Color.orange);
        g.fillOval (base_x+1, base_y+85, 50, 55);


    }
}
/*
<applet code="Applet1.class" width="600" height="600">
</applet>
*/