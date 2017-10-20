import  java.util.Scanner;
public class asteriskThing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = 0;
        do {
            System.out.println("Enter a positive integer");
            p = in.nextInt();
        } while (p < 0);
        int count = 1;
        int r = p;
        for  (int i = 1; i <=r; i++) {
            for (int j = 1; j < p; j++) {
                System.out.print(" ");
            }
            for (int w = 1; w <= count; w++) {
                System.out.print("*");
            }
            System.out.println();
            count+=2;
            p--;
        }
        p = 1;
        count-=4;
        for (int i = 1; i < r; i++) {
            for (int j = p; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int w = 1; w <= count; w++) {
                System.out.print("*");
            }
            System.out.println();
            p++;
            count-=2;
        }
    }
}