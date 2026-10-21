package Programming6;

/*
 * Programming Assignment 6: Soccer team roster
 * @author shan shan zhong
 * @version 1.0
 */

import java.util.Scanner;

public class PlayerRoster {
    private int[] jerseyNumber;
    private int[] rating;

    public PlayerRoster() {
        jerseyNumber = new int[5];
        rating = new int[5];
    }

    public void setJerseyNumberRating(Scanner scnr) {
        int i;

        for (i = 0; i < jerseyNumber.length; ++i) {
            System.out.println("Enter player " + (i+1) + "'s jersey number:");
            jerseyNumber[i] = scnr.nextInt();
            System.out.println("Enter player " + (i+1) + "'s rating:");
            rating[i] = scnr.nextInt();
            System.out.println();
        }

        this.teamRosterPrint();
    }

    public void menuPrint() {
        System.out.println();
        System.out.println("MENU");
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");
        System.out.println();
        System.out.println("Choose an option:");
    }

    public void menuModify(Scanner scnr) {
        char userChar;

        this.menuPrint();
        userChar = scnr.next().charAt(0);
        while (userChar != 'q') {
            if (userChar == 'u') {
                ratingUpdate(scnr);
            }
            else if (userChar == 'a') {
                ratingAboveOutput(scnr);
            }
            else if (userChar == 'r') {
                playerReplace(scnr);
            }
            else if (userChar == 'o') {
                teamRosterPrint();
            }

            this.menuPrint();
            userChar = scnr.next().charAt(0);
        }
    }

    public void teamRosterPrint() {
        int i;

        System.out.println("ROSTER");
        for (i = 0; i < jerseyNumber.length; ++i) {
            System.out.println("Player " + (i+1) + " -- Jersey number: " + jerseyNumber[i] + ", Rating: " + rating[i]);
        }

    }

    public void ratingUpdate(Scanner scnr) {
        int updateJersey;
        int updateJerseyRating;
        int i;

        System.out.println("Enter a jersey number:");
        updateJersey = scnr.nextInt();
        System.out.println("Enter a new rating for player:");
        updateJerseyRating = scnr.nextInt();

        for (i = 0; i < jerseyNumber.length; ++i) {
            if (updateJersey == jerseyNumber[i]) {
                rating[i] = updateJerseyRating;
            }
        }
    }

    public void ratingAboveOutput(Scanner scnr) {
        int userAboveRating;
        int i;

        System.out.println("Enter a rating:");
        userAboveRating = scnr.nextInt();
        System.out.println();
        System.out.println("ABOVE " + userAboveRating);
        for (i = 0; i < rating.length; ++i) {
            if (rating[i] > userAboveRating) {
                System.out.println("Player " + (i+1) + " -- Jersey number: " + jerseyNumber[i] + ", Rating: " + rating[i]);
            }
        }
    }

    public void playerReplace(Scanner scnr) {
        int oldJerseyNumber;
        int newJerseyNumber;
        int newRating;
        int i;

        System.out.println("Enter a jersey number:");
        oldJerseyNumber = scnr.nextInt();

        for (i = 0; i < jerseyNumber.length; ++i) {
            if (jerseyNumber[i] == oldJerseyNumber) {
                System.out.println("Enter a new jersey number:");
                newJerseyNumber = scnr.nextInt();
                jerseyNumber[i] = newJerseyNumber;
                System.out.println("Enter a rating for the new player:");
                newRating = scnr.nextInt();
                rating[i] = newRating;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        PlayerRoster playerRoster = new PlayerRoster();
        playerRoster.setJerseyNumberRating(scnr);
        playerRoster.menuModify(scnr);
    }
}

