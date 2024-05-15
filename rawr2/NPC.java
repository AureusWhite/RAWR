package rawr2;

import javax.swing.JTextArea;

public class NPC {
    public  GameGUI gameGUI;
    public  JTextArea gameTextArea = new JTextArea("Blargh");
    
    public NPC(GameGUI gameGUI, Player player) {
        this.gameGUI = gameGUI;
    }

    public  void dialog(Player player, GameGUI gameGUI) {

             switch(player.EQ) {
                case 1:
                    gameGUI.getGameTextArea().append("NPC: Hello there!\n");
                    player.EQ=2;
                    break;
                case 2:
                    gameGUI.getGameTextArea().append("Blargh!\n");
                    player.EQ=1;
                    break;
                default:
                    gameGUI.getGameTextArea().append("Oooops");
                    break;
            }
        } 
    }





