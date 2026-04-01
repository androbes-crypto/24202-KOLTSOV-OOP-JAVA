package org.example;

public class Validator{
    public boolean isValidGuess(String guess){
        for(char c: guess.toCharArray()){
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return guess.length() == 4;
    }
}
