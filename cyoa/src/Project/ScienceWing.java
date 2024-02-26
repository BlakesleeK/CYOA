package Project;

import java.util.Scanner;

public class ScienceWing {
    static Scanner scan = new Scanner(System.in);

    public static void firstChoice() {
        System.out.println("Running down the hallway, you quickly find yourself at a dead end." +
                " To the right is a chemistry classroom. There might be some chemicals you can use in there. " +
                "To the left, a biology classroom. You remember that the last biology class had done a dissection lab."
                +
                " Directly in front of you is a locker that you could hide in."
                + "\n Where do you go? \n (1) Chemistry classroom \n (2) Biology classroom \n (3) Locker");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("You quickly run into the classroom and lock the door behind you. " +
                    "Hopefully this will give you a few minutes to figure out how to escape.");
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

    private static Item rope = new Item("rope");
    // don't die when you go onto the tree
    private static Item shield = new Item("shield");
    // don't die when you throw the vials
    static Inventory chemClass = new Inventory(1);

    /*
     * TODO:
     * if you have the rope, you don't die on the tree. If you have the shield, you
     * don't die when you mix and then throw the vials.
     */

    public static void chemistryClass() {
        System.out.println(
                "Looking around the room, you notice two windows that may serve as possible escape routes. " +
                        "Outside the first window is a tree that you could climb onto, though getting down to the ground may be difficult. "
                        + "Outside the second window is a drop down two stories. Could you make that jump? "
                        + "In the corner of the room, you notice two vials of chemicals, though you can't identify them."
                        +
                        "Maybe if you got closer, you could figure out what to do with them..." +
                        "\n (1) go out the first window \n (2) go out the second window \n (3) inspect vials \n (4) search for something else");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("As you climb out the window, the beast breaks through the door to the classroom." +
                    "Fortunately, you're able to make it onto one of the branches. Unfortunately, the beast is also able to do that.");
            if (chemClass.isPresent(rope) == true) {
                System.out.println(
                        "Thankfully, you grabbed that rope earlier. You quickly tie one end to a branch and crawl down, making it safely to the ground."
                                + " The veast tries to follow you, but the rope snaps under its weight almost immediately. The beast crashes to the ground, unconscious, and you are able to get away.");
                chemClass.removeAll();
                TheGame.win();
            } else {
                System.out.println("With no way down, you are caught by the beast.");
                TheGame.death();
            }
        } else if (n == 2) {
            System.out.println(
                    "The answer was no, you could not make that jump. The beast doesn't even follow you. You hit concrete and die on impact.");
            TheGame.death();
        } else if (n == 3) {
            vials();
        } else if (n == 4) {
            System.out.println(
                    "You ignore all three options and instead search the room for a different item. You end up finding a rope and a shield — odd that they're in a chemistry class — but you can only hold one"
                            +
                            "\n (1) pick up rope \n (2) pick up shield");
            int f = scan.nextInt();
            if (f == 1) {
                chemClass.addItem(rope);
                System.out.println("You grab the rope. Now you're running out of time.");
                chemistryClass();
            } else if (f == 2) {
                chemClass.addItem(shield);
                System.out.println("You grab the shield. Now you're running out of time.");
                chemistryClass();
            } else {
                chemistryClass();
            }
        } else {
            System.out.println("Whoops, this isn't an option.");
            chemistryClass();
        }
    }

    public static void vials() {
        System.out.println(
                "You get closer to the vials. There are no labels, so you still have no idea what the chemicals do."
                        + " You decide you have two choices. You can either throw one of the vials at the creature and hope it does something, "
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
                    + "Panicked, you throw the vial at it. As the mixture collides with the beast, an explosion rocks the room.");
            if (chemClass.isPresent(shield) == true) {
                System.out.println(
                        "You see the beast fall to the ground, dead. You revel in your victory for a millisecond before a piece of glass flies at you. "
                                +
                                "It's fortunate that you grabbed that shield. You raise it just in time for the glass to bounce off it, saving your life.");
                chemClass.removeAll();
                TheGame.win();
            } else {
                System.out.println(
                        "You see the beast fall to the ground, dead. You revel in your victory for a millisecond before a piece of glass flies at you, "
                                + "spearing you through the heart.");
                heroEnding();
            }

        } else {
            vials();
        }
    }

    public static void heroEnding() {
        System.out.println(
                "\nThe following day, word spreads quickly of your sacrifice. You are remembered as a hero of the town... "
                        +
                        "\n \n ...was it worth it?");
        System.out.println("\n [HERO ENDING] \n (1) play again \n (2) exit");
        int n = scan.nextInt();
        if (n == 1) {
            TheGame.start();
        } else if (n == 2) {
            System.out.println("Sorry to hear that :(");
            System.exit(0);
        } else {
            heroEnding();
        }
    }

    public static void biologyClass() {
        System.out.println("You turn rapidly into the biology classroom, locking the door behind you."
                + " Looking around you, you realize that there are still dissection materials sitting out. Maybe you could use those."
                + "\nDo you... \n (1) hide in a corner \n (2) collect supplies");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println(
                    "You duck behind a desk in the corner of the room. You can hear the beast howling, but the sound soon fades. "
                            + "Is the monster... gone? \nWith nothing to do but stay there, you fall asleep, hoping everything will be okay in the morning.");
            System.out.println("[??? Ending] \n (1) play again \n (2) exit");
            int x = scan.nextInt();
            if (x == 1) {
                TheGame.start();
            } else if (x == 2) {
                System.out.println("Sorry to hear that :(");
                System.exit(0);
            } else {
                biologyClass();
            }
        } else if (n == 2) {
            System.out.println(
                    "You study your surroundings. On one table you see a pair of dissection scissors and a scalpel. " +
                            "On the teachers desk, you see an apple. Finally, at each desk are two chairs. You could probably grab one. ");
            collectSupplies();
        } else {
            biologyClass();
        }
    }

    static Item scissors = new Item("scissors");
    static Item scalpel = new Item("scalpel");
    static Item apple = new Item("apple");
    static Item chair = new Item("chair");
    static Inventory bioLab = new Inventory(2);

    public static void collectSupplies() {

        // max of two!!
        // make it a choice to pick up a second item?
        System.out.println("What do you grab? \n (1) dissection scissors \n (2) scalpel \n (3) apple \n (4) chair");
        int n = scan.nextInt();
        if (n == 1) { // scissors
            bioLab.addItem(scissors);
            System.out.println("You pick up the scissors in one hand.");
            System.out.println("You still have a free hand. Pick a second item:");
            System.out.println(" (1) scalpel \n (2) apple \n (3) chair");
            int a = scan.nextInt();
            if (a == 1) {
                bioLab.addItem(scalpel);
                System.out.println("You pick up the scalpel in your other hand.");
                monsterEnters();
            } else if (a == 2) {
                bioLab.addItem(apple);
                System.out.println("You pick up the apple in your other hand.");
                monsterEnters();
            } else if (a == 3) {
                bioLab.addItem(chair);
                System.out.println("You pick up the chair in your other hand.");
                monsterEnters();
            } else {
                bioLab.removeAll();
                collectSupplies();
            }
        } else if (n == 2) { // scalpel
            bioLab.addItem(scalpel);
            System.out.println("You pick up the scalpel in one hand.");
            System.out.println("You still have a free hand. Pick a second item:");
            System.out.println(" (1) scissors \n (2) apple \n (3) chair");
            int a = scan.nextInt();
            if (a == 1) {
                bioLab.addItem(scissors);
                System.out.println("You pick up the scissors in your other hand.");
                monsterEnters();
            } else if (a == 2) {
                bioLab.addItem(apple);
                System.out.println("You pick up the apple in your other hand.");
                monsterEnters();
            } else if (a == 3) {
                bioLab.addItem(chair);
                System.out.println("You pick up the chair in your other hand.");
                monsterEnters();
            } else {
                bioLab.removeAll();
                collectSupplies();
            }
        } else if (n == 3) { // apple
            bioLab.addItem(apple);
            System.out.println("You pick up the apple in one hand.");
            System.out.println("You still have a free hand. Pick a second item:");
            System.out.println(" (1) scissors \n (2) scalpel \n (3) chair");
            int a = scan.nextInt();
            if (a == 1) {
                bioLab.addItem(scissors);
                System.out.println("You pick up the scissors in your other hand.");
                monsterEnters();
            } else if (a == 2) {
                bioLab.addItem(scalpel);
                System.out.println("You pick up the scalpel in your other hand.");
                monsterEnters();
            } else if (a == 3) {
                bioLab.addItem(chair);
                System.out.println("You pick up the chair in your other hand.");
                monsterEnters();
            } else {
                bioLab.removeAll();
                collectSupplies();
            }
        } else if (n == 4) { // chair
            bioLab.addItem(chair);
            System.out.println("You pick up the chair in one hand.");
            System.out.println("You still have a free hand. Pick a second item:");
            System.out.println(" (1) scissors \n (2) scalpel \n (3) apple");
            int a = scan.nextInt();
            if (a == 1) {
                bioLab.addItem(scissors);
                System.out.println("You pick up the scissors in your other hand.");
                monsterEnters();
            } else if (a == 2) {
                bioLab.addItem(scalpel);
                System.out.println("You pick up the scalpel in your other hand.");
                monsterEnters();
            } else if (a == 3) {
                bioLab.addItem(apple);
                System.out.println("You pick up the apple in your other hand.");
                monsterEnters();
            } else {
                bioLab.removeAll();
                collectSupplies();
            }
        } else {
            collectSupplies();
        }
    }

    public static void monsterEnters() {
        // runs if you choose to collect items (in bio class)
        System.out.println("\nAs soon as you pick up the second item, the beast barges in the room.");
        if (bioLab.isPresent(chair) == true) {
            System.out.println("You throw the chair at the beast, knocking him down.");
            if (bioLab.isPresent(apple) == true) {
                System.out
                        .println("You throw the apple too, but it has no effect. The beast gets back up and eats you.");
                bioLab.removeAll();
                TheGame.death();
            } else if (bioLab.isPresent(scissors) == true) {
                System.out.println(
                        "While the beast is knocked down, use stab it in the heart with the scissors, killing him.");
                bioLab.removeAll();
                TheGame.win();
            } else if (bioLab.isPresent(scalpel) == true) {
                System.out.println(
                        "While the beast is knocked down, use stab it in the heart with the scalpel, killing him.");
                bioLab.removeAll();
                TheGame.win();
            }

        } else {
            System.out.println(
                    "You charge the beast, sharp object in hand. Unfortunately, the beast is much bigger than you, with a longer reach."
                            + " It reaches a clawed hand out and strangles you.");
            bioLab.removeAll();
            TheGame.death();
        }
    }

}