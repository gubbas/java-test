package applets;/*
* Aditi Gubba
* 6/1/19
* Applet2.java
* 2.21 Write an applet that draws a house with a door (and doorknob),
windows, and a chimney. Add some smoke coming out of the chimney
and some clouds in the sky.
*/


import java.applet.Applet;
import java.awt.*;

public class Applet2 extends Applet{

    /**
     * Life Cycle Methods
     * @param g
     */

    public void init(){
        System.out.println("Applet2 : Inititializing Applet");
    }
    public void start(){
        System.out.println("Applet2 : Starting Applet");

    }
    public void stop(){
        System.out.println("Applet2: Stopping Applet");

    }
    public void destroy(){
        System.out.println("Applet2: Destroying Applet");
    }

    /**
     * Painting Applet
     * @param g
     */


    public void paint(Graphics g){

        //create new colors
        Color c=new Color(124, 66, 7); //brown
        Color c1=new Color(173, 219, 244); //very light blue


        int base_x=100;
        int base_y=100;

        // color in background
        this.setBackground (c1);

        //draw the floor
        this.setForeground (c);
        g.fillRect (0, 300, 800, 800);

        //draw the house
        g.setColor (new Color(255,204,51));
        g.fillRect (base_x+50, base_y+125, 300, 100);

        //draw the door
        g.setColor (new Color(239, 115, 0));
        g.fillRect (base_x+180, base_y+175, 40, 50);

        //draw the windows outside
        g.setColor (new Color(239, 115, 0));
        g.fillRect (base_x+100, base_y+155, 50, 35);
        g.fillRect (base_x+260, base_y+155, 50, 35);

        //draw windows inside part
        g.setColor (new Color(252, 239, 184));
        g.fillRect (base_x+103, base_y+158, 44, 29);
        g.fillRect (base_x+263, base_y+158, 44, 29);

        //draw the roof
        g.setColor (new Color(239, 115, 0));
        g.fillRect (base_x+40, base_y+100, 320, 40);

        //draw the doorknob
        g.setColor(Color.black);
        g.fillOval (base_x+185, base_y+200, 6, 6);

        //draw the chimney
        g.setColor (new Color(239, 115, 0));
        g.fillRect (base_x+60, base_y+80, 20, 40);

        //draw the smoke
        g.setColor (Color.darkGray);
        g.fillOval (base_x+60, base_y+60, 20, 20);
        g.fillOval (base_x+65, base_y+50, 15, 25);
        g.fillOval (base_x+70, base_y+45, 15, 20);

        //draw the cloud
        g.setColor (Color.white);
        g.fillOval (base_x+200, base_y+30, 60, 40);
        g.fillOval (base_x+220, base_y+10, 50, 40);
        g.fillOval (base_x+258, base_y+7, 35, 30);
        g.fillOval (base_x+230, base_y+40, 60, 40);
        g.fillOval (base_x+260, base_y+20, 60, 40);

        //draw bushes left
        g.setColor (new Color(42, 130, 55));
        g.fillOval (base_x+40, base_y+200, 30, 30);
        g.fillOval (base_x+30, base_y+210, 20, 20);
        g.fillOval (base_x+60, base_y+210, 20, 20);

        g.setColor (new Color(124, 66, 7));
        g.fillRect (base_x+30, base_y+225, 80, 60);

    }
}
/*
<applet code="Applet2.class" width="600" height="600">
</applet>
*/