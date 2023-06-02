// Imports:

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

// Resources (to copy/paste for later):
// × ÷ - + % =
// answer = new JLabel("Answer goes here");
// num1Field = new JTextField();
// num2Field = new JTextField();
// num1Field.setFont(new Font("SansSerif",Font.PLAIN,42));
// num1Field.setHorizontalAlignment(0);
// num2Field.setFont(new Font("SansSerif",Font.PLAIN,42));
// num2Field.setHorizontalAlignment(0);
// window.add(num1Field);
// window.add(num2Field);
// window.add(answer);
// answer.setFont(new Font("SansSerif",Font.PLAIN,20));
// JTextField num1Field;
// JTextField num2Field;
// JLabel answer;

public class IndependentProject implements ActionListener {

    Scanner myScanner = new Scanner(System.in); // Creates scanner for user number inputs
    public ArrayList<Integer> pos = new ArrayList<Integer>();

    //All the text fields
    JTextField vc = new JTextField();
    JTextField hc = new JTextField();
    JTextField lm = new JTextField();
    JTextField lb = new JTextField();
    JTextField qa = new JTextField();
    JTextField qb = new JTextField();
    JTextField qc = new JTextField();
    JTextField ldm = new JTextField();
    JTextField ldb = new JTextField();
    JTextField qda = new JTextField();
    JTextField qdb = new JTextField();
    JTextField qdc = new JTextField();
    JTextField cr = new JTextField();
    JTextField ca = new JTextField();
    JTextField cb = new JTextField();
    JTextField ta = new JTextField();
    JTextField tsct = new JTextField();
    JTextField tb = new JTextField();
    JTextField vcol = new JTextField();
    JTextField hcol = new JTextField();
    JTextField lcol = new JTextField();
    JTextField qcol = new JTextField();
    JTextField ldcol = new JTextField();
    JTextField qdcol = new JTextField();
    JTextField ccol = new JTextField();
    JTextField tcol = new JTextField();
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();

    //All buttons
    JButton vertical = new JButton("Vertical Line: x = c"); // Creates vertical graph button
    JButton horizontal = new JButton("Horizontal Line: y = c"); // Creates horizontal graph button
    JButton linear = new JButton("Linear Graph: y = mx + b"); // Creates linear graph button
    JButton quadratic = new JButton("Quadratic Graph: ax² + bx + c"); // Creates quadratic graph button
    JButton linearDerivative = new JButton("Linear Derivative Graph: y' = mx + b"); // Creates linear derivative graph button (horizontal line)
    JButton quadraticDerivative = new JButton("Quadratic Derivative Graph: y' = ax² + bx + c"); // Creates quadratic derivative graph button (linear graph)
    JButton circle = new JButton("Circular Graph: r² = (x - a)² + (y - b)²"); // Creates circular graph button
    JButton trig = new JButton("Trigonometric Function: y = a(sin/cos/tan)bx"); // Creates trig button
    JLabel label = new JLabel("Choice what kind of equation you want to graph");//Sets the label/directions at the top of page
    JButton graph = new JButton("Graph");//Creates the graph button
    JButton addButton = new JButton("Addition");
    JButton subButton = new JButton("Subtraction");
    JButton multButton = new JButton("Multiplication");
    JButton divButton = new JButton("Division");
    JButton modButton = new JButton("Mod");
    JLabel answer = new JLabel("Answer: ");
    //Sets up all variables
    static int ivc;
    static int ihc;
    static int ilm;
    static int ilb;
    static int iqa;
    static int iqb;
    static int iqc;
    static int ildm;
    static int ildb;
    static int iqda;
    static int iqdb;
    static int iqdc;
    static int icr;
    static int ica;
    static int icb;
    static int ita;
    static int itsct;
    static int itb;
    static int ivcol;
    static int ihcol;
    static int ilcol;
    static int iqcol;
    static int ildcol;
    static int iqdcol;
    static int iccol;
    static int itcol;

    //Uses booleans to check if buttons have been clicked
    boolean clickedvert = false;
    boolean clickedhori = false;
    boolean clickedline = false;
    boolean clickedquad = false;
    boolean clickedlide = false;
    boolean clickedqude = false;
    boolean clickedcirc = false;
    boolean clickedtrig = false;

       /*
        Unused containers for pop-ups
        Container linearContainer = new Container();
        Container quadraticContainer = new Container();
        Container circularContainer = new Container();
        Container trigContainer = new Container();
        linearWindow.add(linearContainer);
        quadraticWindow.add(quadraticContainer);
        linearDerivativeWindow.add(linearContainer);
        quadraticDerivativeWindow.add(quadraticContainer);
        circularWindow.add(circularContainer);
        trigWindow.add(trigContainer);
         */

    // Main method:
    public static void main(String[] args) {
        new IndependentProject();
    }

    // Constructor:
    public IndependentProject() {

        // Sets up JFrame window:
        JFrame window = new JFrame("Graphing Calculator");
        window.setSize(800, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());
        Container labelContainer = new Container();
        Container mainContainer = new Container();
        labelContainer.setLayout(new GridLayout(2, 1));
        mainContainer.setLayout(new GridLayout(4, 2));
        window.add(labelContainer, BorderLayout.NORTH);
        window.add(mainContainer, BorderLayout.CENTER);

        //Regular Calculator
        JFrame calc = new JFrame("Calculator");
        calc.setSize(400, 600);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setLayout(new GridLayout(4,2));

        // Adds buttons to window in specific order:
        mainContainer.add(vertical);
        mainContainer.add(horizontal);
        mainContainer.add(linear);
        mainContainer.add(quadratic);
        mainContainer.add(linearDerivative);
        mainContainer.add(quadraticDerivative);
        mainContainer.add(circle);
        mainContainer.add(trig);
        labelContainer.add(label);
        labelContainer.add(graph);
        calc.add(num1);
        calc.add(num2);
        calc.add(addButton);
        calc.add(subButton);
        calc.add(multButton);
        calc.add(divButton);
        calc.add(modButton);
        calc.add(answer);

        // Adds actionlisteners to buttons so input can be detected:
        vertical.addActionListener(this);
        horizontal.addActionListener(this);
        linear.addActionListener(this);
        quadratic.addActionListener(this);
        linearDerivative.addActionListener(this);
        quadraticDerivative.addActionListener(this);
        circle.addActionListener(this);
        trig.addActionListener(this);
        graph.addActionListener(this);
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multButton.addActionListener(this);
        divButton.addActionListener(this);
        modButton.addActionListener(this);

        // Sets button colors:
        vertical.setBackground(Color.white);
        horizontal.setBackground(Color.white);
        linear.setBackground(Color.lightGray);
        quadratic.setBackground(Color.lightGray);
        linearDerivative.setBackground(Color.white);
        quadraticDerivative.setBackground(Color.white);
        circle.setBackground(Color.lightGray);
        trig.setBackground(Color.lightGray);
        graph.setBackground(Color.lightGray);

        //sets window visible
        window.setVisible(true);
        calc.setVisible(true);
    }

        //Get methods for moving values to graphing class
    public static int[] getVertical(){
        int[] vertical = {ivcol, ivc};
        return vertical;
    }
    public static int[] getHorizontal(){
        int[] horizontal = {ihcol, ihc};
        return horizontal;
    }
    public static int[] getLinear(){
        int[] linear = {ilcol, ilm, ilb};
        return linear;
    }
    public static int[] getQuadratic(){
        int[] quadratic = {iqcol, iqa, iqb, iqc};
        return quadratic;
    }
    public static int[] getLinearDerivative(){
        int[] linearDerivative = {ildcol, ildm, ildb};
        return linearDerivative;
    }
    public static int[] getQuadraticDerivative(){
        int[] quadraticDerivative = {iqdcol, iqda, iqdb, iqdc};
        return quadraticDerivative;
    }
    public static int[] getCircular(){
        int[] circular = {iccol, icr, ica, icb};
        return circular;
    }
    public static int[] getTrigFunction(){
        int[] trig = {itcol, ita, itb, itsct};
        return trig;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Creates the input fields and sets them up depending on button pushed.
        JLabel x = new JLabel("x = ");
        JLabel b = new JLabel("b = ");
        JLabel m = new JLabel("m = ");
        JLabel c = new JLabel("c = ");
        JLabel a = new JLabel("a = ");
        JLabel r = new JLabel("r = ");
        JLabel colL = new JLabel("<html>Color<br>1/Blue<br>2/Green<br>3/Red<br>4/Orange = </html>");
        JLabel trigFunc = new JLabel("<html>trig function<br>0sin,1cos,2tan) = </html>");
        x.setFont(new Font("Sanserif", Font.PLAIN, 30));
        b.setFont(new Font("Sanserif", Font.PLAIN, 30));
        m.setFont(new Font("Sanserif", Font.PLAIN, 30));
        c.setFont(new Font("Sanserif", Font.PLAIN, 30));
        a.setFont(new Font("Sanserif", Font.PLAIN, 30));
        r.setFont(new Font("Sanserif", Font.PLAIN, 30));
        colL.setFont(new Font("Sanserif", Font.PLAIN, 10));
        trigFunc.setFont(new Font("Sanserif", Font.PLAIN, 10));
        vc.setFont(new Font("Sanserif", Font.PLAIN, 30));
        hc.setFont(new Font("Sanserif", Font.PLAIN, 30));
        lm.setFont(new Font("Sanserif", Font.PLAIN, 30));
        lb.setFont(new Font("Sanserif", Font.PLAIN, 30));
        qa.setFont(new Font("Sanserif", Font.PLAIN, 30));
        qb.setFont(new Font("Sanserif", Font.PLAIN, 30));
        qc.setFont(new Font("Sanserif", Font.PLAIN, 30));
        ldm.setFont(new Font("Sanserif", Font.PLAIN, 30));
        ldb.setFont(new Font("Sanserif", Font.PLAIN, 30));
        qda.setFont(new Font("Sanserif", Font.PLAIN, 30));
        qdb.setFont(new Font("Sanserif", Font.PLAIN, 30));
        qdc.setFont(new Font("Sanserif", Font.PLAIN, 30));
        cr.setFont(new Font("Sanserif", Font.PLAIN, 30));
        ca.setFont(new Font("Sanserif", Font.PLAIN, 30));
        cb.setFont(new Font("Sanserif", Font.PLAIN, 30));
        ta.setFont(new Font("Sanserif", Font.PLAIN, 30));
        tsct.setFont(new Font("Sanserif", Font.PLAIN, 30));
        tb.setFont(new Font("Sanserif", Font.PLAIN, 30));
        vcol.setFont(new Font("Sanserif", Font.PLAIN, 30));
        hcol.setFont(new Font("Sanserif", Font.PLAIN, 30));
        lcol.setFont(new Font("Sanserif", Font.PLAIN, 30));
        qcol.setFont(new Font("Sanserif", Font.PLAIN, 30));
        ldcol.setFont(new Font("Sanserif", Font.PLAIN, 30));
        qdcol.setFont(new Font("Sanserif", Font.PLAIN, 30));
        ccol.setFont(new Font("Sanserif", Font.PLAIN, 30));
        tcol.setFont(new Font("Sanserif", Font.PLAIN, 30));
        num1.setFont(new Font("Sansferif", Font.PLAIN, 30));
        num2.setFont(new Font("Sansferif", Font.PLAIN, 30));

        // Sets up new windows depending on what buttons are pressed.
        if(e.getSource().equals(vertical)){
            JFrame verticalWindow = new JFrame("Vertical");
            verticalWindow.setSize(200,200);
            verticalWindow.setLayout(new GridLayout(2, 2));
            verticalWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            verticalWindow.add(c);
            verticalWindow.add(vc);
            verticalWindow.add(colL);
            verticalWindow.add(vcol);
            verticalWindow.setVisible(true);
            clickedvert = true;
        }
        if(e.getSource().equals(horizontal)){
            JFrame horizontalWindow = new JFrame("Horizontal");
            horizontalWindow.setSize(200,200);
            horizontalWindow.setLayout(new GridLayout(2, 2));
            horizontalWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            horizontalWindow.add(c);
            horizontalWindow.add(hc);
            horizontalWindow.add(colL);
            horizontalWindow.add(hcol);
            horizontalWindow.setVisible(true);
            clickedhori = true;
        }
        if(e.getSource().equals(linear)){
            JFrame linearWindow = new JFrame("Linear");
            linearWindow.setSize(200,300);
            linearWindow.setLayout(new GridLayout(3, 2));
            linearWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            linearWindow.add(m, BorderLayout.NORTH);
            linearWindow.add(lm);
            linearWindow.add(b,BorderLayout.NORTH);
            linearWindow.add(lb);
            linearWindow.add(colL);
            linearWindow.add(lcol);
            linearWindow.setVisible(true);
            clickedline = true;
        }
        if(e.getSource().equals(quadratic)){
            JFrame quadraticWindow = new JFrame("Quadratic");
            quadraticWindow.setSize(200,400);
            quadraticWindow.setLayout(new GridLayout(4, 2));
            quadraticWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            quadraticWindow.add(a, BorderLayout.NORTH);
            quadraticWindow.add(qa);
            quadraticWindow.add(b, BorderLayout.CENTER);
            quadraticWindow.add(qb);
            quadraticWindow.add(c, BorderLayout.SOUTH);
            quadraticWindow.add(qc);
            quadraticWindow.add(colL);
            quadraticWindow.add(qcol);
            quadraticWindow.setVisible(true);
            clickedquad = true;
        }
        if(e.getSource().equals(linearDerivative)){
            JFrame linearDerivativeWindow = new JFrame("Linear Derivative");
            linearDerivativeWindow.setSize(200,300);
            linearDerivativeWindow.setLayout(new GridLayout(3, 2));
            linearDerivativeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            linearDerivativeWindow.add(m, BorderLayout.NORTH);
            linearDerivativeWindow.add(ldm);
            linearDerivativeWindow.add(b, BorderLayout.CENTER);
            linearDerivativeWindow.add(ldb);
            linearDerivativeWindow.add(colL);
            linearDerivativeWindow.add(ldcol);
            linearDerivativeWindow.setVisible(true);
            clickedlide = true;
        }
        if(e.getSource().equals(quadraticDerivative)){
            JFrame quadraticDerivativeWindow = new JFrame("Quadratic Derivation");
            quadraticDerivativeWindow.setSize(200,400);
            quadraticDerivativeWindow.setLayout(new GridLayout(4, 2));
            quadraticDerivativeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            quadraticDerivativeWindow.add(a, BorderLayout.NORTH);
            quadraticDerivativeWindow.add(qda);
            quadraticDerivativeWindow.add(b, BorderLayout.CENTER);
            quadraticDerivativeWindow.add(qdb);
            quadraticDerivativeWindow.add(c, BorderLayout.SOUTH);
            quadraticDerivativeWindow.add(qdc);
            quadraticDerivativeWindow.add(colL);
            quadraticDerivativeWindow.add(qdcol);
            quadraticDerivativeWindow.setVisible(true);
            clickedqude = true;
        }
        if(e.getSource().equals(circle)){
            JFrame circularWindow = new JFrame("Circular");
            circularWindow.setSize(200,400);
            circularWindow.setLayout(new GridLayout(4, 2));
            circularWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            circularWindow.add(a, BorderLayout.NORTH);
            circularWindow.add(ca);
            circularWindow.add(b, BorderLayout.NORTH);
            circularWindow.add(cb);
            circularWindow.add(r, BorderLayout.NORTH);
            circularWindow.add(cr);
            circularWindow.add(colL);
            circularWindow.add(ccol);
            circularWindow.setVisible(true);
            clickedcirc = true;
        }
        if(e.getSource().equals(trig)){
            JFrame trigWindow = new JFrame("Trigonometric");
            trigWindow.setSize(200,400);
            trigWindow.setLayout(new GridLayout(4, 2));
            trigWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            trigWindow.add(a, BorderLayout.NORTH);
            trigWindow.add(ta);
            trigWindow.add(b, BorderLayout.NORTH);
            trigWindow.add(tb);
            trigWindow.add(trigFunc, BorderLayout.SOUTH);
            trigWindow.add(tsct);
            trigWindow.add(colL);
            trigWindow.add(tcol);
            trigWindow.setVisible(true);
            clickedtrig = true;
        }
        // Checks if the graph button is pressed and takes the values and assigns them variables:
        if(e.getSource().equals(graph)){
            if(clickedvert) {
                ivc = Integer.parseInt(vc.getText());
                ivcol = Integer.parseInt(vcol.getText());
            }
            if(clickedhori) {
                ihc = Integer.parseInt(hc.getText());
                ihcol = Integer.parseInt(hcol.getText());
            }
            if(clickedline) {
                ilm = Integer.parseInt(lm.getText());
                ilb = Integer.parseInt(lb.getText());
                ilcol = Integer.parseInt(lcol.getText());
            }
            if(clickedquad) {
                iqa = Integer.parseInt(qa.getText());
                iqb = Integer.parseInt(qb.getText());
                iqc = Integer.parseInt(qc.getText());
                iqcol = Integer.parseInt(qcol.getText());
            }
            if(clickedlide) {
                ildm = Integer.parseInt(ldm.getText());
                ildb = Integer.parseInt(ldb.getText());
                ildcol = Integer.parseInt(ldcol.getText());
            }
            if(clickedqude) {
                iqda = Integer.parseInt(qda.getText());
                iqdb = Integer.parseInt(qdb.getText());
                iqdc = Integer.parseInt(qdc.getText());
                iqdcol = Integer.parseInt(qdcol.getText());
            }
            if(clickedcirc) {
                icr = Integer.parseInt(cr.getText());
                ica = Integer.parseInt(ca.getText());
                icb = Integer.parseInt(cb.getText());
                iccol = Integer.parseInt(ccol.getText());
            }
            if(clickedtrig) {
                ita = Integer.parseInt(ta.getText());
                itb = Integer.parseInt(tb.getText());
                itsct = Integer.parseInt(tsct.getText());
                itcol = Integer.parseInt(tcol.getText());
            }

            // Calls GraphingPlane method:
            GraphingPlane.main(null);
        }
    }
}