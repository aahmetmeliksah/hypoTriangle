import java.util.Scanner;
import java.lang.Math;

public class pisagorTheorem {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first side of right triangle: ");
        a = input.nextInt();

        System.out.println("Enter second side of right triangle: ");
        b = input.nextInt();

        c = Math.sqrt((a * a ) + (b * b));
        System.out.println("Hypo " + c);
    }
}
