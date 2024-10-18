import java.util.*;
public class Practice {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s;
    System.out.print("Enter aray size: ");
    s=sc.nextInt();
    int[] arr =new int[s];
    System.out.print("Enter "+s+ " elements:");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("The given array:");
    show(arr);
    System.out.println();
    find(arr);
    

 }
 public static void show(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
 }

 public static boolean find(int[] arr){
    for(int i=0;i<arr.length;i++){
        if(arr[0] == 6 ||  arr[arr.length -1] == 6 ){
            System.out.println("Access Granted");
            break;
        }
        else{
            System.out.println("Access Denied");
            break;
        }
    }
    return true;
 }
}
