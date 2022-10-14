package _java.rockpaperscissorgame;

import java.util.Random;
import java.util.Scanner;

public class _JavaRockPaperScissorGame {
    public static void main(String[] args) {
        int wins = 0;
        int bot_wins = 0;
        String hand;
        int random_number;
        Scanner _scan = new Scanner(System.in);
        Random _rand = new Random();
        System.out.println("Hi User, let's play rock, paper, scissor" + "\n" + "Best of 3 Games, I hope you can beat me" + "\n" + "Select your hand");
        while (wins != 3 && bot_wins != 3) {
            System.out.println("[R]Rock [P]Paper [S]Scissor (Letter Only)");
            System.out.println("Your Score: " + wins + " BOT Score: " + bot_wins);
            hand = _scan.nextLine();
            random_number = _rand.nextInt(2);
            if (random_number == 0) {
                if (hand.equals("P") == true) {
                    wins = wins + 1;
                    System.out.println("BOT use Rock, You Win" + "\n" + "---");
                } else if (hand.equals("S") == true) {
                    bot_wins = bot_wins + 1;
                    System.out.println("BOT use Rock, You Lose" + "\n" + "---");
                } else if (hand.equals("R") == true) {
                    System.out.println("BOT use Rock" + "\n" + "---");
                }
            } else if (random_number == 1) {
                if (hand.equals("S") == true) {
                    wins = wins + 1;
                    System.out.println("BOT use Paper, You Win" + "\n" + "---");
                } else if (hand.equals("R") == true) {
                    bot_wins = bot_wins + 1;
                    System.out.println("BOT use Paper, You Lose" + "\n" + "---");
                } else if (hand.equals("P") == true) {
                    System.out.println("BOT use Paper" + "\n" + "---");
                }
            } else if (random_number == 2) {
                if (hand.equals("R") == true) {
                    wins = wins + 1;
                    System.out.println("BOT use Scissor, You Win" + "\n" + "---");
                } else if (hand.equals("P") == true) {
                    bot_wins = bot_wins + 1;
                    System.out.println("BOT use Scissor, You Lose" + "\n" + "---");
                } else if (hand.equals("S") == true) {
                    System.out.println("BOT use Scissor" + "\n" + "---");
                }
            }
        }
        System.out.println("Your Score: " + wins + " BOT Score: " + bot_wins);
        System.out.print("Press any key to exit...");
        _scan.nextLine();
    }
}
