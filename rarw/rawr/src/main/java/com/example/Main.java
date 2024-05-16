package com.example;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create a new Player object

                // Create a new MyJFrame object
                MyJFrame frame = new MyJFrame();
                frame.setVisible(true);

                // Start the game
                Game.startGame();
            }
        });
    }
}
