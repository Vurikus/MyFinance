package com.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen
{
    //Field
    private static int WIDTH = 600;
    private static int HEIGHT = 600;
    private JPanel panel = new JPanel();

    Button openTableProfitCosts;
    Button addProfit;
    Button addCosts;

    //Constructor

    public MainScreen() {
        createMainWindow();

    }

    //Function
    private void createMainWindow(){
        JFrame mainWindow = new JFrame("MY_FINANCE");
        mainWindow.setSize(WIDTH, HEIGHT);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLocationByPlatform(true);
        mainWindow.setVisible(true);
        mainWindow.add(panel);

        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.ORANGE);
        createLeftPanel();
    }

    private void createLeftPanel(){
        JPanel leftPanel = new JPanel();
        leftPanel.setSize(WIDTH/2, HEIGHT);
        leftPanel.setBackground(Color.BLUE);
        leftPanel.setLayout(new GridLayout(3,1));
        panel.add(leftPanel, BorderLayout.WEST);
        openTableProfitCosts = new Button("Открыть таблицу доходов/расходов");
        addProfit = new Button("Добавить доход");
        addCosts = new Button("Добавить расход");
        OpenMiniFrameButton openMiniFrameButton = new OpenMiniFrameButton();
        addProfit.addActionListener(openMiniFrameButton);
        addCosts.addActionListener(openMiniFrameButton);
        leftPanel.add(openTableProfitCosts);
        leftPanel.add(addProfit);
        leftPanel.add(addCosts);

    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

}
