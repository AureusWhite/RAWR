package com.rawr;

import javax.swing.JOptionPane;

class Player {

    private String name;
    private String gender;
    private String perk;

    void createCharacter() {
String inputValue = JOptionPane.showInputDialog("What is your name?");
this.name = inputValue;
GameGUI.getOutText().append("Hello: "+name+"\n");
String[] possibleValues = { "Boy", "Girl", "Y-Rep", "Non-conforming", "Other" };

        String selectedValue = (String) JOptionPane.showInputDialog(null,
                    "What is your gender?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues, possibleValues[0]);
    this.gender = selectedValue;
    String[] possibleValues2 = { "Well Manered", "Cantancuous", "The Shy Kid", "Non-conforming", "Conspicious","Disgrace!","Lone Pup","Loyalist","Confeterate" };
    GameGUI.getOutText().append("Perk? \n"); 
    selectedValue = (String) JOptionPane.showInputDialog(null,
                    "What is your gender?", "Input",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    possibleValues2, possibleValues2[0]);
    this.gender = selectedValue;               

    }

    public String perk() {
        switch(this.perk){
            case "Well Manered" -> System.out.println("blargh");
            case "Cantancuous" -> System.out.println("blargh");
            case "The Shy Kid" -> System.out.println("blargh");
            case "Conspicious" -> System.out.println("blargh");
            case "Disgrace!" -> System.out.println("blargh");
            case "Lone Pup" -> System.out.println("blargh");
            case "Loyalist" -> System.out.println("blargh");
            case "Confeterate" -> System.out.println("blargh");
        }
        return this.perk;
}

    }
