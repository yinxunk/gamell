package gametest;

import java.util.ArrayList;

public class players {
    private String name;
    private int score = 0;
    private String hand;
    private ArrayList<String> hands = new ArrayList<>(2);
    

    public players(String name){
        this.name = name;
    }
    public int getScore(){
        return this.score;
    }
    public String getName(){
        return this.name;
    }
    public String getHand(){
        return this.hand;
    }
    public ArrayList<String> getHands(){
        return this.hands;
    }

    
}
