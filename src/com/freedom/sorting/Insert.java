package com.freedom.sorting;

public class Insert {

    public static void main(String args[]) {

        Integer[] numbers = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        for (int i = 1; i < numbers.length; i++) {

            // 'extract' the element
            Integer extract = numbers[i];

            int position = -1;

            for (int j = i - 1; j >= 0; j--) {
                if (numbers[j] > extract) {
                    // move sorted element to the right by 1
                    numbers[j + 1] = numbers[j];
                    position = j;
                }
            }

            // insert extracted element
            if (position != -1) {
                numbers[position] = extract;
            }

        }

        print(numbers);

    }

    private static void print(Integer[] Numbers) {
        Utilities.printArray(Numbers);
    }

}
