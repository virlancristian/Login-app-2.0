package ui;

import events.goToCreateAccount;
import events.goToLogin;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class options implements menu {
    private final JButton createAccButton = new JButton("Create account");
    private final JButton loginButton = new JButton("Login");
    private final JTextComponent textArea = new JTextPane();
    private final SpringLayout layout = new SpringLayout();
    static protected Container c = frame.getContentPane();

    public options() {
        setContentFrame();
        addContentToFrame();
        organizeContent();
        initializeFrame();
        addEventListeners();
    }

    @Override
    public void setContentFrame() {
        createAccButton.setSize(300, 100);

        loginButton.setSize(300, 100);

        textArea.setSize(500, 700);
        textArea.setText("Hello user!");
        textArea.setEditable(false);

        c.setLayout(layout);
    }

    @Override
    public void addContentToFrame() {
        c.add(textArea);
        c.add(createAccButton);
        c.add(loginButton);
    }

    @Override
    public void organizeContent() {
        layout.putConstraint(SpringLayout.WEST, textArea, 210, SpringLayout.WEST, c);
        layout.putConstraint(SpringLayout.NORTH, textArea, 150, SpringLayout.NORTH, c);
        layout.putConstraint(SpringLayout.WEST, createAccButton, 180, SpringLayout.WEST, c);
        layout.putConstraint(SpringLayout.WEST, loginButton, 210, SpringLayout.WEST, c);

        layout.putConstraint(SpringLayout.SOUTH, createAccButton, 35, SpringLayout.SOUTH, textArea);
        layout.putConstraint(SpringLayout.SOUTH, loginButton, 25, SpringLayout.SOUTH, createAccButton);
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
    public void addEventListeners() {
        createAccButton.addActionListener(new goToCreateAccount());
        loginButton.addActionListener(new goToLogin());
    }

    public static Container getContainer() {
        return c;
    }
}
