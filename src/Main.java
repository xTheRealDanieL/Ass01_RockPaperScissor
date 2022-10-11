import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playerA = ""; /// must be R, P or S
        String playerB = ""; /// must be R, P or S
        String trash = "";
        String character = "";
        boolean game_on = true;
        boolean chooseA = true;
        boolean chooseB = true;

        while (game_on) {
            while (chooseA) {
                System.out.print("Player A please enter your move R/P/S: ");
                if (in.hasNextLine()) {
                    playerA = in.nextLine();
                    if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                        break;
                    } else {
                        trash = in.nextLine();
                        System.out.println(trash + " is not a valid move");
                    }
                }
            }

            while (chooseB) {
                System.out.print("Player B please enter your move R/P/S: ");
                if (in.hasNextLine()) {
                    playerB = in.nextLine();
                    if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                        break;
                    } else {
                        trash = in.nextLine();
                        System.out.println(trash + " is not a valid move");
                    }
                }
            }

            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock. It's a TIE!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                } else {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a valid input");
                }
            }
            else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. PlayerA wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper. It's a TIE!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cut Paper. Player B wins!");
                } else {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a valid input");
                }
            }
            else if (playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut Paper. Player A wins!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors. It's a TIE!");
                } else {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a valid input");
                }
            }

            System.out.println("Do you want to play again Y/N: ");
            character = in.nextLine();

            if(character.equalsIgnoreCase("n"))
            {
                break;
            }
        }
    }
}