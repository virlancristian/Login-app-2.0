package ui;

import events.accountCreated;
import events.goToOptions;

import javax.swing.*;
import java.awt.*;

public class createAccountUI implements menu {
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    static JTextField usernameField = new JTextField(15);
    static JTextField passwordField = new JTextField(15);
    JButton createAccButton = new JButton("Create account");
    JButton goBack = new JButton("Go back");
    static Container c = frame.getContentPane();
    SpringLayout layout = new SpringLayout();

    public createAccountUI() {
        setContentFrame();
        addContentToFrame();
        organizeContent();
        initializeFrame();
        addEventListeners();
    }

    @Override
    public void setContentFrame() {
        label1.setText("Username");
        label2.setText("Password");

        createAccButton.setSize(300, 100);
        goBack.setSize(300, 100);

        usernameField.setText("");
        passwordField.setText("");

        c.setLayout(layout);
    }

    @Override
    public void addContentToFrame() {
        c.add(label1);
        c.add(usernameField);
        c.add(label2);
        c.add(passwordField);
        c.add(createAccButton);
        c.add(goBack);
    }

    @Override
    public void initializeFrame() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocation(500, 200);
        frame.setVisible(true);
    }

    @Override
    public void organizeContent() {
        layout.putConstraint(SpringLayout.WEST, label1, 135, SpringLayout.WEST, c);
        layout.putConstraint(SpringLayout.NORTH, label1, 150, SpringLayout.NORTH, c);

        layout.putConstraint(SpringLayout.WEST, label2, 135, SpringLayout.WEST, c);
        layout.putConstraint(SpringLayout.NORTH, label2, 175, SpringLayout.NORTH, c);

        layout.putConstraint(SpringLayout.WEST, usernameField, 65, SpringLayout.WEST, label1);
        layout.putConstraint(SpringLayout.NORTH, usernameField, 150, SpringLayout.NORTH, c);

        layout.putConstraint(SpringLayout.WEST, passwordField, 65, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, passwordField, 175, SpringLayout.NORTH, c);

        layout.putConstraint(SpringLayout.WEST, createAccButton, 200, SpringLayout.WEST, c);
        layout.putConstraint(SpringLayout.NORTH, createAccButton, 200, SpringLayout.NORTH, c);

        layout.putConstraint(SpringLayout.WEST, goBack, 15, SpringLayout.WEST, c);
        layout.putConstraint(SpringLayout.NORTH, goBack, 15, SpringLayout.NORTH, c);
    }

    public void addEventListeners() {
        goBack.addActionListener(new goToOptions());
        createAccButton.addActionListener(new accountCreated());
    }

    public static Container getContainer() {
        return c;
    }

    public static String getUsername() {
        return usernameField.getText();
    }

    public static String getPassword() {
        return passwordField.getText();
    }
}
