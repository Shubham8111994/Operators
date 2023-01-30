public class Pattern {
    public static void main(String[] args) {
        /*printing right side star pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }*/


        /*left triangle star pattern
        for (int k = 0; k < 5; k++) {
            for (int j = 5; j > k; j--) {
                System.out.print(" ");
            }
            for (int i=0; i<=k; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }*/

        /*pyramid
        for (int j = 0; j < 5; j++) {
            for (int k = 5 - j; k > 1; k--) {
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/

        /*downward triangle
        for (int j = 0; j < 5; j++) {

            for (int i = 5; i > j; i--) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }*/

        /*downward pyramid
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= 5-1-j; i++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/

        //right down mirror stars
        for (int i=0; i<5; i++){

            for (int k=0; k<i; k++){
                System.out.print(" ");
            }
            for (int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //Right Pascal’s Triangle
        
    }
}
