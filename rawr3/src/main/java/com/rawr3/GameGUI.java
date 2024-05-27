package com.rawr3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GameGUI extends JFrame implements ActionListener {
    static JTextArea outText;
    private Player player;
    
    private JPanel buttonPanel, StatusPanel, sidePanel2, sidePanel1, textPanel;
    private JTextField inputField;

    private JButton button1, button2, button3, button4, button5, button6;

    public GameGUI(Player player) {
        this.player = player;

        setTitle("RAWR The Rise of Taliber.");
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outText = new JTextArea();
        outText.setBackground(Color.WHITE);
        outText.setEditable(false);
    
        Font font1 = new Font(Font.SERIF, Font.BOLD, 14);
        outText.setFont(font1);
        JScrollPane scrollPane = new JScrollPane(outText);
        inputField = new JTextField("Blargh!");
        inputField.setPreferredSize(new Dimension(50, 30));
        StatusPanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1, 6));
        sidePanel2 = new JPanel();
        sidePanel1 = new JPanel();
        textPanel = new JPanel(new BorderLayout());
        textPanel.setBorder(BorderFactory.createBevelBorder(1));

        button1 = new JButton("Talk To:");
        button2 = new JButton("Go To:");
        button3 = new JButton("Pick Up:");
        button4 = new JButton("Put Down:");
        button5 = new JButton("Emote:");
        button6 = new JButton("skillPlace");

        Dimension sidePanelSize = new Dimension(40, 0);
        sidePanel1.setPreferredSize(sidePanelSize);
        sidePanel2.setPreferredSize(sidePanelSize);

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(inputField);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);

        textPanel.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        inputField.addActionListener(this); // Added action listener for input field

        add(StatusPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
        add(sidePanel1, BorderLayout.EAST);
        add(sidePanel2, BorderLayout.WEST);
        add(textPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            Game.isRunning = false;
        } else if(e.getSource() == button2) {
            outText.append("Button 2\n");
        } else if(e.getSource() == button3) {
            outText.append("Button 3\n");
        } else if(e.getSource() == button4) {
            outText.append("Button 4\n");
            player.emote();
        } else if(e.getSource() == button5) {
            outText.append("Button 5\n");
        } else if(e.getSource() == button6) {
            player.perk();
            outText.append("You Did the Thing.\n");
        } else if(e.getSource() == inputField) {
            String text = inputField.getText();
            outText.append(text + "\n");
            inputField.setText("");
        }
    }

    // Getter and Setter methods (if necessary) can be added here
}
