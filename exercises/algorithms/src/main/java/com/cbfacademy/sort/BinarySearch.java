package com.cbfacademy.sort;

public class BinarySearch {
    // Binary search function
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        // Continue searching until low and high pointers meet
        while (low <= high) {
            int mid = (low + high) / 2;

            // If the element is found at the middle position
            if (arr[mid] == x) {
                return mid;
            }
            // If the element is on the right side
            else if (x > arr[mid]) {
                low = mid + 1;
            }
            // If the element is on the left side
            else {
                high = mid - 1;
            }
        }

        // Element not found
        return -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example array (sorted)
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Element to be found
        int elementToFind = 7;

        // Perform binary search
        int result = binarySearch(arr, elementToFind);

        // Display the result
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
