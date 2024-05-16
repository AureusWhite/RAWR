package com.example;

public class Player {

    public static Player player;
    int em, sm, gm, fm;
    String name, rep, grade;
    int age = 0;
    boolean pottyTrained = false;
    boolean gender = false;
    String Gender = "They/Them";
    String[] inventory = { "Handbook", "Penny" };

    public Player(String name, int em, int sm, int gm, int fm) {
        this.em = em;
        this.sm = sm;
        this.gm = gm;
        this.fm = fm;
    }

}
