import java.util.Scanner;

public class aBerage {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first digit: ");
        a = scan.nextInt();
        System.out.println("Input second digit: ");
        b = scan.nextInt();
        int count = 0;
        int total = 0;
        while ( count < 1 ) {
            total = a + b;
            count++;
        }
        System.out.println("The average of the two digits is: " + total/2.0);
    }

}
