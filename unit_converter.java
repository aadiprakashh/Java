import java.util.*;

public class unit_converter {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      boolean val = true;
      while (val) {
         System.out.println("1.Cm -> M\n2.M -> Cm\n3.In -> Ft\n4.Ft -> In\n5.Km -> M\n6.M -> Km");
         System.out.print("Select the unit to convert:");
         int ch = sc.nextInt();
         switch (ch) {
            case 1:
               System.out.print("Enter Cm: ");
               double cm = sc.nextDouble();
               double m = cm / 100;
               System.out.println(cm + " Cm to " + m + "M");
               break;
            case 2:
               System.out.print("Enter Meter: ");
               m = sc.nextDouble();
               cm = m * 100;
               System.out.println(m + " M to " + cm + "Cm");
               break;
            case 3:
               System.out.print("Enter Inch: ");
               double in = sc.nextDouble();
               double ft = in / 12;
               System.out.println(in + " In to " + ft + "Ft");
               break;
            case 4:
               System.out.print("Enter Feet: ");
               ft = sc.nextDouble();
               in = ft * 12;
               System.out.println(ft + " Ft to " + in + "In");
               break;
            case 5:
               System.out.print("Enter Km: ");
               double km = sc.nextDouble();
               m = km / 1000;
               System.out.println(km + " Km to " + m + "M");
               break;
            case 6:
               System.out.print("Enter M: ");
               m = sc.nextDouble();
               km = m * 1000;
               System.out.println(m + " M to " + km + "Km");
               break;
            default:
            System.out.println("Invalid Choice");
               break;

         }
      }
   }

}
