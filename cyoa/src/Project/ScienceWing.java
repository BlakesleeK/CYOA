package Project;

import java.util.Scanner;

public class ScienceWing {
    static Scanner scan = new Scanner(System.in);

    public static void firstChoice() {
        System.out.println("Running down the hallway, you quickly find yourself at a dead end." +
                " To the right is a chemistry classroom. There might be some chemicals you can use in there. " +
                "To the left, a biology classroom. You remember that the last biology class had done a dissection lab."
                +
                " There might be some useful materials still there. Directly in front of you is a locker that you could hide in."
                + "\n Where do you go? \n (1) Chemistry classroom \n (2) Biology classroom \n (3) Locker");
        int n = scan.nextInt();
        if (n == 1) {
            chemistryClass();
        } else if (n == 2) {
            biologyClass();
        } else if (n == 3) {
            locker();
        } else {
            System.out.println("Hey, this isn't an option!");
            firstChoice();
        }
    }

    public static void locker() {
        System.out.println(
                "The monster, who was right behind you, saw you enter the locker. It ripped the door off its hinges before "
                        +
                        "you could close it and grabbed you immediately. \n Why did you think that would work?");
        TheGame.death();
    }

    public static void chemistryClass() {
        System.out.println("You quickly run into the classroom and lock the door behind you. " +
                "Hopefully this will give you a few minutes to figure out how to escape. " +
                "Looking around the room, you notice two windows that may serve as possible escape routes. " +
                "Outside the first window is a tree that you could climb onto, though getting down to the ground may be difficult. "
                // maybe a cool thing would be if there was a rope somewhere in the room, and if
                // you grab the rope you can get down from the tree and escape. (this requires
                // an inventory!)
                + "Outside the second window is a drop down two stories. Could you make that jump? "
                + "In the corner of the room, you notice two vials of chemicals, though you can't identify them." +
                "\n Maybe if you got closer, you could figure out what to do with them..." +
                "\n (1) go out the first window \n (2) go out the second window \n (3) inspect vials");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("As you climb out the window, the beast breaks through the door to the classroom." +
                    "Fortunately, you're able to make it onto one of the branches. Unfortunately, the beast is also able to do that."
                    +
                    "With no way down, you are caught by the beast.");
            TheGame.death();
        } else if (n == 2) {
            System.out.println(
                    "The answer was no, you could not make that jump. The beast doesn't even follow you. You hit concrete and die on impact.");
            TheGame.death();
        } else if (n == 3) {
            vials();
        } else {
            System.out.println("Whoops, this isn't an option.");
            chemistryClass();
        }
    }

    public static void vials() {
        System.out.println(
                "You get closer to the vials. There are no labels, so you still have no idea what the chemicals do."
                        + "You decide you have two choices. You can either throw one of the vials at the creature and hope it does something, "
                        + "or you can mix the chemicals together and then throw it." +
                        "\n (1) throw without mixing \n (2) mix first");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("You pick up one of the vials just as the beast breaks down the door." +
                    " You whip around and, with all your strength, throw the vial at the beast." +
                    " You watch in horror as the beast's skin starts boiling. It's melting!" +
                    "\n The beast is eventually nothing but a pile of brown goo and broken glass. As you get closer, wanting to inspect the disgusting site,"
                    + "you realize that the floor around the beast has also melted. "
                    + "\n \"oh well,\" you think, \"this is someone else's problem\"");
            TheGame.win();
        } else if (n == 2) {
            System.out.println("As you pick up the vials and start to mix, the beast breaks down the door and growls. "
                    + "Panicked, you throw the vial at the beast. As the mixture collides with the beast, an explosion rocks the room."
                    + "You see the beast fall to the ground, dead. You revel in your victory for a millisecond before a piece of glass flys at you, "
                    + "spearing you through the heart.");
            heroEnding();

        } else {
            vials();
        }
    }

    public static void heroEnding() {
        System.out.println(
                "\nThe following day, word spreads quickly of your sacrifice. You are remembered as a hero of the town... "
                        +
                        "\n ...was it worth it?");
        System.out.println("[HERO ENDING] \n (1) play again \n (2) exit");
        int n = scan.nextInt();
        if (n == 1) {
            TheGame.main(null);
        } else if (n == 2) {
            System.out.println("Sorry to hear that :(");
            System.exit(0);
        } else {
            heroEnding();
        }
    }

    public static void biologyClass() {

    }

}