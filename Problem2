import java.util.*;

public class Problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Numbers in array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Find largest
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest = " + max);
        // Find smallest
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest = " + min);
        // Average
        int sum = 0;
        for (int num : arr)
            sum += num;
        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);
        // Count even and odd
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
        // Search element
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }
        if (found) System.out.println(key + " found in array.");
        else System.out.println(key + " not found in array.");

        // Sort array (ascending)
        Arrays.sort(arr);
        System.out.println("Sorted array (Ascending):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Store string
        sc.nextLine();
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Palindrome check
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        // Count vowels and consonants
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        // Uppercase and Lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        sc.close();
    }
}
