package events;

import ui.loginUI;
import ui.options;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class goToLogin implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        options.getContainer().removeAll();
        new loginUI();
    }
}
