package applets;

import java.applet.Applet;
import java.awt.*;

public class AppletTest2 extends Applet{

    /**
     * Life Cycle Methods
     * @param g
     */
    public void init(){
        System.out.println("AppletTest2 : Inititializing Applet");
    }
    public void start(){
        System.out.println("AppletTest2 : Starting Applet");

    }
    public void stop(){
        System.out.println("AppletTest2: Stopping Applet");

    }
    public void destroy(){
        System.out.println("AppletTest2: Destroying Applet");
    }

    /**
     * Painting Applet
     * @param g
     */
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("Welcome Aditi Gubba",50, 50);
        g.drawLine(20,30,20,300);
        g.drawRect(70,100,30,30);
        g.fillRect(170,100,30,30);
        g.drawOval(70,200,30,30);

        g.setColor(Color.pink);
        g.fillOval(170,200,30,30);
        g.drawArc(90,150,30,30,30,270);
        g.fillArc(270,150,30,30,0,180);
    }
}
/*
<applet code="AppletTest2.class" width="600" height="600">
</applet>
*/