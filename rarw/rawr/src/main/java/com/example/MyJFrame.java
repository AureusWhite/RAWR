package com.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyJFrame extends JFrame {
    protected static JFrame frame;
    private final JPanel mainPanel;
    private JPanel buttonPanel, eastPanel, westPanel, northPanel;
    public static JTextArea outputTextArea;
    private JTextField inputField;

    public MyJFrame() {

        setTitle("R.A.W.R. The Rise of Taliber.");
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        northPanel = new JPanel(new BorderLayout());
        northPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JLabel statsLabel = new JLabel(
                "<html><b>Player Stats</b>:______Resilience: 20______|______Name: Aureus______|______Location: Kitchen______|______Age: 4 ______|______Mood: Happy______|______Spirit: 0</html>");
        statsLabel.setFont(new Font("Arial", Font.BOLD, 14));
        northPanel.add(statsLabel, BorderLayout.CENTER);

        eastPanel = new JPanel(new GridLayout(4, 1));
        eastPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ImageIcon icon = new ImageIcon(
                "C:\\Users\\david\\OneDrive\\Documents\\RAWR\\rarw\\rawr\\src\\main\\java\\com\\example\\images\\paper.png");
        ImageIcon scaledIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        createVerticalButtonPanel(eastPanel, scaledIcon, scaledIcon, scaledIcon, scaledIcon);

        westPanel = new JPanel(new GridLayout(4, 1));
        westPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        createVerticalButtonPanel(westPanel, scaledIcon, scaledIcon, scaledIcon, scaledIcon);

        

        


        
        inputField.addActionListener((ActionEvent e) -> {
            String text = inputField.getText();
            switch (text) {
                case "poop" -> outputTextArea.append("You said poop!!!\n");
                default -> outputTextArea.append("You said: " + text + "\n");
            }
            inputField.setText("");
        });
        inputField.setPreferredSize(new Dimension(100, 30));

        buttonPanel = new JPanel(new GridLayout(1, 6));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(inputField);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);

        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener());
        button3.addActionListener(new ButtonListener());
        button4.addActionListener(new ButtonListener());
        button5.addActionListener(new ButtonListener());
        button6.addActionListener(new ButtonListener());

        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(westPanel, BorderLayout.WEST);

        add(mainPanel);
    }

    private void createVerticalButtonPanel(JPanel panel, ImageIcon... icons) {
        for (ImageIcon icon : icons) {
            JButton button = new JButton(icon);
            button.setPreferredSize(new Dimension(40, 40));
            panel.add(button);
        }
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String text = source.getText();
            outputTextArea.append(text + "\n");
        }
    }

    public static JFrame getFrame() {
        return frame;
    }

    public static void setFrame(JFrame frame) {
        MyJFrame.frame = frame;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    public void setButtonPanel(JPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    public JPanel getEastPanel() {
        return eastPanel;
    }

    public void setEastPanel(JPanel eastPanel) {
        this.eastPanel = eastPanel;
    }

    public JPanel getWestPanel() {
        return westPanel;
    }

    public void setWestPanel(JPanel westPanel) {
        this.westPanel = westPanel;
    }

    public JPanel getNorthPanel() {
        return northPanel;
    }

    public void setNorthPanel(JPanel northPanel) {
        this.northPanel = northPanel;
    }

    public static JTextArea getOutputTextArea() {
        return outputTextArea;
    }

    public static void setOutputTextArea(JTextArea outputTextArea) {
        MyJFrame.outputTextArea = outputTextArea;
    }

    public JTextField getInputField() {
        return inputField;
    }

    public void setInputField(JTextField inputField) {
        this.inputField = inputField;
    }
}
