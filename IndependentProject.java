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

    // Main method:
    public static void main(String[] args) {
        new IndependentProject();
    }

    // Constructor:
    public IndependentProject() {

        // Sets up JFrame window:
        JFrame window = new JFrame("Calculator");
        window.setSize(800,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(4,2));

        // Creates buttons with different functions and labels:
        JButton vertical = new JButton("Vertical Line: x = c"); // Creates vertical graph button
        JButton horizontal = new JButton("Horizontal Line: y = c"); // Creates horizontal graph button
        JButton linear = new JButton("Linear Graph: y = mx + b"); // Creates linear graph button
        JButton quadratic = new JButton("Quadratic Graph: ax² + bx + c"); // Creates quadratic graph button
        JButton linearDerivative = new JButton("Linear Derivative Graph: y' = mx + b"); // Creates linear derivative graph button (horizontal line)
        JButton quadraticDerivative = new JButton("Quadratic Derivative Graph: y' = ax² + bx + c"); // Creates quadratic derivative graph button (linear graph)
        JButton circle = new JButton("Circular Graph: r² = √((x - a)² + (y - b)²)"); // Creates circular graph button
        JButton trig = new JButton("Trigonometric Function: y = a(sin/cos/tan)bx"); // Creates graphing button

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
        trig.setBackground(Color.yellow);

        // Adds buttons to window in specific order:
        window.add(vertical);
        window.add(horizontal);
        window.add(linear);
        window.add(quadratic);
        window.add(linearDerivative);
        window.add(quadraticDerivative);
        window.add(circle);
        window.add(trig);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}