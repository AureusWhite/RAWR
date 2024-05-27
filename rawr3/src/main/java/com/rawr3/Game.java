package com.rawr3;


import javax.swing.JTextArea;
class Game {
    JTextArea outText=GameGUI.outText;
    public static boolean isRunning;

    public Game(int i){

    }

    public void startGame(Player player,GameGUI gameGUI) {
        player.createCharacter();
        gameLoop();
    }

    private void gameLoop() {
do{
GameGUI.outText.append("Loop de doop.");
for(int i=0;i<100;i++){
GameGUI.outText.append("Loop de doop mo faka\n");
}
isRunning=false;
}while(isRunning);
    }

}
