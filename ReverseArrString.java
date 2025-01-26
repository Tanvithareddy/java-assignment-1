import java.util.*;

public class ReverseArrString{
    public static void ReverseArr(String[] arr) {
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        
        String[] arr = new String[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        } 
        System.out.println("Original Array: " + Arrays.toString(arr));
        ReverseArr(arr);
        
        
        System.out.println("Reversed Array: " + Arrays.toString(arr));
        
        scanner.close();
    }
}
