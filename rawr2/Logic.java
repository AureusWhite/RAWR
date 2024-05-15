package rawr2;
import java.util.ArrayList;

import rawr2.GameGUI;

public class Logic {
	private  Locations kitchen;
	private  ArrayList objectList = new ArrayList();

	private  Player player;
	private  Locations location = new Locations("Blargh", "Blargh", player);
	
	public  void startIntro(Player player, GameGUI gameGUI) {
		GameGUI.getGameTextArea().append("""
                              Good morning *Player PlaceHolder*," Fuzzy chirps. "Time to start!" You stretch and rub your eyes, feeling a sense of anticipation for the day ahead. Fuzzy gestures towards the neatly folded uniform

                                                on the chair, and you quickly change into it. Once dressed, you glance at the mirror, ensuring the green check mark is next to your name tag,signaling that you're fully uniformed. 
   
                                                               Satisfied, you follow Fuzzy as it leads you to the door. With a soft whir, Fuzzy opens the door, revealing the main room of Busy Beavers. Bright posters line the walls. 
   
                                 They direct you with colorful arrows and playful illustrations. Fuzzy gestures for you to follow the posters, and you make your way through the building, exploring the various rooms and areas. 
   
                                 As you navigate the corridors, you notice locked doors with different colored childproof locks. A blue lock guards one door, a green lock secures another, and a red lock bars entry to a third door. 
   
                                 Fuzzy beeps softly, indicating that these doors are off-limits for now. Finally, you arrive at the foyer. Standing there is Aureus, the prefect of Busy Beavers, with a warm smile on her face.
   
                                  "Good morning!" Aureus greets you. "I'm Aureus, your prefect. Are you ready for a tour?" You nod eagerly, and Aureus begins the tour, leading you through the various areas of Busy Beavers. 
    
                                  First, she shows you the dining hall, where delicious meals are prepared for all the students. Next is the kitchen, where you catch a glimpse of busy chefs preparing today's lunch. 
    
              Then, Aureus leads you to the playroom, where colorful toys and games await. You can't help but feel excited as you imagine all the fun you'll have here. After the playroom, Aureus takes you to the classroom.
    
                                 you'll spend your days learning and discovering new things. Finally, she shows you the dormitories, where you and your fellow students will rest and recharge after a day of adventure. 
    
                          As the tour comes to an end, Aureus leads you back to the foyer."Well, what do you think?" she asks with a smile.You beam with excitement,  feeling ready to begin your journey at Busy Beavers.
    
						                                                            Ready to uncover the mysteries that lie behind the locked doors with their the colorful locks.

				""");

		
	}
	 void startGame(Player player, GameGUI gameGUI) {
		


		GameGUI.getGameTextArea().append("""
				
				
				                      					Welcome to "RAWR: Rejuve Adults Watershed Resistance"!                                 
               
				                                                You find yourself at Busy Beavers, a peculiar institution that serves as a psychological experiment conducted by a renowned developmental psychologist. 
                                                    
				                                                	Here, most are on their third or fourth childhood, simply wanting to get through it and be allowed to leave. RAWR was born out of necessity. 
                                                    
				                                                	a resistance movement against the removal of rejuvenated people's right to vote. It's believed that rejuves are too irresponsible due to their  
	                                                      
		                                          smaller bodies necessitating smaller brains, with underdeveloped frontal and temporal lobes. Despite retaining memories from adult life, procedural memory is lost,
		                                                  
	                                       and tasks like tying shoes and writing need to be relearned (though rejuves can do so quickly). As you step into the facility, the air hums with a mix of determination and resignation.
	                                                          
	                                                         The corridors are lined with signs urging resistance and solidarity. Your journey begins in a classroom at Busy Beavers, where you are introduced to the   
	                                                          
		                                                    unique nature of the institution and the challenges faced by rejuves. Ms. Sagely, the lead researcher and a staunch advocate for rejuve rights, stands at the front of the room.        
		                                                                                            
				                                              "Welcome, rejuves, to RAWR," Ms. Sagely announces, her voice filled with conviction. "Here, we fight for our rights and our voices to be heard, despite society's belief that we are incapable.
				                                              
				        Yes, our brains may be immature, but our spirits are grown."  The room buzzes with a sense of unity as Ms. Sagely outlines the mission of RAWR and the importance of reclaiming the rights denied to rejuves.
		 						              
		 						              
									              											Get ready to join the resistance and prove that even in a smaller body, you can make a  big impact.                                                                         
				""");
		location.listObjects(objectList, location, gameGUI, player);
		location.inventory[0]="Empty";
		location.removeObject(1, "Thing Two");
		location.listObjects(objectList, location, gameGUI, player);
		
			}
		
		
	}
