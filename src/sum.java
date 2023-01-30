import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("enter the first value: ");
        a=s.nextInt();
        System.out.println("enter the second value: ");
        b=s.nextInt();
        System.out.println("The sum is: " +(a+b));
    }
}
