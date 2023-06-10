import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class PassApplication {
    private static String name = "John Doe";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pass Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.drawString("Hello, " + name + "dev", 10, 10);
            }
        };
        frame.add(panel);

        frame.setVisible(true);
    }
}
