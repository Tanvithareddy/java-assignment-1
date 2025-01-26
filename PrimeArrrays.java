import java.util.*;
public class PrimeArrays { 
    public static boolean isPrime(int n) {
        if (n <= 1) return false; 
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> primesWithoutDuplicates(ArrayList<Integer> originalList) {
        Set<Integer> set = new LinkedHashSet<>(originalList); 
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        System.err.println("List of prime numbers: " + primes);
        ArrayList<Integer> primesNoDuplicates = primesWithoutDuplicates(primes);
        System.err.println("List of primes without duplicates: " + primesNoDuplicates);
        scanner.close();
    }
}
