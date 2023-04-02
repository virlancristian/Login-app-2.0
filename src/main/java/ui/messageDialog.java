package ui;

import events.goToOptions;

import javax.swing.*;
import java.awt.*;

public class messageDialog {
    JDialog dialog = new JDialog();
    JTextArea messageField = new JTextArea();
    JButton okButton = new JButton("OK");
    JPanel textPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    boolean successfulOperation = false;

    public messageDialog(String message) {
        if(message.equals("Account created successfully!") || message.equals("Login successful!")) {
            successfulOperation = true;
        }

        setDialogContent(message);
        addContentToDialog();
        addActionListeners();
        initializeDialog();
    }

    private void setDialogContent(String message) {
        messageField.setText(message);
        messageField.setEditable(false);
    }

    private void addContentToDialog() {
        textPanel.add(messageField);
        buttonPanel.add(okButton);

        dialog.add(textPanel, BorderLayout.CENTER);
        dialog.add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addActionListeners() {
        okButton.addActionListener(e -> {
            dialog.dispose();

            if(successfulOperation) {
                new goToOptions().actionPerformed(e);
            }
        });
    }

    private void initializeDialog() {
        dialog.setSize(200, 100);
        dialog.setLocation(650, 350);
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }
}
