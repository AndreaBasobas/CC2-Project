package guessinggame;
import java.io.*;
public class GuessingGame {

 
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("!!!Guess the Number!!!!");

    int count = 0;
    int a = 500;
    int guess = 0;

    System.out.println("Enter Your Number: ");

    while (guess != a) {
        guess = Integer.parseInt(br.readLine());
        count++;
        if (guess > a) {
            System.out.println("Lower!");
                        if (guess % 2 == 0){
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");
        }

        } else if (guess < a) {
            System.out.println("higher!");
                        if (guess % 2 == 0){
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");

    }
    }
        else if(guess >1000){
            System.out.println("the number should not go beyond 1000");
        
        }
    }
    System.out.println("Congratulations! You guessed the number with "
        + count + " tries!");
    }
    
}
