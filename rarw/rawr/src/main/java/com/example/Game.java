package com.example;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Game {
        private static JTextArea outputTextArea = MyJFrame.outputTextArea;
        private static Game Game;
        private static Player player;

        public static void startGame() {
                startIntro(player);
                firstChapter(player);
                secondChapter(player);
        }

        private static void secondChapter(Player player) {
                outputTextArea.append("""
                                        Second Chapter...

                                """);
        }

        private static void firstChapter(Player player) {
                outputTextArea
                                .append("""
                                                First Chapter

                                                        """);
        };

        private static void startIntro(Player player) {
                createCharacter();

                outputTextArea
                                .append("""

                                                intro and story setting.

                                                                                                """);
        }

        public static void createCharacter() {
                outputTextArea.append("\n");

                player = new Player(null, 1, 1, 1, 1);
                player.name = JOptionPane.showInputDialog(null, "What is your name?", "Name Input",
                                JOptionPane.QUESTION_MESSAGE);

                String ageStr = JOptionPane.showInputDialog(null, "How old are you, " + player.name + "?", "Age Input",
                                JOptionPane.QUESTION_MESSAGE);
                player.age = Integer.parseInt(ageStr);

                JOptionPane.showMessageDialog(null,
                                "Hello, " + player.name + "! You are " + player.age
                                                + " years old.\nLet's start the game!",
                                "Game Start", JOptionPane.INFORMATION_MESSAGE);
        }
}
