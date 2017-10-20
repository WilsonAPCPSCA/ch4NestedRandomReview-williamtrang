import java.util.Scanner;
public class coinFlip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program will simulate flipping a fair coin.");
        int x = 0;
        do {
            System.out.println("How many times would you like the coin to be flipped?");
            x = in.nextInt();
        } while (x <0);
        int t = 0;
        int h = 0;
        int y = 0;
        for (int i = 1; i<=x; i++) {
            y = (int)(Math.random() *2) +1;
            if (y%2 == 0) {
                System.out.print("T");
                t++;
            }
            else {
                System.out.print("H");
                h++;
            }
        }
        System.out.println();
        System.out.println("There were " + h + " heads and " + t + " tails.");
    }
}