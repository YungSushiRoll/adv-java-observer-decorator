package decorator.adventuregame;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws InterruptedException {

        Scanner keyboard = new Scanner(System.in);
        GameCharacter bilby = new BasicCharacter("Bilby Braggins");
        boolean isStarving = false;

        System.out.println("*Faint sounds of fighting and weapons clashing*\n" +
                "You slowly open your eyes...*blink* *blink*");
        Thread.sleep(3000);
        System.out.println("*Queue inner monologue*\n" +
                "YOU WERE KNOCKED OUT AND MISSED THE WHOLE BATTLE?!\n" +
                "And you call yourself an Adventurer.. ");
        Thread.sleep(3000);
        System.out.println("Do you even remember your own name?");
        Thread.sleep(3000);
        System.out.println("Oh, you do?\nThen what is it?");
        keyboard.nextLine();
        System.out.println("Are you sure it's Bibly?\nY / N?");
        keyboard.nextLine();
        System.out.println("Wonderful! I\'m glad you're back " + bilby.getName() + "!\n" +
                "Your current might is " + bilby.getMight());
        Thread.sleep(3000);
        System.out.println("You look down to find your trusty elvish blade \"Stung\" next to you!\n");
        bilby = new Sword(bilby);
        System.out.println("** Might increase! **\n\n" +
                bilby.getName() + "\nMight: " + bilby.getMight() + "\n");
        Thread.sleep(3000);
        System.out.println("You dust yourself off, get up off the cold stone ground as you hear a soft\n" +
                "whisper coming from your right vest pocket");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        String choice;
        System.out.println("Do you..\n" +
                "1) Peak in your pocket?\n" +
                "2) Ignore it, and run down the nearest set of stairs?");
        choice = keyboard.nextLine();
        switch (Integer.parseInt(choice))
        {
            case 1:
                System.out.println("With one eye closed you peak into your pocket and stare\n" +
                        "at the brilliant golden ring nestled deep in your vest pocket. You thought you\n" +
                        "dropped it before the battle even started but it was there... the whole time...\n" +
                        "calling to you..."
                );
                Thread.sleep(3500);
                bilby = new Ring(bilby);
                System.out.println("\n** You found the Ring to rule Most! **\n\n" +
                        "** Might increase! **\n" +
                        bilby.getName() + "\nMight: " + bilby.getMight() + "\n"
                );
                Thread.sleep(3000);
                System.out.println("As you stand there gazing at its...PRECIOUS...exterior the\n" +
                        "whispers grow louder drawing you in more and more...\"wEaR mEeEeEeE\"\n\n" +
                        "What do you do?\n1) Put the ring on?\n" +
                        "2) Keep it and forget about it for a really long time...\n\n" +
                        "until you give it to a kid that succumbs to its whispers and goes\n" +
                        "on his own journey to destroy it..."
                );
                Thread.sleep(3000);
                String choice2 = keyboard.nextLine();
                    switch (Integer.parseInt(choice2)) {
                        case 1:
                            bilby = new Unseen(bilby);
                            Thread.sleep(3000);
                            System.out.println("*SwoooOOOooOosh*\n" +
                                    "You look around you, nothing is as it seems anymore! You've been transported\n" +
                                    "to another plane!\n\n** You've become UNSEEN **\n\n** Might unaffected! **\n" +
                                    bilby.getName() + "\n" + bilby.getMight() + "\n");
                            bilby = new Starving(bilby);
                            Thread.sleep(3000);
                            System.out.println("Completely freaked out, you rip the ring off your finger and\n" +
                                    "shove it back in your pocket! You look around and things start to seem hazy\n" +
                                    "and you feel very light headed. The ring and your short time in the Wraith World\n" +
                                    "drained you of any lasting energy.\n\n" +
                                    "** You've passed out from HUNGER **\n\n" +
                                    bilby.getName() + "\n" +
                                    "Might: 0\n\n" +
                                    "Night Night " + bilby.getName() + ".\nSee you in the next Adventure!!"
                            );
                            break;
                        case 2:
                            System.out.println("The whispers don\'t phase you... you brush them\n" +
                                    "off like the crumbs of Pemdas Bread. You rush to find your Dwarf allies\n" +
                                    "and your giant wizard friend \"Gandarf The Great\" and do as your\n" +
                                    "choice suggests. You all celebrate your victory against the evil White Orc\n" +
                                    "and make go your separate ways."
                            );
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            bilby = new Starving(bilby);
                            System.out.println("*rumble* *rumble*\n\n" +
                                    "You groan...you're SO close to Hobbit Town but you are clean out\n" +
                                    "of Pemdas Bread...\n\n" +
                                    "** You're become HUNGRY! **\n\n" +
                                    "** Might decreased! **\n" +
                                    bilby.getName() + "\n" + bilby.getMight() + "\n\n"
                            );
                            Thread.sleep(2000);
                            System.out.println("You slowly drudge that last few miles back to your lovely\n" +
                                    "comfy hobbit-hole where you can fill your belly with warm soup \n" +
                                    "and Pemdas Bread... and maybe... write a story of your adventure..."
                            );
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.print(".");
                            Thread.sleep(1000);
                            System.out.println("\nAdventure");
                            Thread.sleep(2000);
                            System.out.println("Over");
                            Thread.sleep(2000);
                            System.out.println("Thank you!");
                            break;
                        default:
                            break;
                    }
                break;
            case 2:
                System.out.println("Ignoring the whispers you look left, you look right and spot\n" +
                        "the nearest set of stairs and make a break for them! BUT, right before\n" +
                        "the last step you trip and tumble down a corridor and something falls\n" +
                        "out of your pocket...\n\n"
                );
                Thread.sleep(3000);
                System.out.println("A beautiful ring you see... so beautiful you may even call\n" +
                        "it...PRECIOUS... it's staring back at you... it really feels\n" +
                        "like it's staring at you...\n\n" +
                        "What do you do?\n" +
                        "1) Pick it up and put it on?\n" +
                        "2) Put it back in your pocket and\n" +
                        "grab the shield you see laying in corner?\n\n"
                );
                String anotherChoice = keyboard.nextLine();
                switch (Integer.parseInt(anotherChoice)) {
                    case 1:
                        bilby = new Unseen(bilby);
                        Thread.sleep(3000);
                        System.out.println("*SwoooOOOooOosh*\n" +
                                "You look around you, nothing is as it seems anymore! You've been transported\n" +
                                "to another plane!\n\n** You've become UNSEEN **\n\n** Might unaffected! **\n" +
                                bilby.getName() + "\n" + bilby.getMight() + "\n");
                        bilby = new Starving(bilby);
                        Thread.sleep(3000);
                        System.out.println("Completely freaked out, you rip the ring off your finger and\n" +
                                "shove it back in your pocket! You look around and things start to seem hazy\n" +
                                "and you feel very light headed. The ring and your short time in the Wraith World\n" +
                                "drained you of any lasting energy.\n\n" +
                                "** You've passed out from HUNGER **\n\n" +
                                bilby.getName() + "\n" +
                                "Might: 0\n\n" +
                                "Night Night " + bilby.getName() + ".\nSee you in the next Adventure!!"
                        );
                        break;
                    case 2:
                        bilby = new Shield(bilby);
                        Thread.sleep(3000);
                        System.out.println("\n** You found the Oakenshield! **\n\n" +
                                "** Might increase! **\n" +
                                bilby.getName() + "\nMight: " + bilby.getMight() + "\n"
                        );
                        Thread.sleep(3000);
                        System.out.println("You gather yourself and run to find the rest of your company!");
                        Thread.sleep(3000);
                        System.out.println("They did it! WE did it! (Well... not you cause you were\n" +
                                "knocked out for most of it...) The White Orc has been slain! You all walk\n" +
                                "back to the Drawf stronghold to celebrate! PEMDAS BREAD FOR EVERYONE!\n\n"
                        );
                        Thread.sleep(2000);
                        System.out.println("As everyone feasts you reflect on the adventure that you DO\n" +
                                "remember and smile to yourself thinking of how boring it would've been sitting\n" +
                                "in your Hobbit-hole sipping your tea and reading your books...but now\n" +
                                "YOU have a story to tell... your thoughts drown out with the noise and clatter\n" +
                                "of Dwarvish banter as Gandarf gives you a wizard smile.."
                        );
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.print(".");
                        Thread.sleep(1000);
                        System.out.println("\n\nAdventure");
                        Thread.sleep(2000);
                        System.out.println("Over");
                        Thread.sleep(2000);
                        System.out.println("Thank you!");
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }
}
