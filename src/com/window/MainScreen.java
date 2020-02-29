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
        ButtonListener buttonListener = new ButtonListener();
        addProfit.addActionListener(buttonListener);
        leftPanel.add(openTableProfitCosts);
        leftPanel.add(addProfit);
        leftPanel.add(addCosts);

    }

    private void createButton (){

    }

    private class ButtonListener implements ActionListener
    {
        private int miniFrameWIDTH = WIDTH/3;
        private int miniFrameHEIGHT = HEIGHT/6;
        JFrame miniFrame = new JFrame();
        JPanel miniPanel= new JPanel();

        @Override
        public void actionPerformed(ActionEvent e) {
            createMiniFrame(miniFrame);
            createMiniPanel(miniPanel, new GridLayout());
            createButton();
        }


        private void createMiniPanel (JPanel panel, LayoutManager layoutManager){
            panel.setLayout(layoutManager);
            panel.setSize(miniFrameWIDTH, miniFrameHEIGHT);
            panel.setVisible(true);
            panel.setBackground(Color.ORANGE);
            miniFrame.add(panel);
        }

        private void createMiniFrame (JFrame frame){
            frame.setLocationByPlatform(true);
            frame.setSize(miniFrameWIDTH, miniFrameHEIGHT);
            frame.setVisible(true);
        }

        private void createButton (){
            JButton newCategory = new JButton("New Category");
            miniPanel.add(newCategory);
            MiniFrameButtonListener bl = new MiniFrameButtonListener();
            newCategory.addActionListener(bl);

        }

        private class MiniFrameButtonListener implements ActionListener
        {
            JPanel writeTextCategory = new JPanel();
            JButton ok = new JButton("OK");
            JButton cancel = new JButton("Cancel");
            @Override
            public void actionPerformed(ActionEvent e) {
                miniPanel.setVisible(false);
                createMiniPanel(writeTextCategory, new BorderLayout());
                addComponent(writeTextCategory);

            }

            private void addComponent (JPanel panel){
                JLabel label = new JLabel("Enter new Category");
                JTextField text = new JTextField();
                JPanel nullpanel = new JPanel();
                panel.add(label, BorderLayout.NORTH);
                panel.add(text, BorderLayout.CENTER);
                panel.add(nullpanel, BorderLayout.SOUTH);

                nullpanel.setLayout(new GridLayout(1,2));

                nullpanel.add(ok);
                OkCancelButton oc = new OkCancelButton();
                ok.addActionListener(oc);
                nullpanel.add(cancel);
                cancel.addActionListener(oc);
                if (oc) miniFrame.setVisible(false);
                if (oc.equals(ok)) miniFrame.setSize(WIDTH,HEIGHT/2);
            }

            private class OkCancelButton implements ActionListener{

                @Override
                public void actionPerformed(ActionEvent e) {
                    String button = e.getSource().toString();
                }
            }

        }

    }
}
