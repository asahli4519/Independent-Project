// Imports:

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    // Adds buttons to window in specific order:
    JButton vertical = new JButton("Vertical Line: x = c"); // Creates vertical graph button
    JButton horizontal = new JButton("Horizontal Line: y = c"); // Creates horizontal graph button
    JButton linear = new JButton("Linear Graph: y = mx + b"); // Creates linear graph button
    JButton quadratic = new JButton("Quadratic Graph: ax² + bx + c"); // Creates quadratic graph button
    JButton linearDerivative = new JButton("Linear Derivative Graph: y' = mx + b"); // Creates linear derivative graph button (horizontal line)
    JButton quadraticDerivative = new JButton("Quadratic Derivative Graph: y' = ax² + bx + c"); // Creates quadratic derivative graph button (linear graph)
    JButton circle = new JButton("Circular Graph: r² = √((x - a)² + (y - b)²)"); // Creates circular graph button
    JButton trig = new JButton("Trigonometric Function: y = a(sin/cos/tan)bx"); // Creates graphing button
    JTextField label = new JTextField("Choice what kind of equation you want to graph");//Sets the label/directions at the top of page
    //Creates windows for input for functions
    JFrame verticalWindow = new JFrame("Vertical");
    JFrame horizontalWindow = new JFrame("Horizontal");
    JFrame linearWindow = new JFrame("Linear");
    JFrame quadraticWindow = new JFrame("Quadratic");
    JFrame linearDerivativeWindow = new JFrame("Linear Derivative");
    JFrame quadraticDerivativeWindow = new JFrame("Quadratic Derivation");
    JFrame circularWindow = new JFrame("Circular");
    JFrame trigWindow = new JFrame("Trigonometric");


    // Main method:
    public static void main(String[] args) {
        new IndependentProject();
    }

    // Constructor:
    public IndependentProject() {

        //Sets up windows for inputs from other function buttons
        verticalWindow.setSize(200,400);
        horizontalWindow.setSize(200,400);
        linearWindow.setSize(200,400);
        quadraticWindow.setSize(200,400);
        linearDerivativeWindow.setSize(200,400);
        quadraticDerivativeWindow.setSize(200,400);
        circularWindow.setSize(200,400);
        trigWindow.setSize(200,400);

        // Sets up JFrame window:
        JFrame window = new JFrame("Calculator");
        window.setSize(800,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());
        Container labelContainer = new Container();
        Container mainContainer = new Container();
        labelContainer.setLayout(new GridLayout(1,1));
        mainContainer.setLayout(new GridLayout(4, 2));
        window.add(labelContainer, BorderLayout.NORTH);
        window.add(mainContainer, BorderLayout.CENTER);
        /* work in progress to add input boxes to the frames that show up when a button is pressed
        JTextField x = new JTextField();
        JTextField b = new JTextField();
        JTextField m = new JTextField();
        JTextField c = new JTextField();
        x.setFont(new Font("Sansferif", Font.PLAIN, 42));
        b.setFont(new Font("Sansferif", Font.PLAIN, 42));
        m.setFont(new Font("Sansferif", Font.PLAIN, 42));
        c.setFont(new Font("Sansferif", Font.PLAIN, 42));
        */

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

        // Adds actionlisteners to buttons so input can be detected:
        vertical.addActionListener(this);
        horizontal.addActionListener(this);
        linear.addActionListener(this);
        quadratic.addActionListener(this);
        linearDerivative.addActionListener(this);
        quadraticDerivative.addActionListener(this);
        circle.addActionListener(this);
        trig.addActionListener(this);

        // Sets button colors:
        vertical.setBackground(Color.white);
        horizontal.setBackground(Color.white);
        linear.setBackground(Color.lightGray);
        quadratic.setBackground(Color.lightGray);
        linearDerivative.setBackground(Color.white);
        quadraticDerivative.setBackground(Color.white);
        circle.setBackground(Color.lightGray);
        trig.setBackground(Color.lightGray);

        //sets window visible
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vertical)){
            verticalWindow.setVisible(true);
        }
        else if(e.getSource().equals(horizontal)){
            horizontalWindow.setVisible(true);
        }
        else if(e.getSource().equals(linear)){
            linearWindow.setVisible(true);
        }
        else if(e.getSource().equals(quadratic)){
            quadraticWindow.setVisible(true);
        }
        else if(e.getSource().equals(linearDerivative)){
            linearDerivativeWindow.setVisible(true);
        }
        else if(e.getSource().equals(quadraticDerivative)){
            quadraticDerivativeWindow.setVisible(true);
        }
        else if(e.getSource().equals(circle)){
            circularWindow.setVisible(true);
        }
        else if(e.getSource().equals(trig)){
            trigWindow.setVisible(true);
        }

    }
}