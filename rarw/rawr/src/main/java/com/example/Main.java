package com.example;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            private Player player;

            public void run() {
                // Create a new Player object
                player = new Player("blargh!", 1, 1, 1, 1);
                // Create a new MyJFrame object
                MyJFrame frame = new MyJFrame();
                frame.setVisible(true);

                // Start the game
                Game.startGame();
            }
        });
    }
}
