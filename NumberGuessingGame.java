import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Here We generate an random Number
        int RandNumber = (int)((Math.random() * (100)) + 1);
        // ((Math.random() * (max - min)) + min)
        
        System.out.println();
        System.out.println("******** WELCOME TO NUMBER GUESSING GAME **********");
        System.out.println();
        System.out.print("Please enter your number between 1 - 100: ");

        // Taking Input from keyboard using Scanner class
        Scanner sc = new Scanner(System.in);
        int enteredNum = sc.nextInt();
        int attempts = 0;

        while(true) {
            if(RandNumber == enteredNum) {
                System.out.println("---------------------------------------------------------");
                System.out.println("CONGRATULATIONS, YOU GUESS NUMBER IN " + attempts + " ATTEMPTS");
                break;
            }
            else{
                if(RandNumber > enteredNum) {
                    System.out.print("Please enter Higher value : ");
                    enteredNum = sc.nextInt();
                }
                else{
                    System.out.print("Please enter Lower value : ");
                    enteredNum = sc.nextInt();
                }
            }

            attempts++;
        }
    }
}
