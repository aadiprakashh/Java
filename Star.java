public class Star {
        public static void main(String[] args) {
            // Printing the upper half of the arrow
            // for (int i = 0; i < 5; i++) {
            //     for (int j = 0; j < 5 - i; j++) {
            //         System.out.print(" ");
            //     }
            //     for (int k = 0; k < 2 * i + 1; k++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for (int i = 4 - 1; i >= 0; i--) {
            //     for (int j = 0; j < 5 - i; j++) {
            //         System.out.print(" ");
            //     }
            //     for (int k = 0; k < 2 * i + 1; k++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }


            for(int i=1;i<=5;i++){
                for(int k=1;k<=5-i;k++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
            for(int i=4;i>=1;i--){
                for(int k=1;k<=5-i;k++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
    }
}
