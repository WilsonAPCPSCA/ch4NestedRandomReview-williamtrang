import java.util.Scanner;
public class diceRoll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0; int z = 0; int x = 0; int y = 0;
        int two = 0; int three = 0; int four = 0; int five = 0; int six = 0; int seven = 0; 
        int eight = 0; int nine = 0; int ten = 0; int eleven = 0; int twelve = 0;
        System.out.println("This program will simulate tossing a pair of dice.");
        do  {
            System.out.print("How many times would you like the dice to be tossed?");
            z = in.nextInt();
        } while (z < 0);
        System.out.println("Here is the sequence of  sums, one for each toss:");
        for (int i =1; i <=z; i++) {
            x = (int)(Math.random()*6)+1;
            y = (int)(Math.random()*6)+1;
            a = x+y;
            if (a == 2) {
                System.out.print("2" + " ");
                two++;
            }
            if (a == 3) {
                System.out.print("3" + " ");
                three++;
            }
            if (a == 4) {
                System.out.print("4" + " ");
                four++;
            }
            if (a == 5) {
                System.out.print("5" + " ");
                five++;
            }
            if (a == 6) {
                System.out.print("6" + " ");
                six++;
            }
            if (a == 7) {
                System.out.print("7" + " ");
                seven++;
            }
            if (a == 8) {
                System.out.print("8" + " ");
                eight++;
            }
            if (a == 9) {
                System.out.print("9" + " ");
                nine++;
            }
            if (a == 10) {
                System.out.print("10" + " ");
                ten++;
            }
            if (a == 11) {
                System.out.print("11" + " ");
                eleven++;
            }
            if (a == 12) {
                System.out.print("12" + " ");
                twelve++;
            }
        }
        System.out.println(); r(2,two); r(3, three); r(4, four); r(5,five); r(6,six);
        r(7,seven); r(8,eight); r(9,nine); r(10, ten); r(11,eleven); r(12,twelve);
    }
    public static void r (int x, int y) {
        System.out.print(x + ":");
        for (int i = 1; i<=y;i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}