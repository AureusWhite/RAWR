
package com.rawr3;


import javax.swing.JTextArea;
class Game {
    private static  JTextArea outText = GameGUI.getOutText();

    public static JTextArea getOutText() {
        return outText;
    }

    public static void setOutText(JTextArea outText) {
        Game.outText = outText;
    }
      String buffer = "\n";

    public Game(int i, GameGUI gamegui, Player player){

    }
    public   String buffer(int lineNum){
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
