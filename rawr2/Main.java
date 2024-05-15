package rawr2;

import javax.swing.SwingUtilities;

public class Main {
    private  Player player;

public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Player player = new Player("Aureus");
            GameGUI gameGUI2 = new GameGUI(null);
			gameGUI2.doTheThing(player);
            Locations locations = new Locations(null, null, null);
			locations.doTheThing(player);
            Locations kitchen = new Locations("Kitchen","Smells like teen spirit", player);
            GameGUI gameGUI = new GameGUI(player);
            Quests fetch = new Quests(1, 1, gameGUI);
            Logic logic2 = new Logic();
			logic2.startIntro(player, gameGUI);
            Logic logic = new Logic();
			logic.startGame(player, gameGUI);
        });
    }
}