package Project;

import java.util.Scanner;

// Thea Vaughan & Blakeslee Krusen

public class TheGame {
    public static Scanner scan = new Scanner(System.in);
    public static String playerName;

    public static void main(String args[]) {
        System.out.println(
                "\nNOTE: Throughout the game, you will be given lists of options. Please type the number corresponding to the option you wish to choose.\n");
        System.out.println("Welcome to the game! What is your name? ");
        playerName = scan.nextLine();
        System.out.println("Nice to meet you, " + playerName + ".");
        start();
    }

    public static void start() {
        System.out.println("Are you ready to start? \n (1) yes \n (2) no");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("\n You are in school after hours. It's just you... or so you thought." +
                    " As you are leaving the building, you notice one classroom light still on." +
                    " You peer in through the window and you see your science teacher. What is he doing...?" +
                    " Suddenly, a huge monster runs into view. Terrified, you are frozen in place. The beast notices you and growls, notifying his master of your presence.\n"
                    + "The science teacher turns to you, smiles, and says, "
                    + "\"Oh, hello " + playerName
                    + "! Would you like to come see what I've created?\" \n\"I have to get away from him!\" You think.\n"
                    +
                    "You are standing in the middle of the hallway. Do you... " +
                    "\n (1) Go to the science wing \n (2) Go to the arts wing");
            int x = scan.nextInt();
            if (x == 1) {
                ScienceWing.firstChoice();
            } else if (x == 2) {
                ArtWing.firstChoice();
            } else {
                start();
            }
        } else {
            System.out.println("What do you mean? Do you not want to play? Here, I'll give you another chance...");
            start();
        }
    }

    public static void death() {
        System.out.println("\n         _.---,._,'");
        System.out.println("       /' _.--.<");
        System.out.println("         /'     `'");
        System.out.println("       /' _.---._____");
        System.out.println("       \\.'   ___, .-'`");
        System.out.println("           /'    \\\\             .");
        System.out.println("         /'       `-.          -|-");
        System.out.println("        |                       |");
        System.out.println("        |                   .-'~~~`-.");
        System.out.println("        |                 .'         `.");
        System.out.println("        |                 |  R  I  P  |");
        System.out.println("        |                 |           |");
        System.out.println("        |                 |           |");
        System.out.println("         \\              \\\\|           |//");
        System.out.println("   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("\n[GAME OVER] \n (1) play again \n (2) exit");
        int n = scan.nextInt();
        if (n == 1) {
            start();
        } else if (n == 2) {
            System.out.println("Sorry to hear that :( \n Bye " + playerName + ".");
            System.exit(0);
        } else {
            death();
        }

    }

    public static void win() {
        System.out.println("\n    .-'\"'-.");
        System.out.println("   / #     \\");
        System.out.println("  : #       :  .-'\"'-.");
        System.out.println("   \\       /  / #     \\");
        System.out.println("    \\     /  : #       :");
        System.out.println("     `'q'`    \\       /");
        System.out.println("       (       \\     /");
        System.out.println("        )       `'p'`");
        System.out.println("       (          )");
        System.out.println("        )        (");
        System.out.println("                  )");
        System.out.println("\n[YOU WIN!] \n (1) play again \n (2) exit");
        int n = scan.nextInt();
        if (n == 1) {
            start();
        } else if (n == 2) {
            System.out.println("Sorry to hear that... :( \n Bye " + playerName + "!");
            System.exit(0);
        } else {
            win();
        }

    }
}
