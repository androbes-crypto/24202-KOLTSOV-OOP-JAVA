package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeGenerator {
    public static String createSecretCode(){
        List<Character> characters = new ArrayList<>();
        for(char c = '0'; c <= '9'; ++c){
            characters.add(c);
        }
        Collections.shuffle(characters);
        StringBuilder grade = new StringBuilder(4);
        for(int i = 0; i < 4; ++i){
            grade.append(characters.get(i));
        }
        return grade.toString();
    }
}
