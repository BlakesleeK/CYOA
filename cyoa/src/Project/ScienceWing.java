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
                + "\n Where do you go? \n 1. Chemistry classroom \n 2. Biology classroom \n 3. Locker");
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

    public static void chemistryClass() {
        System.out.println("You quickly run into the classroom and lock the door behind you. " +
                "Hopefully this will give you a few minutes to figure out how to escape. " +
                "Looking around the room, you notice two windows that may serve as possible escape routes. " +
                "Outside the first window is a tree that you could climb onto, though getting down to the ground may be difficult.");
    }

    public static void locker() {
        System.out.println(
                "The monster, who was right behind you, saw you enter the locker. It ripped the door off its hinges before "
                        +
                        "you could close it and grabbed you immediatly. \n Why did you think that would work?");
        TheGame.death();
    }

    public static void biologyClass() {

    }

}
