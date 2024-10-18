import java.util.*;
public class calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Operation");
        boolean cal=true;
        while(cal){
            System.out.println("1.Add\n2.Sub\n3.Multi\n4.Div\n5.Exit");
            int ch =sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Val1: ");
                    int a = sc.nextInt();
                    System.out.print("Val2: ");
                    int b = sc.nextInt();
                    System.out.println(" "+a+" + "+b+" = "+(a+b));
                    break;
                case 2:
                    System.out.print("Val1: ");
                     a = sc.nextInt();
                    System.out.print("Val2: ");
                     b = sc.nextInt();
                     System.out.println(" "+a+" - "+b+" = "+(a-b));
                    break;
                case 3:
                    System.out.print("Val1: ");
                    a = sc.nextInt();
                    System.out.print("Val2: ");
                     b = sc.nextInt();
                     System.out.println(" "+a+" * "+b+" = "+(a*b));
                    break;
                case 4:
                        System.out.print("Val1: ");
                        a = sc.nextInt();
                        System.out.print("Val2: ");
                         b = sc.nextInt();
                         System.out.println(" "+a+" / "+b+" = "+(a/b));
                        break;
                case 5:
                System.out.println("Exiting.....");
                    cal=false;
                default:System.out.println("Invalid Choice");
            }
        }
    }    
}
