// Imports:

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class IndependentProject implements ActionListener {

    // Setup:
    JFrame window = new JFrame("Graphs"); // Graph pop-up
    JTextField num1Field;
    JTextField num2Field;
    JLabel answer;
    JButton addButton = new JButton("+"); // Creates addition button
    JButton subtractButton = new JButton("-"); // Creates subtract button
    JButton multiplyButton = new JButton("×"); // Creates multiplication button
    JButton divideButton = new JButton("÷"); // Creates division button
    JButton modButton = new JButton("%"); // Creates modulo button
    Scanner myScanner = new Scanner(System.in); // Creates scanner for user number inputs

    // Main method:
    public static void main(String[] args) {
        new IndependentProject();
    }

    // Constructor:
    public IndependentProject() {
        // Note: original calculator is in ChallengeSetTwo
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
