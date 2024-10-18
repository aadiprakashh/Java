import java.util.*;
public class matrix {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int row,i,j,col;
    System.out.print("Enter row size: ");
    row=sc.nextInt();
    System.out.print("Enter col size: ");
    col=sc.nextInt();

    //inserting matrix
    System.out.println("Enter " +row*col+ " elements:");
    int matrix[][] = new int[row][col];
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            matrix[i][j]=sc.nextInt();
        }
    }

    //Display matrix
    System.out.println("Given Matrix is");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
             System.out.print(matrix[i][j]+" ");
        }
        System.out.println(" ");
    }

    //        // finding an element
    // System.out.println("Element to find: ");
    // int pos=sc.nextInt();
    // for(i=0;i<row;i++){
    //     for(j=0;j<col;j++){
    //         if(pos==matrix[i][j]){
    //             System.out.print("Element found at: "+ i+" "+j);
    //         }
    //     }
    // }


    //transpose matrix
    int transpose[][] = new int[col][row];
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            transpose[j][i]=matrix[i][j];
        }
    }

    //Display Transpose matrix
    System.out.println("Transpose of Matrix is");
    for(j=0;j<col;j++){
    for(i=0;i<row;i++){
             System.out.print(transpose[j][i]+" ");
        }
        System.out.println(" ");
    }
   }
}
