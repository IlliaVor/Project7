package Part1bubbleSort;

import java.util.Scanner;
import java.util.Random;

public class Part1bubbleSort {
    public static void inputElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static int[] randomArray(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100);

        }
        return arr;
    }

    public static int[] userInput(int len) {
        int[] arr = new int[len];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        int a = arr.length;
        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);


            }
        }
    }

    public static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number of elements: ");
            int numOfElements = in.nextInt();

            System.out.print("Generate random values 'R' or input values 'I'? ");
            String letter = in.next();

            int[] myArray;

            if (letter.equalsIgnoreCase("R")) {
                myArray = randomArray(numOfElements);
            } else if (letter.equalsIgnoreCase("I")) {
                myArray = userInput(numOfElements);
            } else {
                System.out.println("Please, enter 'R' or 'I'.");
                continue;
            }

            System.out.println("Original array: ");
            inputElements(myArray);

            bubbleSort(myArray);

            System.out.println("Sorted array: ");
            inputElements(myArray);

            System.out.print("Do you want to repeat? 'Y' or 'N': ");
            String repeat = in.next();

            if (!repeat.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

}
