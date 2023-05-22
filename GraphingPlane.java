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

    // Variables for graph plane:
    private final int POINTWIDTH = 3; // Sets size for drawn points on graph (pixels)
    private final int POINTHEIGHT = 3; // Sets size for drawn points on graph (pixels)
    private int dimensions = 960; // Sets size of graph plane. 960 = 12 x 80
    private int scale = dimensions / 20; // Sets graph scale (will be displayed to user as a graph from -10 to 10)

    // Variables for individual graphs:

        // Vertical line:
        private int vc;

        // Horizontal line:
        private int hc;

        // Linear graph:
        private int lm;
        private int lb;

        // Quadratic graph:
        private int qa;
        private int qb;
        private int qc;

        // Linear derivative graph:
        private int ldm;
        private int ldb;

        // Quadratic derivative graph:
        private int qda;
        private int qdb;
        private int qdc;

        // Circular graph:
        private int ca;
        private int cb;
        private int cr;

        // Trigonometric function graph:
        private int ta;
        private int tb;
        private int trig;



    private int color = 0; // Sets color value for graphs (to be decoded later)

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(dimensions,dimensions);
    }

    // Graphing method:
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < dimensions; i++) { // Draws y-axis
            g.fillRect(dimensions / 2, i, 1, 1);
            g.drawRect(dimensions / 2, i, 1, 1);
        }

        for (int i = 0; i < dimensions; i++) { // Draws x-axis
            g.fillRect(i, dimensions / 2, 1, 1);
            g.drawRect(i, dimensions / 2, 1, 1);
        }

        // Draws scale values on ends of axes:
        g.drawString("10", dimensions / 2 + 15, 15); // North
        g.drawString("10", dimensions - 20, dimensions / 2 + 15); // East
        g.drawString("-10", dimensions / 2 + 15, dimensions - 5); // South
        g.drawString("-10", 5, dimensions / 2 + 15); // West

        // Decodes color for graph:
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

        // Graphs vertical line:
        for (int i = 0; i < dimensions; i++) { // Draws y-axis
            g.fillRect(dimensions / 2 + vc * scale, i, POINTWIDTH, POINTHEIGHT);
            g.drawRect(dimensions / 2 + vc * scale, i, POINTWIDTH, POINTHEIGHT);
        }

        // Graphs horizontal line:
        for (int i = 0; i < dimensions; i++) { // Draws x-axis
            g.fillRect(i, dimensions / 2 + hc * scale, POINTWIDTH, POINTHEIGHT);
            g.drawRect(i, dimensions / 2 + hc * scale, POINTWIDTH, POINTHEIGHT);
        }

        // Graphs linear graph:
        for (int x = 0; x < dimensions; x++) { // Repeats for each pixel in plane length
            point = (x - (double) (dimensions / 2)) / scale; // Converts value of each pixel on plane to a scaled-down version for the graph
            g.fillRect((x), - (int) (point * scale * lm) + (dimensions / 2), POINTWIDTH, POINTHEIGHT);
            g.drawRect((x), - (int) (point * scale * lm) + (dimensions / 2), POINTWIDTH, POINTHEIGHT);
        }

        // Graphs quadratic graph:
        for (int x = 0; x < dimensions; x++) { // Repeats for each pixel in plane length
            point = (x - (double)(dimensions / 2)) / scale; // Converts value of each pixel on plane to a scaled-down version for the graph
            g.fillRect((x), - (int)(point * point * scale) + (dimensions / 2), POINTWIDTH, POINTHEIGHT); // Draws a point on the graph at the correct spot (translates from plane coordinate system to panel coordinate system
            g.drawRect((x), - (int)(point * point * scale) + (dimensions / 2), POINTWIDTH, POINTHEIGHT);

        // Graphs linear derivative graph:

        // Graphs quadratic derivative graph:

        // Graphs circular graph:

        // Graphs trigonometric graph:






            /*
            System.out.println(point);
            System.out.println(x);
            System.out.println(point * point * scale);
            System.out.println("");
            */
        }

        for (int x = 0; x < dimensions; x++) { // Repeats for each pixel in plane length
            point = (x - (double) (dimensions / 2)) / scale; // Converts value of each pixel on plane to a scaled-down version for the graph
            g.fillRect((x), - (int) (point * point * point * scale) + (dimensions / 2), POINTWIDTH, POINTHEIGHT);
            g.drawRect((x), - (int) (point * point * point * scale) + (dimensions / 2), POINTWIDTH, POINTHEIGHT);
        }
    }
}