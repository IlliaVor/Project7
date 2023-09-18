package Part2iterationSnapshots;

import java.util.Random;

public class Part2iterationSnapshots {
    public static void printArray(int[] arr) {
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

    public static void snapshots(int[] arr) {
        int a = arr.length;
        boolean swapped;

        System.out.println("Initial array:");
        printArray(arr);

        for (int i = 0; i < a - 1; i++) {
            swapped = false;
            System.out.println("\nOuter loop, iteration " + (i + 1) + ":");

            for (int j = 0; j < a - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
                    swapped = true;

                System.out.println("\nInner loop:");
                System.out.print("iteration " + (j + 1) + ": ");
                printArray(arr);

                if (swapped) {
                    System.out.print("iteration " + (j + 2) + ": ");
                    printArray(arr);
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void main(String[] args) {
        int[] myArray = randomArray(5);

        System.out.println("Bubble Sort Iteration Snapshots:");
        snapshots(myArray);

        System.out.println("\nSorted array:");
        printArray(myArray);
    }


}
