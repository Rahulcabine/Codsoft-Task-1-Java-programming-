/*Codsoft Virtual Internship in Java Programming
 * TASK 1 : Number Game
 * Author Name : Brajbhusan Kumar
 */

 import java.util.Scanner;
 import java.util.Random;

 class Game 
 {
    Scanner sc = new Scanner(System.in);//making object of scanner class
    Random rd = new Random();//making object of random class to generate random number
    int guessNo;
    
    public Game()
    {
       guessNo = rd.nextInt(100)+1; // This guess no. upto 100
    }

    public void start()
    {
        boolean guessStatus=false;
        int count=0;

        while(!guessStatus)
        {
            System.out.println("Guess A Number Between 0 to 100 : ");
            int ourGuess = sc.nextInt();
            count++;
            
            if(ourGuess>=1 && ourGuess<=100)
            {
                if(ourGuess==guessNo)
                {
                    System.out.println("Congratulation! You have Guessed in "+count+" Guess Count");
                    guessStatus=true;
                }
                else if(ourGuess>guessNo)
                {
                    System.out.println("Too High");
                }
                else
                System.out.println("Too Low");
            }
            else 
            {
                System.out.println("You Have Guessed Out of Limits!");
            }

        }
    }
 }

 public class GuessNumber
 {  
    public static void main(String args[])
    {
        Game object = new Game();
        object.start();
    }
 }
