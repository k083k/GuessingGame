import java.util.Scanner;

public class GuessingGame {
    private int targetNumber;
    private int userGuess;
    void generateNumber(){
        double randNumber = Math.random();
        targetNumber = (int) (randNumber * 10);
    }

    void checkAnswer() {
        int i = 0;
        for (i = 0; i < 3; i++) {
            System.out.println("Guess a number between 0-9 (inclusive):");
            while (!(userGuess == targetNumber)) {
                System.out.println("Enter your guess Here:");
                Scanner sc = new Scanner(System.in);
                int userGuess = sc.nextInt();
                i++;

                if (userGuess == targetNumber) {
                    System.out.println("Correct!!!! Bravo");
                    break;
                }else if (i == 3) {
                    System.out.println("You've ran out of Tries");
                    break;
                }else{
                    System.out.println("NOPE!!! Try Again!!!");
                }
            }
        }
    }
}
