package arrays;

public class DeleteElement {

    // Returns the NEW valid size of the array
    public static int delete(int[] arr, int currentSize, int deletePosition) {
        // Edge Case: Check for invalid positions to prevent crashes
        if (deletePosition < 0 || deletePosition >= currentSize) {
            System.out.println("Invalid position!");
            return currentSize;
        }

        // Shift elements to the left (In-place)
        for (int i = deletePosition; i < currentSize - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Element deleted successfully............");

        // Return the updated logical size
        return currentSize - 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 8};
        int currentSize = arr.length;

        // Delete element at index 5 and get the new logical size
        currentSize = delete(arr, currentSize, 5);

        // Most efficient way to print: only print up to the valid logical size
        System.out.print("[");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arr[i] + (i < currentSize - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
