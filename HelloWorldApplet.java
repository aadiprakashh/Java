import java.applet.Applet;
import java.awt.Graphics;

// Define a class that extends Applet
public class HelloWorldApplet extends Applet {

    // Override the paint method to draw on the applet
    public void paint(Graphics g) {
        // Call the superclass's paint method first
        super.paint(g);
        
        // Draw "Hello, World!" message at coordinates (20, 30)
        g.drawString("Hello, World!", 20, 30);
    }
}
