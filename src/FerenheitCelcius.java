import java.util.Scanner;

public class FerenheitCelcius {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float f,c;
        float temp;
        System.out.println("chose 1 to convert into celsius or 2 for fahrenheit");
        int flag = s.nextInt();
        switch (flag) {
            case 1 -> {
                System.out.println("please enter the temp");
                temp = s.nextFloat();
                c = ((temp - 32) * 5) / 9;
                System.out.println("temp is " + c + "c");
            }
            default -> {
                System.out.println("please enter the temp");
                temp = s.nextFloat();
                f = (temp * 9 / 5) + 32;
                System.out.println("temp is " + f + "f");
            }
        }
    }
}
