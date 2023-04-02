package ui;

import javax.swing.*;

public interface menu {
    JFrame frame = new JFrame("Login App");

    void setContentFrame();
    void addContentToFrame();
    void initializeFrame();
    void organizeContent();
    void addEventListeners();
}
