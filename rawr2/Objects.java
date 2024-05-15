package rawr2;
import rawr2.Locations;
import rawr2.GameGUI;

public class Objects {
    private int id;
    private String name;
    private  GameGUI gameGUI;
     Objects McGuffin;
    private int type;
    private Objects object;
    private Objects heldObject=object;
    
    public Objects(int type, String name, Player player, GameGUI gameGUI) {
        type = type;
        name = name;
        gameGUI = gameGUI; 
        player = player; 
        }
    
    public void play(int type, GameGUI gameGUI) {
        switch (this.type) {
            case 1:
                gameGUI.getGameTextArea().append("Playing with toy...\n");
                this.setType(2);
                break;
            case 2:
                gameGUI.getGameTextArea().append("Playing with book...\n");
                break;
            default:
                break;
        }
    }

    private void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static  Objects getObject() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        switch(randomNumber) {
            case 1:
                GameGUI.gameGUI.getGameTextArea().append("You find an old shoe\n");
                break;
            case 2:
                GameGUI.gameGUI.getGameTextArea().append("You find a booger.\n");
                break;
            case 3:
                GameGUI.gameGUI.getGameTextArea().append("Eeeew... is that what I think it is?\n");
                break;
            case 4:
                GameGUI.gameGUI.getGameTextArea().append("OMGORSH!!!\n");
                return McGuffin;
        }
        return null;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getName(Object obj) {
        return obj.toString();
    }

    public void setName(String name) {
        this.name = name;
    }
}
