package Basics2;
public class Operators{
    public static void main(String[] args) {
        int a = 13;
        int b = 14;
        int result = a + b;
        int d = 15+20;
        System.out.println("The value of D variable is = " + d);
        System.out.println(result);
        System.out.println(a+b);
        System.out.println("The value of two numbers is = " + (a + b));
        System.out.println(a + result);
    }
}
class Substraction{
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int c = a-b;
        System.out.println(b-a);
    }
}
class Division{
    public static void main(String[] args) {
        float a = 12;
        float b = 7;
        float c = a/b;
        System.out.println(c);

        int x = 14;
        int y = 5;
        double z = (double)x/y;
        System.out.println("The value of Z is = " + z);

        int v1 = 12;
        int v2 = 7;
        double res = (double) v1%v2;
        System.out.println(res);
    }
}
class AssignmentOperator{
    public static void main(String[] args) {
        int a = 14;
        int b = 6;
        // a+=b; a = a + b;
        a-=b;
        System.out.println(a);
        System.out.println(a);
    }

}