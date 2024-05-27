package com.rawr3;

public class Location {
    public String name;
    private final int time;
    private final int roomNumber;
    public  String[] snapShot={"noon","after noon","getting dark","pretty dark","morning"};
    public Location(String name,int roomNumber,int time){
    this.name=name;
    this.roomNumber=roomNumber;
    this.time = time;
    }

    public void discribeRoom(int x){        
        
            GameGUI.outText.append("Blargh! " + snapShot[x]);
        
        
    }


    
    }
