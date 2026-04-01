package org.example;

import java.util.*;

public class Grade {
    private int bulls;
    private int cows;

    public Grade(int bulls, int cows){
        this.bulls = bulls;
        this.cows = cows;
    }

    public int getCows(){
        return this.cows;
    }

    public int getBulls(){
        return this.bulls;
    }
}
