package com.rawr3;

import javax.swing.JOptionPane;

import static com.rawr3.GameGUI.getOutText;


class Player {



    public static Player player;

	public static Player getPlayer() {
        return player;
            }


    private String name;
    public static String perk;

    void createCharacter() {
String inputValue = JOptionPane.showInputDialog("What is your name?");
this.name = inputValue;
GameGUI.getOutText().append("Hello: "+name+"\n");
String[] possibleValues = { "Boy", "Girl", "Y-Rep", "Non-conforming", "Other" };

        String selectedValue = (String) JOptionPane.showInputDialog(null,
                    "What is your gender?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);
    String[] possibleValues2 = { "Well Manered", "Cantancuous", "The Shy Kid", "Non-conforming", "Conspicious","Disgrace!","Lone Pup","Loyalist","Confeterate" };
        getOutText().append("Perk? \n"); 
    selectedValue = (String) JOptionPane.showInputDialog(null,
                    "What is your gender?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues2, possibleValues2[0]);
    this.perk = selectedValue;               

    }

    public static String perk() {
        switch(perk){
            case "Well Manered" -> System.out.println("blargh");
            case "Cantancuous" -> System.out.println("blargh");
            case "The Shy Kid" -> System.out.println("blargh");
            case "Conspicious" -> System.out.println("blargh");
            case "Disgrace!" -> System.out.println("blargh");
            case "Lone Pup" -> System.out.println("blargh");
            case "Loyalist" -> System.out.println("blargh");
            case "Confeterate" -> System.out.println("blargh");
        }
        return perk;
}

    }
