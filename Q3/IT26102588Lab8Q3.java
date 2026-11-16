import java.util.Scanner;

public class IT26102588Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = input.nextInt();

            if (num > 0) {
                numbers[count] = num;
                count++;
            } else {
                System.out.println("Error! Please Enter ONLY Positive Numbers");
            }
        }

        int max = numbers[0];

        for (int i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nArray Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}