public class Evennos {
    public static void main(String[] args) {
        int[] even = new int[100];
        int i = 2;
        int flag=0;
        while (flag<100)
        {
            if(i % 2 == 0) {
                even[flag] = i;
                System.out.println(even[flag]);
                flag++;
            }
            i++;
        }
    }
}

