import javax.swing.*;
import java.awt.*;

public class GraphingPlane {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {createAndShowGUI();}});
    }

    private static void createAndShowGUI() {
        JFrame f = new JFrame("Graphing Plane");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MyPanel());
        f.pack();
        f.setVisible(true);
    }
}

class MyPanel extends JPanel {
    private final int POINTWIDTH = 3;
    private final int POINTHEIGHT = 3;

    private  int xPos = 20;

    private  int yPos = 20;

    private int color = 0;

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(1000,1000);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (color == 1) {
            g.setColor(Color.RED);
        }
        else if (color == 2) {
            g.setColor(Color.ORANGE);
        }
        else if (color == 3) {
            g.setColor(Color.GREEN);
        }
        else if (color == 4) {
            g.setColor(Color.BLUE);
        }
        else {
            g.setColor(Color.BLACK);
        }
        g.fillRect(xPos, yPos, POINTWIDTH, POINTHEIGHT);
        g.drawRect(xPos, yPos, POINTWIDTH, POINTHEIGHT);
    }
}