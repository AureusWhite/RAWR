package rawr2;
import rawr2.Objects;

public class Player {
	private  Player Aureus;
	public  Player player = Aureus;
    public int GM=1;
    public int FM=1;
    public int EQ=1;
    public int SQ=1;

    public  String locationName = "Blargh!!!!";

    
    private String name;
    private Locations thevoid;
	private GameGUI gameGUI;
	Locations location;



    public Player(String name) {
        name = name;
        location = thevoid;
    }

    public String getName() {
        return this.name;
    }

    public String getLocationName() {
    	
    	switch(locationName) {
    	case "Kitchen":{
    		locationName="Kitchen";
    	}
    	case "Living Room":{
    		locationName="Living Room";
    	}
    	case "Bed Room":{
    		locationName="Bed Room";
    	}
    	default:{
    		locationName="kitchen";
    	}
    	}
    	GameGUI.gameGUI.updateStatusText(player,gameGUI);
        return locationName;
        
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setEQ(int i) {
        this.EQ=i;
    }
    public void setSQ(int i) {
        this.SQ=i;
    }
    
    public void setGM(int i) {
        this.GM=i;
    }
    public void setFM(int i) {
        this.FM=i;
    }
    
    
    public int getEQ() {
        return EQ;
    }
    public int getSQ() {
        return SQ;
    }
    public int getFM() {
        return FM;
    }
    public int getGM() {
        return GM;
    }

    public Locations getLocation() {
        return this.location;
    }

	public String getDescription(Player player2, GameGUI gameGUI2) {
GameGUI.getGameTextArea().append(player.locationName);
		return null;
	}
}
