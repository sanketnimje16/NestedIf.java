package Basics2;
import java.util.*;

public class IfElse{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age = ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You can vote because your " + age + " age is legal for voting " );
        }else{
            System.out.println("You can't vote bacause your age is " + age);
        }
        
    }
}
/* 
 * Schedule your Study time according the following
 * time = 6am-12pm you have to study HTML.
 * time = 12pm to 4pm you have to study CSS.
 * time = 4pm to 8pm you have to study JavaScript.
 * time = 8pm to 12am you have to study Reactjs.
 * and last good night
 * 
 */
class Schedule{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Study Time = ");
        float time = sc.nextFloat();
        if(time >= 6 && time <=12){
            System.out.println("You Have to study HTML");
        }else if(time > 12 && time <= 16){
            System.out.println("You have to study CSS");
        }else if(time > 16 && time <= 20){
            System.out.println("You have to study JavaScript");
        }else if (time > 20 && time <=24){
            System.out.println("You have to study ReactJs");
        }
        else if(time >= 1 && time <=6){
            System.out.println("Go to the bed.....!! Time to dream");
        }
        else{
            System.out.println("you have enter invalid time");
        }
    }
}
