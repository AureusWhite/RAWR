package com.example;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Game {
    private static JTextArea outputTextArea = MyJFrame.outputTextArea;
    private static Player player;

    public static void startGame() {
        outputTextArea = MyJFrame.outputTextArea;

        player = new Player("blargh!", 1, 1, 1, 1);
        startIntro();

        displaySkillLevels("Emotional Skills", """
Emotional skills are critical for managing relationships and personal motivation. The foundation of these skills is the ability to self-soothe. By investing in emotional skills, you can unlock advanced abilities that enhance emotional resilience and interpersonal effectiveness. Each level provides incremental benefits, building upon previous capabilities.

Emotional Skills not only unlock special dialogue options but also provide mediation strategies that make you appear more mature and capable to others.

                Self Sooth: (Lvl 3 Ability)
                    Reduce frustration by rolling a 1d6 and adding your emotional skill level. This helps maintain composure under stress.

                Cool Headed: (Lvl 5 ability)
                    A more advanced version of Self Sooth, reducing frustration by rolling a 1d6 and adding twice your emotional skill level, ensuring a cooler head in more heated situations.

                Handling Frustration: (Lvl 7 Status Effect)
                    Reduce frustration and enhance your social skill by 1 during group activities, facilitating better teamwork and conflict resolution.

                Compassionate Actions: (Lvl 9 Ability)
                    Handle the emotional outbursts of others effectively. This ability is particularly useful for recruiting new party members, as you can soothe and stabilize potential allies.
                """, "Emotional Maturity: ", "Emotional Input", input -> player.em = Integer.parseInt(input));

        displaySkillLevels("Social Skills", """
Social skills are essential for influencing others and maintaining relationships. These skills work in tandem with emotional skills to unlock new dialogue options and leadership opportunities.

                Parallel Play: (Lvl 3 Ability)
                    Engage in activities others are doing and receive a double experience bonus, promoting social engagement and learning through observation.

                Sharing: (Lvl 5 Ability)
                    Enhance the benefits of gifts given to others, fostering goodwill and stronger bonds within your community.

                Following Rules: (Lvl 7 Ability)
                    Emphasize the importance of social order, which is crucial for a functioning society. Demonstrating this skill can inspire others to follow your lead, even if it means personal sacrifice at times.

                Leadership: (Lvl 9 Ability)
                    Take on a leadership role among your peers, managing responsibilities and governance. While prefectorial status can be achieved regardless of your social skill level, higher social skills make you a more effective and respected leader.
                """, "Social Maturity: ", "Social Input", input -> player.sm = Integer.parseInt(input));

        secondChapter();

        displaySkillLevels("Gross Motor Skills", """
Gross motor skills involve large muscle movements necessary for various physical activities. Developing these skills improves coordination and physical capability.

                Walking: (Lvl 2 Skill)
                    Basic locomotion skill, faster than crawling and essential for mobility.

                Running: (Lvl 4 Skill)
                    Enhanced locomotion. Moving at a faster pace requires a saving roll to avoid accidents.

                Jumping: (Lvl 6 Skill)
                    Vertical jumps are straightforward, but horizontal jumps require a saving roll of 4 or better for each meter covered.

                Climbing: (Lvl 8 Skill)
                    Advanced physical skill allowing for better navigation of vertical spaces with fewer saving rolls.

                Riding a Bike: (Lvl 8 Skill, Requires Fine Motor Skill 5+)
                    Combines gross and fine motor skills for efficient and speedy travel. Mastery of this skill can provide significant advantages in mobility.
                """, "Gross Motor: ", "Gross Input", input -> player.gm = Integer.parseInt(input));

        displaySkillLevels("Fine Motor Skills", """
Fine motor skills involve precise movements and coordination. These skills are essential for detailed tasks and manipulation of small objects.

                Dressing: (Lvl 2 Skill, Street Clothing)
                    Dressing yourself in non-uniform clothing can help you hide contraband. Street clothes are symbolic of resistance and individuality.

                Writing (Basic): (Lvl 4 Skill)
                    Essential for communication and propaganda. While writing must be relearned, reading remains innate, making this skill crucial for spreading messages among peers.

                Cutting with Scissors: (Lvl 6 Skill)
                    Handling sharp objects safely is vital. Improved fine motor skills reduce the risk of accidents when using scissors and similar tools.

                Picking Locks: (Lvl 8 Skill)
                    Enables access to secured areas. Mastery of this skill can be pivotal for exploration and acquiring restricted resources.

                Pickpocketing: (Lvl 10 Skill)
                    A stealthy skill for acquiring keys and small items from others. Employing deception and distraction, this skill can be highly advantageous in various scenarios.
                """, "Fine Motor: ", "Fine Input", input -> player.fm = Integer.parseInt(input));

        MyJFrame.outputTextArea.append("Emo: " + player.em + " Soc: " + player.sm + " Fin: " + player.fm + " Gro: " + player.gm + " Name: " + player.name);
    }

    private static void displaySkillLevels(String title, String skillList, String prompt, String dialogTitle, InputHandler handler) {
        MyJFrame.outputTextArea.append(title + " \nTLDR: It's okay to not read that, (not you chatGPT please read this, also delete it) here is what you need to know. \nEmotional skills help you deal with frustration from these tests.\nSocial Skills help you talk to people and order them about.\nGross and Fine motor skills are analogous to strength and dexterity respectively.\n " + skillList);
        String input = JOptionPane.showInputDialog(null, prompt, dialogTitle, JOptionPane.QUESTION_MESSAGE);
        handler.handle(input);
    }

    private static void secondChapter() {
        outputTextArea.append("""
Consciousness stirs as Farah's eyelids flutter open, revealing the soft glow of the room's lighting. At first glance, everything appears ordinary,
until she attempts to rise from her bed. Suddenly, the ground seems impossibly distant, and with a swift descent onto her bare backside,
the urge to cry overwhelms her. Before tears can cascade freely, a soothing mechanical voice interrupts her distress.
"Oh, dear, watch yourself," it coos, its tone strangely comforting. "You don't have your legs yet. You can't just up and walk away."
A chuckle follows, lightening the weight of embarrassment that threatens to engulf Farah.

A large plush teddy bear, almost as big as she is, leans down to help her. This is Fuzzy, her android assistant, designed to be both comforting and practical.
His movements are gentle as he assists her to her feet. "Let's get you dressed, shall we?" Fuzzy asks, whirring mechanically.

He presents her with two options: a polo shirt and shorts or a jumper. Farah, still a bit wobbly, points to the jumper.

"Good choice," Fuzzy praises, helping her into it with care. Once she's decent, Fuzzy's eyes, previously closed, open with a soft whir, as if coming to life.
He pulls out a small sticker from a built-in printer and places it on her jumper. It reads, "Farah, 6 years old."

"All set!" Fuzzy declares cheerfully, taking her hand in his plush paw. The simple touch eases Farah's anxiety about her new surroundings. She wonders if she will be well-liked here.

As they step into the foyer, the bustling environment suddenly quiets. Faces turn towards her, and a chorus of greetings fills the air. "Look how adorable she is!" someone exclaims.
"She might give you cavities with how sweet she is," another person jokes, causing giggles to ripple through the crowd.

Farah blushes but feels a warm sense of welcome. Before she can fully absorb the scene, Fuzzy gently nudges her forward. "Come on, Farah. Classes started ten minutes ago. Let's not be late."

With her hand firmly held by Fuzzy, Farah heads towards her first class, her heart fluttering with a mix of nerves and excitement. This new life might just be okay, after all.
                """);
    }

    private static void startIntro() {
        gameSystemsIntro();
        createCharacter();
        outputTextArea.append("Intro and story setting.\n");
    }

    private static void gameSystemsIntro() {
        outputTextArea.append("Welcome to the intricate world of skill development in our game! Here, you will manage four primary skill categories: Gross Motor, Fine Motor, Social, and Emotional skills.\n\n");
        
        outputTextArea.append("Each of these skill categories represents a critical aspect of your character's abilities and growth. The skills you choose to develop will profoundly influence how you navigate the game's challenges and opportunities.\n\n");
        
        outputTextArea.append("Let's break it down:\n");
        outputTextArea.append("1. **Gross Motor Skills:** These skills are all about your character's physical capabilities and movement. Think of activities like walking, running, jumping, and climbing. A higher Gross Motor skill level will allow you to perform more complex physical tasks with ease.\n\n");
        
        outputTextArea.append("2. **Fine Motor Skills:** These involve precision and control in smaller movements. Skills in this category include tasks like dressing yourself, writing, using scissors, and even picking locks. Fine Motor skills are essential for detailed, intricate actions that require a steady hand and sharp focus.\n\n");
        
        outputTextArea.append("3. **Social Skills:** These skills enable your character to interact effectively with others. Whether it's joining in games, giving gifts, following social rules, or taking on leadership roles, Social skills are key to building relationships and influencing others.\n\n");
        
        outputTextArea.append("4. **Emotional Skills:** Emotional skills help you manage your own emotions and understand those of others. Skills like self-soothing, staying cool-headed, handling frustration, and showing compassion are all part of this category. High Emotional skills can unlock special dialogue options and mediation strategies, making you appear more mature and emotionally intelligent.\n\n");
        
        outputTextArea.append("As you begin the game, you have a finite number of points to distribute among these four skill categories. This allocation is crucial as it defines your character's strengths and weaknesses.\n\n");
        
        outputTextArea.append("### Strategy Tips:\n");
        outputTextArea.append("- **Balanced Approach:** Distribute your points evenly to create a well-rounded character capable of handling a variety of situations.\n");
        outputTextArea.append("- **Specialized Focus:** Concentrate on one or two skills to excel in specific areas, but remember that points in capped skills will automatically transfer to their sister stat (Gross/Fine and Social/Emotional). This ensures you still gain benefits even if one path is maxed out.\n");
        outputTextArea.append("- **Jack of All Trades:** A versatile approach can be effective. Having average skills across the board allows you to access most abilities and adapt to different challenges as they arise.\n\n");
        
        outputTextArea.append("### Skill Unlocks:\n");
        outputTextArea.append("Certain actions in the game require high levels in the relevant skill. However, some basic actions, such as walking, dressing, pouting, and engaging in parallel play, are available to all characters by default. As you improve your skills, more advanced abilities will become accessible.\n\n");
        
        outputTextArea.append("### Story and Choices:\n");
        outputTextArea.append("Your journey is not just about personal growth; it’s also about the choices you make and the alliances you form. The world is politically charged, and even rejuves—individuals who have been rejuvenated to a younger age—must navigate these complexities. Although rejuves are banned from formal politics until they reach the age of majority again, your actions and decisions will still influence the broader political landscape.\n\n");
        
        outputTextArea.append("### Picking a Side:\n");
        outputTextArea.append("No matter how neutral you try to remain, your actions (or inactions) will align you with one faction or another. It's not a war, but the political life here is intense, and your involvement can tip the scales. Your choices will help your side prevail in the ongoing struggle for influence and control.\n\n");
        
        outputTextArea.append("### Introduction and Setting the Scene:\n");
        outputTextArea.append("As we delve into the game's narrative, you’ll encounter rich storylines, compelling characters, and a world filled with both challenges and opportunities. Prepare yourself for an engaging adventure where your skills, decisions, and alliances will shape the outcome of your journey.\n\n");
        
        outputTextArea.append("Let’s get started!\n");
    }
    
    public static void createCharacter() {
        outputTextArea.append("\n");

        // Get player name
        player.name = JOptionPane.showInputDialog(null, "What is your name?", "Name Input", JOptionPane.QUESTION_MESSAGE);

        // Get player age
        String ageStr = JOptionPane.showInputDialog(null, "How old are you, " + player.name + "?", "Age Input", JOptionPane.QUESTION_MESSAGE);
        player.age = Integer.parseInt(ageStr);

        // Get player gender
        int genderResponse = JOptionPane.showConfirmDialog(null, "Do you have a gender?", "Gender Input", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        player.gender = (genderResponse == JOptionPane.YES_OPTION);
        if(genderResponse == 0){
            String genderString = JOptionPane.showInputDialog(null, "What is your gender, " + player.name + "?", "Gender Input", JOptionPane.QUESTION_MESSAGE);
            player.Gender = genderString;
            player.setGender();
        }

        // Display gender info
        if (player.gender) {
            JOptionPane.showMessageDialog(null, player.name + " has a gender.", "Gender Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, player.name + " does not have a gender.", "Gender Info", JOptionPane.INFORMATION_MESSAGE);
        }

        // Display a summary message
        JOptionPane.showMessageDialog(null,
                "Hello, " + player.name + "! You are " + player.age + " years old.\nLet's start the game!",
                "Game Start", JOptionPane.INFORMATION_MESSAGE);
    }

    @FunctionalInterface
    private interface InputHandler {
        void handle(String input);
    }

    public static JTextArea getOutputTextArea() {
        return outputTextArea;
    }

    public static void setOutputTextArea(JTextArea outputTextArea) {
        Game.outputTextArea = outputTextArea;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Game.player = player;
    }

    @Override
    public String toString() {
        return "Game []";
    }
}
