package rawr2;
import rawr2.Player;
import java.util.ArrayList;

import javax.swing.JTextArea;

import rawr2.GameGUI;

public class Locations {

	private Player player;
	
	private String name;
	public String description;
	ArrayList objectList = new ArrayList();
	Object[] inventory = {"Thing 1","Thing 2","Thing 3"};
	
	
	
	private String dicription = "Blargh!!!!";
	private Object GameGUI;
	private rawr2.GameGUI gameGUI;

	private Object location;




	public Locations(String name, String description,Player player) {
		String locationDiscription=player.getDescription(player, gameGUI);
		Locations location = new  Locations("Blargh", locationDiscription, player);
		GameGUI = gameGUI = new GameGUI(player);
		player = player.player;
		name = name;
		description = description;
		
}

	public String getName() {
		return name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public  Locations getDescription(Locations location,Player player, GameGUI gameGUI) {
		JTextArea jTextArea = new JTextArea();
		jTextArea.append("BLARGHGHTEDCGHRTFSDXC");
	return player.location;
	}


public void listObjects(ArrayList objectList,Locations location, GameGUI gameGUI, Player player) {
	for (int i = 0; i < inventory.length; i++) {
		  JTextArea jTextArea = new JTextArea();
		jTextArea.append(inventory[i].toString());
		  
		  
		}
}

public void removeObject(int i, String Name) {
	inventory[i]="Empty..............!";
}

public void doThing(Player player){
	player = player.player;
	}

public  void doTheThing(Player player2) {
	player2 = player2.player;
	
}
	
}
