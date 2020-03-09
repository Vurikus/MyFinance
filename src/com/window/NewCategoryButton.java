package com.window;

import javafx.beans.property.adapter.JavaBeanProperty;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.window.OpenMiniFrameButton.*;

public class NewCategoryButton implements ActionListener {

    //Field
    private static JPanel panel = new JPanel();
    private JLabel text;
    private JTextField textField;


    //Constructor

    //Function
    @Override
    public void actionPerformed(ActionEvent e)
    {

        miniPanel.setVisible(false);
        createPanelNewCategory();
        miniFrame.createMiniFramePanel(panel, new BorderLayout(), miniFrameWIDTH, miniFrameHEIGHT);

    }

    void createPanelNewCategory ()
    {
        panel.setSize(miniFrameWIDTH, miniFrameHEIGHT);
        miniFrame.add(panel);
        panel.setVisible(true);
        panel.setLayout(new BorderLayout());
    }

}
