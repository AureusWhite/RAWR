package com.rawr;

import javax.swing.SwingUtilities;


public class Main {
    public static Player player;
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {


            @Override
            public void run() {
                GameGUI gamegui = new GameGUI(player);
                gamegui.setVisible(true);
                Game game = new Game(2);
                game.startGame();
            }
        });
        
    }
}