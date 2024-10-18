import java.util.Scanner;
public class dup {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int array[] = new int[50];
        // int ones[] = new int[50];
        // int tens[] = new int[50];
        // int i, n,pos;
        // System.out.print("Size of array: ");
        // n = sc.nextInt();
        // System.out.print("Enter " + n + " element:");
        // for (i = 0; i < n; i++) {
        //     array[i] = sc.nextInt();
        // }
        // System.out.print("Array elements are: ");
        // for (i = 0; i < n; i++) {
        //     System.out.print(array[i] + " ");
        // }
        // System.out.println("Find element: ");
        // pos=sc.nextInt();
        // //  find position of element
        // for (i = 0; i < n; i++) {
        //     if(pos == array[i]){
        //     }
        // }

            int a[] = new int[30];
            int n, pos, i;
            Scanner sc = new Scanner(System.in);
            
            // Input size of the array
            System.out.println("Enter the size: ");
            n = sc.nextInt();
            
            // Input array elements
            System.out.println("Enter the " + n + " numbers: ");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Display array elements
            System.out.println("Array elements are: ");
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            
            // Input number to find
            System.out.print("\nFind: ");
            pos = sc.nextInt();
            
            // Convert pos to single digit if it's two digits
            pos %= 10;
            
            // Find all occurrences of the number and display their indices
            boolean found = false;
            System.out.println("Found at indices: ");
            for (i = 0; i < n; i++) {
                int num = a[i] % 10; // Get single digit
                if (pos == num) {
                    System.out.print(i + " ");
                    found = true;
                }
            }
            
            // If no occurrences found
            if (!found) {
                System.out.println("Number not found.");
            }
            
            sc.close();
    }
}
