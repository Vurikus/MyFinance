package com.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OpenMiniFrameButton implements ActionListener
{

    //Field
    final static int miniFrameWIDTH = MainScreen.getWIDTH()/3;
    final static int miniFrameHEIGHT = MainScreen.getHEIGHT()/6;

    protected static MiniFrame miniFrame = new MiniFrame(miniFrameWIDTH, miniFrameHEIGHT);;
    public static JPanel miniPanel = new JPanel();
            //miniFrame.getMiniPanel();

    //Constructor

    //Function
    @Override
    public void actionPerformed(ActionEvent e)
    {
        miniFrame.setVisible(true);
        miniFrame.createMiniFramePanel(miniPanel, new GridLayout(), miniFrameWIDTH, miniFrameHEIGHT);
        miniFrame.createButton("New Category", miniPanel, new NewCategoryButton());

    }


}
