package Project;

import java.util.Scanner;

public class TheGame {
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Welcome to the game! What is your name? ");
        String name = scan.next();
        System.out.println("Nice to meet you, " + name + ".");
        start();
    }

    public static void start() {
        System.out.println("Are you ready to start? \n 1. yes \n 2. no");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("\n You are in school after hours. It's just you... or so you thought." +
                    " As you are leaving the building, you notice one classroom light still on." +
                    " You peer in through the window and you see your science teacher. What is that he's doing...?" +
                    " Suddenly, a huge monster runs into view. Terrified, you are frozen in place. The beast notices you and growls, notifying his master of your presence.\n"
                    + "The science teacher turns to you, smiles, and says, "
                    + "Oh, hello there! Come here and check this out! \"I have to get away from him!\" You think. \n" +
                    "You are standing in the middle of the hallway. Do you... " +
                    "\n 1. Go to the science wing \n 2. Go to the arts wing");
            int x = scan.nextInt();
            if (x == 1) {
                ScienceWing.firstChoice();
            } else if (x == 2) {
                // run art wing code
            } else {
                start();
            }
        } else {
            System.out.println("What do you mean? Do you not want to play? Here, I'll give you another chance...");
            start();
        }
    }

    public static void death() {
        System.out.println("Unfortunately, it looks like you lost. Play again? \n 1. yes \n 2. no");
        int n = scan.nextInt();
        if (n == 1) {
            main(null);
        } else if (n == 2) {
            System.out.println("Sorry to hear that :(");
            System.exit(0);
        } else {
            death();
        }

    }
}
