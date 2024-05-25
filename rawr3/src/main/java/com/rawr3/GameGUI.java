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
    public Player player=Player.getPlayer();
    public static   JTextArea outText;

    public static   JTextArea getOutText() {
        return outText;
    }

    public   void setOutText(JTextArea outText) {
        GameGUI.outText = outText;
    }

    private JPanel buttonPanel, StatusPanel, sidePanel2, sidePanel1, textPanel;
    private JTextField inputField;

    public JButton button1, button2, button3, button4, button5, button6;

    public GameGUI(Player player) {
        setTitle("RAWR The Rise of Taliber.");
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        outText = new JTextArea();
        outText.setBackground(Color.WHITE);
        outText.setEditable(false);
        outText.setPreferredSize(new Dimension(1100, 900));
        Font font1 = new Font(Font.SERIF, Font.BOLD, 14);
        outText.setFont(font1);
        JScrollPane scrollPane = new JScrollPane(outText);
        inputField = new JTextField();
        inputField.setPreferredSize(new Dimension(100, 30));
        StatusPanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1, 6));
        sidePanel2 = new JPanel();
        sidePanel1 = new JPanel();
        textPanel = new JPanel(new BorderLayout());
        textPanel.setBorder(BorderFactory.createBevelBorder(1));
        JButton button1 = new JButton("Talk To:");
        JButton button2 = new JButton("Go To:");
        JButton button3 = new JButton("Pick Up:");
        JButton button4 = new JButton("Put Down:");
        JButton button5 = new JButton("Emote:");
        JButton button6 = new JButton("skillPlace");
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

        add(StatusPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
        add(sidePanel1, BorderLayout.EAST);
        add(sidePanel2, BorderLayout.WEST);
        add(textPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Talk To:" -> outText.append("yap\n");
            case "Go To:" -> outText.append("go\n");
            case "Pick Up:" -> outText.append("get\n");
            case "Put Down:" -> outText.append("let\n");
            case "Emote:" -> outText.append("ups\n");
            case "skillPlace" -> {
                
                outText.append(player.perk());
            }
        }
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    public void setButtonPanel(JPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    public JPanel getStatusPanel() {
        return StatusPanel;
    }

    public void setStatusPanel(JPanel statusPanel) {
        StatusPanel = statusPanel;
    }

    public JPanel getSidePanel2() {
        return sidePanel2;
    }

    public void setSidePanel2(JPanel sidePanel2) {
        this.sidePanel2 = sidePanel2;
    }

    public JPanel getSidePanel1() {
        return sidePanel1;
    }

    public void setSidePanel1(JPanel sidePanel1) {
        this.sidePanel1 = sidePanel1;
    }

    public JPanel getTextPanel() {
        return textPanel;
    }

    public void setTextPanel(JPanel textPanel) {
        this.textPanel = textPanel;
    }

    public JTextField getInputField() {
        return inputField;
    }

    public void setInputField(JTextField inputField) {
        this.inputField = inputField;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public void setButton4(JButton button4) {
        this.button4 = button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public void setButton5(JButton button5) {
        this.button5 = button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public void setButton6(JButton button6) {
        this.button6 = button6;
    }
}
