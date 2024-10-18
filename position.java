import java.util.Scanner;
public class position{
    public static void main(String [] args){
        int a[] = new int[30];
        int n,pos,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        n = sc.nextInt();
        System.out.println("Enter the "+n+" number: ");
        for(i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nFind: ");
        pos=sc.nextInt();
        for(i=0;i<n;i++){
            if(pos == a[i]){
                System.out.println("Found at: "+i);
            }
        }
    }
}
