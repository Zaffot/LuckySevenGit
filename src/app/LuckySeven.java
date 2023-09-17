package app;
import java.util.Scanner;
import java.util.Random;
public class LuckySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		

        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = r.nextInt(10) + 1;
            System.out.print(numbers[i] + " ");
        }

        System.out.println(); // Print a newline after the numbers.

        boolean foundSeven = false;
        for (int i = 0; i < 3; i++) {
            if (numbers[i] == 7) {
                foundSeven = true;
                break;
            }
        }

        if (foundSeven) {
            System.out.println("Winner!");
        } else {
            System.out.println("You lost!");
        }
    }
}