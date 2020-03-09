package com.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MiniFrame extends JFrame {
    //Field
    JPanel miniPanel = new JPanel();

    //Constructor
    MiniFrame(int widthFrame, int heightFrame)
    {
        setLocationByPlatform(true);
        setSize(widthFrame, heightFrame);
        setVisible(false);
    }

    //Function

    void createMiniFramePanel(JPanel panel, LayoutManager layoutManager, int widthFrame, int heightFrame)
    {
        panel.setLayout(layoutManager);
        panel.setSize(widthFrame, heightFrame);
        panel.setBackground(Color.BLACK);
        add(panel);
    }

    public JPanel getMiniPanel() {
        return miniPanel;
    }

    void createButton (String nameButton, JPanel panel, ActionListener listener){
        JButton button = new JButton(nameButton);
        panel.add(button);
        button.addActionListener(listener);

    }


}
