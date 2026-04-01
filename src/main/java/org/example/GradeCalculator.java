package org.example;

public class GradeCalculator {

    public Grade calculateBullsAndCows(String grade, String guess){
        int bulls = 0;
        int cows = 0;

        int[] gradeCount = new int[10];
        int[] guessCount = new int[10];

        for(int i = 0; i < grade.length(); ++i){
            char s = grade.charAt(i);
            char g = guess.charAt(i);
            if (s==g){
                ++bulls;
            }
            else {
                gradeCount[s - '0']++;
                guessCount[g - '0']++;
            }
        }
        for(int i = 0; i < 10; ++i){
            cows += Math.min(gradeCount[i], guessCount[i]);
        }
        return new Grade(bulls, cows);
    }
}
