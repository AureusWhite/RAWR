package com.example;

import javax.swing.JOptionPane;

public class Player {

    private static Player player;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Player.player = player;
    }

    int em, sm, gm, fm;
    String name, rep, grade;
    int age = 0;
    boolean pottyTrained = false;
    public boolean gender = false;
    String Gender = "Helicopter";
    String pronouns = "Chop/Wop";
    String[] inventory = { "Handbook", "Penny", "Pacifier" };
    private String pronoun1;
    private String pronoun2;
    private String pronoun3;
    private String pronoun;

    public Player(String name, int em, int sm, int gm, int fm) {
        this.name = name;
        this.em = em;
        this.sm = sm;
        this.gm = gm;
        this.fm = fm;
    }

    public String setGender() {
        if (this.gender) {
            this.pronoun1 = JOptionPane.showInputDialog(null, "First Pronoun: Takes the Place of 'He Her They'", "He/Her", JOptionPane.QUESTION_MESSAGE);
            this.pronoun2 = JOptionPane.showInputDialog(null, "Second Pronoun: Takes the Place of 'His Hers Theirs'", "His/Hers", JOptionPane.QUESTION_MESSAGE);
            this.pronoun3 = JOptionPane.showInputDialog(null, "Third Pronoun: Takes the Place of 'Him Her Them'", "His/Hers", JOptionPane.QUESTION_MESSAGE);

            this.pronoun = "1" + this.pronoun1 + "2" + this.pronoun2 + "3" + this.pronoun3;
        }
        return this.pronoun;
    }
}