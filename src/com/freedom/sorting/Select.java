package com.freedom.sorting;

public class Select {

    public static void main(String args[]) {

        Integer[] numbers = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        for (int i = 0; i < numbers.length - 1; i++) {

            // set the first unsorted element as the minimum
            Integer currentMinimum = numbers[i];

            int position = -1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentMinimum > numbers[j]) {
                    // set element as new minimum
                    currentMinimum = numbers[j];
                    position = j;
                }
            }

            if (position != -1) {
                // swap minimum with first unsorted position
                numbers[position] = numbers[i];
                numbers[i] = currentMinimum;
            }

        }

        print(numbers);

    }

    private static void print(Integer[] numbers) {
        Utilities.printArray(numbers);
    }

}
