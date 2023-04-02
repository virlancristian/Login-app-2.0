package events;

import database.fileStorage;
import ui.createAccountUI;
import ui.messageDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class accountCreated implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = createAccountUI.getUsername();
        String password = createAccountUI.getPassword();
        String accountCreationStatus = fileStorage.addAccountToDataBase(username, password);

        new messageDialog(accountCreationStatus);
    }
}
