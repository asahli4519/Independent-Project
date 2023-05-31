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
        private int vc = 3;

        int[] verticalLine = IndependentProject.getVertical(); // Color, c

    // Horizontal line:
        private int hc = 5;

        int[] horizontalLine = IndependentProject.getHorizontal(); // Color, c

        // Linear graph:
        private int lm = 2;
        private int lb = 5;

        int[] linearGraph = IndependentProject.getLinear(); // Color, m, b

        // Quadratic graph:
        private int qa = 2;
        private int qb = 3;
        private int qc = 4;

        int[] quadraticGraph = IndependentProject.getQuadratic(); // Color, a, b, c

        // Linear derivative graph:
        private int ldm = 2;
        private int ldb = 5;

        int[] linearDerivative = IndependentProject.getLinearDerivative(); // Color, m, b

        // Quadratic derivative graph:
        private int qda = 2;
        private int qdb = 3;
        private int qdc = 4;

        int[] quadraticDerivative = IndependentProject.getQuadraticDerivative(); // Color, a, b, c

        // Circular graph:
        private int cr = 5;
        private int ca = 3;
        private int cb = 1;

        int[] circularGraph = IndependentProject.getCircular(); // Color, r, a, b

        // Trigonometric function graph:
        private int ta = 2;
        private int tb = 2;
        private int trig = 0;

        int[] trigFunction = IndependentProject.getTrigFunction(); // Color, a, b, sin/cos/tan

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

        g.setColor(Color.gray);

        // AXES:

        // Draws y-axis:
        for (int i = 0; i < dimensions; i++) {
            g.fillRect(dimensions / 2, i, 1, 1);
            g.drawRect(dimensions / 2, i, 1, 1);
        }

        // Draws x-axis:
        for (int i = 0; i < dimensions; i++) {
            g.fillRect(i, dimensions / 2, 1, 1);
            g.drawRect(i, dimensions / 2, 1, 1);
        }

        // Draws scale values on ends of axes:
        g.drawString("10", dimensions / 2 + 15, 15); // North
        g.drawString("10", dimensions - 20, dimensions / 2 + 15); // East
        g.drawString("-10", dimensions / 2 + 15, dimensions - 5); // South
        g.drawString("-10", 5, dimensions / 2 + 15); // West

        double point;

        // VERTICAL LINE:

        // Decodes color for graph:
        if (verticalLine[0] == 1) {
            g.setColor(Color.BLUE);
        }
        else if (verticalLine[0] == 2) {
            g.setColor(Color.GREEN);
        }
        else if (verticalLine[0] == 3) {
            g.setColor(Color.RED);
        }
        else if (verticalLine[0] == 4) {
            g.setColor(Color.ORANGE);
        }
        else {
            g.setColor(Color.BLACK);
        }

        // Graphs vertical line:
        for (int i = 0; i < dimensions; i++) { // Draws y-axis
            g.fillRect(dimensions / 2 + verticalLine[1] * scale, i, POINTWIDTH, POINTHEIGHT);
            g.drawRect(dimensions / 2 + verticalLine[1] * scale, i, POINTWIDTH, POINTHEIGHT);
        }

        // HORIZONTAL LINE:

        // Decodes color for graph:
        if (horizontalLine[0] == 1) {
            g.setColor(Color.BLUE);
        }
        else if (horizontalLine[0] == 2) {
            g.setColor(Color.GREEN);
        }
        else if (horizontalLine[0] == 3) {
            g.setColor(Color.RED);
        }
        else if (horizontalLine[0] == 4) {
            g.setColor(Color.ORANGE);
        }
        else {
            g.setColor(Color.BLACK);
        }

        // Graphs horizontal line:
        for (int i = 0; i < dimensions; i++) { // Draws x-axis
            g.fillRect(i, dimensions / 2 - horizontalLine[1] * scale, POINTWIDTH, POINTHEIGHT);
            g.drawRect(i, dimensions / 2 - horizontalLine[1] * scale, POINTWIDTH, POINTHEIGHT);
        }

        // LINEAR GRAPH:

        // Decodes color for graph:
        if (linearGraph[0] == 1) {
            g.setColor(Color.BLUE);
        }
        else if (linearGraph[0] == 2) {
            g.setColor(Color.GREEN);
        }
        else if (linearGraph[0] == 3) {
            g.setColor(Color.RED);
        }
        else if (linearGraph[0] == 4) {
            g.setColor(Color.ORANGE);
        }
        else {
            g.setColor(Color.BLACK);
        }

        // Graphs linear graph:
        for (int x = 0; x < dimensions; x++) { // Repeats for each pixel in plane length
            point = (x - (double) (dimensions / 2)) / scale; // Converts value of each pixel on plane to a scaled-down version for the graph
            g.fillRect((x), - (int) (point * scale * linearGraph[1]) + (dimensions / 2) - (linearGraph[2] * scale), POINTWIDTH, POINTHEIGHT);
            g.drawRect((x), - (int) (point * scale * linearGraph[1]) + (dimensions / 2) - (linearGraph[2] * scale), POINTWIDTH, POINTHEIGHT);
        }

        // QUADRATIC GRAPH:

        // Decodes color for graph:
        if (quadraticDerivative[0] == 1) {
            g.setColor(Color.BLUE);
        }
        else if (quadraticDerivative[0] == 2) {
            g.setColor(Color.GREEN);
        }
        else if (quadraticDerivative[0] == 3) {
            g.setColor(Color.RED);
        }
        else if (quadraticDerivative[0] == 4) {
            g.setColor(Color.ORANGE);
        }
        else {
            g.setColor(Color.BLACK);
        }

        // Graphs quadratic graph:
        for (int x = 0; x < dimensions; x++) { // Repeats for each pixel in plane length
            point = (x - (double) (dimensions / 2)) / scale; // Converts value of each pixel on plane to a scaled-down version for the graph
            g.fillRect((x), - (int) (point * point * scale * qa) + (dimensions / 2) - (int) (point * scale * qb) - (qc * scale), POINTWIDTH, POINTHEIGHT); // Draws a point on the graph at the correct spot (translates from plane coordinate system to panel coordinate system
            g.drawRect((x), - (int) (point * point * scale * qa) + (dimensions / 2) - (int) (point * scale * qb) - (qc * scale), POINTWIDTH, POINTHEIGHT);
        }

        // LINEAR DERIVATIVE GRAPH:

        // Decodes color for graph:
        if (color == 1) {
            g.setColor(Color.BLUE);
        }
        else if (color == 2) {
            g.setColor(Color.GREEN);
        }
        else if (color == 3) {
            g.setColor(Color.RED);
        }
        else if (color == 4) {
            g.setColor(Color.ORANGE);
        }
        else {
            g.setColor(Color.BLACK);
        }

        // Graphs linear derivative graph:
        for (int i = 0; i < dimensions; i++) { // Draws x-axis
            g.fillRect(i, dimensions / 2 - ldm * scale, POINTWIDTH, POINTHEIGHT);
            g.drawRect(i, dimensions / 2 - ldm * scale, POINTWIDTH, POINTHEIGHT);
        }

        // QUADRATIC DERIVATIVE GRAPH:

        // Decodes color for graph:
        if (color == 1) {
            g.setColor(Color.BLUE);
        }
        else if (color == 2) {
            g.setColor(Color.GREEN);
        }
        else if (color == 3) {
            g.setColor(Color.RED);
        }
        else if (color == 4) {
            g.setColor(Color.ORANGE);
        }
        else {
            g.setColor(Color.BLACK);
        }

        // Graphs quadratic derivative graph:
        for (int x = 0; x < dimensions; x++) { // Repeats for each pixel in plane length
            point = (x - (double) (dimensions / 2)) / scale; // Converts value of each pixel on plane to a scaled-down version for the graph
            g.fillRect((x), - (int) (point * scale * qda * 2) + (dimensions / 2) - (qdb * scale), POINTWIDTH, POINTHEIGHT);
            g.drawRect((x), - (int) (point * scale * qda * 2) + (dimensions / 2) - (qdb * scale), POINTWIDTH, POINTHEIGHT);
        }
        // CIRCULAR GRAPH:

        // Decodes color for graph:
        if (color == 1) {
            g.setColor(Color.BLUE);
        }
        else if (color == 2) {
            g.setColor(Color.GREEN);
        }
        else if (color == 3) {
            g.setColor(Color.RED);
        }
        else if (color == 4) {
            g.setColor(Color.ORANGE);
        }
        else {
            g.setColor(Color.BLACK);
        }

        // Graphs circular graph:
        for (int x = 0; x < dimensions; x++) { // Repeats for each pixel in plane length
            point = (x - (double) (dimensions / 2)) / scale; // Converts value of each pixel on plane to a scaled-down version for the graph

            // Creates top of circle:
            if (cr * cr >= (point - ca) * (point - ca)) { // Prevents graph from drawing extra line that passes horizontally through circle centerpoint
                g.fillRect((x), -(int) (scale * Math.sqrt((cr * cr) - (point - ca) * (point - ca))) + (dimensions / 2) - (cb * scale), POINTWIDTH, POINTHEIGHT); // Draws a point on the graph at the correct spot (translates from plane coordinate system to panel coordinate system
                g.drawRect((x), -(int) (scale * Math.sqrt((cr * cr) - (point - ca) * (point - ca))) + (dimensions / 2) - (cb * scale), POINTWIDTH, POINTHEIGHT);

                // Creates bottom of circle:
                g.fillRect((x), (int) (scale * Math.sqrt((cr * cr) - (point - ca) * (point - ca))) + (dimensions / 2) - (cb * scale), POINTWIDTH, POINTHEIGHT); // Draws a point on the graph at the correct spot (translates from plane coordinate system to panel coordinate system
                g.drawRect((x), (int) (scale * Math.sqrt((cr * cr) - (point - ca) * (point - ca))) + (dimensions / 2) - (cb * scale), POINTWIDTH, POINTHEIGHT);
            }
        }

        // TRIGONOMETRIC FUNCTION GRAPH:

        // Decodes color for graph:
        if (color == 1) {
            g.setColor(Color.BLUE);
        }
        else if (color == 2) {
            g.setColor(Color.GREEN);
        }
        else if (color == 3) {
            g.setColor(Color.RED);
        }
        else if (color == 4) {
            g.setColor(Color.ORANGE);
        }
        else {
            g.setColor(Color.BLACK);
        }

        // Graphs trigonometric graph:
            if (trig == 0) {
                for (int x = 0; x < dimensions; x++) { // Repeats for each pixel in plane length
                    point = (x - (double) (dimensions / 2)) / scale; // Converts value of each pixel on plane to a scaled-down version for the graph
                    g.fillRect((x), (int) (scale * -ta * Math.sin(point * tb) + (dimensions / 2)), POINTWIDTH, POINTHEIGHT); // Draws a point on the graph at the correct spot (translates from plane coordinate system to panel coordinate system
                    g.fillRect((x), (int) (scale * -ta * Math.sin(point * tb) + (dimensions / 2)), POINTWIDTH, POINTHEIGHT);
                }
            }

            else if (trig == 1) {
                for (int x = 0; x < dimensions; x++) { // Repeats for each pixel in plane length
                    point = (x - (double) (dimensions / 2)) / scale; // Converts value of each pixel on plane to a scaled-down version for the graph
                    g.fillRect((x), (int) (scale * -ta * Math.cos(point * tb) + (dimensions / 2)), POINTWIDTH, POINTHEIGHT); // Draws a point on the graph at the correct spot (translates from plane coordinate system to panel coordinate system
                    g.fillRect((x), (int) (scale * -ta * Math.cos(point * tb) + (dimensions / 2)), POINTWIDTH, POINTHEIGHT);
                }
            }

            else {
                for (int x = 0; x < dimensions; x++) { // Repeats for each pixel in plane length
                    point = (x - (double) (dimensions / 2)) / scale; // Converts value of each pixel on plane to a scaled-down version for the graph
                    g.fillRect((x), (int) (scale * -ta * Math.tan(point * tb) + (dimensions / 2)), POINTWIDTH, POINTHEIGHT); // Draws a point on the graph at the correct spot (translates from plane coordinate system to panel coordinate system
                    g.fillRect((x), (int) (scale * -ta * Math.tan(point * tb) + (dimensions / 2)), POINTWIDTH, POINTHEIGHT);
            }
        }
    }
}