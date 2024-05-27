package com.rawr3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;



class Player {
    JTextArea outText=GameGUI.outText;
    private static Player player;
    public static Player getPlayer() {
        return player;
            }


    private String name;
    public static String perk;
    


    void createCharacter() {
String inputValue = JOptionPane.showInputDialog("What is your name?\n");
this.name = inputValue;
GameGUI.outText.append("Hello: "+name+"\n");
String[] possibleValues = { "Boy", "Girl", "Y-Rep", "Non-conforming", "Other" };

        String selectedValue = (String) JOptionPane.showInputDialog(null,
                    "What is your gender?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);
    String[] possibleValues2 = { "Well Manered", "Cantancuous", "The Shy Kid", "Non-conforming", "Conspicious","Disgrace!","Lone Pup","Loyalist","Confeterate" };
        GameGUI.outText.append("Perk? \n"); 
    selectedValue = (String) JOptionPane.showInputDialog(null,
                    "What is your gender?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues2, possibleValues2[0]);
    Player.perk = selectedValue;               

    }

    public void perk() {
        switch(perk){
            case "Well Manered" -> GameGUI.outText.append(perk+"\n");
            case "Cantancuous" -> GameGUI.outText.append(perk+"\n");
            case "The Shy Kid" -> GameGUI.outText.append(perk+"\n");
            case "Conspicious" -> GameGUI.outText.append(perk+"\n");
            case "Disgrace!" -> GameGUI.outText.append(perk+"\n");
            case "Lone Pup" -> GameGUI.outText.append(perk+"\n");
            case "Loyalist" -> GameGUI.outText.append(perk+"\n");
            case "Confeterate" -> GameGUI.outText.append(perk+"\n");
        }
    }

    public void emote() {
        switch(perk){
            case "Well Manered" -> GameGUI.outText.append("You make sure not to get noticed causing trouble.\n");
            case "Cantancuous" -> GameGUI.outText.append("Small and firey your temper attracts the attention of nearby faculty.\n");
            case "The Shy Kid" -> GameGUI.outText.append("Slow to warm up, even slower to cool down. Befriending the shy kid has it's benefits\n");
            case "Conspicious" -> GameGUI.outText.append("No dening it now, they know who you are. Might as well fly your flag.\n");
            case "Disgrace!" -> GameGUI.outText.append("DISGRACE!. DISGRACE!. DISGRACE! DISGRACE! DISGRACE! DISGRACE! DISGRACE! DISGRACE! DISGRACE! DISGRACE! DISGRACE! DISGRACE!  \n");
            case "Lone Pup" -> GameGUI.outText.append("No gods no masters!, only a cause of your choosing \n");
            case "Loyalist" -> GameGUI.outText.append("Salute! The government is actually somewhat effective at it's job for once, why mess with the status quoe?\n");
            case "Confeterate" -> GameGUI.outText.append("You know who you are, we don't know, but you do... Yup, you suuuure do, what was it you where again?\n");
        }
    }
}
