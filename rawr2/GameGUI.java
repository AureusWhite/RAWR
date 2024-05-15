package rawr2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import rawr2.Player;

public class GameGUI extends JFrame implements ActionListener {
	public static GameGUI gameGUI;
	Player player = new Player("Aureus");
    public  void doTheThing(Player player) {
    	gameGUI.setPlayer(player.player);
    }
	public  JTextArea gameTextArea;;
Objects McGuffin1 = new Objects(player, gameGUI);
	
    private JPanel statusPanel, bottomPanel; // Added bottomPanel
    private JLabel statusLabel;
    private JButton goButton, playButton, talkButton, qButton, pickUpButton;
    private JTextField textField; // Changed JTextComponent to JTextField
    private NPC npc;
    private Objects toy, heldObject, McGuffin;
    private String currentLocation;
    private Locations kitchen;
	private Locations location;

    public GameGUI(Player player) {

    	doTheThing(player);
        Locations location = player.location;


        setTitle("RAWR The rise of Taliber.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 900);
        setLocationRelativeTo(null);

        statusLabel = new JLabel();
        statusLabel.setText("Testing");

        statusPanel = new JPanel();
        statusPanel.add(statusLabel, BorderLayout.CENTER);
        statusPanel.setBackground(Color.PINK);
        add(statusPanel, BorderLayout.NORTH);

        gameTextArea = new JTextArea();
        gameTextArea.setEditable(false);
        gameTextArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(gameTextArea);

        JPanel gamePanel = new JPanel(new BorderLayout());
        gamePanel.add(scrollPane, BorderLayout.CENTER);
        gamePanel.setBackground(new Color(255, 204, 204));
        add(gamePanel, BorderLayout.CENTER);

        // Create and add bottomPanel with text field
        bottomPanel = new JPanel();
        textField = new JTextField(20);
        bottomPanel.add(textField);
        add(bottomPanel, BorderLayout.SOUTH);

        pickUpButton = new JButton("Pick Up");
        qButton = new JButton("Quest");
        talkButton = new JButton("Talk");
        playButton = new JButton("Play");
        goButton = new JButton("Go");

        pickUpButton.addActionListener(this);
        qButton.addActionListener(this);
        talkButton.addActionListener(this);
        playButton.addActionListener(this);
        goButton.addActionListener(this);
        textField.addActionListener(this);

        pickUpButton.setActionCommand("Pick Up");
        qButton.setActionCommand("Quest");
        talkButton.setActionCommand("Talk");
        playButton.setActionCommand("Play");
        goButton.setActionCommand("Go");

        JPanel buttonPanel = new JPanel(new GridLayout(1, 5)); // Adjusted grid layout size
        buttonPanel.add(pickUpButton);
        buttonPanel.add(qButton);
        buttonPanel.add(talkButton);
        buttonPanel.add(playButton);
        buttonPanel.add(goButton); // Moved textField to its own panel
        add(buttonPanel, BorderLayout.SOUTH);

        updateStatusText(player, gameGUI);
        setVisible(true);

        npc = new NPC(this, player);
        toy = new Objects(1, "toy", gameGUI);
        McGuffin1 = new Objects(1, "McGuffin", gameGUI);

        currentLocation = "Kitchen";
        updateStatusText(player, gameGUI);
    }

    

    public void actionPerformed(ActionEvent e) {
       
        }
    }


	public  JTextArea getGameTextArea() {
        return gameTextArea;
    }

	/**
	 * @return the player
	 */
	public  Player getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		player = player;
	}
}
