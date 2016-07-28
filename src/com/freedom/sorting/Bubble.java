package com.freedom.sorting;

public class Bubble {

    public static void main(String args[]) {

        Integer[] numbers = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int count = 0;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    // swap(leftElement, rightElement)
                    Integer temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                    count++;
                }
            }
        } while (swapped);

        print(numbers, count);

    }

    private static void print(Integer[] numbers, int count) {
        Utilities.printArray(numbers);
        System.out.println("Inversion Count: " + count);
    }

}
