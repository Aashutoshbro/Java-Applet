import java.applet.Applet;
import java.awt.Graphics;

public class ap extends Applet {
    public void init() {
        System.out.println("Initializing the applet...");
    }

    public void start() {
        System.out.println("Starting the applet...");
    }

    public void paint(Graphics g) {
        System.out.println("Painting the applet...");
        g.drawString("Applet Life Cycle", 50, 50);
    }

    public void stop() {
        System.out.println("Stopping the applet...");
    }

    public void destroy() {
        System.out.println("Destroying the applet...");
    }
}
