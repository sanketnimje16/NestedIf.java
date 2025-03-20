package Basics2;
import java.util.*;
class NestedIf{
    public static void main(String[]args){
        int a = 1;
        int b = 8;
        int c = 11;

        if(a > b){
            System.out.println("a is bigger than b");
            if(a > c){
                System.out.println("a is bigger than c");
                System.out.println("a is biggest " + a);
            }

        }
        else{
            if(b > a){
                System.out.println("b is bigger than a");
                if (b > c) {
                    System.out.println("b is bigger than c");
                    System.out.println("b is biggest "+ b);
                }
                else{
                    System.out.println("c is bigger than b");
                    System.out.println("c is biggest "+ c);
                }

            }

        }
    }
}
/* Take user input of four numbers and find the biggest numbers */

class NestedIfElse{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c = ");
        int c = sc.nextInt();
        System.out.print("Enter the value of d = ");
        int d = sc.nextInt();
        if(a > b){
            System.out.println("a is bigger than b");
            if(a > c){
                System.out.println("a is bigger than c");
                if (a > d) {
                    System.out.println("a is bigger than d");
                    System.out.println("a is largest "+a );
                } else{
                    System.out.println("c is bigger than a");
                    System.out.println("c is largest "+c);
                }
            }
        }else{
            System.out.println("b is bigger than a");
            if(b > c){
                System.out.println("b is bigger than c");
                System.out.println("b is largest number "+b);
            }else{
                if(c > d){
                    System.out.println("c is bigger than d");
                    System.out.println("c is biggest number"+c);
                }else{
                    System.out.println("d is bigger than c");
                    System.out.println("d is biggest number "+d);
                }
            }

        }
    }
}
   