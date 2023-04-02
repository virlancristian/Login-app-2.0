package events;

import ui.createAccountUI;
import ui.options;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class goToCreateAccount implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        options.getContainer().removeAll();
        new createAccountUI();
    }
}
