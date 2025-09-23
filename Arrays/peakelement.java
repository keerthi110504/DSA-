public class peakelement {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Increasing part
                start = mid + 1;
            } else {
                // Decreasing part
                end = mid;
            }
        }
        return start; // or end (both are same here)
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        int peakIndex = peakIndexInMountainArray(arr);

        System.out.println("Peak index: " + peakIndex);
        System.out.println("Peak value: " + arr[peakIndex]);
    }
}
