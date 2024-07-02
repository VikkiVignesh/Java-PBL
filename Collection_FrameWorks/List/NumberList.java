package Collection_FrameWorks.List;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Number> numberList = new ArrayList<>();
        String input;
        
        System.out.println("Enter numbers (type 'done' to finish):");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                // Try to parse the input as different types of numbers
                if (input.contains(".")) {
                    if (input.endsWith("f") || input.endsWith("F")) {
                        numberList.add(Float.parseFloat(input));
                    } else {
                        numberList.add(Double.parseDouble(input));
                    }
                } else {
                    if (input.endsWith("l") || input.endsWith("L")) {
                        numberList.add(Long.parseLong(input));
                    } else {
                        numberList.add(Integer.parseInt(input));
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please try again.");
            }
        }

        System.out.println("You entered the following numbers:");
        for (Number num : numberList) {
            System.out.println(num);
        }

        scanner.close();
    }
}
