import java.util.Scanner;
public class oddevenlimit {
    public static void main(String args[]){
        int array[] = new int[50];
        int i,n,count=0, ecount=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array: ");
        n = sc.nextInt();
        System.out.print("Enter "+n+" element:");
        for(i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for(i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        for(i=0;i<n;i++){
            if(array[i]%2==0){
                ecount+=1;
                count+=array[i];
                System.out.print("\nEven Numbers: "+array[i]);

            }
        }
        System.out.print("\nEven numbers Count: "+ecount);
        System.out.print("\nEven numbers Sum: "+count);
    }    
}