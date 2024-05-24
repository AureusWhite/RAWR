
package com.rawr;


import javax.swing.JTextArea;

class Game {
    private static JTextArea outText = GameGUI.getOutText();
    static String buffer = "\n";

    public Game(int i){

    }
    public static String buffer(int lineNum){
        for(int i=0;i<lineNum;i++){
            return buffer;
        }
        outText.append("buffer");
        return null;
    }

    public void startGame() {
        Player player = new Player();
        player.createCharacter();
    }

}
