package GuessMeRight;

        import java.util.Scanner;
        import java.util.Random;

public class GuessMeRight {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Random random1= new Random();
        System.out.println("THIS IS GUESS ME RIGHT !");
        System.out.println("------------------------------");
	System.out.println("Instructions: ");
        System.out.println("Choose any number from 0 to 10");
        System.out.println("Number of tries remaining are 5");
        System.out.println("Best of luck :)");
        int NumberGuessed;
        int tries =0;
        int WrongTries=0;
        int ActualNumber =random1.nextInt(10);
        boolean CorrectGuess= false;

        while (!CorrectGuess) {

            System.out.print("ENTER YOUR GUESSED NUMBER: ");
            NumberGuessed = scan.nextInt();
            tries++;
            if (NumberGuessed == ActualNumber) {
                CorrectGuess = true;
            }
            else if (WrongTries ==4) {
                System.out.println("Your tries has been exceeded. "+"The correct number was "+ActualNumber);
                System.out.println("Press shift + F10 to run the program again");
                return;
            }
            else if (NumberGuessed < 0 || NumberGuessed > 10) {
                System.out.println("Your guessed number is not between 0 to 10 ");
                WrongTries++;
                System.out.println("Number of tries remaining are "+(5-WrongTries));
            }
            else if (NumberGuessed > ActualNumber) {
                System.out.println("Your guessed number is way too high please go lower");
                WrongTries++;
                System.out.println("Number of tries remaining are "+(5-WrongTries));
            }
            else if (NumberGuessed < ActualNumber) {
                System.out.println("Your guessed number is way too low please go higher");
                WrongTries++;
                System.out.println("Number of tries remaining are "+(5-WrongTries));
            }
        }
        System.out.println("Congratulations, Your guess is correct!! "+"It took you "+tries+" tries to guess the correct number ");
    }
}
