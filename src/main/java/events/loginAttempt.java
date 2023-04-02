package events;

import database.fileStorage;
import ui.loginUI;
import ui.messageDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginAttempt implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = loginUI.getUsername();
        String password = loginUI.getPassword();
        String loginMessage = fileStorage.verifyData(username, password);

        new messageDialog(loginMessage);
    }
}
