public class TheGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the game! What is your name? ");
        String name = input;

        System.out.println("You are in school after hours, it's just you or so you thought.\n" +
        "As you are leaving the building you notice one classroom light still on.\n" +
        "You peer in through the window and you see your science teacher bottle-feeding a huge monster!!\n" +
        "Terrified, you are frozen in place. You watch with wide eyes as the beast sees you,\n" +
        "and growls, notifying his master of your presence. The science teacher turns to you, smiles, and says, \n" +
        name + " come here and check this out! I have to get away from him! You think. \n" +
        "You are standing in the middle of the hallway. Do you... \n" +
        "Go to the science wing (1) or go to the arts department (2)");
        if ([user input] == "1") {
            scienceWing();
        }
        else if (user input == "2") {
            artsWing();
        }
        else{
            System.out.println("Not an option");
        }
        
    }

    public void scienceWing() {

    }

    public void artsWing(){
        System.out.println("You turn to the right and run down the arts hallway. Stopping to catch your breath, you realize that one of the classrooms’ doors is ajar. Do you…\n" + //
                "(1) Hide in the classroom\n" + //
                "(2) Keep running\n" + //
                "");
        if (user input == "1"){
            System.out.println("You quickly go into the room and lock the door behind you. You’re safe for now, but the creatures distant hallows remind you time is running out. Should you…\n" +
            "(1) Crouch behind the teacher’s desk\n"+
            "(2) Escape out the window\n");
            if (user input == "1") {
                System.out.println("You nervously squat under the desk, straining to hear the monster or your deranged science teacher. But it's quiet. Too quiet, you think.\n" +
                "Then the door breaks open with a loud SLAM, and the creature pounces on you before you even have time to react. \n\n" +
                "*GAME OVER*");
            }
            else if (user input == "2") {
                System.out.println("You run over to the window and look down. You’re only on the second floor. Maybe I could jump, you think. You decide to give it a shot, and start unlocking the window.\n" +
                "But the lock is hard to open, and as you struggle with it the science teacher and his pet monster pick the lock on the classroom door. You look over in terror at your teacher, who is holding back a creature ravenous for your flesh. \n"+
                "“It’s truly a pity,” he says sympathetically, “you were one of the good ones.” Then he lets the monster loose.\n\n" +
                "*GAME OVER*");
            }
            else {
                System.out.println("Not an option");
            }
        }
        
        else if (user input == "2"){
            System.out.println("You reach the end of the hallway. Now I have to figure out how to get out of here, you think. Do you…\n"+
            "(1) Take the elevator downstairs\n"+
            "(2) Take the stairs\n");
            if (user input == "1") {
                System.out.println("You quickly push the elevator button, nervously glancing back at the creature racing down the hallway towards you. Thankfully it arrives quickly, and you hurriedly get inside and click the GROUND FLOOR button. \n"+
                "Please close please close please close, you pray as the footsteps get louder. The elevator doors close just as the monster reaches you, and you breathe a sigh of relief as you coast downstairs. You escape the school unharmed and run all the way home.\n\n" +
                "*YOU WIN*");
            }
            else if (user input == "2") {
                System.out.println("You race down the stairs, jumping two at a time. But you still aren’t faster than the beast chasing you. In 5 swift seconds, it catches up to you, tackles you to the ground, and tears you up.\n\n" +
               "*GAME OVER* ");
            }
            else {
                System.out.println("Not an option");
            }
        }

        else{
            System.out.println("Not an option");
        }
    }
}
