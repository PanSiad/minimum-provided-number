import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MinimumNumber {

    private static List<Integer> input = new ArrayList<>();

    public static void main(String[] args) {

        getInput();
        System.out.println(findMinimumNumber());
    }

    private static void getInput() {

        Scanner scanner = new Scanner(System.in);
        String s = askForInput(scanner);

        //keep asking for input while given input != n
        while (!s.equals("n")) {

            try {
                input.add(Integer.parseInt(s));
                s = s = askForInput(scanner);

            } catch (Exception e) {

                System.out.println("Following error detected: " + e);
                s = s = askForInput(scanner);
            }
        }
    }

    private static String askForInput(Scanner scanner) {
        System.out.println("Enter a number or 'n' to terminate program:");
        return scanner.nextLine();
    }

    private static String findMinimumNumber() {

        int minNumber = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i) < minNumber) {
                minNumber = input.get(i);
            }
        }
        return String.valueOf(minNumber);
    }

}
