package com.example;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
// Create a new Player object
                        // Create a new MyJFrame object
            MyJFrame frame = new MyJFrame();
            frame.setVisible(true);
            
            // Start the game
            Game.startGame();
        });
    }

    @Override
    public String toString() {
        return "Main []";
    }
}
