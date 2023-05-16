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

    private int color = 0;

    private int scale = 20;

    private int dimensions = 960; // Size of graph plane. 960 = 12 x 80

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(dimensions,dimensions);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < dimensions; i++) {
            g.fillRect(dimensions / 2, i, 1, 1);
            g.drawRect(dimensions / 2, i, 1, 1);
        }

        for (int i = 0; i < dimensions; i++) {
            g.fillRect(i, dimensions / 2, 1, 1);
            g.drawRect(i, dimensions / 2, 1, 1);
        }
        g.drawString("10", dimensions / 2 + 15, 15); // North
        g.drawString("10", dimensions - 20, dimensions / 2 + 15); // East
        g.drawString("-10", dimensions / 2 + 15, dimensions - 5); // South
        g.drawString("-10", 5, dimensions / 2 + 15); // West

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
        double point;
        for (int x = 0; x < dimensions; x++) {
            point = x - (double)(dimensions / 2);
            g.fillRect((x - x / 2), dimensions - (x * x) / scale, POINTWIDTH, POINTHEIGHT);
            g.drawRect((x - x / 2), dimensions - (x * x) / scale, POINTWIDTH, POINTHEIGHT);
        }
    }
}