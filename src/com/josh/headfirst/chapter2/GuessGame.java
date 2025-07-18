package com.josh.headfirst.chapter2;

public class GuessGame
{
    Player p1;
    Player p2;    // Instance vars for player objects
    Player p3;    

    public void startGame()
    {
        p1 = new Player();
        p2 = new Player();    // Objects assigned to instance vars
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;    // Vars to hold guesses
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;    // Declare var for player answer
        boolean p3isRight = false;

        int targetNumber = (int)(Math.random() * 10);    // Create target num
        System.out.println("I'm thinking of a number between 0 and 9...");
        
        while(true)
        {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();    // Call guess method
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);    // Get each guess

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            // Check each guess
            if (guessp1 == targetNumber)
            {
                p1isRight = true;
            }
            if (guessp2 == targetNumber)
            {
                p2isRight = true;
            }
            if (guessp3 == targetNumber)
            {
                p3isRight = true;
            }

            // Game loop
            if (p1isRight || p2isRight || p3isRight)
            {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;
            }   
            else
            {
                System.out.println("Players will have to try again.");
            }
        }
    }
}
