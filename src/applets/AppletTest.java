package applets;

import java.applet.Applet;
import java.awt.*;

public class AppletTest extends Applet{

    /**
     * Life Cycle Methods
     * @param g
     */
    public void init(){
        System.out.println("Inititializing Applet");
    }
    public void start(){
        System.out.println("Starting Applet");

    }
    public void stop(){
        System.out.println("Stopping Applet");

    }
    public void destroy(){
        System.out.println("Destroying Applet");
    }

    /**
     * Painting Applet
     * @param g
     */
    public void paint(Graphics g){
        g.drawString("Welcome Aditi Gubba",600,600);
    }
}
/*
<applet code="AppletTest.class" width="600" height="600">
</applet>
*/