package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJFrame extends JFrame {
    protected static JFrame frame;
    private JPanel mainPanel, buttonPanel, eastPanel, westPanel, northPanel;
    public static JTextArea outputTextArea;
    private JTextField inputField;
    private JTextArea statsArea;

    public MyJFrame() {
        // Set up the JFrame
        setTitle("R.A.W.R. The Rise of Taliber.");
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel with BorderLayout
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Create NORTH panel for stats
        northPanel = new JPanel(new BorderLayout());
        northPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        // Create thin label with bold text and different font
        JLabel statsLabel = new JLabel(
                "<html><b>Player Stats</b>:______Resilience: 20______|______Name: Aureus______|______Location: Kitchen______|______Age: 4 ______|______Mood: Happy______|______Spirit: 0</html>");
        statsLabel.setFont(new Font("Arial", Font.BOLD, 14));
        northPanel.add(statsLabel, BorderLayout.CENTER);

        // Create EAST panel with buttons
        eastPanel = new JPanel(new GridLayout(4, 1));
        eastPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        // Load the icon using absolute path
        ImageIcon icon = new ImageIcon(
                "C:\\Users\\david\\OneDrive\\Documents\\RAWR\\rarw\\rawr\\src\\main\\java\\com\\example\\images\\paper.png");
        ImageIcon scaledIcon = new ImageIcon(icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        createVerticalButtonPanel(eastPanel, scaledIcon, scaledIcon, scaledIcon, scaledIcon);

        // Create WEST panel with buttons
        westPanel = new JPanel(new GridLayout(4, 1));
        westPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        createVerticalButtonPanel(westPanel, scaledIcon, scaledIcon, scaledIcon, scaledIcon);

        // Adjust width of east and west panels
        Dimension sidePanelSize = new Dimension(40, 0);
        eastPanel.setPreferredSize(sidePanelSize);
        westPanel.setPreferredSize(sidePanelSize);

        // Create the text area for output
        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);

        // Create the text field for input
        inputField = new JTextField();
        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();
                switch (text) {
                    case "poop":
                        outputTextArea.append("You said poop!!!");
                        break;

                    default:
                        break;
                }
                inputField.setText("");
            }
        });
        inputField.setPreferredSize(new Dimension(100, 30));

        // Create the button panel
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

}
