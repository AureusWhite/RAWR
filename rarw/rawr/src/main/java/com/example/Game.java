package com.example;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Game {
        private static JTextArea outputTextArea = MyJFrame.outputTextArea;
        private static Player player;

        public static void startGame() {
                // Ensure the outputTextArea is not null
                outputTextArea = MyJFrame.outputTextArea;

                // Create a new player object
                player = new Player("blargh!", 1, 1, 1, 1);

                startIntro();
                firstChapter();
                secondChapter();
        }

        private static void secondChapter() {
                outputTextArea.append("Second Chapter...\n");
        }

        private static void firstChapter() {
                outputTextArea.append("First Chapter\n");
        }

        private static void startIntro() {
                createCharacter();

                outputTextArea.append("Intro and story setting.\n");
        }

        public static void createCharacter() {
                outputTextArea.append("\n");

                // Get player name
                player.name = JOptionPane.showInputDialog(null, "What is your name?", "Name Input",
                                JOptionPane.QUESTION_MESSAGE);

                // Get player age
                String ageStr = JOptionPane.showInputDialog(null, "How old are you, " + player.name + "?", "Age Input",
                                JOptionPane.QUESTION_MESSAGE);
                player.age = Integer.parseInt(ageStr);

                // Get player gender
                int genderResponse = JOptionPane.showConfirmDialog(null, "Do you have a gender?", "Gender Input",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                player.gender = (genderResponse == JOptionPane.YES_OPTION);

                // Display gender info
                if (player.gender) {
                        JOptionPane.showMessageDialog(null, player.name + " has a gender.", "Gender Info",
                                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                        JOptionPane.showMessageDialog(null, player.name + " does not have a gender.", "Gender Info",
                                        JOptionPane.INFORMATION_MESSAGE);
                }

                // Display a summary message
                JOptionPane.showMessageDialog(null,
                                "Hello, " + player.name + "! You are " + player.age
                                                + " years old.\nLet's start the game!",
                                "Game Start", JOptionPane.INFORMATION_MESSAGE);
        }
}
