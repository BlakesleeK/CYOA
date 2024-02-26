package Project;

import java.util.Scanner;

public class ArtWing {
    static Scanner scan = new Scanner(System.in);

    static Item key = new Item("key");
    static Inventory artHall = new Inventory(2);

    public static void firstChoice() {
        System.out.println("You turn to the right and run down the arts hallway. Out of the corner of your eye, you see a shiny copper key on the floor. Do you...\n (1) Waste time and pick it up \n (2) Keep running");
        int n = scan.nextInt();
        if (n == 1) {
            artHall.addItem(key);
            System.out.println("Holding the key in your left hand, you continue to run.\n");
            System.out.println("Stopping to catch your breath, you realize that one of the classrooms’ doors is ajar. Do you…\n"
                        + //
                        "(1) Hide in the classroom\n" + //
                        "(2) Keep running\n" + //
                        "");
            int r = scan.nextInt();
            if (r == 1) {
                classroom();
            } else if (r == 2) {
                hallway();
            } else {
                System.out.println("Hey, this isn't an option!");
                firstChoice();
            }
        } else if (n == 2) {
            System.out.println("Stopping to catch your breath, you realize that one of the classrooms’ doors is ajar. Do you…\n"
                        + //
                        "(1) Hide in the classroom\n" + //
                        "(2) Keep running\n" + //
                        "");
            int r = scan.nextInt();
            if (r == 1) {
                classroom();
            } else if (r == 2) {
                hallway();
            } else {
                System.out.println("Hey, this isn't an option!");
                firstChoice();
            }
        } else {
            System.out.println("Hey, this isn't an option!");
            firstChoice();
        }
        
    }

    public static void classroom() {
        if (artHall.isPresent(key)){
            System.out.println(
                    "You try to open the door, but its locked. You try the key you found on the floor, and suprisingly it works! You quickly go into the room and lock the door behind you. You’re safe for now, but the creature's distant howls remind you time is running out. Should you…\n"
                            +
                            "(1) Crouch behind the teacher’s desk\n" +
                            "(2) Escape out the window\n" +
                            "(3) Find a weapon");
            int n = scan.nextInt();
            if (n == 1) {
                System.out.println(
                        "You nervously squat under the desk, straining to hear the monster or your deranged science teacher. But it's quiet. Too quiet, you think.\n"
                                +
                                "Then the door breaks open with a loud SLAM, and the creature pounces on you before you even have time to react. \n\n");
                TheGame.death();
            } else if (n == 2) {
                System.out.println(
                        "You run over to the window and look down. You’re only on the second floor. Maybe I could jump, you think. You decide to give it a shot, and start unlocking the window.\n"
                                +
                                "But the lock is hard to open, and as you struggle with it the science teacher and his pet monster pick the lock on the classroom door. You look over in terror at your teacher, who is holding back a creature ravenous for your flesh. \n"
                                +
                                "“It’s truly a pity,” he says sympathetically, “you were one of the good ones.” Then he lets the monster loose.\n\n");
                TheGame.death();
            } else if (n == 3) {
                System.out.println("You run over to the large art cabinet and open it.");
                collectSupplies();
            } else {
                System.out.println("Whoops, this isn't an option.");
                classroom();
            }  
        }
        else{
            System.out.println("You try to open the door, but its locked and you don't have the key. Do you...\n (1) Go back and try to find the key\n (2) Keep running down the hallway");
            int h = scan.nextInt();
            if (h == 1) {
                goBackForKey();
            } else if (h == 2) {
                hallway();
            } else {
                System.out.println("Hey, this isn't an option!");
                classroom();
            }
        }
    }

    public static void hallway() {
        System.out.println(
                "You reach the end of the hallway. \"Now I have to figure out how to get out of here,\" you think. Do you…\n"
                        +
                        "(1) Take the elevator downstairs\n" +
                        "(2) Take the stairs\n" +
                        "(3) Stay and fight the monster");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println(
                    "You quickly push the elevator button, nervously glancing back at the creature racing down the hallway towards you. Thankfully it arrives quickly, and you hurriedly get inside and click the GROUND FLOOR button. \n"
                            +
                            "\"Please close please close please close,\" you pray as the footsteps get louder. The elevator doors close just as the monster reaches you, and you breathe a sigh of relief as you coast downstairs. You escape the school unharmed and run all the way home.\n");
            TheGame.win();
        } else if (n == 2) {
            System.out.println(
                    "You race down the stairs, jumping two at a time. But you still aren’t faster than the beast chasing you. In 5 swift seconds, it catches up to you, tackles you to the ground, and tears you up.\n");
            TheGame.death();
        } else if (n == 3) {
            System.out.println("First you need a weapon. You open the nearest locker and look inside.");
            collectSupplies();
        } else {
            System.out.println("Whoops, this isn't an option.");
            hallway();
        }
    }

    public static void goBackForKey() {
        System.out.println("You frantically dash back to the spot where you saw the key. But when you get there, the key is nowhere in sight. You fall to your knees, desperately searching the floor. 'Looking for something?' a gravelly voice calls.\n"+
        "You look up to see your evil science teacher, smirking, holding the missing key! Do you... \n (1) Steal it back from him \n (2) Confront him");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("You slowly rise to your feet, never breaking eye contact with your teacher. 'I believe that you have something that I need,' you state assertively. In one swift motion, you karate-kick the old man and he falls to the floor. \n" +
            "As you stand over his dead body triumpantly, you fail to notice the 3 eyed monster creeping up behind you. It launches towards you, taking your head off in one swift bite.");
            TheGame.death();
        }
        else if (n == 2) {
            System.out.println("'Mr. Jones, what is that thing?' you ask your teacher timidly. He laughs and replies, 'That thing is my pride and joy. She is the smartest, fastest, and strongest monster ever created. But more importantly, she is my baby.'\n" +
            "Tears pool in his eyes as he softly says, 'I can't imagine a life without her.' \n You smile softly, moved by his devotion the monster. However your grin fades when he adds, 'That's why you have to die. I can't risk anyone else finding out, and taking my darling away. \n" +
            "Then he throws a rock at your head, killing you instantly.");
            TheGame.death();
        }
        else {
            System.out.println("Whoops, this isn't an option.");
            goBackForKey();
        }
    }

    static Item thumbtacks = new Item("tacks");
    static Item coloredPencil = new Item("colored pencil");
    static Item scissors = new Item("scissors");
    static Item paintTub = new Item("paint tub");
    
    public static void collectSupplies() {
        System.out.println(
                "You find 4 items. Which one do you grab? \n (1) a box of thumbtacks \n (2) a colored pencil \n (3) scissors \n (4) paint tub \n");
        int n = scan.nextInt();
        if (n == 1) {
            artHall.addItem(thumbtacks);
            System.out.println(
                    "You pick up the box and take off the lid. As the monster approaches, you stand against the wall. It roars loudly and you cower in fear. Just before it pounces, you throw the thumbtacks at its face. \n"
                            +
                            "In a mere stroke of luck, one of the tacks impales the creature's eye, and it crashes to the floor, dead.");
            TheGame.win();
        } else if (n == 2) {
            artHall.addItem(coloredPencil);
            System.out.println(
                    "You pick up the colored pencil and grasp it firmly. As the monster approaches, you bravely hurl the projectile at it. It hits the creature's back and bounces off its thick hide. \n"
                            +
                            "Your eyes widen as you realize that it is unharmed. In fact, it is only antagonized by the pencil, and it roars, aggressively charging towards you. Your last thoughts are, 'Why did I think a colored pencil would do anything?'");
            TheGame.death();
        } else if (n == 3) {
            artHall.addItem(scissors);
            System.out.println(
                    "You pick up the scissors and grasp them firmly. As the monster approaches, you bravely hurl the projectile at it. The scissors hit the creature's back and bounce off its thick hide. \n"
                            +
                            "Your eyes widen as you realize that it is unharmed. In fact, it is only antagonized by the scissors, and it roars, aggressively charging towards you. Your last thoughts are, 'How did I think scissors would do anything against that THING?'");
            TheGame.death();
        } else if (n == 4) {
            artHall.addItem(paintTub);
            System.out.println(
                    "You pick up the paint tub and take off the lid. As the monster approaches, you stand against the wall. It roars loudly and you cower in fear. Just before it pounces, you throw the paint at its face. \n"
                            +
                            "It hits the creature straight in the face, going into its mouth and eyes. While it is temporarily blinded, you are able to run past it and escape.");
            TheGame.win();
        } else {
            collectSupplies();
        }
    }

}
