package rawr2;

import javax.swing.*;

public class Quests {
    public GameGUI gameGUI;
    public JTextArea gameTextArea;
    private int type;
    private int level;
    private String description;
    private Objects McGuffin;


    public Quests(int type, int level,GameGUI gameGui) {
        this.type = type;
        this.level = level;
        this.McGuffin = getQuestObject();
        
    }

    Objects getQuestObject() {
        return new Objects(1, "McGuffin", gameGUI);
    }


    // Getters and setters
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Objects getMcGuffin() {
        int randomNumber = (int) (Math.random() * 10) + 1; // Generate a random number between 1 and 10
        
        switch (randomNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                GameGUI.getGameTextArea().append("You found nothing.\n\n");
                return null; 
            case 10:
                GameGUI.getGameTextArea().append("Yaaaaay!!!! You found it!!!\n\n");
                return McGuffin; 
        }
        return null;
        }
    public void setMcGuffin(Objects McGuffin) {
        this.McGuffin = McGuffin;
    }
    public Objects check(Objects object) {
    		return getMcGuffin();
    	}

		
    }
