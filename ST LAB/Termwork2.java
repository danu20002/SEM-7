import java.util.*;

public class Termwork2 {
    public static  void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Values of A,B,C respectively");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a <= 0 || b <= 0 || c <= 0 || a > 10 || b > 10 || c > 10) {
            System.out.println("Not In a Range");
        }

         if(a + b <= c || a + c <= b || b + c <= a){
             System.out.println("NOT a Triangle");
         }else {
             System.out.println("It's Triangle");
             if (a == b && b == c) {
                 System.out.println("Equilateral triangle");
             } else if (a == b || a == c || c == b) {
                 System.out.println("Isosceles Triangle");
             } else {
                 System.out.println("Scelene Triangle");
             }
         }
    }
}
