package org.example;

import java.util.Scanner;

public class Game {
    public void runGame(){
        String secretCode = CodeGenerator.createSecretCode();
        System.out.println("Загаданное число имеет длину 4, все цифры в диапазоне от 0 до 9 включительно и без повторений");
        GradeCalculator gradeCalculator = new GradeCalculator();
        Scanner scanner = new Scanner(System.in);
        Validator validator = new Validator();
        boolean isWin = false;
        do {
            String guess = scanner.nextLine();
            if(!validator.isValidGuess(guess)){
                System.out.println("Некорректный вариант, попробуй ещё раз");
                continue;
            }
            Grade grade = gradeCalculator.calculateBullsAndCows(secretCode, guess);
            int bulls = grade.getBulls();
            int cows = grade.getCows();

            if(bulls == 4){
                isWin = true;
            }
            else{
                System.out.println("Быков: " + bulls +", коров: " + cows);
            }
        } while(!isWin);
        System.out.println("Ты победил, поздравляю!");
    }
}
