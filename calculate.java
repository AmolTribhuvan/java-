
// create a simple calculater using switch

import java.util.Scanner;
public class calculate {
    public static void main(String[] args) 
{
    Scanner obj=new Scanner (System.in);
    System.out.println("enter your choice (+,-,*,/):");
    int a,b,c;
    String  choice;
    System.out.println("enter 2 number:");
    choice=obj.next();
    a=obj.nextInt();
    b=obj.nextInt();

      switch (choice){
    
        case "+":
        c=a+b;
        System.out.println("Addition is " +c);
        break;

        case "-":
        c=a-b;
        System.out.println("Substrction is " +c);
        break;

        case "*":
        c=a*b;
        System.out.println("Multiplication is " +c);
        break;

        case "/":
        c=a/b;
        System.out.println("Division is " +c);
        break;
       }

   }
    
}
