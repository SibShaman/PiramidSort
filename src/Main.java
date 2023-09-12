public class Main {

    public static void main(String[] args) {

         int[] arr = {12, 11, 13, 5, 6, 7};
         int n = arr.length;

         HeapSort ob = new HeapSort();
         ob.sort(arr);

         System.out.println("Sorted array is");
         printArray(arr);
    }
    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}