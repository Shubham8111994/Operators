public class Operators {
    public static void main(String[] args) {
        //Unary
        int c = 1;
        System.out.println("Unary example " + c++ + " " + ++c + " " + --c);

        //Arithmetic operators
        int a = 5;
        int b = 6;
        System.out.println("Arithmetic operation " + (a + b * a / b));

        //shift
        System.out.println("Shift operator example ");
        System.out.println(a<<2);
        System.out.println(a>>2);
        int n=-3;
        System.out.println(n>>>2);

        //logical
        System.out.println("Logical operator example ");
        if (a>b&&a>1){
            System.out.println("passed 1st condition");
        } else if (a>b&a>1) {
            System.out.println("passed 2nd condition");
        } else if (a>b||b>a) {
            System.out.println("passed 3rd condition");
        }

        //ternary operator
        System.out.println("Ternary example ");
        int t = (a > b) ? a : b;
        System.out.println(t);
    }
}