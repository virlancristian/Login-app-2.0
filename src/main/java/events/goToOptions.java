package events;

import ui.createAccountUI;
import ui.options;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class goToOptions implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        createAccountUI.getContainer().removeAll();
        new options();
    }
}
