import java.util.*;

// WAP to take number form user into N variable and print all the even number between 1 to n.
public class evenno {
    public static void main(String[] args) {
        int i,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number");
        n=obj.nextInt();
        i=1;
          while (i<=n){
            if (i%2==0){
                System.out.println(i);
            }
            i=i+1;
          }
    }
    
}
