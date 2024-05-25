package com.rawr3;

import javax.swing.SwingUtilities;


public class Main {
    public   Player player;
    
    public static  void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {


            @Override
            public void run() {
                Player player = new Player();
                GameGUI gamegui = new GameGUI(player);
                gamegui.setVisible(true);
                Game game = new Game(2, gamegui, player);
                game.startGame();
            }
        });
        
    }
}